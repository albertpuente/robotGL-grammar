// $ANTLR 3.4 /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g 2014-05-19 11:06:40

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTION", "AND", "ARGLIST", "ASSIGN", "BEGIN", "BOX", "CALL", "COMMENT", "DEFINELIST", "DEFINITIONS", "DETECT", "DIV", "DO", "DOUBLE", "EAST", "ELSE", "END", "ENDACTION", "ENDDEFINITIONS", "ENDFUNC", "ENDIF", "EQUAL", "EQUALS", "ESC_SEQ", "FACE", "FALSE", "FEND", "FOR", "FROM", "FRONT", "FUNC", "GE", "GET", "GETPOSX", "GETPOSY", "GT", "ID", "IF", "INITMAP", "INITROBOT", "INSTRLIST", "INT", "LE", "LEFT", "LT", "MARK", "MINUS", "MOD", "MOVEFORWARD", "MOVETO", "MUL", "NORTH", "NOT", "NOT_EQUAL", "OBSTACLE", "OFF", "ON", "OR", "PICKOBJECT", "PLUS", "PROGRAM", "RELEASEOBJECT", "RETURN", "RGL", "RIGHT", "ROTATE", "SOUTH", "STEP", "STOPROBOT", "STRING", "THEN", "TO", "TRAIL", "TRUE", "WEND", "WEST", "WHILE", "WS", "'('", "')'", "','", "':'"
    };

    public static final int EOF=-1;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int ACTION=4;
    public static final int AND=5;
    public static final int ARGLIST=6;
    public static final int ASSIGN=7;
    public static final int BEGIN=8;
    public static final int BOX=9;
    public static final int CALL=10;
    public static final int COMMENT=11;
    public static final int DEFINELIST=12;
    public static final int DEFINITIONS=13;
    public static final int DETECT=14;
    public static final int DIV=15;
    public static final int DO=16;
    public static final int DOUBLE=17;
    public static final int EAST=18;
    public static final int ELSE=19;
    public static final int END=20;
    public static final int ENDACTION=21;
    public static final int ENDDEFINITIONS=22;
    public static final int ENDFUNC=23;
    public static final int ENDIF=24;
    public static final int EQUAL=25;
    public static final int EQUALS=26;
    public static final int ESC_SEQ=27;
    public static final int FACE=28;
    public static final int FALSE=29;
    public static final int FEND=30;
    public static final int FOR=31;
    public static final int FROM=32;
    public static final int FRONT=33;
    public static final int FUNC=34;
    public static final int GE=35;
    public static final int GET=36;
    public static final int GETPOSX=37;
    public static final int GETPOSY=38;
    public static final int GT=39;
    public static final int ID=40;
    public static final int IF=41;
    public static final int INITMAP=42;
    public static final int INITROBOT=43;
    public static final int INSTRLIST=44;
    public static final int INT=45;
    public static final int LE=46;
    public static final int LEFT=47;
    public static final int LT=48;
    public static final int MARK=49;
    public static final int MINUS=50;
    public static final int MOD=51;
    public static final int MOVEFORWARD=52;
    public static final int MOVETO=53;
    public static final int MUL=54;
    public static final int NORTH=55;
    public static final int NOT=56;
    public static final int NOT_EQUAL=57;
    public static final int OBSTACLE=58;
    public static final int OFF=59;
    public static final int ON=60;
    public static final int OR=61;
    public static final int PICKOBJECT=62;
    public static final int PLUS=63;
    public static final int PROGRAM=64;
    public static final int RELEASEOBJECT=65;
    public static final int RETURN=66;
    public static final int RGL=67;
    public static final int RIGHT=68;
    public static final int ROTATE=69;
    public static final int SOUTH=70;
    public static final int STEP=71;
    public static final int STOPROBOT=72;
    public static final int STRING=73;
    public static final int THEN=74;
    public static final int TO=75;
    public static final int TRAIL=76;
    public static final int TRUE=77;
    public static final int WEND=78;
    public static final int WEST=79;
    public static final int WHILE=80;
    public static final int WS=81;

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
    public String getGrammarFileName() { return "/home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:31:1: prog : ( definitions )? main EOF -> ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) ) ;
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
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:31:9: ( ( definitions )? main EOF -> ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) ) )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:31:11: ( definitions )? main EOF
            {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:31:11: ( definitions )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==DEFINITIONS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:31:11: definitions
                    {
                    pushFollow(FOLLOW_definitions_in_prog158);
                    definitions1=definitions();

                    state._fsp--;

                    stream_definitions.add(definitions1.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_main_in_prog161);
            main2=main();

            state._fsp--;

            stream_main.add(main2.getTree());

            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog163);  
            stream_EOF.add(EOF3);


            // AST REWRITE
            // elements: main, definitions
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (RGLTree)adaptor.nil();
            // 32:10: -> ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) )
            {
                // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:32:13: ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(RGL, "RGL")
                , root_1);

                // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:32:19: ^( DEFINELIST ( definitions )? )
                {
                RGLTree root_2 = (RGLTree)adaptor.nil();
                root_2 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(DEFINELIST, "DEFINELIST")
                , root_2);

                // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:32:32: ( definitions )?
                if ( stream_definitions.hasNext() ) {
                    adaptor.addChild(root_2, stream_definitions.nextTree());

                }
                stream_definitions.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:32:46: ^( INSTRLIST main )
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:35:1: definitions : DEFINITIONS ! ( declaration )* ENDDEFINITIONS !;
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
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:35:13: ( DEFINITIONS ! ( declaration )* ENDDEFINITIONS !)
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:35:15: DEFINITIONS ! ( declaration )* ENDDEFINITIONS !
            {
            root_0 = (RGLTree)adaptor.nil();


            DEFINITIONS4=(Token)match(input,DEFINITIONS,FOLLOW_DEFINITIONS_in_definitions208); 

            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:35:28: ( declaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ACTION||LA2_0==FUNC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:35:28: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_definitions211);
            	    declaration5=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            ENDDEFINITIONS6=(Token)match(input,ENDDEFINITIONS,FOLLOW_ENDDEFINITIONS_in_definitions214); 

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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:38:1: declaration : ( action | function );
    public final RGLParser.declaration_return declaration() throws RecognitionException {
        RGLParser.declaration_return retval = new RGLParser.declaration_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.action_return action7 =null;

        RGLParser.function_return function8 =null;



        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:38:13: ( action | function )
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
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:38:15: action
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_action_in_declaration232);
                    action7=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action7.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:38:24: function
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_function_in_declaration236);
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:41:1: action : ACTION ^ ID argList ':' ! instrList ENDACTION !;
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
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:41:9: ( ACTION ^ ID argList ':' ! instrList ENDACTION !)
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:41:11: ACTION ^ ID argList ':' ! instrList ENDACTION !
            {
            root_0 = (RGLTree)adaptor.nil();


            ACTION9=(Token)match(input,ACTION,FOLLOW_ACTION_in_action270); 
            ACTION9_tree = 
            (RGLTree)adaptor.create(ACTION9)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(ACTION9_tree, root_0);


            ID10=(Token)match(input,ID,FOLLOW_ID_in_action273); 
            ID10_tree = 
            (RGLTree)adaptor.create(ID10)
            ;
            adaptor.addChild(root_0, ID10_tree);


            pushFollow(FOLLOW_argList_in_action275);
            argList11=argList();

            state._fsp--;

            adaptor.addChild(root_0, argList11.getTree());

            char_literal12=(Token)match(input,85,FOLLOW_85_in_action277); 

            pushFollow(FOLLOW_instrList_in_action280);
            instrList13=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList13.getTree());

            ENDACTION14=(Token)match(input,ENDACTION,FOLLOW_ENDACTION_in_action282); 

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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:43:1: function : FUNC ^ ID argList ':' ! instrList ENDFUNC !;
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
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:43:10: ( FUNC ^ ID argList ':' ! instrList ENDFUNC !)
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:43:12: FUNC ^ ID argList ':' ! instrList ENDFUNC !
            {
            root_0 = (RGLTree)adaptor.nil();


            FUNC15=(Token)match(input,FUNC,FOLLOW_FUNC_in_function299); 
            FUNC15_tree = 
            (RGLTree)adaptor.create(FUNC15)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(FUNC15_tree, root_0);


            ID16=(Token)match(input,ID,FOLLOW_ID_in_function302); 
            ID16_tree = 
            (RGLTree)adaptor.create(ID16)
            ;
            adaptor.addChild(root_0, ID16_tree);


            pushFollow(FOLLOW_argList_in_function304);
            argList17=argList();

            state._fsp--;

            adaptor.addChild(root_0, argList17.getTree());

            char_literal18=(Token)match(input,85,FOLLOW_85_in_function306); 

            pushFollow(FOLLOW_instrList_in_function309);
            instrList19=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList19.getTree());

            ENDFUNC20=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_function311); 

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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:46:1: main : BEGIN ! initialInstr instrList END !;
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
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:46:9: ( BEGIN ! initialInstr instrList END !)
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:46:11: BEGIN ! initialInstr instrList END !
            {
            root_0 = (RGLTree)adaptor.nil();


            BEGIN21=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_main341); 

            pushFollow(FOLLOW_initialInstr_in_main344);
            initialInstr22=initialInstr();

            state._fsp--;

            adaptor.addChild(root_0, initialInstr22.getTree());

            pushFollow(FOLLOW_instrList_in_main346);
            instrList23=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList23.getTree());

            END24=(Token)match(input,END,FOLLOW_END_in_main348); 

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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:49:1: initialInstr : ( setMap )? setRobot ;
    public final RGLParser.initialInstr_return initialInstr() throws RecognitionException {
        RGLParser.initialInstr_return retval = new RGLParser.initialInstr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.setMap_return setMap25 =null;

        RGLParser.setRobot_return setRobot26 =null;



        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:49:14: ( ( setMap )? setRobot )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:49:17: ( setMap )? setRobot
            {
            root_0 = (RGLTree)adaptor.nil();


            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:49:17: ( setMap )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==INITMAP) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:49:17: setMap
                    {
                    pushFollow(FOLLOW_setMap_in_initialInstr369);
                    setMap25=setMap();

                    state._fsp--;

                    adaptor.addChild(root_0, setMap25.getTree());

                    }
                    break;

            }


            pushFollow(FOLLOW_setRobot_in_initialInstr372);
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:52:1: setMap : INITMAP ^ INT ;
    public final RGLParser.setMap_return setMap() throws RecognitionException {
        RGLParser.setMap_return retval = new RGLParser.setMap_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token INITMAP27=null;
        Token INT28=null;

        RGLTree INITMAP27_tree=null;
        RGLTree INT28_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:52:9: ( INITMAP ^ INT )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:52:13: INITMAP ^ INT
            {
            root_0 = (RGLTree)adaptor.nil();


            INITMAP27=(Token)match(input,INITMAP,FOLLOW_INITMAP_in_setMap397); 
            INITMAP27_tree = 
            (RGLTree)adaptor.create(INITMAP27)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(INITMAP27_tree, root_0);


            INT28=(Token)match(input,INT,FOLLOW_INT_in_setMap400); 
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:55:1: setRobot : INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr ;
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
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:55:13: ( INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:55:15: INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr
            {
            root_0 = (RGLTree)adaptor.nil();


            INITROBOT29=(Token)match(input,INITROBOT,FOLLOW_INITROBOT_in_setRobot420); 
            INITROBOT29_tree = 
            (RGLTree)adaptor.create(INITROBOT29)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(INITROBOT29_tree, root_0);


            pushFollow(FOLLOW_numExpr_in_setRobot423);
            numExpr30=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr30.getTree());

            char_literal31=(Token)match(input,84,FOLLOW_84_in_setRobot425); 

            pushFollow(FOLLOW_numExpr_in_setRobot428);
            numExpr32=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr32.getTree());

            char_literal33=(Token)match(input,84,FOLLOW_84_in_setRobot430); 

            pushFollow(FOLLOW_numExpr_in_setRobot433);
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:58:1: instr : ( whileExpr | forExpr | ifExpr | CALL ^ ID '(' ! ( numExpr ( ',' ! numExpr )* )? ')' !| ID '=' ^ numExpr | RETURN ^ numExpr | MOVEFORWARD ^ numExpr | STOPROBOT ^ numExpr | MOVETO ^ numExpr ',' ! numExpr | ROTATE ^ numExpr | FACE ^ direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE ^ numExpr ',' ! numExpr | BOX ^ numExpr ',' ! numExpr | TRAIL ^ ( boolExpr | ON | OFF ) | MARK ^ numExpr ',' ! numExpr );
    public final RGLParser.instr_return instr() throws RecognitionException {
        RGLParser.instr_return retval = new RGLParser.instr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token CALL38=null;
        Token ID39=null;
        Token char_literal40=null;
        Token char_literal42=null;
        Token char_literal44=null;
        Token ID45=null;
        Token char_literal46=null;
        Token RETURN48=null;
        Token MOVEFORWARD50=null;
        Token STOPROBOT52=null;
        Token MOVETO54=null;
        Token char_literal56=null;
        Token ROTATE58=null;
        Token FACE60=null;
        Token PICKOBJECT62=null;
        Token RELEASEOBJECT63=null;
        Token OBSTACLE64=null;
        Token char_literal66=null;
        Token BOX68=null;
        Token char_literal70=null;
        Token TRAIL72=null;
        Token ON74=null;
        Token OFF75=null;
        Token MARK76=null;
        Token char_literal78=null;
        RGLParser.whileExpr_return whileExpr35 =null;

        RGLParser.forExpr_return forExpr36 =null;

        RGLParser.ifExpr_return ifExpr37 =null;

        RGLParser.numExpr_return numExpr41 =null;

        RGLParser.numExpr_return numExpr43 =null;

        RGLParser.numExpr_return numExpr47 =null;

        RGLParser.numExpr_return numExpr49 =null;

        RGLParser.numExpr_return numExpr51 =null;

        RGLParser.numExpr_return numExpr53 =null;

        RGLParser.numExpr_return numExpr55 =null;

        RGLParser.numExpr_return numExpr57 =null;

        RGLParser.numExpr_return numExpr59 =null;

        RGLParser.direction_return direction61 =null;

        RGLParser.numExpr_return numExpr65 =null;

        RGLParser.numExpr_return numExpr67 =null;

        RGLParser.numExpr_return numExpr69 =null;

        RGLParser.numExpr_return numExpr71 =null;

        RGLParser.boolExpr_return boolExpr73 =null;

        RGLParser.numExpr_return numExpr77 =null;

        RGLParser.numExpr_return numExpr79 =null;


        RGLTree CALL38_tree=null;
        RGLTree ID39_tree=null;
        RGLTree char_literal40_tree=null;
        RGLTree char_literal42_tree=null;
        RGLTree char_literal44_tree=null;
        RGLTree ID45_tree=null;
        RGLTree char_literal46_tree=null;
        RGLTree RETURN48_tree=null;
        RGLTree MOVEFORWARD50_tree=null;
        RGLTree STOPROBOT52_tree=null;
        RGLTree MOVETO54_tree=null;
        RGLTree char_literal56_tree=null;
        RGLTree ROTATE58_tree=null;
        RGLTree FACE60_tree=null;
        RGLTree PICKOBJECT62_tree=null;
        RGLTree RELEASEOBJECT63_tree=null;
        RGLTree OBSTACLE64_tree=null;
        RGLTree char_literal66_tree=null;
        RGLTree BOX68_tree=null;
        RGLTree char_literal70_tree=null;
        RGLTree TRAIL72_tree=null;
        RGLTree ON74_tree=null;
        RGLTree OFF75_tree=null;
        RGLTree MARK76_tree=null;
        RGLTree char_literal78_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:58:9: ( whileExpr | forExpr | ifExpr | CALL ^ ID '(' ! ( numExpr ( ',' ! numExpr )* )? ')' !| ID '=' ^ numExpr | RETURN ^ numExpr | MOVEFORWARD ^ numExpr | STOPROBOT ^ numExpr | MOVETO ^ numExpr ',' ! numExpr | ROTATE ^ numExpr | FACE ^ direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE ^ numExpr ',' ! numExpr | BOX ^ numExpr ',' ! numExpr | TRAIL ^ ( boolExpr | ON | OFF ) | MARK ^ numExpr ',' ! numExpr )
            int alt8=17;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt8=1;
                }
                break;
            case FOR:
                {
                alt8=2;
                }
                break;
            case IF:
                {
                alt8=3;
                }
                break;
            case CALL:
                {
                alt8=4;
                }
                break;
            case ID:
                {
                alt8=5;
                }
                break;
            case RETURN:
                {
                alt8=6;
                }
                break;
            case MOVEFORWARD:
                {
                alt8=7;
                }
                break;
            case STOPROBOT:
                {
                alt8=8;
                }
                break;
            case MOVETO:
                {
                alt8=9;
                }
                break;
            case ROTATE:
                {
                alt8=10;
                }
                break;
            case FACE:
                {
                alt8=11;
                }
                break;
            case PICKOBJECT:
                {
                alt8=12;
                }
                break;
            case RELEASEOBJECT:
                {
                alt8=13;
                }
                break;
            case OBSTACLE:
                {
                alt8=14;
                }
                break;
            case BOX:
                {
                alt8=15;
                }
                break;
            case TRAIL:
                {
                alt8=16;
                }
                break;
            case MARK:
                {
                alt8=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:60:9: whileExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_whileExpr_in_instr473);
                    whileExpr35=whileExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, whileExpr35.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:60:21: forExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_forExpr_in_instr477);
                    forExpr36=forExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, forExpr36.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:61:11: ifExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_ifExpr_in_instr522);
                    ifExpr37=ifExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, ifExpr37.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:62:11: CALL ^ ID '(' ! ( numExpr ( ',' ! numExpr )* )? ')' !
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    CALL38=(Token)match(input,CALL,FOLLOW_CALL_in_instr578); 
                    CALL38_tree = 
                    (RGLTree)adaptor.create(CALL38)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(CALL38_tree, root_0);


                    ID39=(Token)match(input,ID,FOLLOW_ID_in_instr581); 
                    ID39_tree = 
                    (RGLTree)adaptor.create(ID39)
                    ;
                    adaptor.addChild(root_0, ID39_tree);


                    char_literal40=(Token)match(input,82,FOLLOW_82_in_instr583); 

                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:62:25: ( numExpr ( ',' ! numExpr )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==DOUBLE||(LA6_0 >= GET && LA6_0 <= GETPOSY)||LA6_0==ID||LA6_0==INT||LA6_0==MINUS||LA6_0==PLUS||LA6_0==82) ) {
                        alt6=1;
                    }
                    switch (alt6) {
                        case 1 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:62:26: numExpr ( ',' ! numExpr )*
                            {
                            pushFollow(FOLLOW_numExpr_in_instr587);
                            numExpr41=numExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, numExpr41.getTree());

                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:62:34: ( ',' ! numExpr )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==84) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:62:35: ',' ! numExpr
                            	    {
                            	    char_literal42=(Token)match(input,84,FOLLOW_84_in_instr590); 

                            	    pushFollow(FOLLOW_numExpr_in_instr593);
                            	    numExpr43=numExpr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, numExpr43.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }


                    char_literal44=(Token)match(input,83,FOLLOW_83_in_instr599); 

                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:63:11: ID '=' ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ID45=(Token)match(input,ID,FOLLOW_ID_in_instr617); 
                    ID45_tree = 
                    (RGLTree)adaptor.create(ID45)
                    ;
                    adaptor.addChild(root_0, ID45_tree);


                    char_literal46=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instr619); 
                    char_literal46_tree = 
                    (RGLTree)adaptor.create(char_literal46)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal46_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr622);
                    numExpr47=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr47.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:64:11: RETURN ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    RETURN48=(Token)match(input,RETURN,FOLLOW_RETURN_in_instr669); 
                    RETURN48_tree = 
                    (RGLTree)adaptor.create(RETURN48)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(RETURN48_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr672);
                    numExpr49=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr49.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:67:11: MOVEFORWARD ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MOVEFORWARD50=(Token)match(input,MOVEFORWARD,FOLLOW_MOVEFORWARD_in_instr702); 
                    MOVEFORWARD50_tree = 
                    (RGLTree)adaptor.create(MOVEFORWARD50)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVEFORWARD50_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr705);
                    numExpr51=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr51.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:68:11: STOPROBOT ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    STOPROBOT52=(Token)match(input,STOPROBOT,FOLLOW_STOPROBOT_in_instr717); 
                    STOPROBOT52_tree = 
                    (RGLTree)adaptor.create(STOPROBOT52)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(STOPROBOT52_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr720);
                    numExpr53=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr53.getTree());

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:69:11: MOVETO ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MOVETO54=(Token)match(input,MOVETO,FOLLOW_MOVETO_in_instr732); 
                    MOVETO54_tree = 
                    (RGLTree)adaptor.create(MOVETO54)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVETO54_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr735);
                    numExpr55=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr55.getTree());

                    char_literal56=(Token)match(input,84,FOLLOW_84_in_instr737); 

                    pushFollow(FOLLOW_numExpr_in_instr740);
                    numExpr57=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr57.getTree());

                    }
                    break;
                case 10 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:70:11: ROTATE ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ROTATE58=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_instr752); 
                    ROTATE58_tree = 
                    (RGLTree)adaptor.create(ROTATE58)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(ROTATE58_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr755);
                    numExpr59=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr59.getTree());

                    }
                    break;
                case 11 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:71:11: FACE ^ direction
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    FACE60=(Token)match(input,FACE,FOLLOW_FACE_in_instr767); 
                    FACE60_tree = 
                    (RGLTree)adaptor.create(FACE60)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(FACE60_tree, root_0);


                    pushFollow(FOLLOW_direction_in_instr770);
                    direction61=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction61.getTree());

                    }
                    break;
                case 12 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:72:11: PICKOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    PICKOBJECT62=(Token)match(input,PICKOBJECT,FOLLOW_PICKOBJECT_in_instr782); 
                    PICKOBJECT62_tree = 
                    (RGLTree)adaptor.create(PICKOBJECT62)
                    ;
                    adaptor.addChild(root_0, PICKOBJECT62_tree);


                    }
                    break;
                case 13 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:73:11: RELEASEOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    RELEASEOBJECT63=(Token)match(input,RELEASEOBJECT,FOLLOW_RELEASEOBJECT_in_instr794); 
                    RELEASEOBJECT63_tree = 
                    (RGLTree)adaptor.create(RELEASEOBJECT63)
                    ;
                    adaptor.addChild(root_0, RELEASEOBJECT63_tree);


                    }
                    break;
                case 14 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:74:11: OBSTACLE ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    OBSTACLE64=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_instr806); 
                    OBSTACLE64_tree = 
                    (RGLTree)adaptor.create(OBSTACLE64)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(OBSTACLE64_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr809);
                    numExpr65=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr65.getTree());

                    char_literal66=(Token)match(input,84,FOLLOW_84_in_instr811); 

                    pushFollow(FOLLOW_numExpr_in_instr814);
                    numExpr67=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr67.getTree());

                    }
                    break;
                case 15 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:75:11: BOX ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    BOX68=(Token)match(input,BOX,FOLLOW_BOX_in_instr826); 
                    BOX68_tree = 
                    (RGLTree)adaptor.create(BOX68)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(BOX68_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr829);
                    numExpr69=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr69.getTree());

                    char_literal70=(Token)match(input,84,FOLLOW_84_in_instr831); 

                    pushFollow(FOLLOW_numExpr_in_instr834);
                    numExpr71=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr71.getTree());

                    }
                    break;
                case 16 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:76:11: TRAIL ^ ( boolExpr | ON | OFF )
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    TRAIL72=(Token)match(input,TRAIL,FOLLOW_TRAIL_in_instr846); 
                    TRAIL72_tree = 
                    (RGLTree)adaptor.create(TRAIL72)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(TRAIL72_tree, root_0);


                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:76:18: ( boolExpr | ON | OFF )
                    int alt7=3;
                    switch ( input.LA(1) ) {
                    case DETECT:
                    case DOUBLE:
                    case FALSE:
                    case GET:
                    case GETPOSX:
                    case GETPOSY:
                    case ID:
                    case INT:
                    case MINUS:
                    case NOT:
                    case PLUS:
                    case TRUE:
                    case 82:
                        {
                        alt7=1;
                        }
                        break;
                    case ON:
                        {
                        alt7=2;
                        }
                        break;
                    case OFF:
                        {
                        alt7=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 7, 0, input);

                        throw nvae;

                    }

                    switch (alt7) {
                        case 1 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:76:19: boolExpr
                            {
                            pushFollow(FOLLOW_boolExpr_in_instr850);
                            boolExpr73=boolExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, boolExpr73.getTree());

                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:76:30: ON
                            {
                            ON74=(Token)match(input,ON,FOLLOW_ON_in_instr854); 
                            ON74_tree = 
                            (RGLTree)adaptor.create(ON74)
                            ;
                            adaptor.addChild(root_0, ON74_tree);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:76:35: OFF
                            {
                            OFF75=(Token)match(input,OFF,FOLLOW_OFF_in_instr858); 
                            OFF75_tree = 
                            (RGLTree)adaptor.create(OFF75)
                            ;
                            adaptor.addChild(root_0, OFF75_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 17 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:77:11: MARK ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MARK76=(Token)match(input,MARK,FOLLOW_MARK_in_instr871); 
                    MARK76_tree = 
                    (RGLTree)adaptor.create(MARK76)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MARK76_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr874);
                    numExpr77=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr77.getTree());

                    char_literal78=(Token)match(input,84,FOLLOW_84_in_instr876); 

                    pushFollow(FOLLOW_numExpr_in_instr879);
                    numExpr79=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr79.getTree());

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


    public static class argList_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "argList"
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:80:1: argList : ( args )? -> ^( ARGLIST ( args )? ) ;
    public final RGLParser.argList_return argList() throws RecognitionException {
        RGLParser.argList_return retval = new RGLParser.argList_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.args_return args80 =null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:80:9: ( ( args )? -> ^( ARGLIST ( args )? ) )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:80:11: ( args )?
            {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:80:11: ( args )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==DOUBLE||LA9_0==ID) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:80:11: args
                    {
                    pushFollow(FOLLOW_args_in_argList896);
                    args80=args();

                    state._fsp--;

                    stream_args.add(args80.getTree());

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
            // 80:17: -> ^( ARGLIST ( args )? )
            {
                // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:80:20: ^( ARGLIST ( args )? )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_1);

                // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:80:30: ( args )?
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:82:1: args : arg ( ',' ! arg )* ;
    public final RGLParser.args_return args() throws RecognitionException {
        RGLParser.args_return retval = new RGLParser.args_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal82=null;
        RGLParser.arg_return arg81 =null;

        RGLParser.arg_return arg83 =null;


        RGLTree char_literal82_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:82:9: ( arg ( ',' ! arg )* )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:82:11: arg ( ',' ! arg )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_arg_in_args925);
            arg81=arg();

            state._fsp--;

            adaptor.addChild(root_0, arg81.getTree());

            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:82:15: ( ',' ! arg )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==84) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:82:16: ',' ! arg
            	    {
            	    char_literal82=(Token)match(input,84,FOLLOW_84_in_args928); 

            	    pushFollow(FOLLOW_arg_in_args931);
            	    arg83=arg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arg83.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:85:1: arg : ( ID | DOUBLE );
    public final RGLParser.arg_return arg() throws RecognitionException {
        RGLParser.arg_return retval = new RGLParser.arg_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set84=null;

        RGLTree set84_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:85:9: ( ID | DOUBLE )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set84=(Token)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set84)
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:88:1: instrList : ( instr )* -> ^( INSTRLIST ( instr )* ) ;
    public final RGLParser.instrList_return instrList() throws RecognitionException {
        RGLParser.instrList_return retval = new RGLParser.instrList_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.instr_return instr85 =null;


        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:88:13: ( ( instr )* -> ^( INSTRLIST ( instr )* ) )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:88:15: ( instr )*
            {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:88:15: ( instr )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0 >= BOX && LA11_0 <= CALL)||LA11_0==FACE||LA11_0==FOR||(LA11_0 >= ID && LA11_0 <= IF)||LA11_0==MARK||(LA11_0 >= MOVEFORWARD && LA11_0 <= MOVETO)||LA11_0==OBSTACLE||LA11_0==PICKOBJECT||(LA11_0 >= RELEASEOBJECT && LA11_0 <= RETURN)||LA11_0==ROTATE||LA11_0==STOPROBOT||LA11_0==TRAIL||LA11_0==WHILE) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:88:15: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_instrList977);
            	    instr85=instr();

            	    state._fsp--;

            	    stream_instr.add(instr85.getTree());

            	    }
            	    break;

            	default :
            	    break loop11;
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
            // 88:23: -> ^( INSTRLIST ( instr )* )
            {
                // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:88:26: ^( INSTRLIST ( instr )* )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(INSTRLIST, "INSTRLIST")
                , root_1);

                // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:88:38: ( instr )*
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:91:1: whileExpr : WHILE ^ boolExpr DO ! instrList WEND !;
    public final RGLParser.whileExpr_return whileExpr() throws RecognitionException {
        RGLParser.whileExpr_return retval = new RGLParser.whileExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token WHILE86=null;
        Token DO88=null;
        Token WEND90=null;
        RGLParser.boolExpr_return boolExpr87 =null;

        RGLParser.instrList_return instrList89 =null;


        RGLTree WHILE86_tree=null;
        RGLTree DO88_tree=null;
        RGLTree WEND90_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:91:13: ( WHILE ^ boolExpr DO ! instrList WEND !)
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:91:15: WHILE ^ boolExpr DO ! instrList WEND !
            {
            root_0 = (RGLTree)adaptor.nil();


            WHILE86=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExpr1033); 
            WHILE86_tree = 
            (RGLTree)adaptor.create(WHILE86)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(WHILE86_tree, root_0);


            pushFollow(FOLLOW_boolExpr_in_whileExpr1036);
            boolExpr87=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr87.getTree());

            DO88=(Token)match(input,DO,FOLLOW_DO_in_whileExpr1038); 

            pushFollow(FOLLOW_instrList_in_whileExpr1041);
            instrList89=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList89.getTree());

            WEND90=(Token)match(input,WEND,FOLLOW_WEND_in_whileExpr1043); 

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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:94:1: forExpr : FOR ^ ID FROM ! DOUBLE TO ! DOUBLE ( STEP ! DOUBLE )? DO ! instrList FEND !;
    public final RGLParser.forExpr_return forExpr() throws RecognitionException {
        RGLParser.forExpr_return retval = new RGLParser.forExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token FOR91=null;
        Token ID92=null;
        Token FROM93=null;
        Token DOUBLE94=null;
        Token TO95=null;
        Token DOUBLE96=null;
        Token STEP97=null;
        Token DOUBLE98=null;
        Token DO99=null;
        Token FEND101=null;
        RGLParser.instrList_return instrList100 =null;


        RGLTree FOR91_tree=null;
        RGLTree ID92_tree=null;
        RGLTree FROM93_tree=null;
        RGLTree DOUBLE94_tree=null;
        RGLTree TO95_tree=null;
        RGLTree DOUBLE96_tree=null;
        RGLTree STEP97_tree=null;
        RGLTree DOUBLE98_tree=null;
        RGLTree DO99_tree=null;
        RGLTree FEND101_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:94:13: ( FOR ^ ID FROM ! DOUBLE TO ! DOUBLE ( STEP ! DOUBLE )? DO ! instrList FEND !)
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:94:15: FOR ^ ID FROM ! DOUBLE TO ! DOUBLE ( STEP ! DOUBLE )? DO ! instrList FEND !
            {
            root_0 = (RGLTree)adaptor.nil();


            FOR91=(Token)match(input,FOR,FOLLOW_FOR_in_forExpr1081); 
            FOR91_tree = 
            (RGLTree)adaptor.create(FOR91)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(FOR91_tree, root_0);


            ID92=(Token)match(input,ID,FOLLOW_ID_in_forExpr1084); 
            ID92_tree = 
            (RGLTree)adaptor.create(ID92)
            ;
            adaptor.addChild(root_0, ID92_tree);


            FROM93=(Token)match(input,FROM,FOLLOW_FROM_in_forExpr1086); 

            DOUBLE94=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forExpr1089); 
            DOUBLE94_tree = 
            (RGLTree)adaptor.create(DOUBLE94)
            ;
            adaptor.addChild(root_0, DOUBLE94_tree);


            TO95=(Token)match(input,TO,FOLLOW_TO_in_forExpr1091); 

            DOUBLE96=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forExpr1094); 
            DOUBLE96_tree = 
            (RGLTree)adaptor.create(DOUBLE96)
            ;
            adaptor.addChild(root_0, DOUBLE96_tree);


            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:94:47: ( STEP ! DOUBLE )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==STEP) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:94:48: STEP ! DOUBLE
                    {
                    STEP97=(Token)match(input,STEP,FOLLOW_STEP_in_forExpr1097); 

                    DOUBLE98=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forExpr1100); 
                    DOUBLE98_tree = 
                    (RGLTree)adaptor.create(DOUBLE98)
                    ;
                    adaptor.addChild(root_0, DOUBLE98_tree);


                    }
                    break;

            }


            DO99=(Token)match(input,DO,FOLLOW_DO_in_forExpr1124); 

            pushFollow(FOLLOW_instrList_in_forExpr1127);
            instrList100=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList100.getTree());

            FEND101=(Token)match(input,FEND,FOLLOW_FEND_in_forExpr1129); 

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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:98:1: ifExpr : IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !;
    public final RGLParser.ifExpr_return ifExpr() throws RecognitionException {
        RGLParser.ifExpr_return retval = new RGLParser.ifExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token IF102=null;
        Token THEN104=null;
        Token ELSE106=null;
        Token ENDIF108=null;
        RGLParser.boolExpr_return boolExpr103 =null;

        RGLParser.instrList_return instrList105 =null;

        RGLParser.instrList_return instrList107 =null;


        RGLTree IF102_tree=null;
        RGLTree THEN104_tree=null;
        RGLTree ELSE106_tree=null;
        RGLTree ENDIF108_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:98:13: ( IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !)
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:98:15: IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !
            {
            root_0 = (RGLTree)adaptor.nil();


            IF102=(Token)match(input,IF,FOLLOW_IF_in_ifExpr1168); 
            IF102_tree = 
            (RGLTree)adaptor.create(IF102)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(IF102_tree, root_0);


            pushFollow(FOLLOW_boolExpr_in_ifExpr1171);
            boolExpr103=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr103.getTree());

            THEN104=(Token)match(input,THEN,FOLLOW_THEN_in_ifExpr1173); 

            pushFollow(FOLLOW_instrList_in_ifExpr1176);
            instrList105=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList105.getTree());

            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:98:44: ( ELSE ! instrList )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==ELSE) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:98:45: ELSE ! instrList
                    {
                    ELSE106=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifExpr1179); 

                    pushFollow(FOLLOW_instrList_in_ifExpr1182);
                    instrList107=instrList();

                    state._fsp--;

                    adaptor.addChild(root_0, instrList107.getTree());

                    }
                    break;

            }


            ENDIF108=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExpr1186); 

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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:102:1: boolExpr : boolterm ( OR ^ boolterm )* ;
    public final RGLParser.boolExpr_return boolExpr() throws RecognitionException {
        RGLParser.boolExpr_return retval = new RGLParser.boolExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token OR110=null;
        RGLParser.boolterm_return boolterm109 =null;

        RGLParser.boolterm_return boolterm111 =null;


        RGLTree OR110_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:102:13: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:102:15: boolterm ( OR ^ boolterm )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolExpr1212);
            boolterm109=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm109.getTree());

            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:102:24: ( OR ^ boolterm )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==OR) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:102:25: OR ^ boolterm
            	    {
            	    OR110=(Token)match(input,OR,FOLLOW_OR_in_boolExpr1215); 
            	    OR110_tree = 
            	    (RGLTree)adaptor.create(OR110)
            	    ;
            	    root_0 = (RGLTree)adaptor.becomeRoot(OR110_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolExpr1218);
            	    boolterm111=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm111.getTree());

            	    }
            	    break;

            	default :
            	    break loop14;
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:105:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final RGLParser.boolterm_return boolterm() throws RecognitionException {
        RGLParser.boolterm_return retval = new RGLParser.boolterm_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token AND113=null;
        RGLParser.boolfact_return boolfact112 =null;

        RGLParser.boolfact_return boolfact114 =null;


        RGLTree AND113_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:105:13: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:105:15: boolfact ( AND ^ boolfact )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1256);
            boolfact112=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact112.getTree());

            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:105:24: ( AND ^ boolfact )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==AND) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:105:25: AND ^ boolfact
            	    {
            	    AND113=(Token)match(input,AND,FOLLOW_AND_in_boolterm1259); 
            	    AND113_tree = 
            	    (RGLTree)adaptor.create(AND113)
            	    ;
            	    root_0 = (RGLTree)adaptor.becomeRoot(AND113_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1262);
            	    boolfact114=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact114.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:108:1: boolfact : ( NOT ^)? boolatom ;
    public final RGLParser.boolfact_return boolfact() throws RecognitionException {
        RGLParser.boolfact_return retval = new RGLParser.boolfact_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token NOT115=null;
        RGLParser.boolatom_return boolatom116 =null;


        RGLTree NOT115_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:108:13: ( ( NOT ^)? boolatom )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:108:15: ( NOT ^)? boolatom
            {
            root_0 = (RGLTree)adaptor.nil();


            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:108:15: ( NOT ^)?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==NOT) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:108:16: NOT ^
                    {
                    NOT115=(Token)match(input,NOT,FOLLOW_NOT_in_boolfact1289); 
                    NOT115_tree = 
                    (RGLTree)adaptor.create(NOT115)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(NOT115_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_boolatom_in_boolfact1294);
            boolatom116=boolatom();

            state._fsp--;

            adaptor.addChild(root_0, boolatom116.getTree());

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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:111:1: boolatom : ( numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr | TRUE | FALSE | DETECT ^ side );
    public final RGLParser.boolatom_return boolatom() throws RecognitionException {
        RGLParser.boolatom_return retval = new RGLParser.boolatom_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token string_literal118=null;
        Token string_literal119=null;
        Token char_literal120=null;
        Token string_literal121=null;
        Token char_literal122=null;
        Token string_literal123=null;
        Token TRUE125=null;
        Token FALSE126=null;
        Token DETECT127=null;
        RGLParser.numExpr_return numExpr117 =null;

        RGLParser.numExpr_return numExpr124 =null;

        RGLParser.side_return side128 =null;


        RGLTree string_literal118_tree=null;
        RGLTree string_literal119_tree=null;
        RGLTree char_literal120_tree=null;
        RGLTree string_literal121_tree=null;
        RGLTree char_literal122_tree=null;
        RGLTree string_literal123_tree=null;
        RGLTree TRUE125_tree=null;
        RGLTree FALSE126_tree=null;
        RGLTree DETECT127_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:111:12: ( numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr | TRUE | FALSE | DETECT ^ side )
            int alt18=4;
            switch ( input.LA(1) ) {
            case DOUBLE:
            case GET:
            case GETPOSX:
            case GETPOSY:
            case ID:
            case INT:
            case MINUS:
            case PLUS:
            case 82:
                {
                alt18=1;
                }
                break;
            case TRUE:
                {
                alt18=2;
                }
                break;
            case FALSE:
                {
                alt18=3;
                }
                break;
            case DETECT:
                {
                alt18=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:111:14: numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_numExpr_in_boolatom1329);
                    numExpr117=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr117.getTree());

                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:111:22: ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^)
                    int alt17=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt17=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt17=2;
                        }
                        break;
                    case LT:
                        {
                        alt17=3;
                        }
                        break;
                    case LE:
                        {
                        alt17=4;
                        }
                        break;
                    case GT:
                        {
                        alt17=5;
                        }
                        break;
                    case GE:
                        {
                        alt17=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;

                    }

                    switch (alt17) {
                        case 1 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:111:23: '==' ^
                            {
                            string_literal118=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_boolatom1332); 
                            string_literal118_tree = 
                            (RGLTree)adaptor.create(string_literal118)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal118_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:111:31: '!=' ^
                            {
                            string_literal119=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolatom1337); 
                            string_literal119_tree = 
                            (RGLTree)adaptor.create(string_literal119)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal119_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:111:39: '<' ^
                            {
                            char_literal120=(Token)match(input,LT,FOLLOW_LT_in_boolatom1342); 
                            char_literal120_tree = 
                            (RGLTree)adaptor.create(char_literal120)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal120_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:111:46: '<=' ^
                            {
                            string_literal121=(Token)match(input,LE,FOLLOW_LE_in_boolatom1347); 
                            string_literal121_tree = 
                            (RGLTree)adaptor.create(string_literal121)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal121_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:111:54: '>' ^
                            {
                            char_literal122=(Token)match(input,GT,FOLLOW_GT_in_boolatom1352); 
                            char_literal122_tree = 
                            (RGLTree)adaptor.create(char_literal122)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal122_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:111:61: '>=' ^
                            {
                            string_literal123=(Token)match(input,GE,FOLLOW_GE_in_boolatom1357); 
                            string_literal123_tree = 
                            (RGLTree)adaptor.create(string_literal123)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal123_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_numExpr_in_boolatom1361);
                    numExpr124=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr124.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:112:15: TRUE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    TRUE125=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolatom1377); 
                    TRUE125_tree = 
                    (RGLTree)adaptor.create(TRUE125)
                    ;
                    adaptor.addChild(root_0, TRUE125_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:112:22: FALSE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    FALSE126=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolatom1381); 
                    FALSE126_tree = 
                    (RGLTree)adaptor.create(FALSE126)
                    ;
                    adaptor.addChild(root_0, FALSE126_tree);


                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:113:15: DETECT ^ side
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    DETECT127=(Token)match(input,DETECT,FOLLOW_DETECT_in_boolatom1397); 
                    DETECT127_tree = 
                    (RGLTree)adaptor.create(DETECT127)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(DETECT127_tree, root_0);


                    pushFollow(FOLLOW_side_in_boolatom1400);
                    side128=side();

                    state._fsp--;

                    adaptor.addChild(root_0, side128.getTree());

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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:116:1: numExpr : term ( ( '+' ^| '-' ^) term )* ;
    public final RGLParser.numExpr_return numExpr() throws RecognitionException {
        RGLParser.numExpr_return retval = new RGLParser.numExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal130=null;
        Token char_literal131=null;
        RGLParser.term_return term129 =null;

        RGLParser.term_return term132 =null;


        RGLTree char_literal130_tree=null;
        RGLTree char_literal131_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:116:9: ( term ( ( '+' ^| '-' ^) term )* )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:116:11: term ( ( '+' ^| '-' ^) term )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_numExpr1421);
            term129=term();

            state._fsp--;

            adaptor.addChild(root_0, term129.getTree());

            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:116:16: ( ( '+' ^| '-' ^) term )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==MINUS||LA20_0==PLUS) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:116:18: ( '+' ^| '-' ^) term
            	    {
            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:116:18: ( '+' ^| '-' ^)
            	    int alt19=2;
            	    int LA19_0 = input.LA(1);

            	    if ( (LA19_0==PLUS) ) {
            	        alt19=1;
            	    }
            	    else if ( (LA19_0==MINUS) ) {
            	        alt19=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;

            	    }
            	    switch (alt19) {
            	        case 1 :
            	            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:116:19: '+' ^
            	            {
            	            char_literal130=(Token)match(input,PLUS,FOLLOW_PLUS_in_numExpr1426); 
            	            char_literal130_tree = 
            	            (RGLTree)adaptor.create(char_literal130)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal130_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:116:26: '-' ^
            	            {
            	            char_literal131=(Token)match(input,MINUS,FOLLOW_MINUS_in_numExpr1431); 
            	            char_literal131_tree = 
            	            (RGLTree)adaptor.create(char_literal131)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal131_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_numExpr1435);
            	    term132=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term132.getTree());

            	    }
            	    break;

            	default :
            	    break loop20;
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:119:1: term : factor ( ( '*' ^| '/' ^| '%' ^) factor )* ;
    public final RGLParser.term_return term() throws RecognitionException {
        RGLParser.term_return retval = new RGLParser.term_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal134=null;
        Token char_literal135=null;
        Token char_literal136=null;
        RGLParser.factor_return factor133 =null;

        RGLParser.factor_return factor137 =null;


        RGLTree char_literal134_tree=null;
        RGLTree char_literal135_tree=null;
        RGLTree char_literal136_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:119:9: ( factor ( ( '*' ^| '/' ^| '%' ^) factor )* )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:119:11: factor ( ( '*' ^| '/' ^| '%' ^) factor )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1457);
            factor133=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor133.getTree());

            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:119:18: ( ( '*' ^| '/' ^| '%' ^) factor )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==DIV||LA22_0==MOD||LA22_0==MUL) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:119:20: ( '*' ^| '/' ^| '%' ^) factor
            	    {
            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:119:20: ( '*' ^| '/' ^| '%' ^)
            	    int alt21=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt21=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt21=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt21=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt21) {
            	        case 1 :
            	            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:119:21: '*' ^
            	            {
            	            char_literal134=(Token)match(input,MUL,FOLLOW_MUL_in_term1462); 
            	            char_literal134_tree = 
            	            (RGLTree)adaptor.create(char_literal134)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal134_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:119:28: '/' ^
            	            {
            	            char_literal135=(Token)match(input,DIV,FOLLOW_DIV_in_term1467); 
            	            char_literal135_tree = 
            	            (RGLTree)adaptor.create(char_literal135)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal135_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:119:35: '%' ^
            	            {
            	            char_literal136=(Token)match(input,MOD,FOLLOW_MOD_in_term1472); 
            	            char_literal136_tree = 
            	            (RGLTree)adaptor.create(char_literal136)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal136_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1476);
            	    factor137=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor137.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:122:1: factor : ( '+' ^| '-' ^)? atom ;
    public final RGLParser.factor_return factor() throws RecognitionException {
        RGLParser.factor_return retval = new RGLParser.factor_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal138=null;
        Token char_literal139=null;
        RGLParser.atom_return atom140 =null;


        RGLTree char_literal138_tree=null;
        RGLTree char_literal139_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:122:9: ( ( '+' ^| '-' ^)? atom )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:122:11: ( '+' ^| '-' ^)? atom
            {
            root_0 = (RGLTree)adaptor.nil();


            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:122:11: ( '+' ^| '-' ^)?
            int alt23=3;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==PLUS) ) {
                alt23=1;
            }
            else if ( (LA23_0==MINUS) ) {
                alt23=2;
            }
            switch (alt23) {
                case 1 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:122:12: '+' ^
                    {
                    char_literal138=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1497); 
                    char_literal138_tree = 
                    (RGLTree)adaptor.create(char_literal138)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal138_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:122:19: '-' ^
                    {
                    char_literal139=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1502); 
                    char_literal139_tree = 
                    (RGLTree)adaptor.create(char_literal139)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal139_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1507);
            atom140=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom140.getTree());

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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:125:1: atom : ( ( DOUBLE | INT ) | ID | GET ^ ID '(' ! ( numExpr ( ',' ! numExpr )* )? ')' !| GETPOSX | GETPOSY | '(' ! numExpr ')' !);
    public final RGLParser.atom_return atom() throws RecognitionException {
        RGLParser.atom_return retval = new RGLParser.atom_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set141=null;
        Token ID142=null;
        Token GET143=null;
        Token ID144=null;
        Token char_literal145=null;
        Token char_literal147=null;
        Token char_literal149=null;
        Token GETPOSX150=null;
        Token GETPOSY151=null;
        Token char_literal152=null;
        Token char_literal154=null;
        RGLParser.numExpr_return numExpr146 =null;

        RGLParser.numExpr_return numExpr148 =null;

        RGLParser.numExpr_return numExpr153 =null;


        RGLTree set141_tree=null;
        RGLTree ID142_tree=null;
        RGLTree GET143_tree=null;
        RGLTree ID144_tree=null;
        RGLTree char_literal145_tree=null;
        RGLTree char_literal147_tree=null;
        RGLTree char_literal149_tree=null;
        RGLTree GETPOSX150_tree=null;
        RGLTree GETPOSY151_tree=null;
        RGLTree char_literal152_tree=null;
        RGLTree char_literal154_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:125:9: ( ( DOUBLE | INT ) | ID | GET ^ ID '(' ! ( numExpr ( ',' ! numExpr )* )? ')' !| GETPOSX | GETPOSY | '(' ! numExpr ')' !)
            int alt26=6;
            switch ( input.LA(1) ) {
            case DOUBLE:
            case INT:
                {
                alt26=1;
                }
                break;
            case ID:
                {
                alt26=2;
                }
                break;
            case GET:
                {
                alt26=3;
                }
                break;
            case GETPOSX:
                {
                alt26=4;
                }
                break;
            case GETPOSY:
                {
                alt26=5;
                }
                break;
            case 82:
                {
                alt26=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }

            switch (alt26) {
                case 1 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:125:11: ( DOUBLE | INT )
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    set141=(Token)input.LT(1);

                    if ( input.LA(1)==DOUBLE||input.LA(1)==INT ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (RGLTree)adaptor.create(set141)
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
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:126:11: ID
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ID142=(Token)match(input,ID,FOLLOW_ID_in_atom1545); 
                    ID142_tree = 
                    (RGLTree)adaptor.create(ID142)
                    ;
                    adaptor.addChild(root_0, ID142_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:127:11: GET ^ ID '(' ! ( numExpr ( ',' ! numExpr )* )? ')' !
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GET143=(Token)match(input,GET,FOLLOW_GET_in_atom1557); 
                    GET143_tree = 
                    (RGLTree)adaptor.create(GET143)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(GET143_tree, root_0);


                    ID144=(Token)match(input,ID,FOLLOW_ID_in_atom1560); 
                    ID144_tree = 
                    (RGLTree)adaptor.create(ID144)
                    ;
                    adaptor.addChild(root_0, ID144_tree);


                    char_literal145=(Token)match(input,82,FOLLOW_82_in_atom1562); 

                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:127:24: ( numExpr ( ',' ! numExpr )* )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==DOUBLE||(LA25_0 >= GET && LA25_0 <= GETPOSY)||LA25_0==ID||LA25_0==INT||LA25_0==MINUS||LA25_0==PLUS||LA25_0==82) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:127:25: numExpr ( ',' ! numExpr )*
                            {
                            pushFollow(FOLLOW_numExpr_in_atom1566);
                            numExpr146=numExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, numExpr146.getTree());

                            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:127:33: ( ',' ! numExpr )*
                            loop24:
                            do {
                                int alt24=2;
                                int LA24_0 = input.LA(1);

                                if ( (LA24_0==84) ) {
                                    alt24=1;
                                }


                                switch (alt24) {
                            	case 1 :
                            	    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:127:34: ',' ! numExpr
                            	    {
                            	    char_literal147=(Token)match(input,84,FOLLOW_84_in_atom1569); 

                            	    pushFollow(FOLLOW_numExpr_in_atom1572);
                            	    numExpr148=numExpr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, numExpr148.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop24;
                                }
                            } while (true);


                            }
                            break;

                    }


                    char_literal149=(Token)match(input,83,FOLLOW_83_in_atom1578); 

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:128:11: GETPOSX
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GETPOSX150=(Token)match(input,GETPOSX,FOLLOW_GETPOSX_in_atom1591); 
                    GETPOSX150_tree = 
                    (RGLTree)adaptor.create(GETPOSX150)
                    ;
                    adaptor.addChild(root_0, GETPOSX150_tree);


                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:129:11: GETPOSY
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GETPOSY151=(Token)match(input,GETPOSY,FOLLOW_GETPOSY_in_atom1603); 
                    GETPOSY151_tree = 
                    (RGLTree)adaptor.create(GETPOSY151)
                    ;
                    adaptor.addChild(root_0, GETPOSY151_tree);


                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:130:11: '(' ! numExpr ')' !
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    char_literal152=(Token)match(input,82,FOLLOW_82_in_atom1615); 

                    pushFollow(FOLLOW_numExpr_in_atom1618);
                    numExpr153=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr153.getTree());

                    char_literal154=(Token)match(input,83,FOLLOW_83_in_atom1620); 

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


    public static class direction_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "direction"
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:133:1: direction : ( NORTH | SOUTH | EAST | WEST );
    public final RGLParser.direction_return direction() throws RecognitionException {
        RGLParser.direction_return retval = new RGLParser.direction_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set155=null;

        RGLTree set155_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:133:13: ( NORTH | SOUTH | EAST | WEST )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set155=(Token)input.LT(1);

            if ( input.LA(1)==EAST||input.LA(1)==NORTH||input.LA(1)==SOUTH||input.LA(1)==WEST ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set155)
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
    // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:135:1: side : ( FRONT | RIGHT | LEFT );
    public final RGLParser.side_return side() throws RecognitionException {
        RGLParser.side_return retval = new RGLParser.side_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set156=null;

        RGLTree set156_tree=null;

        try {
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:135:11: ( FRONT | RIGHT | LEFT )
            // /home2/users/alumnes/1160196/dades/linux/cl/Project/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set156=(Token)input.LT(1);

            if ( input.LA(1)==FRONT||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set156)
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


 

    public static final BitSet FOLLOW_definitions_in_prog158 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_main_in_prog161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITIONS_in_definitions208 = new BitSet(new long[]{0x0000000400400010L});
    public static final BitSet FOLLOW_declaration_in_definitions211 = new BitSet(new long[]{0x0000000400400010L});
    public static final BitSet FOLLOW_ENDDEFINITIONS_in_definitions214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_declaration232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_action270 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_action273 = new BitSet(new long[]{0x0000010000020000L,0x0000000000200000L});
    public static final BitSet FOLLOW_argList_in_action275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_action277 = new BitSet(new long[]{0x4432030090200600L,0x0000000000011126L});
    public static final BitSet FOLLOW_instrList_in_action280 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDACTION_in_action282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function299 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_function302 = new BitSet(new long[]{0x0000010000020000L,0x0000000000200000L});
    public static final BitSet FOLLOW_argList_in_function304 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_function306 = new BitSet(new long[]{0x4432030090800600L,0x0000000000011126L});
    public static final BitSet FOLLOW_instrList_in_function309 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ENDFUNC_in_function311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_main341 = new BitSet(new long[]{0x00000C0000000000L});
    public static final BitSet FOLLOW_initialInstr_in_main344 = new BitSet(new long[]{0x4432030090100600L,0x0000000000011126L});
    public static final BitSet FOLLOW_instrList_in_main346 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_END_in_main348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMap_in_initialInstr369 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_setRobot_in_initialInstr372 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITMAP_in_setMap397 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_INT_in_setMap400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITROBOT_in_setRobot420 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_setRobot423 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_setRobot425 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_setRobot428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_setRobot430 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_setRobot433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExpr_in_instr473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExpr_in_instr477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_instr522 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_instr578 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_instr581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_instr583 = new BitSet(new long[]{0x8004217000020000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_numExpr_in_instr587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_84_in_instr590 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr593 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_83_in_instr599 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instr617 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_EQUAL_in_instr619 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_instr669 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEFORWARD_in_instr702 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr705 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPROBOT_in_instr717 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVETO_in_instr732 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr735 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_instr737 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_instr752 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_instr767 = new BitSet(new long[]{0x0080000000040000L,0x0000000000008040L});
    public static final BitSet FOLLOW_direction_in_instr770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICKOBJECT_in_instr782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASEOBJECT_in_instr794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_instr806 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr809 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_instr811 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr814 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOX_in_instr826 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr829 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_instr831 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRAIL_in_instr846 = new BitSet(new long[]{0x9904217020024000L,0x0000000000042000L});
    public static final BitSet FOLLOW_boolExpr_in_instr850 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_instr854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFF_in_instr858 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARK_in_instr871 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_instr876 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_instr879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_argList896 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args925 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_84_in_args928 = new BitSet(new long[]{0x0000010000020000L});
    public static final BitSet FOLLOW_arg_in_args931 = new BitSet(new long[]{0x0000000000000002L,0x0000000000100000L});
    public static final BitSet FOLLOW_instr_in_instrList977 = new BitSet(new long[]{0x4432030090000602L,0x0000000000011126L});
    public static final BitSet FOLLOW_WHILE_in_whileExpr1033 = new BitSet(new long[]{0x8104217020024000L,0x0000000000042000L});
    public static final BitSet FOLLOW_boolExpr_in_whileExpr1036 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DO_in_whileExpr1038 = new BitSet(new long[]{0x4432030090000600L,0x0000000000015126L});
    public static final BitSet FOLLOW_instrList_in_whileExpr1041 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_WEND_in_whileExpr1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forExpr1081 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_forExpr1084 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_FROM_in_forExpr1086 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOUBLE_in_forExpr1089 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_TO_in_forExpr1091 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOUBLE_in_forExpr1094 = new BitSet(new long[]{0x0000000000010000L,0x0000000000000080L});
    public static final BitSet FOLLOW_STEP_in_forExpr1097 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_DOUBLE_in_forExpr1100 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DO_in_forExpr1124 = new BitSet(new long[]{0x44320300D0000600L,0x0000000000011126L});
    public static final BitSet FOLLOW_instrList_in_forExpr1127 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_FEND_in_forExpr1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr1168 = new BitSet(new long[]{0x8104217020024000L,0x0000000000042000L});
    public static final BitSet FOLLOW_boolExpr_in_ifExpr1171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_THEN_in_ifExpr1173 = new BitSet(new long[]{0x4432030091080600L,0x0000000000011126L});
    public static final BitSet FOLLOW_instrList_in_ifExpr1176 = new BitSet(new long[]{0x0000000001080000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr1179 = new BitSet(new long[]{0x4432030091000600L,0x0000000000011126L});
    public static final BitSet FOLLOW_instrList_in_ifExpr1182 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_ENDIF_in_ifExpr1186 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1212 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_OR_in_boolExpr1215 = new BitSet(new long[]{0x8104217020024000L,0x0000000000042000L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1218 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1256 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_AND_in_boolterm1259 = new BitSet(new long[]{0x8104217020024000L,0x0000000000042000L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1262 = new BitSet(new long[]{0x0000000000000022L});
    public static final BitSet FOLLOW_NOT_in_boolfact1289 = new BitSet(new long[]{0x8004217020024000L,0x0000000000042000L});
    public static final BitSet FOLLOW_boolatom_in_boolfact1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numExpr_in_boolatom1329 = new BitSet(new long[]{0x0201408804000000L});
    public static final BitSet FOLLOW_EQUALS_in_boolatom1332 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolatom1337 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LT_in_boolatom1342 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_LE_in_boolatom1347 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_GT_in_boolatom1352 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_GE_in_boolatom1357 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_boolatom1361 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolatom1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolatom1381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETECT_in_boolatom1397 = new BitSet(new long[]{0x0000800200000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_side_in_boolatom1400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_numExpr1421 = new BitSet(new long[]{0x8004000000000002L});
    public static final BitSet FOLLOW_PLUS_in_numExpr1426 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_MINUS_in_numExpr1431 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_term_in_numExpr1435 = new BitSet(new long[]{0x8004000000000002L});
    public static final BitSet FOLLOW_factor_in_term1457 = new BitSet(new long[]{0x0048000000008002L});
    public static final BitSet FOLLOW_MUL_in_term1462 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_DIV_in_term1467 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_MOD_in_term1472 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_factor_in_term1476 = new BitSet(new long[]{0x0048000000008002L});
    public static final BitSet FOLLOW_PLUS_in_factor1497 = new BitSet(new long[]{0x0000217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_MINUS_in_factor1502 = new BitSet(new long[]{0x0000217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_atom_in_factor1507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_atom1527 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GET_in_atom1557 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_ID_in_atom1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_atom1562 = new BitSet(new long[]{0x8004217000020000L,0x00000000000C0000L});
    public static final BitSet FOLLOW_numExpr_in_atom1566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_84_in_atom1569 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_atom1572 = new BitSet(new long[]{0x0000000000000000L,0x0000000000180000L});
    public static final BitSet FOLLOW_83_in_atom1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSX_in_atom1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSY_in_atom1603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_atom1615 = new BitSet(new long[]{0x8004217000020000L,0x0000000000040000L});
    public static final BitSet FOLLOW_numExpr_in_atom1618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000080000L});
    public static final BitSet FOLLOW_83_in_atom1620 = new BitSet(new long[]{0x0000000000000002L});

}