package interp;

import parser.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Class that implements the interpreter of the language. */
public class Interp {

    /** AST root */
    private RGLTree tree;
    
    /** Formatted translation */
    private RGLTranslation translation;    
    
    /** Maps of RGL actions and functions, used to check for potentially invalid calls */
    private HashMap<String, Integer> actionSet;
    private HashMap<String, Integer> functionSet;
    
    /** Set of variables, used to check they have an assigned value at the current translation state */
    private HashSet<String> variableSet;
    
    /** Stores the line number of the current statement. */
    private RGLErrorStack errorStack;
    
    /** used to check correct use of returns: -1 not needed // 0 needed // 1 needed and already found */
    private int returnCount = -1;
    
    /** Constructor of the interpreter */
    public Interp(RGLTree T) {
        assert T != null;   tree = T;
        
        translation = new RGLTranslation();
        variableSet = new HashSet<String> ();
        actionSet = new HashMap<String, Integer> ();
        functionSet = new HashMap<String, Integer> ();        
        errorStack = new RGLErrorStack();
    }

    /** Returns a string containing the translation. Must have called "Run" before */
    public String translation() { return translation.toString(); }
    
    /** Queue with error messages */
    public ArrayList<String> getErrors() { return errorStack.getErrors(); }
    
    /** Queue with warning messages */
    public ArrayList<String> getWarnings() { return errorStack.getWarnings(); }
    
    /** Runs the program by calling the main function without parameters. */
    public void Run() {
        translation.addLine();
        translateDefinitions(tree.getChild(0));
        translation.addLine("void actions() {");
        translate(tree.getChild(1));
        translation.tab();
        translation.addLine("finish = true;");
        translation.untab();
        translation.addLine("}");
    }


    /** Returns the number of children of a tree node */
    private int getChildrenNumber(RGLTree tree) {
        int childNumber = 0;
        while (tree.getChild(childNumber) != null) ++childNumber;
        return childNumber;
    }

    /** Translates the definitions and fills the 'actionSet' set with their ids */
    private void translateDefinitions (RGLTree tree) {
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
            
            //check for duplicate definitions
            if (defSet.containsKey(defId) && defSet.get(defId) == n_args) {
                int linenumber = definition.getLine();
                errorStack.addError(linenumber, "duplicate definition name ("+defId+")");
            }
            defSet.put(defId, n_args);
            declaration += "rglf_" + defId + "(";
            //parameters
            for (int j = 0; j < n_args; ++j) {
                if (j > 0) declaration += ", ";
                String arg = argList.getChild(j).getText();
                //check for duplicate argument names
                if (variableSet.contains(arg)) {
                    int linenumber = argList.getChild(j).getLine();
                    errorStack.addError(linenumber, "duplicate variable name ("+arg+")");
                }                
                variableSet.add(arg);
                declaration += "double rglv_" + arg;
                
            }
            variableSet.clear();
            declaration += ");";
            translation.addLine(declaration);
        }
        translation.addLine("");
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
            header += "rglf_" + defId + "(";
            for (int j = 0; j < n_args; ++j) {
                if (j > 0) header += ", ";
                String arg = argList.getChild(j).getText();
                header += "double rglv_" + arg;
                variableSet.add(arg);   //arguments are visible inside the body of the function
            }
            header += ") {";
            translation.addLine(header);
            
            if (definition.getType() == RGLLexer.FUNC) returnCount = 0; //0 marks the need for a return
            translate(definition.getChild(2));  //body
            translation.addLine("}");
            if (definition.getType() == RGLLexer.FUNC && returnCount == 0)  //no return found
                errorStack.addError(definition.getLine(), "Missing return instruction at " +
                    "some branch of function " + definition.getChild(0).getText());
            returnCount = -1;
            variableSet.clear();        //variables declared inside a definition aren't visible outside of it
            
            translation.addLine(""); 
        }          
    }
    
    /** Begins the translation */
    private void translate (RGLTree tree) {
        if (tree == null) return;
        switch (tree.getType()) {
        
            //////// FLOW CONTROL EXPRESSIONS /////////
            case RGLLexer.EQUAL:
                String id = tree.getChild(0).getText();
                String ini = "";
                if (!variableSet.contains(id)) ini += "double ";
                translation.addLine(ini + "rglv_" + tree.getChild(0).getText() + " = "
                        + translateExpression(tree.getChild(1)) + ";");
                if (!variableSet.contains(id)) variableSet.add(id);
                break;
            case RGLLexer.IF:
                translation.addLine("if (" + translateExpression(tree.getChild(0)) + ") {");
                boolean returnNeeded = returnCount < 1;
                translate(tree.getChild(1));
                boolean returnFound = returnCount > 0;
                translation.addLine("}");
                RGLTree elseTree = tree.getChild(2);
                if (elseTree == null) {
                    if (returnNeeded) returnCount = 0;
                    else returnCount = 1;
                } else {
                    returnCount = 0;
                    translation.addLine("else {");
                    translate(elseTree);
                    translation.addLine("}");
                    returnFound = returnFound && returnCount > 0;
                    if (returnNeeded && returnFound) returnCount = 1;
                    else returnCount = 0;
                }
                break;
            case RGLLexer.WHILE:
                returnNeeded = returnCount < 1;
                translation.addLine("while (" + translateExpression(tree.getChild(0)) + ") {");
                translate(tree.getChild(1));
                if (returnNeeded) returnCount = 0;
                translation.addLine("}");
                break;
            case RGLLexer.FOR:
                String iter_id = tree.getChild(0).getText();
                boolean exists = variableSet.contains(iter_id);
                if (exists) {
                    int linenumber = tree.getLine();
                    errorStack.addWarning(tree.getLine(), "using an already existing variable " + 
                        " as iterator ("+iter_id+")");
                } else variableSet.add(iter_id);
                
                String minbound = translateExpression(tree.getChild(1));
                String maxbound = translateExpression(tree.getChild(2));
                
                String increment = "1.0";
                if (getChildrenNumber(tree) == 5) increment = translateExpression(tree.getChild(3));   //step specified
                translation.addLine("for (double rglv_"+iter_id+" = "+minbound+"; "+ "rglv_" +iter_id+" <= "+maxbound+"; "+
                        "rglv_" + iter_id+" += " + increment + ") {");
                
                returnNeeded = returnCount < 1;        
                if (getChildrenNumber(tree) == 4) translate(tree.getChild(3));
                else translate(tree.getChild(4));
                if (returnNeeded) returnCount = 0;
                
                if (!exists) variableSet.remove(iter_id);
                translation.addLine("}");
                break;
            case RGLLexer.INSTRLIST:
                translation.tab();
                HashSet<String> scope = new HashSet<String> (variableSet);
                int i = 0;
                while (i < getChildrenNumber(tree) && returnCount < 1)  {
                    translate(tree.getChild(i));
                    ++i;
                }
                if (i < getChildrenNumber(tree)) 
                    errorStack.addWarning(tree.getChild(i).getLine(), "Unreachable statements");
                variableSet = scope;
                translation.untab();
                break;
            
            ////////// RGL EXPRESSIONS /////////////
            case RGLLexer.INITROBOT:
                translation.addLine("R = robot(" + translateExpression(tree.getChild(0)) +
                                ", " + translateExpression(tree.getChild(1)) +
                                ", " + translateExpression(tree.getChild(2)) + ");");
                break;
            case RGLLexer.INITMAP:
                translation.addLine("SIZE = " + translateExpression(tree.getChild(0)) + ";");
                break;
            case RGLLexer.MOVEFORWARD:
                translation.addLine("exec( action(MOVE_FORWARD, "          +
                        translateExpression(tree.getChild(0)) + ") );");
                break;
            case RGLLexer.STOPROBOT:
                translation.addLine("exec( action(STOP, " + translateExpression(tree.getChild(0)) +") );");
                break;
            case RGLLexer.MOVETO:
                translation.addLine("exec( action(MOVE, " + translateExpression(tree.getChild(0)) +
                                         ", " + translateExpression(tree.getChild(1)) + ") );");
                break;
            case RGLLexer.ROTATE:
                translation.addLine("exec( action(ROTATE, angleActual() + " +
                        translateExpression(tree.getChild(0))   + ") );");
                break;
            case RGLLexer.PICKOBJECT:
                translation.addLine("exec( action(PICK_OBJECT) );");
                break;
            case RGLLexer.RELEASEOBJECT:
                translation.addLine("exec( action(RELEASE_OBJECT) );");
                break;
            case RGLLexer.OBSTACLE:
                translation.addLine("exec( action(OBSTACLE, " + translateExpression(tree.getChild(0)) +
                                             ", " + translateExpression(tree.getChild(1)) + ") );");
                break; 
            case RGLLexer.MARK:
                translation.addLine("exec( action(MARK, " + translateExpression(tree.getChild(0)) +
                                         ", " + translateExpression(tree.getChild(1)) + ") );");
                break; 
            case RGLLexer.BOX:
                translation.addLine("exec( action(BOX, " + translateExpression(tree.getChild(0)) +
                                        ", " + translateExpression(tree.getChild(1)) + ") );");
                break;  
            case RGLLexer.TRAIL:
                translation.addLine("exec( action(TRAIL, " + translateExpression(tree.getChild(0)) + ") );");
                break;
            case RGLLexer.FACE:
                int angle = 0;
                switch (tree.getChild(0).getType()) {
                    case RGLLexer.EAST:     angle = 90; break;
                    case RGLLexer.NORTH:    angle = 180; break;
                    case RGLLexer.WEST:     angle = 270; break;
                    default: break;
                }
                translation.addLine("exec( action(ROTATE, " + angle + ") );");
                break;
            case RGLLexer.CALL:
                String actionId = tree.getChild(0).getText();
                int n_params = getChildrenNumber(tree) - 1;
                if (!actionSet.containsKey(actionId)) {
                    errorStack.addError(tree.getLine(), "Calling a nonexistent action ("+actionId+")");
                }
                else {
                    int n_args = actionSet.get(actionId);
                    if (n_args != n_params) {
                        errorStack.addError(tree.getLine(), "Calling an action with a wrong "+
                            "number of parameters (" + "actionId: expected " + n_args +
                            ", found "+n_params+")");
                    }
                }
                String call = "rglf_" + actionId + "(";
                
                for (int paramNumber = 0; paramNumber < n_params; ++paramNumber) {
                    RGLTree param = tree.getChild(paramNumber + 1);
                    if (paramNumber > 0) call += ", ";
                    call += translateExpression(param);
                }
                call += ");";
                translation.addLine(call);
                break;
            case RGLLexer.RETURN:
                if (returnCount < 0) errorStack.addError(tree.getLine(), "Return found outside a function");
                else ++returnCount;
                translation.addLine("return " + translateExpression( tree.getChild(0) ) + ";");
                break;
            default: System.out.println("Something went wrong (" + tree.getLine() + "): " + tree.getText());
        }
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
                errorStack.addError(tree.getLine(), "Using a variable with no assigned value ("+id+")");
            }
            return ("rglv_" + id);
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
                case RGLLexer.RIGHT: angle = -90;   break;
                case RGLLexer.LEFT:  angle = 90;   break;
                default: break;
            }
            return "detectDirection(" + angle + ")";
        }
        if (type == RGLLexer.NOT) return "not " + translateExpression(tree.getChild(0));
        if (type == RGLLexer.GET) {
            String functionId = tree.getChild(0).getText();
            int n_params = getChildrenNumber(tree) - 1;
            if (!functionSet.containsKey(functionId)) {
                errorStack.addError(tree.getLine(), "Calling a nonexistent function ("+functionId+")");
            }
            else {
                int n_args = functionSet.get(functionId);
                if (n_args != n_params) {
                    errorStack.addError(tree.getLine(), "Calling a function with a wrong number of parameters ("+
                        "functionId: expected "+n_args+", found "+n_params+")");
                }
            }
            String get = "rglf_" + functionId + "(";
            
            for (int paramNumber = 0; paramNumber < n_params; ++paramNumber) {
                RGLTree param = tree.getChild(paramNumber + 1);
                if (paramNumber > 0) get += ", ";
                get += translateExpression(param);
            }
            get += ")";
            return get;
        }
        if (type == RGLLexer.COS || type == RGLLexer.SIN || type == RGLLexer.SQRT) {
            return tree.getText() + "((" + translateExpression(tree.getChild(0)) + ") * M_PI / 180)";
        }
        return translateExpression(tree.getChild(0)) + " " + tree.getText() +
                    " " + translateExpression(tree.getChild(1));
    }
    
}
