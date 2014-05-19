// $ANTLR 3.4 /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g 2014-05-19 17:22:04

    package parser;
    import interp.RGLTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class RGLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "AND", "ARGLIST", "ASSIGN", "BEGIN", "BOX", "CALL", "COMMENT", "COS", "DEFINELIST", "DEFINITIONS", "DETECT", "DIV", "DO", "DOUBLE", "EAST", "ELSE", "END", "ENDACTION", "ENDDEFINITIONS", "ENDFUNC", "ENDIF", "EQUAL", "EQUALS", "ESC_SEQ", "FACE", "FALSE", "FEND", "FOR", "FROM", "FRONT", "FUNC", "GE", "GET", "GETPOSX", "GETPOSY", "GT", "ID", "IF", "INITMAP", "INITROBOT", "INSTRLIST", "INT", "LE", "LEFT", "LT", "MARK", "MINUS", "MOD", "MOVEFORWARD", "MOVETO", "MUL", "NORTH", "NOT", "NOT_EQUAL", "OBSTACLE", "OFF", "ON", "OR", "PICKOBJECT", "PLUS", "PROGRAM", "RELEASEOBJECT", "RETURN", "RGL", "RIGHT", "ROTATE", "SIN", "SOUTH", "SQRT", "STEP", "STOPROBOT", "STRING", "THEN", "TO", "TRAIL", "TRUE", "WEND", "WEST", "WHILE", "WS", "'('", "')'", "','", "':'"
    };

    public static final int EOF=-1;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int ACTION=4;
    public static final int AND=5;
    public static final int ARGLIST=6;
    public static final int ASSIGN=7;
    public static final int BEGIN=8;
    public static final int BOX=9;
    public static final int CALL=10;
    public static final int COMMENT=11;
    public static final int COS=12;
    public static final int DEFINELIST=13;
    public static final int DEFINITIONS=14;
    public static final int DETECT=15;
    public static final int DIV=16;
    public static final int DO=17;
    public static final int DOUBLE=18;
    public static final int EAST=19;
    public static final int ELSE=20;
    public static final int END=21;
    public static final int ENDACTION=22;
    public static final int ENDDEFINITIONS=23;
    public static final int ENDFUNC=24;
    public static final int ENDIF=25;
    public static final int EQUAL=26;
    public static final int EQUALS=27;
    public static final int ESC_SEQ=28;
    public static final int FACE=29;
    public static final int FALSE=30;
    public static final int FEND=31;
    public static final int FOR=32;
    public static final int FROM=33;
    public static final int FRONT=34;
    public static final int FUNC=35;
    public static final int GE=36;
    public static final int GET=37;
    public static final int GETPOSX=38;
    public static final int GETPOSY=39;
    public static final int GT=40;
    public static final int ID=41;
    public static final int IF=42;
    public static final int INITMAP=43;
    public static final int INITROBOT=44;
    public static final int INSTRLIST=45;
    public static final int INT=46;
    public static final int LE=47;
    public static final int LEFT=48;
    public static final int LT=49;
    public static final int MARK=50;
    public static final int MINUS=51;
    public static final int MOD=52;
    public static final int MOVEFORWARD=53;
    public static final int MOVETO=54;
    public static final int MUL=55;
    public static final int NORTH=56;
    public static final int NOT=57;
    public static final int NOT_EQUAL=58;
    public static final int OBSTACLE=59;
    public static final int OFF=60;
    public static final int ON=61;
    public static final int OR=62;
    public static final int PICKOBJECT=63;
    public static final int PLUS=64;
    public static final int PROGRAM=65;
    public static final int RELEASEOBJECT=66;
    public static final int RETURN=67;
    public static final int RGL=68;
    public static final int RIGHT=69;
    public static final int ROTATE=70;
    public static final int SIN=71;
    public static final int SOUTH=72;
    public static final int SQRT=73;
    public static final int STEP=74;
    public static final int STOPROBOT=75;
    public static final int STRING=76;
    public static final int THEN=77;
    public static final int TO=78;
    public static final int TRAIL=79;
    public static final int TRUE=80;
    public static final int WEND=81;
    public static final int WEST=82;
    public static final int WHILE=83;
    public static final int WS=84;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public RGLParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public RGLParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return RGLParser.tokenNames; }
    public String getGrammarFileName() { return "/home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:32:1: prog : ( definitions )? main EOF -> ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) ) ;
    public final RGLParser.prog_return prog() throws RecognitionException {
        RGLParser.prog_return retval = new RGLParser.prog_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token EOF3=null;
        RGLParser.definitions_return definitions1 =null;

        RGLParser.main_return main2 =null;


        RGLTree EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_definitions=new RewriteRuleSubtreeStream(adaptor,"rule definitions");
        RewriteRuleSubtreeStream stream_main=new RewriteRuleSubtreeStream(adaptor,"rule main");
        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:32:9: ( ( definitions )? main EOF -> ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) ) )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:32:11: ( definitions )? main EOF
            {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:32:11: ( definitions )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==DEFINITIONS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:32:11: definitions
                    {
                    pushFollow(FOLLOW_definitions_in_prog165);
                    definitions1=definitions();

                    state._fsp--;

                    stream_definitions.add(definitions1.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_main_in_prog168);
            main2=main();

            state._fsp--;

            stream_main.add(main2.getTree());

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog170);  
            stream_EOF.add(EOF3);


            // AST REWRITE
            // elements: definitions, main
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (RGLTree)adaptor.nil();
            // 33:10: -> ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) )
            {
                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:33:13: ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(RGL, "RGL")
                , root_1);

                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:33:19: ^( DEFINELIST ( definitions )? )
                {
                RGLTree root_2 = (RGLTree)adaptor.nil();
                root_2 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(DEFINELIST, "DEFINELIST")
                , root_2);

                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:33:32: ( definitions )?
                if ( stream_definitions.hasNext() ) {
                    adaptor.addChild(root_2, stream_definitions.nextTree());

                }
                stream_definitions.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:33:46: ^( INSTRLIST main )
                {
                RGLTree root_2 = (RGLTree)adaptor.nil();
                root_2 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(INSTRLIST, "INSTRLIST")
                , root_2);

                adaptor.addChild(root_2, stream_main.nextTree());

                adaptor.addChild(root_1, root_2);
                }

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class definitions_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "definitions"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:36:1: definitions : DEFINITIONS ! ( declaration )* ENDDEFINITIONS !;
    public final RGLParser.definitions_return definitions() throws RecognitionException {
        RGLParser.definitions_return retval = new RGLParser.definitions_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token DEFINITIONS4=null;
        Token ENDDEFINITIONS6=null;
        RGLParser.declaration_return declaration5 =null;


        RGLTree DEFINITIONS4_tree=null;
        RGLTree ENDDEFINITIONS6_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:36:13: ( DEFINITIONS ! ( declaration )* ENDDEFINITIONS !)
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:36:15: DEFINITIONS ! ( declaration )* ENDDEFINITIONS !
            {
            root_0 = (RGLTree)adaptor.nil();


            DEFINITIONS4=(Token)match(input,DEFINITIONS,FOLLOW_DEFINITIONS_in_definitions215); 

            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:36:28: ( declaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ACTION||LA2_0==FUNC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:36:28: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_definitions218);
            	    declaration5=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            ENDDEFINITIONS6=(Token)match(input,ENDDEFINITIONS,FOLLOW_ENDDEFINITIONS_in_definitions221); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "definitions"


    public static class declaration_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:39:1: declaration : ( action | function );
    public final RGLParser.declaration_return declaration() throws RecognitionException {
        RGLParser.declaration_return retval = new RGLParser.declaration_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.action_return action7 =null;

        RGLParser.function_return function8 =null;



        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:39:13: ( action | function )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ACTION) ) {
                alt3=1;
            }
            else if ( (LA3_0==FUNC) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:39:15: action
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_action_in_declaration239);
                    action7=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action7.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:39:24: function
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_declaration243);
                    function8=function();

                    state._fsp--;

                    adaptor.addChild(root_0, function8.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class action_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "action"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:42:1: action : ACTION ^ ID argList ':' ! instrList ENDACTION !;
    public final RGLParser.action_return action() throws RecognitionException {
        RGLParser.action_return retval = new RGLParser.action_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token ACTION9=null;
        Token ID10=null;
        Token char_literal12=null;
        Token ENDACTION14=null;
        RGLParser.argList_return argList11 =null;

        RGLParser.instrList_return instrList13 =null;


        RGLTree ACTION9_tree=null;
        RGLTree ID10_tree=null;
        RGLTree char_literal12_tree=null;
        RGLTree ENDACTION14_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:42:9: ( ACTION ^ ID argList ':' ! instrList ENDACTION !)
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:42:11: ACTION ^ ID argList ':' ! instrList ENDACTION !
            {
            root_0 = (RGLTree)adaptor.nil();


            ACTION9=(Token)match(input,ACTION,FOLLOW_ACTION_in_action277); 
            ACTION9_tree = 
            (RGLTree)adaptor.create(ACTION9)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(ACTION9_tree, root_0);


            ID10=(Token)match(input,ID,FOLLOW_ID_in_action280); 
            ID10_tree = 
            (RGLTree)adaptor.create(ID10)
            ;
            adaptor.addChild(root_0, ID10_tree);


            pushFollow(FOLLOW_argList_in_action282);
            argList11=argList();

            state._fsp--;

            adaptor.addChild(root_0, argList11.getTree());

            char_literal12=(Token)match(input,88,FOLLOW_88_in_action284); 

            pushFollow(FOLLOW_instrList_in_action287);
            instrList13=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList13.getTree());

            ENDACTION14=(Token)match(input,ENDACTION,FOLLOW_ENDACTION_in_action289); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "action"


    public static class function_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "function"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:44:1: function : FUNC ^ ID argList ':' ! instrList ENDFUNC !;
    public final RGLParser.function_return function() throws RecognitionException {
        RGLParser.function_return retval = new RGLParser.function_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token FUNC15=null;
        Token ID16=null;
        Token char_literal18=null;
        Token ENDFUNC20=null;
        RGLParser.argList_return argList17 =null;

        RGLParser.instrList_return instrList19 =null;


        RGLTree FUNC15_tree=null;
        RGLTree ID16_tree=null;
        RGLTree char_literal18_tree=null;
        RGLTree ENDFUNC20_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:44:10: ( FUNC ^ ID argList ':' ! instrList ENDFUNC !)
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:44:12: FUNC ^ ID argList ':' ! instrList ENDFUNC !
            {
            root_0 = (RGLTree)adaptor.nil();


            FUNC15=(Token)match(input,FUNC,FOLLOW_FUNC_in_function306); 
            FUNC15_tree = 
            (RGLTree)adaptor.create(FUNC15)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(FUNC15_tree, root_0);


            ID16=(Token)match(input,ID,FOLLOW_ID_in_function309); 
            ID16_tree = 
            (RGLTree)adaptor.create(ID16)
            ;
            adaptor.addChild(root_0, ID16_tree);


            pushFollow(FOLLOW_argList_in_function311);
            argList17=argList();

            state._fsp--;

            adaptor.addChild(root_0, argList17.getTree());

            char_literal18=(Token)match(input,88,FOLLOW_88_in_function313); 

            pushFollow(FOLLOW_instrList_in_function316);
            instrList19=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList19.getTree());

            ENDFUNC20=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_function318); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "function"


    public static class main_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:47:1: main : BEGIN ! initialInstr instrList END !;
    public final RGLParser.main_return main() throws RecognitionException {
        RGLParser.main_return retval = new RGLParser.main_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token BEGIN21=null;
        Token END24=null;
        RGLParser.initialInstr_return initialInstr22 =null;

        RGLParser.instrList_return instrList23 =null;


        RGLTree BEGIN21_tree=null;
        RGLTree END24_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:47:9: ( BEGIN ! initialInstr instrList END !)
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:47:11: BEGIN ! initialInstr instrList END !
            {
            root_0 = (RGLTree)adaptor.nil();


            BEGIN21=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_main348); 

            pushFollow(FOLLOW_initialInstr_in_main351);
            initialInstr22=initialInstr();

            state._fsp--;

            adaptor.addChild(root_0, initialInstr22.getTree());

            pushFollow(FOLLOW_instrList_in_main353);
            instrList23=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList23.getTree());

            END24=(Token)match(input,END,FOLLOW_END_in_main355); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "main"


    public static class initialInstr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initialInstr"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:50:1: initialInstr : ( setMap )? setRobot ;
    public final RGLParser.initialInstr_return initialInstr() throws RecognitionException {
        RGLParser.initialInstr_return retval = new RGLParser.initialInstr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.setMap_return setMap25 =null;

        RGLParser.setRobot_return setRobot26 =null;



        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:50:14: ( ( setMap )? setRobot )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:50:17: ( setMap )? setRobot
            {
            root_0 = (RGLTree)adaptor.nil();


            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:50:17: ( setMap )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INITMAP) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:50:17: setMap
                    {
                    pushFollow(FOLLOW_setMap_in_initialInstr376);
                    setMap25=setMap();

                    state._fsp--;

                    adaptor.addChild(root_0, setMap25.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_setRobot_in_initialInstr379);
            setRobot26=setRobot();

            state._fsp--;

            adaptor.addChild(root_0, setRobot26.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initialInstr"


    public static class setMap_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "setMap"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:53:1: setMap : INITMAP ^ INT ;
    public final RGLParser.setMap_return setMap() throws RecognitionException {
        RGLParser.setMap_return retval = new RGLParser.setMap_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token INITMAP27=null;
        Token INT28=null;

        RGLTree INITMAP27_tree=null;
        RGLTree INT28_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:53:9: ( INITMAP ^ INT )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:53:13: INITMAP ^ INT
            {
            root_0 = (RGLTree)adaptor.nil();


            INITMAP27=(Token)match(input,INITMAP,FOLLOW_INITMAP_in_setMap404); 
            INITMAP27_tree = 
            (RGLTree)adaptor.create(INITMAP27)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(INITMAP27_tree, root_0);


            INT28=(Token)match(input,INT,FOLLOW_INT_in_setMap407); 
            INT28_tree = 
            (RGLTree)adaptor.create(INT28)
            ;
            adaptor.addChild(root_0, INT28_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "setMap"


    public static class setRobot_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "setRobot"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:56:1: setRobot : INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr ;
    public final RGLParser.setRobot_return setRobot() throws RecognitionException {
        RGLParser.setRobot_return retval = new RGLParser.setRobot_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token INITROBOT29=null;
        Token char_literal31=null;
        Token char_literal33=null;
        RGLParser.numExpr_return numExpr30 =null;

        RGLParser.numExpr_return numExpr32 =null;

        RGLParser.numExpr_return numExpr34 =null;


        RGLTree INITROBOT29_tree=null;
        RGLTree char_literal31_tree=null;
        RGLTree char_literal33_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:56:13: ( INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:56:15: INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr
            {
            root_0 = (RGLTree)adaptor.nil();


            INITROBOT29=(Token)match(input,INITROBOT,FOLLOW_INITROBOT_in_setRobot427); 
            INITROBOT29_tree = 
            (RGLTree)adaptor.create(INITROBOT29)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(INITROBOT29_tree, root_0);


            pushFollow(FOLLOW_numExpr_in_setRobot430);
            numExpr30=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr30.getTree());

            char_literal31=(Token)match(input,87,FOLLOW_87_in_setRobot432); 

            pushFollow(FOLLOW_numExpr_in_setRobot435);
            numExpr32=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr32.getTree());

            char_literal33=(Token)match(input,87,FOLLOW_87_in_setRobot437); 

            pushFollow(FOLLOW_numExpr_in_setRobot440);
            numExpr34=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr34.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "setRobot"


    public static class instr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instr"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:59:1: instr : ( whileExpr | forExpr | ifExpr | actioncall | ID '=' ^ numExpr | RETURN ^ numExpr | MOVEFORWARD ^ numExpr | STOPROBOT ^ numExpr | MOVETO ^ numExpr ',' ! numExpr | ROTATE ^ numExpr | FACE ^ direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE ^ numExpr ',' ! numExpr | BOX ^ numExpr ',' ! numExpr | TRAIL ^ ( boolExpr | ON | OFF ) | MARK ^ numExpr ',' ! numExpr );
    public final RGLParser.instr_return instr() throws RecognitionException {
        RGLParser.instr_return retval = new RGLParser.instr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token ID39=null;
        Token char_literal40=null;
        Token RETURN42=null;
        Token MOVEFORWARD44=null;
        Token STOPROBOT46=null;
        Token MOVETO48=null;
        Token char_literal50=null;
        Token ROTATE52=null;
        Token FACE54=null;
        Token PICKOBJECT56=null;
        Token RELEASEOBJECT57=null;
        Token OBSTACLE58=null;
        Token char_literal60=null;
        Token BOX62=null;
        Token char_literal64=null;
        Token TRAIL66=null;
        Token ON68=null;
        Token OFF69=null;
        Token MARK70=null;
        Token char_literal72=null;
        RGLParser.whileExpr_return whileExpr35 =null;

        RGLParser.forExpr_return forExpr36 =null;

        RGLParser.ifExpr_return ifExpr37 =null;

        RGLParser.actioncall_return actioncall38 =null;

        RGLParser.numExpr_return numExpr41 =null;

        RGLParser.numExpr_return numExpr43 =null;

        RGLParser.numExpr_return numExpr45 =null;

        RGLParser.numExpr_return numExpr47 =null;

        RGLParser.numExpr_return numExpr49 =null;

        RGLParser.numExpr_return numExpr51 =null;

        RGLParser.numExpr_return numExpr53 =null;

        RGLParser.direction_return direction55 =null;

        RGLParser.numExpr_return numExpr59 =null;

        RGLParser.numExpr_return numExpr61 =null;

        RGLParser.numExpr_return numExpr63 =null;

        RGLParser.numExpr_return numExpr65 =null;

        RGLParser.boolExpr_return boolExpr67 =null;

        RGLParser.numExpr_return numExpr71 =null;

        RGLParser.numExpr_return numExpr73 =null;


        RGLTree ID39_tree=null;
        RGLTree char_literal40_tree=null;
        RGLTree RETURN42_tree=null;
        RGLTree MOVEFORWARD44_tree=null;
        RGLTree STOPROBOT46_tree=null;
        RGLTree MOVETO48_tree=null;
        RGLTree char_literal50_tree=null;
        RGLTree ROTATE52_tree=null;
        RGLTree FACE54_tree=null;
        RGLTree PICKOBJECT56_tree=null;
        RGLTree RELEASEOBJECT57_tree=null;
        RGLTree OBSTACLE58_tree=null;
        RGLTree char_literal60_tree=null;
        RGLTree BOX62_tree=null;
        RGLTree char_literal64_tree=null;
        RGLTree TRAIL66_tree=null;
        RGLTree ON68_tree=null;
        RGLTree OFF69_tree=null;
        RGLTree MARK70_tree=null;
        RGLTree char_literal72_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:59:9: ( whileExpr | forExpr | ifExpr | actioncall | ID '=' ^ numExpr | RETURN ^ numExpr | MOVEFORWARD ^ numExpr | STOPROBOT ^ numExpr | MOVETO ^ numExpr ',' ! numExpr | ROTATE ^ numExpr | FACE ^ direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE ^ numExpr ',' ! numExpr | BOX ^ numExpr ',' ! numExpr | TRAIL ^ ( boolExpr | ON | OFF ) | MARK ^ numExpr ',' ! numExpr )
            int alt6=17;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt6=1;
                }
                break;
            case FOR:
                {
                alt6=2;
                }
                break;
            case IF:
                {
                alt6=3;
                }
                break;
            case ID:
                {
                int LA6_4 = input.LA(2);

                if ( (LA6_4==85) ) {
                    alt6=4;
                }
                else if ( (LA6_4==EQUAL) ) {
                    alt6=5;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 4, input);

                    throw nvae;

                }
                }
                break;
            case RETURN:
                {
                alt6=6;
                }
                break;
            case MOVEFORWARD:
                {
                alt6=7;
                }
                break;
            case STOPROBOT:
                {
                alt6=8;
                }
                break;
            case MOVETO:
                {
                alt6=9;
                }
                break;
            case ROTATE:
                {
                alt6=10;
                }
                break;
            case FACE:
                {
                alt6=11;
                }
                break;
            case PICKOBJECT:
                {
                alt6=12;
                }
                break;
            case RELEASEOBJECT:
                {
                alt6=13;
                }
                break;
            case OBSTACLE:
                {
                alt6=14;
                }
                break;
            case BOX:
                {
                alt6=15;
                }
                break;
            case TRAIL:
                {
                alt6=16;
                }
                break;
            case MARK:
                {
                alt6=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }

            switch (alt6) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:61:9: whileExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_whileExpr_in_instr480);
                    whileExpr35=whileExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, whileExpr35.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:61:21: forExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_forExpr_in_instr484);
                    forExpr36=forExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, forExpr36.getTree());

                    }
                    break;
                case 3 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:62:11: ifExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_ifExpr_in_instr529);
                    ifExpr37=ifExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, ifExpr37.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:63:11: actioncall
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_actioncall_in_instr585);
                    actioncall38=actioncall();

                    state._fsp--;

                    adaptor.addChild(root_0, actioncall38.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:64:11: ID '=' ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ID39=(Token)match(input,ID,FOLLOW_ID_in_instr597); 
                    ID39_tree = 
                    (RGLTree)adaptor.create(ID39)
                    ;
                    adaptor.addChild(root_0, ID39_tree);


                    char_literal40=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instr599); 
                    char_literal40_tree = 
                    (RGLTree)adaptor.create(char_literal40)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal40_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr602);
                    numExpr41=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr41.getTree());

                    }
                    break;
                case 6 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:65:11: RETURN ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    RETURN42=(Token)match(input,RETURN,FOLLOW_RETURN_in_instr649); 
                    RETURN42_tree = 
                    (RGLTree)adaptor.create(RETURN42)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(RETURN42_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr652);
                    numExpr43=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr43.getTree());

                    }
                    break;
                case 7 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:68:11: MOVEFORWARD ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MOVEFORWARD44=(Token)match(input,MOVEFORWARD,FOLLOW_MOVEFORWARD_in_instr682); 
                    MOVEFORWARD44_tree = 
                    (RGLTree)adaptor.create(MOVEFORWARD44)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVEFORWARD44_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr685);
                    numExpr45=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr45.getTree());

                    }
                    break;
                case 8 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:69:11: STOPROBOT ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    STOPROBOT46=(Token)match(input,STOPROBOT,FOLLOW_STOPROBOT_in_instr697); 
                    STOPROBOT46_tree = 
                    (RGLTree)adaptor.create(STOPROBOT46)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(STOPROBOT46_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr700);
                    numExpr47=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr47.getTree());

                    }
                    break;
                case 9 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:70:11: MOVETO ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MOVETO48=(Token)match(input,MOVETO,FOLLOW_MOVETO_in_instr712); 
                    MOVETO48_tree = 
                    (RGLTree)adaptor.create(MOVETO48)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVETO48_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr715);
                    numExpr49=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr49.getTree());

                    char_literal50=(Token)match(input,87,FOLLOW_87_in_instr717); 

                    pushFollow(FOLLOW_numExpr_in_instr720);
                    numExpr51=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr51.getTree());

                    }
                    break;
                case 10 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:71:11: ROTATE ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ROTATE52=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_instr732); 
                    ROTATE52_tree = 
                    (RGLTree)adaptor.create(ROTATE52)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(ROTATE52_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr735);
                    numExpr53=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr53.getTree());

                    }
                    break;
                case 11 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:72:11: FACE ^ direction
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    FACE54=(Token)match(input,FACE,FOLLOW_FACE_in_instr747); 
                    FACE54_tree = 
                    (RGLTree)adaptor.create(FACE54)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(FACE54_tree, root_0);


                    pushFollow(FOLLOW_direction_in_instr750);
                    direction55=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction55.getTree());

                    }
                    break;
                case 12 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:73:11: PICKOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    PICKOBJECT56=(Token)match(input,PICKOBJECT,FOLLOW_PICKOBJECT_in_instr762); 
                    PICKOBJECT56_tree = 
                    (RGLTree)adaptor.create(PICKOBJECT56)
                    ;
                    adaptor.addChild(root_0, PICKOBJECT56_tree);


                    }
                    break;
                case 13 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:74:11: RELEASEOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    RELEASEOBJECT57=(Token)match(input,RELEASEOBJECT,FOLLOW_RELEASEOBJECT_in_instr774); 
                    RELEASEOBJECT57_tree = 
                    (RGLTree)adaptor.create(RELEASEOBJECT57)
                    ;
                    adaptor.addChild(root_0, RELEASEOBJECT57_tree);


                    }
                    break;
                case 14 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:75:11: OBSTACLE ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    OBSTACLE58=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_instr786); 
                    OBSTACLE58_tree = 
                    (RGLTree)adaptor.create(OBSTACLE58)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(OBSTACLE58_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr789);
                    numExpr59=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr59.getTree());

                    char_literal60=(Token)match(input,87,FOLLOW_87_in_instr791); 

                    pushFollow(FOLLOW_numExpr_in_instr794);
                    numExpr61=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr61.getTree());

                    }
                    break;
                case 15 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:76:11: BOX ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    BOX62=(Token)match(input,BOX,FOLLOW_BOX_in_instr806); 
                    BOX62_tree = 
                    (RGLTree)adaptor.create(BOX62)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(BOX62_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr809);
                    numExpr63=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr63.getTree());

                    char_literal64=(Token)match(input,87,FOLLOW_87_in_instr811); 

                    pushFollow(FOLLOW_numExpr_in_instr814);
                    numExpr65=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr65.getTree());

                    }
                    break;
                case 16 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:77:11: TRAIL ^ ( boolExpr | ON | OFF )
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    TRAIL66=(Token)match(input,TRAIL,FOLLOW_TRAIL_in_instr826); 
                    TRAIL66_tree = 
                    (RGLTree)adaptor.create(TRAIL66)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(TRAIL66_tree, root_0);


                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:77:18: ( boolExpr | ON | OFF )
                    int alt5=3;
                    switch ( input.LA(1) ) {
                    case COS:
                    case DETECT:
                    case DOUBLE:
                    case FALSE:
                    case GETPOSX:
                    case GETPOSY:
                    case ID:
                    case INT:
                    case MINUS:
                    case NOT:
                    case PLUS:
                    case SIN:
                    case SQRT:
                    case TRUE:
                    case 85:
                        {
                        alt5=1;
                        }
                        break;
                    case ON:
                        {
                        alt5=2;
                        }
                        break;
                    case OFF:
                        {
                        alt5=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 5, 0, input);

                        throw nvae;

                    }

                    switch (alt5) {
                        case 1 :
                            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:77:19: boolExpr
                            {
                            pushFollow(FOLLOW_boolExpr_in_instr830);
                            boolExpr67=boolExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, boolExpr67.getTree());

                            }
                            break;
                        case 2 :
                            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:77:30: ON
                            {
                            ON68=(Token)match(input,ON,FOLLOW_ON_in_instr834); 
                            ON68_tree = 
                            (RGLTree)adaptor.create(ON68)
                            ;
                            adaptor.addChild(root_0, ON68_tree);


                            }
                            break;
                        case 3 :
                            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:77:35: OFF
                            {
                            OFF69=(Token)match(input,OFF,FOLLOW_OFF_in_instr838); 
                            OFF69_tree = 
                            (RGLTree)adaptor.create(OFF69)
                            ;
                            adaptor.addChild(root_0, OFF69_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 17 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:78:11: MARK ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MARK70=(Token)match(input,MARK,FOLLOW_MARK_in_instr851); 
                    MARK70_tree = 
                    (RGLTree)adaptor.create(MARK70)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MARK70_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr854);
                    numExpr71=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr71.getTree());

                    char_literal72=(Token)match(input,87,FOLLOW_87_in_instr856); 

                    pushFollow(FOLLOW_numExpr_in_instr859);
                    numExpr73=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr73.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instr"


    public static class actioncall_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "actioncall"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:81:1: actioncall : ID '(' ( params )? ')' -> ^( CALL ID ( params )? ) ;
    public final RGLParser.actioncall_return actioncall() throws RecognitionException {
        RGLParser.actioncall_return retval = new RGLParser.actioncall_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token ID74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        RGLParser.params_return params76 =null;


        RGLTree ID74_tree=null;
        RGLTree char_literal75_tree=null;
        RGLTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:81:13: ( ID '(' ( params )? ')' -> ^( CALL ID ( params )? ) )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:81:15: ID '(' ( params )? ')'
            {
            ID74=(Token)match(input,ID,FOLLOW_ID_in_actioncall885);  
            stream_ID.add(ID74);


            char_literal75=(Token)match(input,85,FOLLOW_85_in_actioncall887);  
            stream_85.add(char_literal75);


            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:81:22: ( params )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==COS||LA7_0==DOUBLE||(LA7_0 >= GETPOSX && LA7_0 <= GETPOSY)||LA7_0==ID||LA7_0==INT||LA7_0==MINUS||LA7_0==PLUS||LA7_0==SIN||LA7_0==SQRT||LA7_0==85) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:81:22: params
                    {
                    pushFollow(FOLLOW_params_in_actioncall889);
                    params76=params();

                    state._fsp--;

                    stream_params.add(params76.getTree());

                    }
                    break;

            }


            char_literal77=(Token)match(input,86,FOLLOW_86_in_actioncall892);  
            stream_86.add(char_literal77);


            // AST REWRITE
            // elements: params, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (RGLTree)adaptor.nil();
            // 82:9: -> ^( CALL ID ( params )? )
            {
                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:82:12: ^( CALL ID ( params )? )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(CALL, "CALL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:82:22: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "actioncall"


    public static class funccall_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "funccall"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:85:1: funccall : ID '(' ( params )? ')' -> ^( GET ID ( params )? ) ;
    public final RGLParser.funccall_return funccall() throws RecognitionException {
        RGLParser.funccall_return retval = new RGLParser.funccall_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token ID78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        RGLParser.params_return params80 =null;


        RGLTree ID78_tree=null;
        RGLTree char_literal79_tree=null;
        RGLTree char_literal81_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleTokenStream stream_85=new RewriteRuleTokenStream(adaptor,"token 85");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:85:9: ( ID '(' ( params )? ')' -> ^( GET ID ( params )? ) )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:85:11: ID '(' ( params )? ')'
            {
            ID78=(Token)match(input,ID,FOLLOW_ID_in_funccall935);  
            stream_ID.add(ID78);


            char_literal79=(Token)match(input,85,FOLLOW_85_in_funccall937);  
            stream_85.add(char_literal79);


            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:85:18: ( params )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==COS||LA8_0==DOUBLE||(LA8_0 >= GETPOSX && LA8_0 <= GETPOSY)||LA8_0==ID||LA8_0==INT||LA8_0==MINUS||LA8_0==PLUS||LA8_0==SIN||LA8_0==SQRT||LA8_0==85) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:85:18: params
                    {
                    pushFollow(FOLLOW_params_in_funccall939);
                    params80=params();

                    state._fsp--;

                    stream_params.add(params80.getTree());

                    }
                    break;

            }


            char_literal81=(Token)match(input,86,FOLLOW_86_in_funccall942);  
            stream_86.add(char_literal81);


            // AST REWRITE
            // elements: params, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (RGLTree)adaptor.nil();
            // 86:9: -> ^( GET ID ( params )? )
            {
                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:86:12: ^( GET ID ( params )? )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(GET, "GET")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:86:21: ( params )?
                if ( stream_params.hasNext() ) {
                    adaptor.addChild(root_1, stream_params.nextTree());

                }
                stream_params.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "funccall"


    public static class params_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "params"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:89:1: params : numExpr ( ',' numExpr )* ;
    public final RGLParser.params_return params() throws RecognitionException {
        RGLParser.params_return retval = new RGLParser.params_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal83=null;
        RGLParser.numExpr_return numExpr82 =null;

        RGLParser.numExpr_return numExpr84 =null;


        RGLTree char_literal83_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:89:8: ( numExpr ( ',' numExpr )* )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:89:10: numExpr ( ',' numExpr )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_numExpr_in_params986);
            numExpr82=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr82.getTree());

            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:89:18: ( ',' numExpr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==87) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:89:19: ',' numExpr
            	    {
            	    char_literal83=(Token)match(input,87,FOLLOW_87_in_params989); 
            	    char_literal83_tree = 
            	    (RGLTree)adaptor.create(char_literal83)
            	    ;
            	    adaptor.addChild(root_0, char_literal83_tree);


            	    pushFollow(FOLLOW_numExpr_in_params991);
            	    numExpr84=numExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, numExpr84.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "params"


    public static class argList_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argList"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:92:1: argList : ( args )? -> ^( ARGLIST ( args )? ) ;
    public final RGLParser.argList_return argList() throws RecognitionException {
        RGLParser.argList_return retval = new RGLParser.argList_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.args_return args85 =null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:92:9: ( ( args )? -> ^( ARGLIST ( args )? ) )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:92:11: ( args )?
            {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:92:11: ( args )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==DOUBLE||LA10_0==ID) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:92:11: args
                    {
                    pushFollow(FOLLOW_args_in_argList1010);
                    args85=args();

                    state._fsp--;

                    stream_args.add(args85.getTree());

                    }
                    break;

            }


            // AST REWRITE
            // elements: args
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (RGLTree)adaptor.nil();
            // 92:17: -> ^( ARGLIST ( args )? )
            {
                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:92:20: ^( ARGLIST ( args )? )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_1);

                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:92:30: ( args )?
                if ( stream_args.hasNext() ) {
                    adaptor.addChild(root_1, stream_args.nextTree());

                }
                stream_args.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "argList"


    public static class args_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "args"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:94:1: args : arg ( ',' ! arg )* ;
    public final RGLParser.args_return args() throws RecognitionException {
        RGLParser.args_return retval = new RGLParser.args_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal87=null;
        RGLParser.arg_return arg86 =null;

        RGLParser.arg_return arg88 =null;


        RGLTree char_literal87_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:94:9: ( arg ( ',' ! arg )* )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:94:11: arg ( ',' ! arg )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_arg_in_args1039);
            arg86=arg();

            state._fsp--;

            adaptor.addChild(root_0, arg86.getTree());

            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:94:15: ( ',' ! arg )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==87) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:94:16: ',' ! arg
            	    {
            	    char_literal87=(Token)match(input,87,FOLLOW_87_in_args1042); 

            	    pushFollow(FOLLOW_arg_in_args1045);
            	    arg88=arg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arg88.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "args"


    public static class arg_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arg"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:97:1: arg : ( ID | DOUBLE );
    public final RGLParser.arg_return arg() throws RecognitionException {
        RGLParser.arg_return retval = new RGLParser.arg_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set89=null;

        RGLTree set89_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:97:9: ( ID | DOUBLE )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set89=(Token)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set89)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arg"


    public static class instrList_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instrList"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:100:1: instrList : ( instr )* -> ^( INSTRLIST ( instr )* ) ;
    public final RGLParser.instrList_return instrList() throws RecognitionException {
        RGLParser.instrList_return retval = new RGLParser.instrList_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.instr_return instr90 =null;


        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:100:13: ( ( instr )* -> ^( INSTRLIST ( instr )* ) )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:100:15: ( instr )*
            {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:100:15: ( instr )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==BOX||LA12_0==FACE||LA12_0==FOR||(LA12_0 >= ID && LA12_0 <= IF)||LA12_0==MARK||(LA12_0 >= MOVEFORWARD && LA12_0 <= MOVETO)||LA12_0==OBSTACLE||LA12_0==PICKOBJECT||(LA12_0 >= RELEASEOBJECT && LA12_0 <= RETURN)||LA12_0==ROTATE||LA12_0==STOPROBOT||LA12_0==TRAIL||LA12_0==WHILE) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:100:15: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_instrList1091);
            	    instr90=instr();

            	    state._fsp--;

            	    stream_instr.add(instr90.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
                }
            } while (true);


            // AST REWRITE
            // elements: instr
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (RGLTree)adaptor.nil();
            // 100:23: -> ^( INSTRLIST ( instr )* )
            {
                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:100:26: ^( INSTRLIST ( instr )* )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(INSTRLIST, "INSTRLIST")
                , root_1);

                // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:100:38: ( instr )*
                while ( stream_instr.hasNext() ) {
                    adaptor.addChild(root_1, stream_instr.nextTree());

                }
                stream_instr.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "instrList"


    public static class whileExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileExpr"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:103:1: whileExpr : WHILE ^ boolExpr DO ! instrList WEND !;
    public final RGLParser.whileExpr_return whileExpr() throws RecognitionException {
        RGLParser.whileExpr_return retval = new RGLParser.whileExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token WHILE91=null;
        Token DO93=null;
        Token WEND95=null;
        RGLParser.boolExpr_return boolExpr92 =null;

        RGLParser.instrList_return instrList94 =null;


        RGLTree WHILE91_tree=null;
        RGLTree DO93_tree=null;
        RGLTree WEND95_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:103:13: ( WHILE ^ boolExpr DO ! instrList WEND !)
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:103:15: WHILE ^ boolExpr DO ! instrList WEND !
            {
            root_0 = (RGLTree)adaptor.nil();


            WHILE91=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExpr1147); 
            WHILE91_tree = 
            (RGLTree)adaptor.create(WHILE91)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(WHILE91_tree, root_0);


            pushFollow(FOLLOW_boolExpr_in_whileExpr1150);
            boolExpr92=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr92.getTree());

            DO93=(Token)match(input,DO,FOLLOW_DO_in_whileExpr1152); 

            pushFollow(FOLLOW_instrList_in_whileExpr1155);
            instrList94=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList94.getTree());

            WEND95=(Token)match(input,WEND,FOLLOW_WEND_in_whileExpr1157); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileExpr"


    public static class forExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forExpr"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:106:1: forExpr : FOR ^ ID FROM ! DOUBLE TO ! DOUBLE ( STEP ! DOUBLE )? DO ! instrList FEND !;
    public final RGLParser.forExpr_return forExpr() throws RecognitionException {
        RGLParser.forExpr_return retval = new RGLParser.forExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token FOR96=null;
        Token ID97=null;
        Token FROM98=null;
        Token DOUBLE99=null;
        Token TO100=null;
        Token DOUBLE101=null;
        Token STEP102=null;
        Token DOUBLE103=null;
        Token DO104=null;
        Token FEND106=null;
        RGLParser.instrList_return instrList105 =null;


        RGLTree FOR96_tree=null;
        RGLTree ID97_tree=null;
        RGLTree FROM98_tree=null;
        RGLTree DOUBLE99_tree=null;
        RGLTree TO100_tree=null;
        RGLTree DOUBLE101_tree=null;
        RGLTree STEP102_tree=null;
        RGLTree DOUBLE103_tree=null;
        RGLTree DO104_tree=null;
        RGLTree FEND106_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:106:13: ( FOR ^ ID FROM ! DOUBLE TO ! DOUBLE ( STEP ! DOUBLE )? DO ! instrList FEND !)
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:106:15: FOR ^ ID FROM ! DOUBLE TO ! DOUBLE ( STEP ! DOUBLE )? DO ! instrList FEND !
            {
            root_0 = (RGLTree)adaptor.nil();


            FOR96=(Token)match(input,FOR,FOLLOW_FOR_in_forExpr1195); 
            FOR96_tree = 
            (RGLTree)adaptor.create(FOR96)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(FOR96_tree, root_0);


            ID97=(Token)match(input,ID,FOLLOW_ID_in_forExpr1198); 
            ID97_tree = 
            (RGLTree)adaptor.create(ID97)
            ;
            adaptor.addChild(root_0, ID97_tree);


            FROM98=(Token)match(input,FROM,FOLLOW_FROM_in_forExpr1200); 

            DOUBLE99=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forExpr1203); 
            DOUBLE99_tree = 
            (RGLTree)adaptor.create(DOUBLE99)
            ;
            adaptor.addChild(root_0, DOUBLE99_tree);


            TO100=(Token)match(input,TO,FOLLOW_TO_in_forExpr1205); 

            DOUBLE101=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forExpr1208); 
            DOUBLE101_tree = 
            (RGLTree)adaptor.create(DOUBLE101)
            ;
            adaptor.addChild(root_0, DOUBLE101_tree);


            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:106:47: ( STEP ! DOUBLE )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==STEP) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:106:48: STEP ! DOUBLE
                    {
                    STEP102=(Token)match(input,STEP,FOLLOW_STEP_in_forExpr1211); 

                    DOUBLE103=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forExpr1214); 
                    DOUBLE103_tree = 
                    (RGLTree)adaptor.create(DOUBLE103)
                    ;
                    adaptor.addChild(root_0, DOUBLE103_tree);


                    }
                    break;

            }


            DO104=(Token)match(input,DO,FOLLOW_DO_in_forExpr1238); 

            pushFollow(FOLLOW_instrList_in_forExpr1241);
            instrList105=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList105.getTree());

            FEND106=(Token)match(input,FEND,FOLLOW_FEND_in_forExpr1243); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forExpr"


    public static class ifExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifExpr"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:110:1: ifExpr : IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !;
    public final RGLParser.ifExpr_return ifExpr() throws RecognitionException {
        RGLParser.ifExpr_return retval = new RGLParser.ifExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token IF107=null;
        Token THEN109=null;
        Token ELSE111=null;
        Token ENDIF113=null;
        RGLParser.boolExpr_return boolExpr108 =null;

        RGLParser.instrList_return instrList110 =null;

        RGLParser.instrList_return instrList112 =null;


        RGLTree IF107_tree=null;
        RGLTree THEN109_tree=null;
        RGLTree ELSE111_tree=null;
        RGLTree ENDIF113_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:110:13: ( IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !)
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:110:15: IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !
            {
            root_0 = (RGLTree)adaptor.nil();


            IF107=(Token)match(input,IF,FOLLOW_IF_in_ifExpr1282); 
            IF107_tree = 
            (RGLTree)adaptor.create(IF107)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(IF107_tree, root_0);


            pushFollow(FOLLOW_boolExpr_in_ifExpr1285);
            boolExpr108=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr108.getTree());

            THEN109=(Token)match(input,THEN,FOLLOW_THEN_in_ifExpr1287); 

            pushFollow(FOLLOW_instrList_in_ifExpr1290);
            instrList110=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList110.getTree());

            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:110:44: ( ELSE ! instrList )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==ELSE) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:110:45: ELSE ! instrList
                    {
                    ELSE111=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifExpr1293); 

                    pushFollow(FOLLOW_instrList_in_ifExpr1296);
                    instrList112=instrList();

                    state._fsp--;

                    adaptor.addChild(root_0, instrList112.getTree());

                    }
                    break;

            }


            ENDIF113=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExpr1300); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifExpr"


    public static class boolExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolExpr"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:114:1: boolExpr : boolterm ( OR ^ boolterm )* ;
    public final RGLParser.boolExpr_return boolExpr() throws RecognitionException {
        RGLParser.boolExpr_return retval = new RGLParser.boolExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token OR115=null;
        RGLParser.boolterm_return boolterm114 =null;

        RGLParser.boolterm_return boolterm116 =null;


        RGLTree OR115_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:114:13: ( boolterm ( OR ^ boolterm )* )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:114:15: boolterm ( OR ^ boolterm )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolExpr1326);
            boolterm114=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm114.getTree());

            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:114:24: ( OR ^ boolterm )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==OR) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:114:25: OR ^ boolterm
            	    {
            	    OR115=(Token)match(input,OR,FOLLOW_OR_in_boolExpr1329); 
            	    OR115_tree = 
            	    (RGLTree)adaptor.create(OR115)
            	    ;
            	    root_0 = (RGLTree)adaptor.becomeRoot(OR115_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolExpr1332);
            	    boolterm116=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm116.getTree());

            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolExpr"


    public static class boolterm_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolterm"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:117:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final RGLParser.boolterm_return boolterm() throws RecognitionException {
        RGLParser.boolterm_return retval = new RGLParser.boolterm_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token AND118=null;
        RGLParser.boolfact_return boolfact117 =null;

        RGLParser.boolfact_return boolfact119 =null;


        RGLTree AND118_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:117:13: ( boolfact ( AND ^ boolfact )* )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:117:15: boolfact ( AND ^ boolfact )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1370);
            boolfact117=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact117.getTree());

            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:117:24: ( AND ^ boolfact )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==AND) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:117:25: AND ^ boolfact
            	    {
            	    AND118=(Token)match(input,AND,FOLLOW_AND_in_boolterm1373); 
            	    AND118_tree = 
            	    (RGLTree)adaptor.create(AND118)
            	    ;
            	    root_0 = (RGLTree)adaptor.becomeRoot(AND118_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1376);
            	    boolfact119=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact119.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:120:1: boolfact : ( NOT ^)? boolatom ;
    public final RGLParser.boolfact_return boolfact() throws RecognitionException {
        RGLParser.boolfact_return retval = new RGLParser.boolfact_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token NOT120=null;
        RGLParser.boolatom_return boolatom121 =null;


        RGLTree NOT120_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:120:13: ( ( NOT ^)? boolatom )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:120:15: ( NOT ^)? boolatom
            {
            root_0 = (RGLTree)adaptor.nil();


            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:120:15: ( NOT ^)?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==NOT) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:120:16: NOT ^
                    {
                    NOT120=(Token)match(input,NOT,FOLLOW_NOT_in_boolfact1403); 
                    NOT120_tree = 
                    (RGLTree)adaptor.create(NOT120)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(NOT120_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_boolatom_in_boolfact1408);
            boolatom121=boolatom();

            state._fsp--;

            adaptor.addChild(root_0, boolatom121.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolfact"


    public static class boolatom_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolatom"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:123:1: boolatom : ( numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr | TRUE | FALSE | DETECT ^ side );
    public final RGLParser.boolatom_return boolatom() throws RecognitionException {
        RGLParser.boolatom_return retval = new RGLParser.boolatom_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token string_literal123=null;
        Token string_literal124=null;
        Token char_literal125=null;
        Token string_literal126=null;
        Token char_literal127=null;
        Token string_literal128=null;
        Token TRUE130=null;
        Token FALSE131=null;
        Token DETECT132=null;
        RGLParser.numExpr_return numExpr122 =null;

        RGLParser.numExpr_return numExpr129 =null;

        RGLParser.side_return side133 =null;


        RGLTree string_literal123_tree=null;
        RGLTree string_literal124_tree=null;
        RGLTree char_literal125_tree=null;
        RGLTree string_literal126_tree=null;
        RGLTree char_literal127_tree=null;
        RGLTree string_literal128_tree=null;
        RGLTree TRUE130_tree=null;
        RGLTree FALSE131_tree=null;
        RGLTree DETECT132_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:123:12: ( numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr | TRUE | FALSE | DETECT ^ side )
            int alt19=4;
            switch ( input.LA(1) ) {
            case COS:
            case DOUBLE:
            case GETPOSX:
            case GETPOSY:
            case ID:
            case INT:
            case MINUS:
            case PLUS:
            case SIN:
            case SQRT:
            case 85:
                {
                alt19=1;
                }
                break;
            case TRUE:
                {
                alt19=2;
                }
                break;
            case FALSE:
                {
                alt19=3;
                }
                break;
            case DETECT:
                {
                alt19=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }

            switch (alt19) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:123:14: numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_numExpr_in_boolatom1443);
                    numExpr122=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr122.getTree());

                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:123:22: ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^)
                    int alt18=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt18=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt18=2;
                        }
                        break;
                    case LT:
                        {
                        alt18=3;
                        }
                        break;
                    case LE:
                        {
                        alt18=4;
                        }
                        break;
                    case GT:
                        {
                        alt18=5;
                        }
                        break;
                    case GE:
                        {
                        alt18=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 18, 0, input);

                        throw nvae;

                    }

                    switch (alt18) {
                        case 1 :
                            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:123:23: '==' ^
                            {
                            string_literal123=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_boolatom1446); 
                            string_literal123_tree = 
                            (RGLTree)adaptor.create(string_literal123)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal123_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:123:31: '!=' ^
                            {
                            string_literal124=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolatom1451); 
                            string_literal124_tree = 
                            (RGLTree)adaptor.create(string_literal124)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal124_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:123:39: '<' ^
                            {
                            char_literal125=(Token)match(input,LT,FOLLOW_LT_in_boolatom1456); 
                            char_literal125_tree = 
                            (RGLTree)adaptor.create(char_literal125)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal125_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:123:46: '<=' ^
                            {
                            string_literal126=(Token)match(input,LE,FOLLOW_LE_in_boolatom1461); 
                            string_literal126_tree = 
                            (RGLTree)adaptor.create(string_literal126)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal126_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:123:54: '>' ^
                            {
                            char_literal127=(Token)match(input,GT,FOLLOW_GT_in_boolatom1466); 
                            char_literal127_tree = 
                            (RGLTree)adaptor.create(char_literal127)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal127_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:123:61: '>=' ^
                            {
                            string_literal128=(Token)match(input,GE,FOLLOW_GE_in_boolatom1471); 
                            string_literal128_tree = 
                            (RGLTree)adaptor.create(string_literal128)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal128_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_numExpr_in_boolatom1475);
                    numExpr129=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr129.getTree());

                    }
                    break;
                case 2 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:124:15: TRUE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    TRUE130=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolatom1491); 
                    TRUE130_tree = 
                    (RGLTree)adaptor.create(TRUE130)
                    ;
                    adaptor.addChild(root_0, TRUE130_tree);


                    }
                    break;
                case 3 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:124:22: FALSE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    FALSE131=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolatom1495); 
                    FALSE131_tree = 
                    (RGLTree)adaptor.create(FALSE131)
                    ;
                    adaptor.addChild(root_0, FALSE131_tree);


                    }
                    break;
                case 4 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:125:15: DETECT ^ side
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    DETECT132=(Token)match(input,DETECT,FOLLOW_DETECT_in_boolatom1511); 
                    DETECT132_tree = 
                    (RGLTree)adaptor.create(DETECT132)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(DETECT132_tree, root_0);


                    pushFollow(FOLLOW_side_in_boolatom1514);
                    side133=side();

                    state._fsp--;

                    adaptor.addChild(root_0, side133.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "boolatom"


    public static class numExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numExpr"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:128:1: numExpr : term ( ( '+' ^| '-' ^) term )* ;
    public final RGLParser.numExpr_return numExpr() throws RecognitionException {
        RGLParser.numExpr_return retval = new RGLParser.numExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal135=null;
        Token char_literal136=null;
        RGLParser.term_return term134 =null;

        RGLParser.term_return term137 =null;


        RGLTree char_literal135_tree=null;
        RGLTree char_literal136_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:128:9: ( term ( ( '+' ^| '-' ^) term )* )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:128:11: term ( ( '+' ^| '-' ^) term )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_numExpr1535);
            term134=term();

            state._fsp--;

            adaptor.addChild(root_0, term134.getTree());

            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:128:16: ( ( '+' ^| '-' ^) term )*
            loop21:
            do {
                int alt21=2;
                int LA21_0 = input.LA(1);

                if ( (LA21_0==MINUS||LA21_0==PLUS) ) {
                    alt21=1;
                }


                switch (alt21) {
            	case 1 :
            	    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:128:18: ( '+' ^| '-' ^) term
            	    {
            	    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:128:18: ( '+' ^| '-' ^)
            	    int alt20=2;
            	    int LA20_0 = input.LA(1);

            	    if ( (LA20_0==PLUS) ) {
            	        alt20=1;
            	    }
            	    else if ( (LA20_0==MINUS) ) {
            	        alt20=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 20, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt20) {
            	        case 1 :
            	            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:128:19: '+' ^
            	            {
            	            char_literal135=(Token)match(input,PLUS,FOLLOW_PLUS_in_numExpr1540); 
            	            char_literal135_tree = 
            	            (RGLTree)adaptor.create(char_literal135)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal135_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:128:26: '-' ^
            	            {
            	            char_literal136=(Token)match(input,MINUS,FOLLOW_MINUS_in_numExpr1545); 
            	            char_literal136_tree = 
            	            (RGLTree)adaptor.create(char_literal136)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal136_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_numExpr1549);
            	    term137=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term137.getTree());

            	    }
            	    break;

            	default :
            	    break loop21;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "numExpr"


    public static class term_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:131:1: term : factor ( ( '*' ^| '/' ^| MOD ^) factor )* ;
    public final RGLParser.term_return term() throws RecognitionException {
        RGLParser.term_return retval = new RGLParser.term_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal139=null;
        Token char_literal140=null;
        Token MOD141=null;
        RGLParser.factor_return factor138 =null;

        RGLParser.factor_return factor142 =null;


        RGLTree char_literal139_tree=null;
        RGLTree char_literal140_tree=null;
        RGLTree MOD141_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:131:9: ( factor ( ( '*' ^| '/' ^| MOD ^) factor )* )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:131:11: factor ( ( '*' ^| '/' ^| MOD ^) factor )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1571);
            factor138=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor138.getTree());

            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:131:18: ( ( '*' ^| '/' ^| MOD ^) factor )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==DIV||LA23_0==MOD||LA23_0==MUL) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:131:20: ( '*' ^| '/' ^| MOD ^) factor
            	    {
            	    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:131:20: ( '*' ^| '/' ^| MOD ^)
            	    int alt22=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt22=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt22=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt22=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 22, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt22) {
            	        case 1 :
            	            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:131:21: '*' ^
            	            {
            	            char_literal139=(Token)match(input,MUL,FOLLOW_MUL_in_term1576); 
            	            char_literal139_tree = 
            	            (RGLTree)adaptor.create(char_literal139)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal139_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:131:28: '/' ^
            	            {
            	            char_literal140=(Token)match(input,DIV,FOLLOW_DIV_in_term1581); 
            	            char_literal140_tree = 
            	            (RGLTree)adaptor.create(char_literal140)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal140_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:131:35: MOD ^
            	            {
            	            MOD141=(Token)match(input,MOD,FOLLOW_MOD_in_term1586); 
            	            MOD141_tree = 
            	            (RGLTree)adaptor.create(MOD141)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(MOD141_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1590);
            	    factor142=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor142.getTree());

            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:134:1: factor : ( '+' ^| '-' ^)? atom ;
    public final RGLParser.factor_return factor() throws RecognitionException {
        RGLParser.factor_return retval = new RGLParser.factor_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal143=null;
        Token char_literal144=null;
        RGLParser.atom_return atom145 =null;


        RGLTree char_literal143_tree=null;
        RGLTree char_literal144_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:134:9: ( ( '+' ^| '-' ^)? atom )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:134:11: ( '+' ^| '-' ^)? atom
            {
            root_0 = (RGLTree)adaptor.nil();


            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:134:11: ( '+' ^| '-' ^)?
            int alt24=3;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==PLUS) ) {
                alt24=1;
            }
            else if ( (LA24_0==MINUS) ) {
                alt24=2;
            }
            switch (alt24) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:134:12: '+' ^
                    {
                    char_literal143=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1611); 
                    char_literal143_tree = 
                    (RGLTree)adaptor.create(char_literal143)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal143_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:134:19: '-' ^
                    {
                    char_literal144=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1616); 
                    char_literal144_tree = 
                    (RGLTree)adaptor.create(char_literal144)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal144_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1621);
            atom145=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom145.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class atom_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:137:1: atom : ( ( DOUBLE | INT ) | ID | funccall | predefined | GETPOSX | GETPOSY | '(' ! numExpr ')' !);
    public final RGLParser.atom_return atom() throws RecognitionException {
        RGLParser.atom_return retval = new RGLParser.atom_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set146=null;
        Token ID147=null;
        Token GETPOSX150=null;
        Token GETPOSY151=null;
        Token char_literal152=null;
        Token char_literal154=null;
        RGLParser.funccall_return funccall148 =null;

        RGLParser.predefined_return predefined149 =null;

        RGLParser.numExpr_return numExpr153 =null;


        RGLTree set146_tree=null;
        RGLTree ID147_tree=null;
        RGLTree GETPOSX150_tree=null;
        RGLTree GETPOSY151_tree=null;
        RGLTree char_literal152_tree=null;
        RGLTree char_literal154_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:137:9: ( ( DOUBLE | INT ) | ID | funccall | predefined | GETPOSX | GETPOSY | '(' ! numExpr ')' !)
            int alt25=7;
            switch ( input.LA(1) ) {
            case DOUBLE:
            case INT:
                {
                alt25=1;
                }
                break;
            case ID:
                {
                int LA25_2 = input.LA(2);

                if ( (LA25_2==85) ) {
                    alt25=3;
                }
                else if ( (LA25_2==AND||LA25_2==BOX||(LA25_2 >= DIV && LA25_2 <= DO)||(LA25_2 >= ELSE && LA25_2 <= ENDACTION)||(LA25_2 >= ENDFUNC && LA25_2 <= ENDIF)||LA25_2==EQUALS||LA25_2==FACE||(LA25_2 >= FEND && LA25_2 <= FOR)||LA25_2==GE||(LA25_2 >= GT && LA25_2 <= IF)||LA25_2==LE||(LA25_2 >= LT && LA25_2 <= MUL)||(LA25_2 >= NOT_EQUAL && LA25_2 <= OBSTACLE)||(LA25_2 >= OR && LA25_2 <= PLUS)||(LA25_2 >= RELEASEOBJECT && LA25_2 <= RETURN)||LA25_2==ROTATE||LA25_2==STOPROBOT||LA25_2==THEN||LA25_2==TRAIL||LA25_2==WEND||LA25_2==WHILE||(LA25_2 >= 86 && LA25_2 <= 87)) ) {
                    alt25=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 25, 2, input);

                    throw nvae;

                }
                }
                break;
            case COS:
            case SIN:
            case SQRT:
                {
                alt25=4;
                }
                break;
            case GETPOSX:
                {
                alt25=5;
                }
                break;
            case GETPOSY:
                {
                alt25=6;
                }
                break;
            case 85:
                {
                alt25=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }

            switch (alt25) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:137:11: ( DOUBLE | INT )
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    set146=(Token)input.LT(1);

                    if ( input.LA(1)==DOUBLE||input.LA(1)==INT ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (RGLTree)adaptor.create(set146)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:138:11: ID
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ID147=(Token)match(input,ID,FOLLOW_ID_in_atom1659); 
                    ID147_tree = 
                    (RGLTree)adaptor.create(ID147)
                    ;
                    adaptor.addChild(root_0, ID147_tree);


                    }
                    break;
                case 3 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:139:11: funccall
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_funccall_in_atom1671);
                    funccall148=funccall();

                    state._fsp--;

                    adaptor.addChild(root_0, funccall148.getTree());

                    }
                    break;
                case 4 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:140:11: predefined
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_predefined_in_atom1683);
                    predefined149=predefined();

                    state._fsp--;

                    adaptor.addChild(root_0, predefined149.getTree());

                    }
                    break;
                case 5 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:141:11: GETPOSX
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GETPOSX150=(Token)match(input,GETPOSX,FOLLOW_GETPOSX_in_atom1695); 
                    GETPOSX150_tree = 
                    (RGLTree)adaptor.create(GETPOSX150)
                    ;
                    adaptor.addChild(root_0, GETPOSX150_tree);


                    }
                    break;
                case 6 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:142:11: GETPOSY
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GETPOSY151=(Token)match(input,GETPOSY,FOLLOW_GETPOSY_in_atom1707); 
                    GETPOSY151_tree = 
                    (RGLTree)adaptor.create(GETPOSY151)
                    ;
                    adaptor.addChild(root_0, GETPOSY151_tree);


                    }
                    break;
                case 7 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:143:11: '(' ! numExpr ')' !
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    char_literal152=(Token)match(input,85,FOLLOW_85_in_atom1719); 

                    pushFollow(FOLLOW_numExpr_in_atom1722);
                    numExpr153=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr153.getTree());

                    char_literal154=(Token)match(input,86,FOLLOW_86_in_atom1724); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"


    public static class predefined_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "predefined"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:146:1: predefined : ( SIN ^ '(' ! numExpr ')' !| COS ^ '(' ! numExpr ')' !| SQRT ^ '(' ! numExpr ')' !);
    public final RGLParser.predefined_return predefined() throws RecognitionException {
        RGLParser.predefined_return retval = new RGLParser.predefined_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token SIN155=null;
        Token char_literal156=null;
        Token char_literal158=null;
        Token COS159=null;
        Token char_literal160=null;
        Token char_literal162=null;
        Token SQRT163=null;
        Token char_literal164=null;
        Token char_literal166=null;
        RGLParser.numExpr_return numExpr157 =null;

        RGLParser.numExpr_return numExpr161 =null;

        RGLParser.numExpr_return numExpr165 =null;


        RGLTree SIN155_tree=null;
        RGLTree char_literal156_tree=null;
        RGLTree char_literal158_tree=null;
        RGLTree COS159_tree=null;
        RGLTree char_literal160_tree=null;
        RGLTree char_literal162_tree=null;
        RGLTree SQRT163_tree=null;
        RGLTree char_literal164_tree=null;
        RGLTree char_literal166_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:146:13: ( SIN ^ '(' ! numExpr ')' !| COS ^ '(' ! numExpr ')' !| SQRT ^ '(' ! numExpr ')' !)
            int alt26=3;
            switch ( input.LA(1) ) {
            case SIN:
                {
                alt26=1;
                }
                break;
            case COS:
                {
                alt26=2;
                }
                break;
            case SQRT:
                {
                alt26=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:146:15: SIN ^ '(' ! numExpr ')' !
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    SIN155=(Token)match(input,SIN,FOLLOW_SIN_in_predefined1743); 
                    SIN155_tree = 
                    (RGLTree)adaptor.create(SIN155)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(SIN155_tree, root_0);


                    char_literal156=(Token)match(input,85,FOLLOW_85_in_predefined1746); 

                    pushFollow(FOLLOW_numExpr_in_predefined1749);
                    numExpr157=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr157.getTree());

                    char_literal158=(Token)match(input,86,FOLLOW_86_in_predefined1751); 

                    }
                    break;
                case 2 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:147:15: COS ^ '(' ! numExpr ')' !
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    COS159=(Token)match(input,COS,FOLLOW_COS_in_predefined1768); 
                    COS159_tree = 
                    (RGLTree)adaptor.create(COS159)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(COS159_tree, root_0);


                    char_literal160=(Token)match(input,85,FOLLOW_85_in_predefined1771); 

                    pushFollow(FOLLOW_numExpr_in_predefined1774);
                    numExpr161=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr161.getTree());

                    char_literal162=(Token)match(input,86,FOLLOW_86_in_predefined1776); 

                    }
                    break;
                case 3 :
                    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:148:15: SQRT ^ '(' ! numExpr ')' !
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    SQRT163=(Token)match(input,SQRT,FOLLOW_SQRT_in_predefined1793); 
                    SQRT163_tree = 
                    (RGLTree)adaptor.create(SQRT163)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(SQRT163_tree, root_0);


                    char_literal164=(Token)match(input,85,FOLLOW_85_in_predefined1796); 

                    pushFollow(FOLLOW_numExpr_in_predefined1799);
                    numExpr165=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr165.getTree());

                    char_literal166=(Token)match(input,86,FOLLOW_86_in_predefined1801); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "predefined"


    public static class direction_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direction"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:151:1: direction : ( NORTH | SOUTH | EAST | WEST );
    public final RGLParser.direction_return direction() throws RecognitionException {
        RGLParser.direction_return retval = new RGLParser.direction_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set167=null;

        RGLTree set167_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:151:13: ( NORTH | SOUTH | EAST | WEST )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set167=(Token)input.LT(1);

            if ( input.LA(1)==EAST||input.LA(1)==NORTH||input.LA(1)==SOUTH||input.LA(1)==WEST ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set167)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "direction"


    public static class side_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "side"
    // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:153:1: side : ( FRONT | RIGHT | LEFT );
    public final RGLParser.side_return side() throws RecognitionException {
        RGLParser.side_return retval = new RGLParser.side_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set168=null;

        RGLTree set168_tree=null;

        try {
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:153:11: ( FRONT | RIGHT | LEFT )
            // /home/andres/cl/Translator/RGLTranslator/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set168=(Token)input.LT(1);

            if ( input.LA(1)==FRONT||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set168)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (RGLTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (RGLTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "side"

    // Delegated rules


 

    public static final BitSet FOLLOW_definitions_in_prog165 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_main_in_prog168 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog170 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITIONS_in_definitions215 = new BitSet(new long[]{0x0000000800800010L});
    public static final BitSet FOLLOW_declaration_in_definitions218 = new BitSet(new long[]{0x0000000800800010L});
    public static final BitSet FOLLOW_ENDDEFINITIONS_in_definitions221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_declaration239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_action277 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_action280 = new BitSet(new long[]{0x0000020000040000L,0x0000000001000000L});
    public static final BitSet FOLLOW_argList_in_action282 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_action284 = new BitSet(new long[]{0x8864060120400200L,0x000000000008884CL});
    public static final BitSet FOLLOW_instrList_in_action287 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ENDACTION_in_action289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function306 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_function309 = new BitSet(new long[]{0x0000020000040000L,0x0000000001000000L});
    public static final BitSet FOLLOW_argList_in_function311 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_function313 = new BitSet(new long[]{0x8864060121000200L,0x000000000008884CL});
    public static final BitSet FOLLOW_instrList_in_function316 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDFUNC_in_function318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_main348 = new BitSet(new long[]{0x0000180000000000L});
    public static final BitSet FOLLOW_initialInstr_in_main351 = new BitSet(new long[]{0x8864060120200200L,0x000000000008884CL});
    public static final BitSet FOLLOW_instrList_in_main353 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_END_in_main355 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMap_in_initialInstr376 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_setRobot_in_initialInstr379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITMAP_in_setMap404 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_INT_in_setMap407 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITROBOT_in_setRobot427 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_setRobot430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_setRobot432 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_setRobot435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_setRobot437 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_setRobot440 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExpr_in_instr480 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExpr_in_instr484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_instr529 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actioncall_in_instr585 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instr597 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_EQUAL_in_instr599 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_instr649 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEFORWARD_in_instr682 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPROBOT_in_instr697 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVETO_in_instr712 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_instr717 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_instr732 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_instr747 = new BitSet(new long[]{0x0100000000080000L,0x0000000000040100L});
    public static final BitSet FOLLOW_direction_in_instr750 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICKOBJECT_in_instr762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASEOBJECT_in_instr774 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_instr786 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_instr791 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOX_in_instr806 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_instr811 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRAIL_in_instr826 = new BitSet(new long[]{0x320842C040049000L,0x0000000000210281L});
    public static final BitSet FOLLOW_boolExpr_in_instr830 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_instr834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFF_in_instr838 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARK_in_instr851 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_instr856 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_instr859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_actioncall885 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_actioncall887 = new BitSet(new long[]{0x000842C000041000L,0x0000000000600281L});
    public static final BitSet FOLLOW_params_in_actioncall889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_actioncall892 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funccall935 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_funccall937 = new BitSet(new long[]{0x000842C000041000L,0x0000000000600281L});
    public static final BitSet FOLLOW_params_in_funccall939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_funccall942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numExpr_in_params986 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_params989 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_params991 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_args_in_argList1010 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args1039 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_87_in_args1042 = new BitSet(new long[]{0x0000020000040000L});
    public static final BitSet FOLLOW_arg_in_args1045 = new BitSet(new long[]{0x0000000000000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_instr_in_instrList1091 = new BitSet(new long[]{0x8864060120000202L,0x000000000008884CL});
    public static final BitSet FOLLOW_WHILE_in_whileExpr1147 = new BitSet(new long[]{0x020842C040049000L,0x0000000000210281L});
    public static final BitSet FOLLOW_boolExpr_in_whileExpr1150 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_whileExpr1152 = new BitSet(new long[]{0x8864060120000200L,0x00000000000A884CL});
    public static final BitSet FOLLOW_instrList_in_whileExpr1155 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_WEND_in_whileExpr1157 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forExpr1195 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_ID_in_forExpr1198 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_FROM_in_forExpr1200 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DOUBLE_in_forExpr1203 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_TO_in_forExpr1205 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DOUBLE_in_forExpr1208 = new BitSet(new long[]{0x0000000000020000L,0x0000000000000400L});
    public static final BitSet FOLLOW_STEP_in_forExpr1211 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_DOUBLE_in_forExpr1214 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DO_in_forExpr1238 = new BitSet(new long[]{0x88640601A0000200L,0x000000000008884CL});
    public static final BitSet FOLLOW_instrList_in_forExpr1241 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_FEND_in_forExpr1243 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr1282 = new BitSet(new long[]{0x020842C040049000L,0x0000000000210281L});
    public static final BitSet FOLLOW_boolExpr_in_ifExpr1285 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr1287 = new BitSet(new long[]{0x8864060122100200L,0x000000000008884CL});
    public static final BitSet FOLLOW_instrList_in_ifExpr1290 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr1293 = new BitSet(new long[]{0x8864060122000200L,0x000000000008884CL});
    public static final BitSet FOLLOW_instrList_in_ifExpr1296 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ENDIF_in_ifExpr1300 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1326 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_OR_in_boolExpr1329 = new BitSet(new long[]{0x020842C040049000L,0x0000000000210281L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1332 = new BitSet(new long[]{0x4000000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1370 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1373 = new BitSet(new long[]{0x020842C040049000L,0x0000000000210281L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1376 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_NOT_in_boolfact1403 = new BitSet(new long[]{0x000842C040049000L,0x0000000000210281L});
    public static final BitSet FOLLOW_boolatom_in_boolfact1408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numExpr_in_boolatom1443 = new BitSet(new long[]{0x0402811008000000L});
    public static final BitSet FOLLOW_EQUALS_in_boolatom1446 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolatom1451 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_LT_in_boolatom1456 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_LE_in_boolatom1461 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_GT_in_boolatom1466 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_GE_in_boolatom1471 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_boolatom1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolatom1491 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolatom1495 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETECT_in_boolatom1511 = new BitSet(new long[]{0x0001000400000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_side_in_boolatom1514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_numExpr1535 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_PLUS_in_numExpr1540 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_MINUS_in_numExpr1545 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_term_in_numExpr1549 = new BitSet(new long[]{0x0008000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_factor_in_term1571 = new BitSet(new long[]{0x0090000000010002L});
    public static final BitSet FOLLOW_MUL_in_term1576 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_DIV_in_term1581 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_MOD_in_term1586 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_factor_in_term1590 = new BitSet(new long[]{0x0090000000010002L});
    public static final BitSet FOLLOW_PLUS_in_factor1611 = new BitSet(new long[]{0x000042C000041000L,0x0000000000200280L});
    public static final BitSet FOLLOW_MINUS_in_factor1616 = new BitSet(new long[]{0x000042C000041000L,0x0000000000200280L});
    public static final BitSet FOLLOW_atom_in_factor1621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_atom1641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1659 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funccall_in_atom1671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predefined_in_atom1683 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSX_in_atom1695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSY_in_atom1707 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_atom1719 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_atom1722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_atom1724 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIN_in_predefined1743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_predefined1746 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_predefined1749 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_predefined1751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COS_in_predefined1768 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_predefined1771 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_predefined1774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_predefined1776 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQRT_in_predefined1793 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_predefined1796 = new BitSet(new long[]{0x000842C000041000L,0x0000000000200281L});
    public static final BitSet FOLLOW_numExpr_in_predefined1799 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_predefined1801 = new BitSet(new long[]{0x0000000000000002L});

}