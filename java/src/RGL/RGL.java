package RGL;

// Imports for ANTLR
import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import org.antlr.stringtemplate.*;

// Imports from Java
import java.io.*;

// Parser and Interpreter
import parser.*;
import interp.*;

/**
 * The class <code>RGL</code> implement the main function of the
 * interpreter. It accepts a set of options to generate the AST in
 * dot format and avoid the execution of the program. To know about
 * the accepted options, run the command RGL -help.
 */

public class RGL {

    private static String filename = null;
    private static boolean generateAST = false;
      
    /** Main program that invokes the parser and the interpreter. */
    
    public static void main(String[] args) throws Exception {
        // Parser for command line options
        readOptions(args);

        // Parsing of the input file        
        CharStream input = null;
        try { input = new ANTLRFileStream(filename+".rgl"); }
        catch (IOException e) {
            System.err.println ("Error: file " + filename + " could not be opened.");
            System.exit(1);
        }

        // Creates the lexer
        RGLLexer lex = new RGLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lex);

        // Creates and runs the parser. As a result, an AST is created
        RGLParser parser = new RGLParser(tokens);
        RGLTreeAdaptor adaptor = new RGLTreeAdaptor();
        parser.setTreeAdaptor(adaptor);
        RGLParser.prog_return result = null;
        try { result = parser.prog(); }
        catch (Exception e) {} // Just catch the exception (nothing to do)
        
        // Check for parsing errors
        int nerrors = parser.getNumberOfSyntaxErrors();
        if (nerrors > 0) {
            System.err.println (nerrors + " errors detected. " + "The program has not been translated.");
            System.exit(1);
        }

        RGLTree tree = (RGLTree)result.getTree();  //get the AST
        if (generateAST) {
            File ast = new File(filename+".dot");
            BufferedWriter output = new BufferedWriter(new FileWriter(ast));
            DOTTreeGenerator gen = new DOTTreeGenerator();
            output.write(gen.toDOT(tree).toString());
            output.close();
        }
        
        else {
            // Creates and prepares the translator
            Interp I = null;
            int linenumber = -1;
            try {
                I = new Interp(tree); // prepares the interpreter
                I.Run();                  // Executes the code
                
                File ast = new File("translation.txt");
                BufferedWriter output = new BufferedWriter(new FileWriter(ast));
                output.write(I.translation());
                output.close();
                
            } catch (UndefinedElementException e) {
                System.out.println("Translation error (line " + e.getLineNumber() + "): ");
                System.out.println("Variable (or function) " + e.getVariable() + 
                                   " is used but has no assigned value (or doesn't exist)");
            } catch (RuntimeException e) {
                System.out.println("Runtime exception");
            }
        }
    }

    // Check whether we want to generate the AST or translate the code.
    private static void readOptions(String[] args) {
        switch (args.length) {
            case 1:     filename = args[0]; break;                          // ./translate code.rgl
            case 2:     if (args[0].equals("-ast")) {                       // ./translate -ast code.rgl
                            filename = args[1];
                            generateAST = true;
                            break;
                        } else usage();      
            default:    usage();
        }
    }
    
    // Translator usage
    private static void usage() {
        System.out.println("Usage: ./translate [-ast] filename");
        System.out.println();
        System.out.println("If -asl option is added, the AST dot file will be generated and " +
                            "the program will not be translated.");
        System.exit(1);
    }
}

