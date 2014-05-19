package interp;

import parser.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.LinkedList;

/** Class that implements the interpreter of the language. */

public class Interp {
    /** AST root */
    private RGLTree tree;        
    
    /** c++ code resulting of the translation */
    private String translation;
    
    /** Maps of RGL actions and functions, used to check for potentially invalid calls */
    private HashMap<String, Integer> actionSet;
    private HashMap<String, Integer> functionSet;
    /** Set of variables, used to check they have an assigned value at the current translation state */
    private HashSet<String> variableSet;
    
    /** Stores the line number of the current statement. */
    private Queue<String> errors;
    private Queue<String> warnings;
    
    /** number of spaces to be written before a statement at the current translation state */
    private int tabulation = 0;
    
    /** used to check correct use of returns */
    private int returnCount = -1;
    
    /** Constructor of the interpreter */
    public Interp(RGLTree T) {
        assert T != null;
        tree = T;
        translation = "";
        variableSet = new HashSet<String> ();
        actionSet = new HashMap<String, Integer> ();
        functionSet = new HashMap<String, Integer> ();
        
        errors = new LinkedList<String> ();
        warnings = new LinkedList<String> ();
    }

    /** Returns a string containing the translation. Must have called "Run" before */
    public String translation() { return translation; }
    
    /** Queue with error messages */
    public Queue<String> getErrors() { return errors; }
    
    /** Queue with warning messages */
    public Queue<String> getWarnings() { return warnings; }
    
    /** Adds 'tabulation' spaces to the current state of the translation */
    private void indent() {
        indent(tabulation);
    }
    
    /** Adds as many spaces to the current state of the translation as specified with nspaces */
    private void indent(int nspaces) {
        for (int i = 0; i < nspaces; ++i) translation += " ";
    }
    
    /** Writes the 'statement' of code, indented correctly */
    private void addLine(String statement) {
        indent();
        translation += statement+"\n";
    }
    
    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        addLine("");
        translateActions(tree.getChild(0));
        addLine("void actions() {");        
        translate(tree.getChild(1));
        addLine("    finish = true;");        
        addLine("}");
    }


    /** Returns the number of children of a tree node */
    private int getChildrenNumber(RGLTree tree) {
        int childNumber = 0;
        while (tree.getChild(childNumber) != null) ++childNumber;
        return childNumber;
    }

    /** Translates the actions and fills the 'actionSet' set with their ids */
    private void translateActions (RGLTree tree) {
        //translate declarations
        for (int i = 0; i < getChildrenNumber(tree); ++i) {
            RGLTree definition = tree.getChild(i);
            RGLTree argList = definition.getChild(1);            
            String defId = definition.getChild(0).getText();
            int n_args = getChildrenNumber(argList);
            
            HashMap<String, Integer> defSet;
            String declaration = "";
            if (definition.getType() == RGLLexer.ACTION) {
                defSet = actionSet;
                declaration += "void ";
            }
            else {
                defSet = functionSet;
                declaration += "double ";
            }
            if (defSet.containsKey(defId) && defSet.get(defId) == n_args) {
                int linenumber = definition.getLine();
                errors.add("Error (line "+linenumber+"): duplicate definition name ("+defId+")");
            }
            defSet.put(defId, n_args);
            declaration += "rgl_" + defId + "(";
            //parameters
            for (int j = 0; j < n_args; ++j) {
                if (j > 0) declaration += ", ";
                String arg = argList.getChild(j).getText();
                if (variableSet.contains(arg)) {
                    int linenumber = argList.getChild(j).getLine();
                    errors.add("Error (line "+linenumber+"): duplicate variable name ("+arg+")");
                }                
                variableSet.add(arg);
                declaration += "double " + arg;
                
            }
            variableSet.clear();
            declaration += ");";
            addLine(declaration);
        }
        addLine("");
        //translate the headers+bodies
        for (int i = 0; i < getChildrenNumber(tree); ++i) {
            RGLTree definition = tree.getChild(i);         
            String defId = definition.getChild(0).getText();
            
            //parameters
            RGLTree argList = definition.getChild(1);   
            int n_args = getChildrenNumber(argList);
            String header = "";
            if (definition.getType() == RGLLexer.ACTION) header += "void ";
            else header += "double ";
            header += "rgl_" + defId + "(";
            for (int j = 0; j < n_args; ++j) {
                if (j > 0) header += ", ";
                String arg = argList.getChild(j).getText();
                header += "double " + arg;
                variableSet.add(arg); //used to check that all used vars in the body have a value
            }
            header += ") {";
            addLine(header);
            
            if (definition.getType() == RGLLexer.FUNC)
                returnCount = 0;
                //checkForReturn(definition);
            translate(definition.getChild(2));  //body
            addLine("}");
            if (definition.getType() == RGLLexer.FUNC && returnCount == 0)
                errors.add("Missing return instruction at function " + definition.getChild(0).getText() + " (line " + definition.getLine() + ")");
            returnCount = -1;
            variableSet.clear();    //no visibility between functions
            
            addLine(""); 
        }          
    }
    /*
    private void checkForReturn(RGLTree func) {
        boolean found = false;
        RGLTree instrlist = func.getChild(2);
        for (int i = 0; i < instrlist.getChildCount(); ++i)
            found = found || (instrlist.getChild(i).getType() == RGLLexer.RETURN);
        if (!found) errors.add("Missing return at function " + func.getText() + " (line " + func.getLine() + ")");
    }*/
    
    /** Begins the translation */
    private void translate (RGLTree tree) {
        if (tree == null) return;
        tabulation += 4;
        switch (tree.getType()) {
        
            //////// FLOW CONTROL EXPRESSIONS /////////
            case RGLLexer.EQUAL:    //assignation
                //guardarla per comprovar que usos posteriors son correctes
                String id = tree.getChild(0).getText();
                String ini = "";
                if (!variableSet.contains(id)) {
                    ini += "double ";
                    variableSet.add(id);
                }
                addLine(ini + tree.getChild(0).getText() + " = "
                        + translateExpression(tree.getChild(1)) + ";");
                break;
            case RGLLexer.IF:
                addLine("if (" + translateExpression(tree.getChild(0)) + ") {");
                translate(tree.getChild(1));
                addLine("}");
                RGLTree elseTree = tree.getChild(2);
                if (elseTree != null) {
                    addLine("else {");
                    translate(elseTree);
                    addLine("}");
                }
                break;
            case RGLLexer.WHILE:
                addLine("while (" + translateExpression(tree.getChild(0)) + ") {");
                translate(tree.getChild(1));
                addLine("}");
                break;
            case RGLLexer.FOR:
                String iter_id = tree.getChild(0).getText();
                boolean exists = variableSet.contains(iter_id);
                if (exists) {
                    int linenumber = tree.getLine();
                    warnings.add("Warning (line "+linenumber+"): using an already "+
                                  "existing variable as iterator ("+iter_id+")");
                } else variableSet.add(iter_id);
                
                String minbound = tree.getChild(1).getText();
                String maxbound = tree.getChild(2).getText();
                
                String increment = "1.0";
                if (getChildrenNumber(tree) == 5) increment = tree.getChild(3).getText();   //step specified
                addLine("for (double "+iter_id+" = "+minbound+"; "+iter_id+" <= "+maxbound+"; "+
                        iter_id+" += " + increment + ") {");
                        
                if (getChildrenNumber(tree) == 4) translate(tree.getChild(3));
                else translate(tree.getChild(4));
                
                if (!exists) variableSet.remove(iter_id);
                addLine("}");
                break;
            case RGLLexer.INSTRLIST:
                tabulation -= 4;    //since no line is written, undo the tabulation
                HashSet<String> scope = (HashSet<String>) variableSet.clone();
                for (int i = 0; i < getChildrenNumber(tree); ++i) translate(tree.getChild(i));
                variableSet = scope;
                tabulation += 4;    //back to original tabulation
                break;
            
            ////////// RGL EXPRESSIONS /////////////
            case RGLLexer.INITROBOT:
                addLine("R = robot(" + translateExpression(tree.getChild(0)) +
                                ", " + translateExpression(tree.getChild(1)) +
                                ", " + translateExpression(tree.getChild(2)) + ");");
                break;
            case RGLLexer.INITMAP:
                addLine("SIZE = " + translateExpression(tree.getChild(0)));
                break;
            case RGLLexer.MOVEFORWARD:
                addLine("exec( action(MOVE_FORWARD, "          +
                        translateExpression(tree.getChild(0)) + ") );");
                break;
            case RGLLexer.STOPROBOT:
                addLine("exec( action(STOP, " + translateExpression(tree.getChild(0)) +") );");
                break;
            case RGLLexer.MOVETO:
                addLine("exec( action(MOVE, " + translateExpression(tree.getChild(0)) +
                                         ", " + translateExpression(tree.getChild(1)) + ") );");
                break;
            case RGLLexer.ROTATE:
                addLine("exec( action(ROTATE, angleActual() + " +
                        translateExpression(tree.getChild(0))   + ") );");
                break;
            case RGLLexer.PICKOBJECT:
                addLine("exec( action(PICK_OBJECT) );");
                break;
            case RGLLexer.RELEASEOBJECT:
                addLine("exec( action(RELEASE_OBJECT) );");
                break;
            case RGLLexer.OBSTACLE:
                addLine("exec( action(OBSTACLE, " + translateExpression(tree.getChild(0)) +
                                             ", " + translateExpression(tree.getChild(1)) + ") );");
                break; 
            case RGLLexer.MARK:
                addLine("exec( action(MARK, " + translateExpression(tree.getChild(0)) +
                                         ", " + translateExpression(tree.getChild(1)) + ") );");
                break; 
            case RGLLexer.BOX:
                addLine("exec( action(BOX, " + translateExpression(tree.getChild(0)) +
                                        ", " + translateExpression(tree.getChild(1)) + ") );");
                break;  
            case RGLLexer.TRAIL:
                addLine("exec( action(TRAIL, " + translateExpression(tree.getChild(0)) + ") );");
                break;
            case RGLLexer.FACE:
                int angle = 0;
                switch (tree.getChild(0).getType()) {
                    case RGLLexer.EAST:     angle += 90; break;
                    case RGLLexer.NORTH:    angle += 180; break;
                    case RGLLexer.WEST:     angle += 270; break;
                    default: break;
                }
                addLine("exec( action(ROTATE, " + angle + ") );");
                break;
            case RGLLexer.CALL:
                String actionId = tree.getChild(0).getText();
                int n_params = getChildrenNumber(tree) - 1;
                if (!actionSet.containsKey(actionId)) {
                    int linenumber = tree.getLine();
                    errors.add("Error (line "+linenumber+"): calling a non-existent action ("+actionId+")");
                }
                else {
                    int n_args = actionSet.get(actionId);
                    if (n_args != n_params) {
                        int linenumber = tree.getLine();
                        errors.add("Error (line "+linenumber+"): calling an action with a wrong number of parameters ("+
                            "actionId: expected "+n_args+", found "+n_params+")");
                    }
                }
                String call = "rgl_" + actionId + "(";
                
                for (int paramNumber = 0; paramNumber < n_params; ++paramNumber) {
                    RGLTree param = tree.getChild(paramNumber + 1);
                    if (paramNumber > 0) call += ", ";
                    call += translateExpression(param);
                }
                call += ");";
                addLine(call);
                break;
            case RGLLexer.RETURN:
                if (returnCount < 0) errors.add("Return found outside a function (line " + tree.getLine() + ")");
                else ++returnCount;
                addLine("return " + translateExpression( tree.getChild(0) ) + ";");
                break;
            default:    System.out.println("Something went wrong ("+tree.getLine() +"): "+tree.getText());
        }
        tabulation -= 4;
    }
    
    private String translateExpression(RGLTree tree) {
        assert tree != null;
        int type = tree.getType();
        if (type == RGLLexer.TRUE || type == RGLLexer.ON) return "true";
        if (type == RGLLexer.FALSE || type == RGLLexer.OFF) return "false";
        if (type == RGLLexer.DOUBLE || type == RGLLexer.INT) return tree.getText();
        if (type == RGLLexer.ID) {
            String id = tree.getText();
            if (!variableSet.contains(id)) {
                int linenumber = tree.getLine();
                errors.add("Error (line "+linenumber+"): using a variable with no assigned value ("+id+")");
            }
            return id;
        }
        if (type == RGLLexer.MOD) {
            return "fmod( ((double)" + translateExpression(tree.getChild(0)) + "), ((double) " +
               translateExpression(tree.getChild(1)) + ") )";
        }
        if (type == RGLLexer.MUL || type == RGLLexer.DIV) {
            String s = "";
            int childtype = tree.getChild(0).getType();
            if (childtype == RGLLexer.PLUS || childtype == RGLLexer.MINUS) s += "(";
            s += translateExpression(tree.getChild(0));
            if (childtype == RGLLexer.PLUS || childtype == RGLLexer.MINUS) s += ")";
            s += " " + tree.getText() + " ";
            
            childtype = tree.getChild(1).getType();            
            if (childtype == RGLLexer.PLUS || childtype == RGLLexer.MINUS) s += "(";
            s += translateExpression(tree.getChild(1));
            if (childtype == RGLLexer.PLUS || childtype == RGLLexer.MINUS) s += ")";
            return s;
        }
        if ((type == RGLLexer.PLUS || type == RGLLexer.MINUS) && getChildrenNumber(tree) == 1) {
            return tree.getText() + " " + translateExpression(tree.getChild(0));
        }
        if (type == RGLLexer.GETPOSX) return "R.getIntX()";
        if (type == RGLLexer.GETPOSY) return "R.getIntZ()";
        if (type == RGLLexer.DETECT) {
            int angle = 0;
            switch (tree.getChild(0).getType()) {
                case RGLLexer.RIGHT: angle -= 90;   break;
                case RGLLexer.LEFT:  angle += 90;   break;
                default: break;
            }
            return "detectDirection(" + angle + ")";
        }
        if (type == RGLLexer.NOT) return "not " + translateExpression(tree.getChild(0));
        if (type == RGLLexer.GET) {
            String functionId = tree.getChild(0).getText();
            int n_params = getChildrenNumber(tree) - 1;
            if (!functionSet.containsKey(functionId)) {
                int linenumber = tree.getLine();
                errors.add("Error (line "+linenumber+"): calling a non-existent function ("+functionId+")");
            }
            else {
                int n_args = functionSet.get(functionId);
                if (n_args != n_params) {
                    int linenumber = tree.getLine();
                    errors.add("Error (line "+linenumber+"): calling a function with a wrong number of parameters ("+
                        "functionId: expected "+n_args+", found "+n_params+")");
                }
            }
            String get = "rgl_" + functionId + "(";
            
            for (int paramNumber = 0; paramNumber < n_params; ++paramNumber) {
                RGLTree param = tree.getChild(paramNumber + 1);
                if (paramNumber > 0) get += ", ";
                get += translateExpression(param);
            }
            get += ")";
            return get;
        }
        if (type == RGLLexer.COS || type == RGLLexer.SIN || type == RGLLexer.SQRT) {
            return tree.getText() + "(" + translateExpression(tree.getChild(0)) + ")";
        }
        return translateExpression(tree.getChild(0)) + " " + tree.getText() +
                    " " + translateExpression(tree.getChild(1));
    }
    
}
