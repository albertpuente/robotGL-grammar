package interp;

import parser.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/** Class that implements the interpreter of the language. */

public class Interp {
    /** AST root */
    private RGLTree tree;        
    
    /** c++ code resulting of the translation */
    private String translation;
    
    /** Set of RGL actions, used to check for potentially invalid calls */
    private HashSet<String> actionSet;    
    /** Set of variables, used to check they have an assigned value at the current translation state */
    private HashSet<String> variableSet;
    
    /** Stores the line number of the current statement. */
    //private int linenumber = -1;
    
    /** Set to true if the robot has been initialized. Used to check for multiple initializations */
    private boolean robotInitialized = false;
    
    /** number of spaces to be written before a statement at the current translation state */
    private int tabulation = 0;
    
    /** Constructor of the interpreter */
    public Interp(RGLTree T) {
        assert T != null;
        tree = T;
        translation = "";
        variableSet = new HashSet<String> ();
        actionSet = new HashSet<String> ();
    }
    
    /** Gets the current line number. In case of a runtime error */
    //public int lineNumber() { return linenumber; }

    public String translation() { return translation; };
    
    /** Defines the current line number associated to an AST node. */
    //private void setLineNumber(RGLTree t) { linenumber = t.getLine();}

    /** Defines the current line number with a specific value */
    //private void setLineNumber(int l) { linenumber = l;}
    
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
        indent(); translation += statement+"\n";
    }
    
    /** Runs the program by calling the main function without parameters. */
    public void Run() throws UndefinedElementException {
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

    /** Translates the actions and fills the 'actionSet' set with their ids */
    private void translateActions (RGLTree tree) throws UndefinedElementException {
        int childNumber = 0;
        RGLTree action = tree.getChild(childNumber);
        while (action != null) {
            String actionId = action.getText();
            actionSet.add(actionId);
            
            String header = "void rgl_" + actionId + "(";            
            //parameters
            RGLTree arglist = action.getChild(0);
            int argNumber = 0;
            RGLTree arg = arglist.getChild(argNumber);
            if (arg != null) {
                header += "int " + arg.getText();
                //used to check that all used vars in the body have a value
                variableSet.add(arg.getText());
            }
            arg = arglist.getChild(++argNumber);
            while (arg != null) {
                variableSet.add(arg.getText());                
                header += ", int " + arg.getText();
                arg = arglist.getChild(++argNumber);
            }
            header += ") {";
            addLine(header);            
            translate(action.getChild(1));      //body
            addLine("}");
            
            variableSet.clear();
            
            addLine("");
            action = tree.getChild(++childNumber);  
        }          
    }
    
/*    
    // PROVISIONAL, NOMES TORNA ENTERS
    private int evaluateExpression(RGLTree t) {
        assert t != null;

        int previous_line = lineNumber();
        setLineNumber(t);
        
        int type = t.getType();
        int value = 0;        
        switch (type) {
            case RGLLexer.INT:
                value = Integer.parseInt(t.getText());
                break;            
            default: break;
        }
        
        setLineNumber(previous_line);
        return value;
    }
*/

    /** Begins the translation */
    private void translate (RGLTree tree) throws UndefinedElementException {
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
            case RGLLexer.CALL:
                break;                
            case RGLLexer.INSTRLIST:
                tabulation -= 4;    //since no line is written, undo the tabulation
                int childNum = 0;
                RGLTree child = tree.getChild(childNum);
                while (child != null) {
                    translate(child);
                    child = tree.getChild(++childNum);
                }
                tabulation += 4;    //back to original tabulation
                break;
            
            ////////// RGL EXPRESSIONS /////////////
            case RGLLexer.INITROBOT:
                if (robotInitialized) { /*error. throw exception*/ }
                robotInitialized = true;
                
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
                addLine("exec( action(RELEAS_EOBJECT) );");
                break;
            case RGLLexer.OBSTACLE:
                addLine("exec( action(OBSTACLE, " + translateExpression(tree.getChild(0)) +
                                             ", " + translateExpression(tree.getChild(1)) + ") );");
                return; 
            case RGLLexer.BOX:
                addLine("exec( action(BOX, " + translateExpression(tree.getChild(0)) +
                                        ", " + translateExpression(tree.getChild(1)) + ") );");
                break;  
            case RGLLexer.TRAIL:
                
                break;
            //function call
            default:
                String actionId = tree.getText();
                if (!actionSet.contains(actionId))
                    throw new UndefinedElementException(actionId, tree.getLine());
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
    
    private String translateExpression(RGLTree tree) throws UndefinedElementException {
        assert tree != null;
        int type = tree.getType();
        if (type == RGLLexer.TRUE || type == RGLLexer.ON) return "true";
        if (type == RGLLexer.FALSE || type == RGLLexer.OFF) return "false";
        if (type == RGLLexer.INT) return tree.getText();
        if (type == RGLLexer.ID) {
            String id = tree.getText();
            if (!variableSet.contains(id))
                throw new UndefinedElementException(id, tree.getLine());
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
        else return translateExpression(tree.getChild(0)) + " " + tree.getText() +
                    " " + translateExpression(tree.getChild(1));
    }
    
    /** Checks that the function call is valid
     */
     
    private boolean validFunction (RGLTree tree) {
        // Check that the number of parameters is the same
        return true;
    }
}
