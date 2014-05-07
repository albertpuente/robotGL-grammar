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
    
    /** Map of RGL actions, used to check for potentially invalid calls */
    private HashMap<String, Integer> actionSet;    
    /** Set of variables, used to check they have an assigned value at the current translation state */
    private HashSet<String> variableSet;
    
    /** Stores the line number of the current statement. */
    private Queue<String> errors;
    private Queue<String> warnings;
    
    /** number of spaces to be written before a statement at the current translation state */
    private int tabulation = 0;
    
    /** Constructor of the interpreter */
    public Interp(RGLTree T) {
        assert T != null;
        tree = T;
        translation = "";
        variableSet = new HashSet<String> ();
        actionSet = new HashMap<String, Integer> ();
        
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
        //CAL recorrer (i guardar info de) tots els ids abans de traduir els bodies.
        //alhora s'han d'escriure les declaracions per poder fer servir funcions dins de
        //funcions i no tenir problemes de visibilitat a C++
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
            RGLTree action = tree.getChild(i);
            RGLTree argList = action.getChild(0);
            
            String actionId = action.getText();
            int n_args = getChildrenNumber(argList);
            if (actionSet.containsKey(actionId) && actionSet.get(actionId) == n_args) {
                int linenumber = action.getLine();
                errors.add("Error (line "+linenumber+"): duplicate function name ("+actionId+")");
            }
            actionSet.put(actionId, n_args);
            
            String declaration = "void rgl_" + actionId + "(";
            //parameters
            for (int j = 0; j < n_args; ++j) {
                if (j > 0) declaration += ", ";
                String arg = argList.getChild(j).getText();
                if (variableSet.contains(arg)) {
                    int linenumber = argList.getChild(j).getLine();
                    errors.add("Error (line "+linenumber+"): duplicate variable name ("+arg+")");
                }                
                variableSet.add(arg);
                declaration += "int " + arg;
                
            }
            variableSet.clear();
            declaration += ");";
            addLine(declaration);
        }
        addLine("");
        //translate the headers+bodies
        for (int i = 0; i < getChildrenNumber(tree); ++i) {
            RGLTree action = tree.getChild(i);
            String actionId = action.getText();
            
            //parameters
            RGLTree argList = action.getChild(0); 
            int n_args = getChildrenNumber(argList);
            String header = "void rgl_" + actionId + "(";
            
            for (int j = 0; j < n_args; ++j) {
                if (j > 0) header += ", ";
                String arg = argList.getChild(j).getText();
                header += "int " + arg;
                variableSet.add(arg); //used to check that all used vars in the body have a value
            }
            header += ") {";
            addLine(header);            
            translate(action.getChild(1));  //body
            addLine("}");
            
            variableSet.clear();    //no visibility between functions
            
            addLine(""); 
        }          
    }
    
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
                    ini += "int ";
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
                addLine("for (int "+iter_id+" = "+minbound+"; "+iter_id+" <= "+maxbound+"; "+
                        "++"+iter_id+") {");
                translate(tree.getChild(3));
                if (!exists) variableSet.remove(iter_id);
                addLine("}");
                break;
            case RGLLexer.CALL:
                break;                
            case RGLLexer.INSTRLIST:
                tabulation -= 4;    //since no line is written, undo the tabulation
                for (int i = 0; i < getChildrenNumber(tree); ++i) translate(tree.getChild(i));
                tabulation += 4;    //back to original tabulation
                break;
            
            ////////// RGL EXPRESSIONS /////////////
            case RGLLexer.INITROBOT:
                addLine("R = robot(" + translateExpression(tree.getChild(0)) +
                                ", " + translateExpression(tree.getChild(1)) +
                                ", " + translateExpression(tree.getChild(2)) + ");");
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
            //function call
            default:
                String actionId = tree.getText();
                if (!actionSet.containsKey(actionId)) {
                    int linenumber = tree.getLine();
                    errors.add("Error (line "+linenumber+"): calling a non-existent function ("+actionId+")");
                }
                else {
                    int n_params = getChildrenNumber(tree);
                    int n_args = actionSet.get(actionId);
                    if (n_args != n_params) {
                        int linenumber = tree.getLine();
                        errors.add("Error (line "+linenumber+"): calling a function with wrong number of parameters ("+
                            "actionId: expected "+n_args+", found "+n_params+")");
                    }
                }
                String call = "rgl_" + actionId + "(";
                int paramNumber = 0;
                RGLTree param = tree.getChild(paramNumber);
                if (param != null) call += translateExpression(param);
                param = tree.getChild(++paramNumber);
                while (param != null) {
                    call += ", " + translateExpression(param);
                    param = tree.getChild(++paramNumber);
                }
                call += ");";
                addLine(call);
        }
        tabulation -= 4;
    }
    
    private String translateExpression(RGLTree tree) {
        assert tree != null;
        int type = tree.getType();
        if (type == RGLLexer.TRUE || type == RGLLexer.ON) return "true";
        if (type == RGLLexer.FALSE || type == RGLLexer.OFF) return "false";
        if (type == RGLLexer.INT) return tree.getText();
        if (type == RGLLexer.ID) {
            String id = tree.getText();
            if (!variableSet.contains(id)) {
                int linenumber = tree.getLine();
                errors.add("Error (line "+linenumber+"): using a variable with no assigned value ("+id+")");
            }
            return id;
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
        return translateExpression(tree.getChild(0)) + " " + tree.getText() +
                    " " + translateExpression(tree.getChild(1));
    }
    
    /** Checks that the function call is valid
     */
     
    private boolean validFunction (RGLTree tree) {
        // Check that the number of parameters is the same
        return true;
    }
}
