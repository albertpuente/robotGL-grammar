// $ANTLR 3.2 debian-7ubuntu3 /home/albert/Escriptori/Projecte/java/src/parser/RGL.g 2014-05-30 20:17:03

    package parser;
    import interp.RGLTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RGLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "CALL", "GET", "INSTRLIST", "ARGLIST", "PROGRAM", "DEFINELIST", "RGL", "DEFINITIONS", "ENDDEFINITIONS", "ACTION", "ID", "ENDACTION", "FUNC", "ENDFUNC", "BEGIN", "END", "INITMAP", "INT", "INITROBOT", "RETURN", "MOVEFORWARD", "STOPROBOT", "MOVETO", "ROTATE", "FACE", "PICKOBJECT", "RELEASEOBJECT", "OBSTACLE", "BOX", "TRAIL", "ON", "OFF", "MARK", "DOUBLE", "WHILE", "DO", "WEND", "FOR", "FROM", "TO", "STEP", "FEND", "IF", "THEN", "ELSE", "ENDIF", "OR", "AND", "NOT", "TRUE", "FALSE", "DETECT", "MOD", "GETPOSX", "GETPOSY", "SIN", "COS", "SQRT", "NORTH", "SOUTH", "EAST", "WEST", "FRONT", "RIGHT", "LEFT", "EQUAL", "EQUALS", "NOT_EQUAL", "PLUS", "MINUS", "MUL", "DIV", "COMMENT", "WS", "':'", "','", "'('", "')'", "'<'", "'<='", "'>'", "'>='"
    };
    public static final int WEND=40;
    public static final int PICKOBJECT=29;
    public static final int WHILE=38;
    public static final int MOD=56;
    public static final int STOPROBOT=25;
    public static final int FACE=28;
    public static final int MOVEFORWARD=24;
    public static final int STEP=44;
    public static final int FOR=41;
    public static final int DO=39;
    public static final int ENDACTION=15;
    public static final int ARGLIST=7;
    public static final int EQUALS=70;
    public static final int SOUTH=63;
    public static final int NOT=52;
    public static final int RGL=10;
    public static final int AND=51;
    public static final int ID=14;
    public static final int EOF=-1;
    public static final int ACTION=13;
    public static final int IF=46;
    public static final int WEST=65;
    public static final int BOX=32;
    public static final int THEN=47;
    public static final int SIN=59;
    public static final int INITROBOT=22;
    public static final int NOT_EQUAL=71;
    public static final int DEFINELIST=9;
    public static final int COS=60;
    public static final int LEFT=68;
    public static final int OFF=35;
    public static final int EQUAL=69;
    public static final int BEGIN=18;
    public static final int RETURN=23;
    public static final int ENDIF=49;
    public static final int DOUBLE=37;
    public static final int PLUS=72;
    public static final int GET=5;
    public static final int ENDFUNC=17;
    public static final int COMMENT=76;
    public static final int TRAIL=33;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int MARK=36;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int RELEASEOBJECT=30;
    public static final int FEND=45;
    public static final int TO=43;
    public static final int DEFINITIONS=11;
    public static final int ELSE=48;
    public static final int ON=34;
    public static final int RIGHT=67;
    public static final int GETPOSY=58;
    public static final int INT=21;
    public static final int GETPOSX=57;
    public static final int ROTATE=27;
    public static final int EAST=64;
    public static final int MINUS=73;
    public static final int SQRT=61;
    public static final int T__85=85;
    public static final int OBSTACLE=31;
    public static final int T__84=84;
    public static final int MUL=74;
    public static final int TRUE=53;
    public static final int ENDDEFINITIONS=12;
    public static final int INSTRLIST=6;
    public static final int WS=77;
    public static final int DETECT=55;
    public static final int FUNC=16;
    public static final int MOVETO=26;
    public static final int OR=50;
    public static final int FRONT=66;
    public static final int NORTH=62;
    public static final int PROGRAM=8;
    public static final int CALL=4;
    public static final int DIV=75;
    public static final int INITMAP=20;
    public static final int FROM=42;
    public static final int END=19;
    public static final int FALSE=54;
    public static final int T__79=79;
    public static final int T__78=78;

    // delegates
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
    public String getGrammarFileName() { return "/home/albert/Escriptori/Projecte/java/src/parser/RGL.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:30:1: prog : ( definitions )? main EOF -> ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) ) ;
    public final RGLParser.prog_return prog() throws RecognitionException {
        RGLParser.prog_return retval = new RGLParser.prog_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token EOF3=null;
        RGLParser.definitions_return definitions1 = null;

        RGLParser.main_return main2 = null;


        RGLTree EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_definitions=new RewriteRuleSubtreeStream(adaptor,"rule definitions");
        RewriteRuleSubtreeStream stream_main=new RewriteRuleSubtreeStream(adaptor,"rule main");
        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:30:9: ( ( definitions )? main EOF -> ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) ) )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:30:11: ( definitions )? main EOF
            {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:30:11: ( definitions )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==DEFINITIONS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:30:11: definitions
                    {
                    pushFollow(FOLLOW_definitions_in_prog174);
                    definitions1=definitions();

                    state._fsp--;

                    stream_definitions.add(definitions1.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_main_in_prog177);
            main2=main();

            state._fsp--;

            stream_main.add(main2.getTree());
            EOF3=(Token)match(input,EOF,FOLLOW_EOF_in_prog179);  
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
            // 31:10: -> ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) )
            {
                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:31:13: ^( RGL ^( DEFINELIST ( definitions )? ) ^( INSTRLIST main ) )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(RGL, "RGL"), root_1);

                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:31:19: ^( DEFINELIST ( definitions )? )
                {
                RGLTree root_2 = (RGLTree)adaptor.nil();
                root_2 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(DEFINELIST, "DEFINELIST"), root_2);

                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:31:32: ( definitions )?
                if ( stream_definitions.hasNext() ) {
                    adaptor.addChild(root_2, stream_definitions.nextTree());

                }
                stream_definitions.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:31:46: ^( INSTRLIST main )
                {
                RGLTree root_2 = (RGLTree)adaptor.nil();
                root_2 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(INSTRLIST, "INSTRLIST"), root_2);

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
        }
        return retval;
    }
    // $ANTLR end "prog"

    public static class definitions_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "definitions"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:34:1: definitions : DEFINITIONS ( declaration )* ENDDEFINITIONS ;
    public final RGLParser.definitions_return definitions() throws RecognitionException {
        RGLParser.definitions_return retval = new RGLParser.definitions_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token DEFINITIONS4=null;
        Token ENDDEFINITIONS6=null;
        RGLParser.declaration_return declaration5 = null;


        RGLTree DEFINITIONS4_tree=null;
        RGLTree ENDDEFINITIONS6_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:34:13: ( DEFINITIONS ( declaration )* ENDDEFINITIONS )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:34:15: DEFINITIONS ( declaration )* ENDDEFINITIONS
            {
            root_0 = (RGLTree)adaptor.nil();

            DEFINITIONS4=(Token)match(input,DEFINITIONS,FOLLOW_DEFINITIONS_in_definitions224); 
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:34:28: ( declaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==ACTION||LA2_0==FUNC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:34:28: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_definitions227);
            	    declaration5=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            ENDDEFINITIONS6=(Token)match(input,ENDDEFINITIONS,FOLLOW_ENDDEFINITIONS_in_definitions230); 

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
        }
        return retval;
    }
    // $ANTLR end "definitions"

    public static class declaration_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:36:1: declaration : ( action | function );
    public final RGLParser.declaration_return declaration() throws RecognitionException {
        RGLParser.declaration_return retval = new RGLParser.declaration_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        RGLParser.action_return action7 = null;

        RGLParser.function_return function8 = null;



        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:36:13: ( action | function )
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
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:36:15: action
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_action_in_declaration240);
                    action7=action();

                    state._fsp--;

                    adaptor.addChild(root_0, action7.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:36:24: function
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_function_in_declaration244);
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
        }
        return retval;
    }
    // $ANTLR end "declaration"

    public static class action_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "action"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:38:1: action : ACTION ID argList ':' instrList ENDACTION ;
    public final RGLParser.action_return action() throws RecognitionException {
        RGLParser.action_return retval = new RGLParser.action_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token ACTION9=null;
        Token ID10=null;
        Token char_literal12=null;
        Token ENDACTION14=null;
        RGLParser.argList_return argList11 = null;

        RGLParser.instrList_return instrList13 = null;


        RGLTree ACTION9_tree=null;
        RGLTree ID10_tree=null;
        RGLTree char_literal12_tree=null;
        RGLTree ENDACTION14_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:38:9: ( ACTION ID argList ':' instrList ENDACTION )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:38:11: ACTION ID argList ':' instrList ENDACTION
            {
            root_0 = (RGLTree)adaptor.nil();

            ACTION9=(Token)match(input,ACTION,FOLLOW_ACTION_in_action266); 
            ACTION9_tree = (RGLTree)adaptor.create(ACTION9);
            root_0 = (RGLTree)adaptor.becomeRoot(ACTION9_tree, root_0);

            ID10=(Token)match(input,ID,FOLLOW_ID_in_action269); 
            ID10_tree = (RGLTree)adaptor.create(ID10);
            adaptor.addChild(root_0, ID10_tree);

            pushFollow(FOLLOW_argList_in_action271);
            argList11=argList();

            state._fsp--;

            adaptor.addChild(root_0, argList11.getTree());
            char_literal12=(Token)match(input,78,FOLLOW_78_in_action273); 
            pushFollow(FOLLOW_instrList_in_action276);
            instrList13=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList13.getTree());
            ENDACTION14=(Token)match(input,ENDACTION,FOLLOW_ENDACTION_in_action278); 

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
        }
        return retval;
    }
    // $ANTLR end "action"

    public static class function_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "function"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:39:1: function : FUNC ID argList ':' instrList ENDFUNC ;
    public final RGLParser.function_return function() throws RecognitionException {
        RGLParser.function_return retval = new RGLParser.function_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token FUNC15=null;
        Token ID16=null;
        Token char_literal18=null;
        Token ENDFUNC20=null;
        RGLParser.argList_return argList17 = null;

        RGLParser.instrList_return instrList19 = null;


        RGLTree FUNC15_tree=null;
        RGLTree ID16_tree=null;
        RGLTree char_literal18_tree=null;
        RGLTree ENDFUNC20_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:39:10: ( FUNC ID argList ':' instrList ENDFUNC )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:39:12: FUNC ID argList ':' instrList ENDFUNC
            {
            root_0 = (RGLTree)adaptor.nil();

            FUNC15=(Token)match(input,FUNC,FOLLOW_FUNC_in_function287); 
            FUNC15_tree = (RGLTree)adaptor.create(FUNC15);
            root_0 = (RGLTree)adaptor.becomeRoot(FUNC15_tree, root_0);

            ID16=(Token)match(input,ID,FOLLOW_ID_in_function290); 
            ID16_tree = (RGLTree)adaptor.create(ID16);
            adaptor.addChild(root_0, ID16_tree);

            pushFollow(FOLLOW_argList_in_function292);
            argList17=argList();

            state._fsp--;

            adaptor.addChild(root_0, argList17.getTree());
            char_literal18=(Token)match(input,78,FOLLOW_78_in_function294); 
            pushFollow(FOLLOW_instrList_in_function297);
            instrList19=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList19.getTree());
            ENDFUNC20=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_function299); 

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
        }
        return retval;
    }
    // $ANTLR end "function"

    public static class main_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:41:1: main : BEGIN initialInstr ( instr )* END ;
    public final RGLParser.main_return main() throws RecognitionException {
        RGLParser.main_return retval = new RGLParser.main_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token BEGIN21=null;
        Token END24=null;
        RGLParser.initialInstr_return initialInstr22 = null;

        RGLParser.instr_return instr23 = null;


        RGLTree BEGIN21_tree=null;
        RGLTree END24_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:41:9: ( BEGIN initialInstr ( instr )* END )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:41:11: BEGIN initialInstr ( instr )* END
            {
            root_0 = (RGLTree)adaptor.nil();

            BEGIN21=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_main321); 
            pushFollow(FOLLOW_initialInstr_in_main324);
            initialInstr22=initialInstr();

            state._fsp--;

            adaptor.addChild(root_0, initialInstr22.getTree());
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:41:31: ( instr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID||(LA4_0>=RETURN && LA4_0<=TRAIL)||LA4_0==MARK||LA4_0==WHILE||LA4_0==FOR||LA4_0==IF) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:41:31: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_main326);
            	    instr23=instr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instr23.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            END24=(Token)match(input,END,FOLLOW_END_in_main329); 

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
        }
        return retval;
    }
    // $ANTLR end "main"

    public static class initialInstr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initialInstr"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:43:1: initialInstr : ( setMap )? setRobot ;
    public final RGLParser.initialInstr_return initialInstr() throws RecognitionException {
        RGLParser.initialInstr_return retval = new RGLParser.initialInstr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        RGLParser.setMap_return setMap25 = null;

        RGLParser.setRobot_return setRobot26 = null;



        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:43:14: ( ( setMap )? setRobot )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:43:17: ( setMap )? setRobot
            {
            root_0 = (RGLTree)adaptor.nil();

            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:43:17: ( setMap )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==INITMAP) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:43:17: setMap
                    {
                    pushFollow(FOLLOW_setMap_in_initialInstr345);
                    setMap25=setMap();

                    state._fsp--;

                    adaptor.addChild(root_0, setMap25.getTree());

                    }
                    break;

            }

            pushFollow(FOLLOW_setRobot_in_initialInstr348);
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
        }
        return retval;
    }
    // $ANTLR end "initialInstr"

    public static class setMap_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setMap"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:44:1: setMap : INITMAP INT ;
    public final RGLParser.setMap_return setMap() throws RecognitionException {
        RGLParser.setMap_return retval = new RGLParser.setMap_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token INITMAP27=null;
        Token INT28=null;

        RGLTree INITMAP27_tree=null;
        RGLTree INT28_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:44:9: ( INITMAP INT )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:44:13: INITMAP INT
            {
            root_0 = (RGLTree)adaptor.nil();

            INITMAP27=(Token)match(input,INITMAP,FOLLOW_INITMAP_in_setMap359); 
            INITMAP27_tree = (RGLTree)adaptor.create(INITMAP27);
            root_0 = (RGLTree)adaptor.becomeRoot(INITMAP27_tree, root_0);

            INT28=(Token)match(input,INT,FOLLOW_INT_in_setMap362); 
            INT28_tree = (RGLTree)adaptor.create(INT28);
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
        }
        return retval;
    }
    // $ANTLR end "setMap"

    public static class setRobot_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "setRobot"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:45:1: setRobot : INITROBOT numExpr ',' numExpr ',' numExpr ;
    public final RGLParser.setRobot_return setRobot() throws RecognitionException {
        RGLParser.setRobot_return retval = new RGLParser.setRobot_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token INITROBOT29=null;
        Token char_literal31=null;
        Token char_literal33=null;
        RGLParser.numExpr_return numExpr30 = null;

        RGLParser.numExpr_return numExpr32 = null;

        RGLParser.numExpr_return numExpr34 = null;


        RGLTree INITROBOT29_tree=null;
        RGLTree char_literal31_tree=null;
        RGLTree char_literal33_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:45:13: ( INITROBOT numExpr ',' numExpr ',' numExpr )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:45:15: INITROBOT numExpr ',' numExpr ',' numExpr
            {
            root_0 = (RGLTree)adaptor.nil();

            INITROBOT29=(Token)match(input,INITROBOT,FOLLOW_INITROBOT_in_setRobot373); 
            INITROBOT29_tree = (RGLTree)adaptor.create(INITROBOT29);
            root_0 = (RGLTree)adaptor.becomeRoot(INITROBOT29_tree, root_0);

            pushFollow(FOLLOW_numExpr_in_setRobot376);
            numExpr30=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr30.getTree());
            char_literal31=(Token)match(input,79,FOLLOW_79_in_setRobot378); 
            pushFollow(FOLLOW_numExpr_in_setRobot381);
            numExpr32=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr32.getTree());
            char_literal33=(Token)match(input,79,FOLLOW_79_in_setRobot383); 
            pushFollow(FOLLOW_numExpr_in_setRobot386);
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
        }
        return retval;
    }
    // $ANTLR end "setRobot"

    public static class instr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instr"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:47:1: instr : ( whileExpr | forExpr | ifExpr | actioncall | ID '=' numExpr | RETURN numExpr | MOVEFORWARD numExpr | STOPROBOT numExpr | MOVETO numExpr ',' numExpr | ROTATE numExpr | FACE direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE numExpr ',' numExpr | BOX numExpr ',' numExpr | TRAIL ( boolExpr | ON | OFF ) | MARK numExpr ',' numExpr );
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
        RGLParser.whileExpr_return whileExpr35 = null;

        RGLParser.forExpr_return forExpr36 = null;

        RGLParser.ifExpr_return ifExpr37 = null;

        RGLParser.actioncall_return actioncall38 = null;

        RGLParser.numExpr_return numExpr41 = null;

        RGLParser.numExpr_return numExpr43 = null;

        RGLParser.numExpr_return numExpr45 = null;

        RGLParser.numExpr_return numExpr47 = null;

        RGLParser.numExpr_return numExpr49 = null;

        RGLParser.numExpr_return numExpr51 = null;

        RGLParser.numExpr_return numExpr53 = null;

        RGLParser.direction_return direction55 = null;

        RGLParser.numExpr_return numExpr59 = null;

        RGLParser.numExpr_return numExpr61 = null;

        RGLParser.numExpr_return numExpr63 = null;

        RGLParser.numExpr_return numExpr65 = null;

        RGLParser.boolExpr_return boolExpr67 = null;

        RGLParser.numExpr_return numExpr71 = null;

        RGLParser.numExpr_return numExpr73 = null;


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
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:47:9: ( whileExpr | forExpr | ifExpr | actioncall | ID '=' numExpr | RETURN numExpr | MOVEFORWARD numExpr | STOPROBOT numExpr | MOVETO numExpr ',' numExpr | ROTATE numExpr | FACE direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE numExpr ',' numExpr | BOX numExpr ',' numExpr | TRAIL ( boolExpr | ON | OFF ) | MARK numExpr ',' numExpr )
            int alt7=17;
            alt7 = dfa7.predict(input);
            switch (alt7) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:49:9: whileExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_whileExpr_in_instr414);
                    whileExpr35=whileExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, whileExpr35.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:49:21: forExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_forExpr_in_instr418);
                    forExpr36=forExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, forExpr36.getTree());

                    }
                    break;
                case 3 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:50:11: ifExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_ifExpr_in_instr463);
                    ifExpr37=ifExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, ifExpr37.getTree());

                    }
                    break;
                case 4 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:51:11: actioncall
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_actioncall_in_instr519);
                    actioncall38=actioncall();

                    state._fsp--;

                    adaptor.addChild(root_0, actioncall38.getTree());

                    }
                    break;
                case 5 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:52:11: ID '=' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    ID39=(Token)match(input,ID,FOLLOW_ID_in_instr531); 
                    ID39_tree = (RGLTree)adaptor.create(ID39);
                    adaptor.addChild(root_0, ID39_tree);

                    char_literal40=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instr533); 
                    char_literal40_tree = (RGLTree)adaptor.create(char_literal40);
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal40_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr536);
                    numExpr41=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr41.getTree());

                    }
                    break;
                case 6 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:53:11: RETURN numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    RETURN42=(Token)match(input,RETURN,FOLLOW_RETURN_in_instr583); 
                    RETURN42_tree = (RGLTree)adaptor.create(RETURN42);
                    root_0 = (RGLTree)adaptor.becomeRoot(RETURN42_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr586);
                    numExpr43=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr43.getTree());

                    }
                    break;
                case 7 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:56:11: MOVEFORWARD numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    MOVEFORWARD44=(Token)match(input,MOVEFORWARD,FOLLOW_MOVEFORWARD_in_instr616); 
                    MOVEFORWARD44_tree = (RGLTree)adaptor.create(MOVEFORWARD44);
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVEFORWARD44_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr619);
                    numExpr45=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr45.getTree());

                    }
                    break;
                case 8 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:57:11: STOPROBOT numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    STOPROBOT46=(Token)match(input,STOPROBOT,FOLLOW_STOPROBOT_in_instr631); 
                    STOPROBOT46_tree = (RGLTree)adaptor.create(STOPROBOT46);
                    root_0 = (RGLTree)adaptor.becomeRoot(STOPROBOT46_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr634);
                    numExpr47=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr47.getTree());

                    }
                    break;
                case 9 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:58:11: MOVETO numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    MOVETO48=(Token)match(input,MOVETO,FOLLOW_MOVETO_in_instr646); 
                    MOVETO48_tree = (RGLTree)adaptor.create(MOVETO48);
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVETO48_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr649);
                    numExpr49=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr49.getTree());
                    char_literal50=(Token)match(input,79,FOLLOW_79_in_instr651); 
                    pushFollow(FOLLOW_numExpr_in_instr654);
                    numExpr51=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr51.getTree());

                    }
                    break;
                case 10 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:59:11: ROTATE numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    ROTATE52=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_instr666); 
                    ROTATE52_tree = (RGLTree)adaptor.create(ROTATE52);
                    root_0 = (RGLTree)adaptor.becomeRoot(ROTATE52_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr669);
                    numExpr53=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr53.getTree());

                    }
                    break;
                case 11 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:60:11: FACE direction
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    FACE54=(Token)match(input,FACE,FOLLOW_FACE_in_instr681); 
                    FACE54_tree = (RGLTree)adaptor.create(FACE54);
                    root_0 = (RGLTree)adaptor.becomeRoot(FACE54_tree, root_0);

                    pushFollow(FOLLOW_direction_in_instr684);
                    direction55=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction55.getTree());

                    }
                    break;
                case 12 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:61:11: PICKOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    PICKOBJECT56=(Token)match(input,PICKOBJECT,FOLLOW_PICKOBJECT_in_instr696); 
                    PICKOBJECT56_tree = (RGLTree)adaptor.create(PICKOBJECT56);
                    adaptor.addChild(root_0, PICKOBJECT56_tree);


                    }
                    break;
                case 13 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:62:11: RELEASEOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    RELEASEOBJECT57=(Token)match(input,RELEASEOBJECT,FOLLOW_RELEASEOBJECT_in_instr708); 
                    RELEASEOBJECT57_tree = (RGLTree)adaptor.create(RELEASEOBJECT57);
                    adaptor.addChild(root_0, RELEASEOBJECT57_tree);


                    }
                    break;
                case 14 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:63:11: OBSTACLE numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    OBSTACLE58=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_instr720); 
                    OBSTACLE58_tree = (RGLTree)adaptor.create(OBSTACLE58);
                    root_0 = (RGLTree)adaptor.becomeRoot(OBSTACLE58_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr723);
                    numExpr59=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr59.getTree());
                    char_literal60=(Token)match(input,79,FOLLOW_79_in_instr725); 
                    pushFollow(FOLLOW_numExpr_in_instr728);
                    numExpr61=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr61.getTree());

                    }
                    break;
                case 15 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:64:11: BOX numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    BOX62=(Token)match(input,BOX,FOLLOW_BOX_in_instr740); 
                    BOX62_tree = (RGLTree)adaptor.create(BOX62);
                    root_0 = (RGLTree)adaptor.becomeRoot(BOX62_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr743);
                    numExpr63=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr63.getTree());
                    char_literal64=(Token)match(input,79,FOLLOW_79_in_instr745); 
                    pushFollow(FOLLOW_numExpr_in_instr748);
                    numExpr65=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr65.getTree());

                    }
                    break;
                case 16 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:65:11: TRAIL ( boolExpr | ON | OFF )
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    TRAIL66=(Token)match(input,TRAIL,FOLLOW_TRAIL_in_instr760); 
                    TRAIL66_tree = (RGLTree)adaptor.create(TRAIL66);
                    root_0 = (RGLTree)adaptor.becomeRoot(TRAIL66_tree, root_0);

                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:65:18: ( boolExpr | ON | OFF )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case ID:
                    case INT:
                    case DOUBLE:
                    case NOT:
                    case TRUE:
                    case FALSE:
                    case DETECT:
                    case GETPOSX:
                    case GETPOSY:
                    case SIN:
                    case COS:
                    case SQRT:
                    case PLUS:
                    case MINUS:
                    case 80:
                        {
                        alt6=1;
                        }
                        break;
                    case ON:
                        {
                        alt6=2;
                        }
                        break;
                    case OFF:
                        {
                        alt6=3;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 6, 0, input);

                        throw nvae;
                    }

                    switch (alt6) {
                        case 1 :
                            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:65:19: boolExpr
                            {
                            pushFollow(FOLLOW_boolExpr_in_instr764);
                            boolExpr67=boolExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, boolExpr67.getTree());

                            }
                            break;
                        case 2 :
                            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:65:30: ON
                            {
                            ON68=(Token)match(input,ON,FOLLOW_ON_in_instr768); 
                            ON68_tree = (RGLTree)adaptor.create(ON68);
                            adaptor.addChild(root_0, ON68_tree);


                            }
                            break;
                        case 3 :
                            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:65:35: OFF
                            {
                            OFF69=(Token)match(input,OFF,FOLLOW_OFF_in_instr772); 
                            OFF69_tree = (RGLTree)adaptor.create(OFF69);
                            adaptor.addChild(root_0, OFF69_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 17 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:66:11: MARK numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    MARK70=(Token)match(input,MARK,FOLLOW_MARK_in_instr785); 
                    MARK70_tree = (RGLTree)adaptor.create(MARK70);
                    root_0 = (RGLTree)adaptor.becomeRoot(MARK70_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr788);
                    numExpr71=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr71.getTree());
                    char_literal72=(Token)match(input,79,FOLLOW_79_in_instr790); 
                    pushFollow(FOLLOW_numExpr_in_instr793);
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
        }
        return retval;
    }
    // $ANTLR end "instr"

    public static class actioncall_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actioncall"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:69:1: actioncall : ID '(' ( params )? ')' -> ^( CALL ID ( params )? ) ;
    public final RGLParser.actioncall_return actioncall() throws RecognitionException {
        RGLParser.actioncall_return retval = new RGLParser.actioncall_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token ID74=null;
        Token char_literal75=null;
        Token char_literal77=null;
        RGLParser.params_return params76 = null;


        RGLTree ID74_tree=null;
        RGLTree char_literal75_tree=null;
        RGLTree char_literal77_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:69:13: ( ID '(' ( params )? ')' -> ^( CALL ID ( params )? ) )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:69:15: ID '(' ( params )? ')'
            {
            ID74=(Token)match(input,ID,FOLLOW_ID_in_actioncall819);  
            stream_ID.add(ID74);

            char_literal75=(Token)match(input,80,FOLLOW_80_in_actioncall821);  
            stream_80.add(char_literal75);

            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:69:22: ( params )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||LA8_0==INT||LA8_0==DOUBLE||(LA8_0>=GETPOSX && LA8_0<=SQRT)||(LA8_0>=PLUS && LA8_0<=MINUS)||LA8_0==80) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:69:22: params
                    {
                    pushFollow(FOLLOW_params_in_actioncall823);
                    params76=params();

                    state._fsp--;

                    stream_params.add(params76.getTree());

                    }
                    break;

            }

            char_literal77=(Token)match(input,81,FOLLOW_81_in_actioncall826);  
            stream_81.add(char_literal77);



            // AST REWRITE
            // elements: ID, params
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (RGLTree)adaptor.nil();
            // 70:9: -> ^( CALL ID ( params )? )
            {
                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:70:12: ^( CALL ID ( params )? )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(CALL, "CALL"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:70:22: ( params )?
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
        }
        return retval;
    }
    // $ANTLR end "actioncall"

    public static class funccall_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "funccall"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:73:1: funccall : ID '(' ( params )? ')' -> ^( GET ID ( params )? ) ;
    public final RGLParser.funccall_return funccall() throws RecognitionException {
        RGLParser.funccall_return retval = new RGLParser.funccall_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token ID78=null;
        Token char_literal79=null;
        Token char_literal81=null;
        RGLParser.params_return params80 = null;


        RGLTree ID78_tree=null;
        RGLTree char_literal79_tree=null;
        RGLTree char_literal81_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_81=new RewriteRuleTokenStream(adaptor,"token 81");
        RewriteRuleSubtreeStream stream_params=new RewriteRuleSubtreeStream(adaptor,"rule params");
        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:73:9: ( ID '(' ( params )? ')' -> ^( GET ID ( params )? ) )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:73:11: ID '(' ( params )? ')'
            {
            ID78=(Token)match(input,ID,FOLLOW_ID_in_funccall869);  
            stream_ID.add(ID78);

            char_literal79=(Token)match(input,80,FOLLOW_80_in_funccall871);  
            stream_80.add(char_literal79);

            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:73:18: ( params )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ID||LA9_0==INT||LA9_0==DOUBLE||(LA9_0>=GETPOSX && LA9_0<=SQRT)||(LA9_0>=PLUS && LA9_0<=MINUS)||LA9_0==80) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:73:18: params
                    {
                    pushFollow(FOLLOW_params_in_funccall873);
                    params80=params();

                    state._fsp--;

                    stream_params.add(params80.getTree());

                    }
                    break;

            }

            char_literal81=(Token)match(input,81,FOLLOW_81_in_funccall876);  
            stream_81.add(char_literal81);



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
            // 74:9: -> ^( GET ID ( params )? )
            {
                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:74:12: ^( GET ID ( params )? )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(GET, "GET"), root_1);

                adaptor.addChild(root_1, stream_ID.nextNode());
                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:74:21: ( params )?
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
        }
        return retval;
    }
    // $ANTLR end "funccall"

    public static class params_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "params"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:77:1: params : numExpr ( ',' numExpr )* ;
    public final RGLParser.params_return params() throws RecognitionException {
        RGLParser.params_return retval = new RGLParser.params_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal83=null;
        RGLParser.numExpr_return numExpr82 = null;

        RGLParser.numExpr_return numExpr84 = null;


        RGLTree char_literal83_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:77:8: ( numExpr ( ',' numExpr )* )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:77:10: numExpr ( ',' numExpr )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_numExpr_in_params920);
            numExpr82=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr82.getTree());
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:77:18: ( ',' numExpr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==79) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:77:19: ',' numExpr
            	    {
            	    char_literal83=(Token)match(input,79,FOLLOW_79_in_params923); 
            	    pushFollow(FOLLOW_numExpr_in_params926);
            	    numExpr84=numExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, numExpr84.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "params"

    public static class argList_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argList"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:79:1: argList : ( args )? -> ^( ARGLIST ( args )? ) ;
    public final RGLParser.argList_return argList() throws RecognitionException {
        RGLParser.argList_return retval = new RGLParser.argList_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        RGLParser.args_return args85 = null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:79:9: ( ( args )? -> ^( ARGLIST ( args )? ) )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:79:11: ( args )?
            {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:79:11: ( args )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID||LA11_0==DOUBLE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:79:11: args
                    {
                    pushFollow(FOLLOW_args_in_argList937);
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
            // 79:17: -> ^( ARGLIST ( args )? )
            {
                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:79:20: ^( ARGLIST ( args )? )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(ARGLIST, "ARGLIST"), root_1);

                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:79:30: ( args )?
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
        }
        return retval;
    }
    // $ANTLR end "argList"

    public static class args_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "args"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:80:1: args : arg ( ',' arg )* ;
    public final RGLParser.args_return args() throws RecognitionException {
        RGLParser.args_return retval = new RGLParser.args_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal87=null;
        RGLParser.arg_return arg86 = null;

        RGLParser.arg_return arg88 = null;


        RGLTree char_literal87_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:80:9: ( arg ( ',' arg )* )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:80:11: arg ( ',' arg )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_arg_in_args958);
            arg86=arg();

            state._fsp--;

            adaptor.addChild(root_0, arg86.getTree());
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:80:15: ( ',' arg )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==79) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:80:16: ',' arg
            	    {
            	    char_literal87=(Token)match(input,79,FOLLOW_79_in_args961); 
            	    pushFollow(FOLLOW_arg_in_args964);
            	    arg88=arg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arg88.getTree());

            	    }
            	    break;

            	default :
            	    break loop12;
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
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class arg_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:82:1: arg : ( ID | DOUBLE );
    public final RGLParser.arg_return arg() throws RecognitionException {
        RGLParser.arg_return retval = new RGLParser.arg_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token set89=null;

        RGLTree set89_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:82:9: ( ID | DOUBLE )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();

            set89=(Token)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==DOUBLE ) {
                input.consume();
                adaptor.addChild(root_0, (RGLTree)adaptor.create(set89));
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
        }
        return retval;
    }
    // $ANTLR end "arg"

    public static class instrList_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instrList"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:86:1: instrList : ( instr )* -> ^( INSTRLIST ( instr )* ) ;
    public final RGLParser.instrList_return instrList() throws RecognitionException {
        RGLParser.instrList_return retval = new RGLParser.instrList_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        RGLParser.instr_return instr90 = null;


        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:86:13: ( ( instr )* -> ^( INSTRLIST ( instr )* ) )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:86:15: ( instr )*
            {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:86:15: ( instr )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==ID||(LA13_0>=RETURN && LA13_0<=TRAIL)||LA13_0==MARK||LA13_0==WHILE||LA13_0==FOR||LA13_0==IF) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:86:15: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_instrList1011);
            	    instr90=instr();

            	    state._fsp--;

            	    stream_instr.add(instr90.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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
            // 86:23: -> ^( INSTRLIST ( instr )* )
            {
                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:86:26: ^( INSTRLIST ( instr )* )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(INSTRLIST, "INSTRLIST"), root_1);

                // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:86:38: ( instr )*
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
        }
        return retval;
    }
    // $ANTLR end "instrList"

    public static class whileExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "whileExpr"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:88:1: whileExpr : WHILE boolExpr DO instrList WEND ;
    public final RGLParser.whileExpr_return whileExpr() throws RecognitionException {
        RGLParser.whileExpr_return retval = new RGLParser.whileExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token WHILE91=null;
        Token DO93=null;
        Token WEND95=null;
        RGLParser.boolExpr_return boolExpr92 = null;

        RGLParser.instrList_return instrList94 = null;


        RGLTree WHILE91_tree=null;
        RGLTree DO93_tree=null;
        RGLTree WEND95_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:88:13: ( WHILE boolExpr DO instrList WEND )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:88:15: WHILE boolExpr DO instrList WEND
            {
            root_0 = (RGLTree)adaptor.nil();

            WHILE91=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExpr1055); 
            WHILE91_tree = (RGLTree)adaptor.create(WHILE91);
            root_0 = (RGLTree)adaptor.becomeRoot(WHILE91_tree, root_0);

            pushFollow(FOLLOW_boolExpr_in_whileExpr1058);
            boolExpr92=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr92.getTree());
            DO93=(Token)match(input,DO,FOLLOW_DO_in_whileExpr1060); 
            pushFollow(FOLLOW_instrList_in_whileExpr1063);
            instrList94=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList94.getTree());
            WEND95=(Token)match(input,WEND,FOLLOW_WEND_in_whileExpr1065); 

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
        }
        return retval;
    }
    // $ANTLR end "whileExpr"

    public static class forExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "forExpr"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:90:1: forExpr : FOR ID FROM numExpr TO numExpr ( STEP numExpr )? DO instrList FEND ;
    public final RGLParser.forExpr_return forExpr() throws RecognitionException {
        RGLParser.forExpr_return retval = new RGLParser.forExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token FOR96=null;
        Token ID97=null;
        Token FROM98=null;
        Token TO100=null;
        Token STEP102=null;
        Token DO104=null;
        Token FEND106=null;
        RGLParser.numExpr_return numExpr99 = null;

        RGLParser.numExpr_return numExpr101 = null;

        RGLParser.numExpr_return numExpr103 = null;

        RGLParser.instrList_return instrList105 = null;


        RGLTree FOR96_tree=null;
        RGLTree ID97_tree=null;
        RGLTree FROM98_tree=null;
        RGLTree TO100_tree=null;
        RGLTree STEP102_tree=null;
        RGLTree DO104_tree=null;
        RGLTree FEND106_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:90:13: ( FOR ID FROM numExpr TO numExpr ( STEP numExpr )? DO instrList FEND )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:90:15: FOR ID FROM numExpr TO numExpr ( STEP numExpr )? DO instrList FEND
            {
            root_0 = (RGLTree)adaptor.nil();

            FOR96=(Token)match(input,FOR,FOLLOW_FOR_in_forExpr1091); 
            FOR96_tree = (RGLTree)adaptor.create(FOR96);
            root_0 = (RGLTree)adaptor.becomeRoot(FOR96_tree, root_0);

            ID97=(Token)match(input,ID,FOLLOW_ID_in_forExpr1094); 
            ID97_tree = (RGLTree)adaptor.create(ID97);
            adaptor.addChild(root_0, ID97_tree);

            FROM98=(Token)match(input,FROM,FOLLOW_FROM_in_forExpr1096); 
            pushFollow(FOLLOW_numExpr_in_forExpr1099);
            numExpr99=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr99.getTree());
            TO100=(Token)match(input,TO,FOLLOW_TO_in_forExpr1101); 
            pushFollow(FOLLOW_numExpr_in_forExpr1104);
            numExpr101=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr101.getTree());
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:90:49: ( STEP numExpr )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==STEP) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:90:50: STEP numExpr
                    {
                    STEP102=(Token)match(input,STEP,FOLLOW_STEP_in_forExpr1107); 
                    pushFollow(FOLLOW_numExpr_in_forExpr1110);
                    numExpr103=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr103.getTree());

                    }
                    break;

            }

            DO104=(Token)match(input,DO,FOLLOW_DO_in_forExpr1114); 
            pushFollow(FOLLOW_instrList_in_forExpr1117);
            instrList105=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList105.getTree());
            FEND106=(Token)match(input,FEND,FOLLOW_FEND_in_forExpr1119); 

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
        }
        return retval;
    }
    // $ANTLR end "forExpr"

    public static class ifExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "ifExpr"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:92:1: ifExpr : IF boolExpr THEN instrList ( ELSE instrList )? ENDIF ;
    public final RGLParser.ifExpr_return ifExpr() throws RecognitionException {
        RGLParser.ifExpr_return retval = new RGLParser.ifExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token IF107=null;
        Token THEN109=null;
        Token ELSE111=null;
        Token ENDIF113=null;
        RGLParser.boolExpr_return boolExpr108 = null;

        RGLParser.instrList_return instrList110 = null;

        RGLParser.instrList_return instrList112 = null;


        RGLTree IF107_tree=null;
        RGLTree THEN109_tree=null;
        RGLTree ELSE111_tree=null;
        RGLTree ENDIF113_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:92:13: ( IF boolExpr THEN instrList ( ELSE instrList )? ENDIF )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:92:15: IF boolExpr THEN instrList ( ELSE instrList )? ENDIF
            {
            root_0 = (RGLTree)adaptor.nil();

            IF107=(Token)match(input,IF,FOLLOW_IF_in_ifExpr1146); 
            IF107_tree = (RGLTree)adaptor.create(IF107);
            root_0 = (RGLTree)adaptor.becomeRoot(IF107_tree, root_0);

            pushFollow(FOLLOW_boolExpr_in_ifExpr1149);
            boolExpr108=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr108.getTree());
            THEN109=(Token)match(input,THEN,FOLLOW_THEN_in_ifExpr1151); 
            pushFollow(FOLLOW_instrList_in_ifExpr1154);
            instrList110=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList110.getTree());
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:92:44: ( ELSE instrList )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==ELSE) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:92:45: ELSE instrList
                    {
                    ELSE111=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifExpr1157); 
                    pushFollow(FOLLOW_instrList_in_ifExpr1160);
                    instrList112=instrList();

                    state._fsp--;

                    adaptor.addChild(root_0, instrList112.getTree());

                    }
                    break;

            }

            ENDIF113=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExpr1164); 

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
        }
        return retval;
    }
    // $ANTLR end "ifExpr"

    public static class boolExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolExpr"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:95:1: boolExpr : boolterm ( OR boolterm )* ;
    public final RGLParser.boolExpr_return boolExpr() throws RecognitionException {
        RGLParser.boolExpr_return retval = new RGLParser.boolExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token OR115=null;
        RGLParser.boolterm_return boolterm114 = null;

        RGLParser.boolterm_return boolterm116 = null;


        RGLTree OR115_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:95:13: ( boolterm ( OR boolterm )* )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:95:15: boolterm ( OR boolterm )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_boolterm_in_boolExpr1178);
            boolterm114=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm114.getTree());
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:95:24: ( OR boolterm )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==OR) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:95:25: OR boolterm
            	    {
            	    OR115=(Token)match(input,OR,FOLLOW_OR_in_boolExpr1181); 
            	    OR115_tree = (RGLTree)adaptor.create(OR115);
            	    root_0 = (RGLTree)adaptor.becomeRoot(OR115_tree, root_0);

            	    pushFollow(FOLLOW_boolterm_in_boolExpr1184);
            	    boolterm116=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm116.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "boolExpr"

    public static class boolterm_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolterm"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:97:1: boolterm : boolfact ( AND boolfact )* ;
    public final RGLParser.boolterm_return boolterm() throws RecognitionException {
        RGLParser.boolterm_return retval = new RGLParser.boolterm_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token AND118=null;
        RGLParser.boolfact_return boolfact117 = null;

        RGLParser.boolfact_return boolfact119 = null;


        RGLTree AND118_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:97:13: ( boolfact ( AND boolfact )* )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:97:15: boolfact ( AND boolfact )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_boolfact_in_boolterm1210);
            boolfact117=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact117.getTree());
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:97:24: ( AND boolfact )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==AND) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:97:25: AND boolfact
            	    {
            	    AND118=(Token)match(input,AND,FOLLOW_AND_in_boolterm1213); 
            	    AND118_tree = (RGLTree)adaptor.create(AND118);
            	    root_0 = (RGLTree)adaptor.becomeRoot(AND118_tree, root_0);

            	    pushFollow(FOLLOW_boolfact_in_boolterm1216);
            	    boolfact119=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact119.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
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
        }
        return retval;
    }
    // $ANTLR end "boolterm"

    public static class boolfact_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolfact"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:99:1: boolfact : ( NOT )? boolatom ;
    public final RGLParser.boolfact_return boolfact() throws RecognitionException {
        RGLParser.boolfact_return retval = new RGLParser.boolfact_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token NOT120=null;
        RGLParser.boolatom_return boolatom121 = null;


        RGLTree NOT120_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:99:13: ( ( NOT )? boolatom )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:99:15: ( NOT )? boolatom
            {
            root_0 = (RGLTree)adaptor.nil();

            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:99:15: ( NOT )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==NOT) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:99:16: NOT
                    {
                    NOT120=(Token)match(input,NOT,FOLLOW_NOT_in_boolfact1231); 
                    NOT120_tree = (RGLTree)adaptor.create(NOT120);
                    root_0 = (RGLTree)adaptor.becomeRoot(NOT120_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_boolatom_in_boolfact1236);
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
        }
        return retval;
    }
    // $ANTLR end "boolfact"

    public static class boolatom_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolatom"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:101:1: boolatom : ( numExpr ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) numExpr | TRUE | FALSE | DETECT side );
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
        RGLParser.numExpr_return numExpr122 = null;

        RGLParser.numExpr_return numExpr129 = null;

        RGLParser.side_return side133 = null;


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
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:101:12: ( numExpr ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) numExpr | TRUE | FALSE | DETECT side )
            int alt20=4;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case DOUBLE:
            case GETPOSX:
            case GETPOSY:
            case SIN:
            case COS:
            case SQRT:
            case PLUS:
            case MINUS:
            case 80:
                {
                alt20=1;
                }
                break;
            case TRUE:
                {
                alt20=2;
                }
                break;
            case FALSE:
                {
                alt20=3;
                }
                break;
            case DETECT:
                {
                alt20=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }

            switch (alt20) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:101:14: numExpr ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_numExpr_in_boolatom1259);
                    numExpr122=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr122.getTree());
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:101:22: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
                    int alt19=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt19=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt19=2;
                        }
                        break;
                    case 82:
                        {
                        alt19=3;
                        }
                        break;
                    case 83:
                        {
                        alt19=4;
                        }
                        break;
                    case 84:
                        {
                        alt19=5;
                        }
                        break;
                    case 85:
                        {
                        alt19=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }

                    switch (alt19) {
                        case 1 :
                            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:101:23: '=='
                            {
                            string_literal123=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_boolatom1262); 
                            string_literal123_tree = (RGLTree)adaptor.create(string_literal123);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal123_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:101:31: '!='
                            {
                            string_literal124=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolatom1267); 
                            string_literal124_tree = (RGLTree)adaptor.create(string_literal124);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal124_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:101:39: '<'
                            {
                            char_literal125=(Token)match(input,82,FOLLOW_82_in_boolatom1272); 
                            char_literal125_tree = (RGLTree)adaptor.create(char_literal125);
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal125_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:101:46: '<='
                            {
                            string_literal126=(Token)match(input,83,FOLLOW_83_in_boolatom1277); 
                            string_literal126_tree = (RGLTree)adaptor.create(string_literal126);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal126_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:101:54: '>'
                            {
                            char_literal127=(Token)match(input,84,FOLLOW_84_in_boolatom1282); 
                            char_literal127_tree = (RGLTree)adaptor.create(char_literal127);
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal127_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:101:61: '>='
                            {
                            string_literal128=(Token)match(input,85,FOLLOW_85_in_boolatom1287); 
                            string_literal128_tree = (RGLTree)adaptor.create(string_literal128);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal128_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_numExpr_in_boolatom1291);
                    numExpr129=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr129.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:102:15: TRUE
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    TRUE130=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolatom1307); 
                    TRUE130_tree = (RGLTree)adaptor.create(TRUE130);
                    adaptor.addChild(root_0, TRUE130_tree);


                    }
                    break;
                case 3 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:102:22: FALSE
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    FALSE131=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolatom1311); 
                    FALSE131_tree = (RGLTree)adaptor.create(FALSE131);
                    adaptor.addChild(root_0, FALSE131_tree);


                    }
                    break;
                case 4 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:103:15: DETECT side
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    DETECT132=(Token)match(input,DETECT,FOLLOW_DETECT_in_boolatom1327); 
                    DETECT132_tree = (RGLTree)adaptor.create(DETECT132);
                    root_0 = (RGLTree)adaptor.becomeRoot(DETECT132_tree, root_0);

                    pushFollow(FOLLOW_side_in_boolatom1330);
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
        }
        return retval;
    }
    // $ANTLR end "boolatom"

    public static class numExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numExpr"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:106:1: numExpr : term ( ( '+' | '-' ) term )* ;
    public final RGLParser.numExpr_return numExpr() throws RecognitionException {
        RGLParser.numExpr_return retval = new RGLParser.numExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal135=null;
        Token char_literal136=null;
        RGLParser.term_return term134 = null;

        RGLParser.term_return term137 = null;


        RGLTree char_literal135_tree=null;
        RGLTree char_literal136_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:106:9: ( term ( ( '+' | '-' ) term )* )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:106:11: term ( ( '+' | '-' ) term )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_term_in_numExpr1351);
            term134=term();

            state._fsp--;

            adaptor.addChild(root_0, term134.getTree());
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:106:16: ( ( '+' | '-' ) term )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( ((LA22_0>=PLUS && LA22_0<=MINUS)) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:106:18: ( '+' | '-' ) term
            	    {
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:106:18: ( '+' | '-' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==PLUS) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==MINUS) ) {
            	        alt21=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 21, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt21) {
            	        case 1 :
            	            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:106:19: '+'
            	            {
            	            char_literal135=(Token)match(input,PLUS,FOLLOW_PLUS_in_numExpr1356); 
            	            char_literal135_tree = (RGLTree)adaptor.create(char_literal135);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal135_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:106:26: '-'
            	            {
            	            char_literal136=(Token)match(input,MINUS,FOLLOW_MINUS_in_numExpr1361); 
            	            char_literal136_tree = (RGLTree)adaptor.create(char_literal136);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal136_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_numExpr1365);
            	    term137=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term137.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "numExpr"

    public static class term_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:108:1: term : factor ( ( '*' | '/' | MOD ) factor )* ;
    public final RGLParser.term_return term() throws RecognitionException {
        RGLParser.term_return retval = new RGLParser.term_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal139=null;
        Token char_literal140=null;
        Token MOD141=null;
        RGLParser.factor_return factor138 = null;

        RGLParser.factor_return factor142 = null;


        RGLTree char_literal139_tree=null;
        RGLTree char_literal140_tree=null;
        RGLTree MOD141_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:108:9: ( factor ( ( '*' | '/' | MOD ) factor )* )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:108:11: factor ( ( '*' | '/' | MOD ) factor )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term1379);
            factor138=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor138.getTree());
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:108:18: ( ( '*' | '/' | MOD ) factor )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==MOD||(LA24_0>=MUL && LA24_0<=DIV)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:108:20: ( '*' | '/' | MOD ) factor
            	    {
            	    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:108:20: ( '*' | '/' | MOD )
            	    int alt23=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 23, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt23) {
            	        case 1 :
            	            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:108:21: '*'
            	            {
            	            char_literal139=(Token)match(input,MUL,FOLLOW_MUL_in_term1384); 
            	            char_literal139_tree = (RGLTree)adaptor.create(char_literal139);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal139_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:108:28: '/'
            	            {
            	            char_literal140=(Token)match(input,DIV,FOLLOW_DIV_in_term1389); 
            	            char_literal140_tree = (RGLTree)adaptor.create(char_literal140);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal140_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:108:35: MOD
            	            {
            	            MOD141=(Token)match(input,MOD,FOLLOW_MOD_in_term1394); 
            	            MOD141_tree = (RGLTree)adaptor.create(MOD141);
            	            root_0 = (RGLTree)adaptor.becomeRoot(MOD141_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_factor_in_term1398);
            	    factor142=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor142.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
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
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:110:1: factor : ( '+' | '-' )? atom ;
    public final RGLParser.factor_return factor() throws RecognitionException {
        RGLParser.factor_return retval = new RGLParser.factor_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal143=null;
        Token char_literal144=null;
        RGLParser.atom_return atom145 = null;


        RGLTree char_literal143_tree=null;
        RGLTree char_literal144_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:110:9: ( ( '+' | '-' )? atom )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:110:11: ( '+' | '-' )? atom
            {
            root_0 = (RGLTree)adaptor.nil();

            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:110:11: ( '+' | '-' )?
            int alt25=3;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==PLUS) ) {
                alt25=1;
            }
            else if ( (LA25_0==MINUS) ) {
                alt25=2;
            }
            switch (alt25) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:110:12: '+'
                    {
                    char_literal143=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1411); 
                    char_literal143_tree = (RGLTree)adaptor.create(char_literal143);
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal143_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:110:19: '-'
                    {
                    char_literal144=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1416); 
                    char_literal144_tree = (RGLTree)adaptor.create(char_literal144);
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal144_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_in_factor1421);
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
        }
        return retval;
    }
    // $ANTLR end "factor"

    public static class atom_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "atom"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:112:1: atom : ( ( DOUBLE | INT ) | ID | funccall | predefined | GETPOSX | GETPOSY | '(' numExpr ')' );
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
        RGLParser.funccall_return funccall148 = null;

        RGLParser.predefined_return predefined149 = null;

        RGLParser.numExpr_return numExpr153 = null;


        RGLTree set146_tree=null;
        RGLTree ID147_tree=null;
        RGLTree GETPOSX150_tree=null;
        RGLTree GETPOSY151_tree=null;
        RGLTree char_literal152_tree=null;
        RGLTree char_literal154_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:112:9: ( ( DOUBLE | INT ) | ID | funccall | predefined | GETPOSX | GETPOSY | '(' numExpr ')' )
            int alt26=7;
            switch ( input.LA(1) ) {
            case INT:
            case DOUBLE:
                {
                alt26=1;
                }
                break;
            case ID:
                {
                int LA26_2 = input.LA(2);

                if ( (LA26_2==80) ) {
                    alt26=3;
                }
                else if ( ((LA26_2>=ID && LA26_2<=ENDACTION)||LA26_2==ENDFUNC||LA26_2==END||(LA26_2>=RETURN && LA26_2<=TRAIL)||LA26_2==MARK||(LA26_2>=WHILE && LA26_2<=FOR)||(LA26_2>=TO && LA26_2<=AND)||LA26_2==MOD||(LA26_2>=EQUALS && LA26_2<=DIV)||LA26_2==79||(LA26_2>=81 && LA26_2<=85)) ) {
                    alt26=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 26, 2, input);

                    throw nvae;
                }
                }
                break;
            case SIN:
            case COS:
            case SQRT:
                {
                alt26=4;
                }
                break;
            case GETPOSX:
                {
                alt26=5;
                }
                break;
            case GETPOSY:
                {
                alt26=6;
                }
                break;
            case 80:
                {
                alt26=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;
            }

            switch (alt26) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:112:11: ( DOUBLE | INT )
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    set146=(Token)input.LT(1);
                    if ( input.LA(1)==INT||input.LA(1)==DOUBLE ) {
                        input.consume();
                        adaptor.addChild(root_0, (RGLTree)adaptor.create(set146));
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:113:11: ID
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    ID147=(Token)match(input,ID,FOLLOW_ID_in_atom1451); 
                    ID147_tree = (RGLTree)adaptor.create(ID147);
                    adaptor.addChild(root_0, ID147_tree);


                    }
                    break;
                case 3 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:114:11: funccall
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_funccall_in_atom1463);
                    funccall148=funccall();

                    state._fsp--;

                    adaptor.addChild(root_0, funccall148.getTree());

                    }
                    break;
                case 4 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:115:11: predefined
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_predefined_in_atom1475);
                    predefined149=predefined();

                    state._fsp--;

                    adaptor.addChild(root_0, predefined149.getTree());

                    }
                    break;
                case 5 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:116:11: GETPOSX
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    GETPOSX150=(Token)match(input,GETPOSX,FOLLOW_GETPOSX_in_atom1487); 
                    GETPOSX150_tree = (RGLTree)adaptor.create(GETPOSX150);
                    adaptor.addChild(root_0, GETPOSX150_tree);


                    }
                    break;
                case 6 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:117:11: GETPOSY
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    GETPOSY151=(Token)match(input,GETPOSY,FOLLOW_GETPOSY_in_atom1499); 
                    GETPOSY151_tree = (RGLTree)adaptor.create(GETPOSY151);
                    adaptor.addChild(root_0, GETPOSY151_tree);


                    }
                    break;
                case 7 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:118:11: '(' numExpr ')'
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    char_literal152=(Token)match(input,80,FOLLOW_80_in_atom1511); 
                    pushFollow(FOLLOW_numExpr_in_atom1514);
                    numExpr153=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr153.getTree());
                    char_literal154=(Token)match(input,81,FOLLOW_81_in_atom1516); 

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
        }
        return retval;
    }
    // $ANTLR end "atom"

    public static class predefined_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "predefined"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:121:1: predefined : ( SIN '(' numExpr ')' | COS '(' numExpr ')' | SQRT '(' numExpr ')' );
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
        RGLParser.numExpr_return numExpr157 = null;

        RGLParser.numExpr_return numExpr161 = null;

        RGLParser.numExpr_return numExpr165 = null;


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
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:121:13: ( SIN '(' numExpr ')' | COS '(' numExpr ')' | SQRT '(' numExpr ')' )
            int alt27=3;
            switch ( input.LA(1) ) {
            case SIN:
                {
                alt27=1;
                }
                break;
            case COS:
                {
                alt27=2;
                }
                break;
            case SQRT:
                {
                alt27=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;
            }

            switch (alt27) {
                case 1 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:121:15: SIN '(' numExpr ')'
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    SIN155=(Token)match(input,SIN,FOLLOW_SIN_in_predefined1535); 
                    SIN155_tree = (RGLTree)adaptor.create(SIN155);
                    root_0 = (RGLTree)adaptor.becomeRoot(SIN155_tree, root_0);

                    char_literal156=(Token)match(input,80,FOLLOW_80_in_predefined1538); 
                    pushFollow(FOLLOW_numExpr_in_predefined1541);
                    numExpr157=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr157.getTree());
                    char_literal158=(Token)match(input,81,FOLLOW_81_in_predefined1543); 

                    }
                    break;
                case 2 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:122:15: COS '(' numExpr ')'
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    COS159=(Token)match(input,COS,FOLLOW_COS_in_predefined1560); 
                    COS159_tree = (RGLTree)adaptor.create(COS159);
                    root_0 = (RGLTree)adaptor.becomeRoot(COS159_tree, root_0);

                    char_literal160=(Token)match(input,80,FOLLOW_80_in_predefined1563); 
                    pushFollow(FOLLOW_numExpr_in_predefined1566);
                    numExpr161=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr161.getTree());
                    char_literal162=(Token)match(input,81,FOLLOW_81_in_predefined1568); 

                    }
                    break;
                case 3 :
                    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:123:15: SQRT '(' numExpr ')'
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    SQRT163=(Token)match(input,SQRT,FOLLOW_SQRT_in_predefined1585); 
                    SQRT163_tree = (RGLTree)adaptor.create(SQRT163);
                    root_0 = (RGLTree)adaptor.becomeRoot(SQRT163_tree, root_0);

                    char_literal164=(Token)match(input,80,FOLLOW_80_in_predefined1588); 
                    pushFollow(FOLLOW_numExpr_in_predefined1591);
                    numExpr165=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr165.getTree());
                    char_literal166=(Token)match(input,81,FOLLOW_81_in_predefined1593); 

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
        }
        return retval;
    }
    // $ANTLR end "predefined"

    public static class direction_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "direction"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:126:1: direction : ( NORTH | SOUTH | EAST | WEST );
    public final RGLParser.direction_return direction() throws RecognitionException {
        RGLParser.direction_return retval = new RGLParser.direction_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token set167=null;

        RGLTree set167_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:126:13: ( NORTH | SOUTH | EAST | WEST )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();

            set167=(Token)input.LT(1);
            if ( (input.LA(1)>=NORTH && input.LA(1)<=WEST) ) {
                input.consume();
                adaptor.addChild(root_0, (RGLTree)adaptor.create(set167));
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
        }
        return retval;
    }
    // $ANTLR end "direction"

    public static class side_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "side"
    // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:127:1: side : ( FRONT | RIGHT | LEFT );
    public final RGLParser.side_return side() throws RecognitionException {
        RGLParser.side_return retval = new RGLParser.side_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token set168=null;

        RGLTree set168_tree=null;

        try {
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:127:11: ( FRONT | RIGHT | LEFT )
            // /home/albert/Escriptori/Projecte/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();

            set168=(Token)input.LT(1);
            if ( (input.LA(1)>=FRONT && input.LA(1)<=LEFT) ) {
                input.consume();
                adaptor.addChild(root_0, (RGLTree)adaptor.create(set168));
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
        }
        return retval;
    }
    // $ANTLR end "side"

    // Delegated rules


    protected DFA7 dfa7 = new DFA7(this);
    static final String DFA7_eotS =
        "\23\uffff";
    static final String DFA7_eofS =
        "\23\uffff";
    static final String DFA7_minS =
        "\1\16\3\uffff\1\105\16\uffff";
    static final String DFA7_maxS =
        "\1\56\3\uffff\1\120\16\uffff";
    static final String DFA7_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\uffff\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1"+
        "\15\1\16\1\17\1\20\1\21\1\4\1\5";
    static final String DFA7_specialS =
        "\23\uffff}>";
    static final String[] DFA7_transitionS = {
            "\1\4\10\uffff\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
            "\1\17\2\uffff\1\20\1\uffff\1\1\2\uffff\1\2\4\uffff\1\3",
            "",
            "",
            "",
            "\1\22\12\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA7_eot = DFA.unpackEncodedString(DFA7_eotS);
    static final short[] DFA7_eof = DFA.unpackEncodedString(DFA7_eofS);
    static final char[] DFA7_min = DFA.unpackEncodedStringToUnsignedChars(DFA7_minS);
    static final char[] DFA7_max = DFA.unpackEncodedStringToUnsignedChars(DFA7_maxS);
    static final short[] DFA7_accept = DFA.unpackEncodedString(DFA7_acceptS);
    static final short[] DFA7_special = DFA.unpackEncodedString(DFA7_specialS);
    static final short[][] DFA7_transition;

    static {
        int numStates = DFA7_transitionS.length;
        DFA7_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA7_transition[i] = DFA.unpackEncodedString(DFA7_transitionS[i]);
        }
    }

    class DFA7 extends DFA {

        public DFA7(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 7;
            this.eot = DFA7_eot;
            this.eof = DFA7_eof;
            this.min = DFA7_min;
            this.max = DFA7_max;
            this.accept = DFA7_accept;
            this.special = DFA7_special;
            this.transition = DFA7_transition;
        }
        public String getDescription() {
            return "47:1: instr : ( whileExpr | forExpr | ifExpr | actioncall | ID '=' numExpr | RETURN numExpr | MOVEFORWARD numExpr | STOPROBOT numExpr | MOVETO numExpr ',' numExpr | ROTATE numExpr | FACE direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE numExpr ',' numExpr | BOX numExpr ',' numExpr | TRAIL ( boolExpr | ON | OFF ) | MARK numExpr ',' numExpr );";
        }
    }
 

    public static final BitSet FOLLOW_definitions_in_prog174 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_main_in_prog177 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog179 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DEFINITIONS_in_definitions224 = new BitSet(new long[]{0x0000000000013000L});
    public static final BitSet FOLLOW_declaration_in_definitions227 = new BitSet(new long[]{0x0000000000013000L});
    public static final BitSet FOLLOW_ENDDEFINITIONS_in_definitions230 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_action_in_declaration240 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_function_in_declaration244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTION_in_action266 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_action269 = new BitSet(new long[]{0x0000002000004000L,0x0000000000004000L});
    public static final BitSet FOLLOW_argList_in_action271 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_action273 = new BitSet(new long[]{0x00004253FF80C000L});
    public static final BitSet FOLLOW_instrList_in_action276 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_ENDACTION_in_action278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_function287 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_function290 = new BitSet(new long[]{0x0000002000004000L,0x0000000000004000L});
    public static final BitSet FOLLOW_argList_in_function292 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_function294 = new BitSet(new long[]{0x00004253FF824000L});
    public static final BitSet FOLLOW_instrList_in_function297 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_ENDFUNC_in_function299 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_main321 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_initialInstr_in_main324 = new BitSet(new long[]{0x00004253FF884000L});
    public static final BitSet FOLLOW_instr_in_main326 = new BitSet(new long[]{0x00004253FF884000L});
    public static final BitSet FOLLOW_END_in_main329 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_setMap_in_initialInstr345 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_setRobot_in_initialInstr348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITMAP_in_setMap359 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INT_in_setMap362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITROBOT_in_setRobot373 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_setRobot376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_setRobot378 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_setRobot381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_setRobot383 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_setRobot386 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExpr_in_instr414 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExpr_in_instr418 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_instr463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_actioncall_in_instr519 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_instr531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_EQUAL_in_instr533 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr536 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RETURN_in_instr583 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr586 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEFORWARD_in_instr616 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPROBOT_in_instr631 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr634 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVETO_in_instr646 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr649 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_instr651 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_instr666 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_instr681 = new BitSet(new long[]{0xC000000000000000L,0x0000000000000003L});
    public static final BitSet FOLLOW_direction_in_instr684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICKOBJECT_in_instr696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASEOBJECT_in_instr708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_instr720 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_instr725 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr728 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOX_in_instr740 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr743 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_instr745 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRAIL_in_instr760 = new BitSet(new long[]{0x3EF0002C00204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_boolExpr_in_instr764 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_instr768 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFF_in_instr772 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARK_in_instr785 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_instr790 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_instr793 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_actioncall819 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_actioncall821 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000030300L});
    public static final BitSet FOLLOW_params_in_actioncall823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_actioncall826 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_funccall869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_funccall871 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000030300L});
    public static final BitSet FOLLOW_params_in_funccall873 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_funccall876 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numExpr_in_params920 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_params923 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_params926 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_args_in_argList937 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args958 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_args961 = new BitSet(new long[]{0x0000002000004000L});
    public static final BitSet FOLLOW_arg_in_args964 = new BitSet(new long[]{0x0000000000000002L,0x0000000000008000L});
    public static final BitSet FOLLOW_set_in_arg0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instr_in_instrList1011 = new BitSet(new long[]{0x00004253FF804002L});
    public static final BitSet FOLLOW_WHILE_in_whileExpr1055 = new BitSet(new long[]{0x3EF0002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_boolExpr_in_whileExpr1058 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DO_in_whileExpr1060 = new BitSet(new long[]{0x00004353FF804000L});
    public static final BitSet FOLLOW_instrList_in_whileExpr1063 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_WEND_in_whileExpr1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forExpr1091 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_forExpr1094 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_FROM_in_forExpr1096 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_forExpr1099 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_TO_in_forExpr1101 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_forExpr1104 = new BitSet(new long[]{0x0000108000000000L});
    public static final BitSet FOLLOW_STEP_in_forExpr1107 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_forExpr1110 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_DO_in_forExpr1114 = new BitSet(new long[]{0x00006253FF804000L});
    public static final BitSet FOLLOW_instrList_in_forExpr1117 = new BitSet(new long[]{0x0000200000000000L});
    public static final BitSet FOLLOW_FEND_in_forExpr1119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr1146 = new BitSet(new long[]{0x3EF0002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_boolExpr_in_ifExpr1149 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr1151 = new BitSet(new long[]{0x00034253FF804000L});
    public static final BitSet FOLLOW_instrList_in_ifExpr1154 = new BitSet(new long[]{0x0003000000000000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr1157 = new BitSet(new long[]{0x00024253FF804000L});
    public static final BitSet FOLLOW_instrList_in_ifExpr1160 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_ENDIF_in_ifExpr1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1178 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_OR_in_boolExpr1181 = new BitSet(new long[]{0x3EF0002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1184 = new BitSet(new long[]{0x0004000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1210 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_AND_in_boolterm1213 = new BitSet(new long[]{0x3EF0002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1216 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_NOT_in_boolfact1231 = new BitSet(new long[]{0x3EF0002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_boolatom_in_boolfact1236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numExpr_in_boolatom1259 = new BitSet(new long[]{0x0000000000000000L,0x00000000003C00C0L});
    public static final BitSet FOLLOW_EQUALS_in_boolatom1262 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolatom1267 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_82_in_boolatom1272 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_83_in_boolatom1277 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_84_in_boolatom1282 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_85_in_boolatom1287 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_boolatom1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolatom1307 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolatom1311 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETECT_in_boolatom1327 = new BitSet(new long[]{0x0000000000000000L,0x000000000000001CL});
    public static final BitSet FOLLOW_side_in_boolatom1330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_numExpr1351 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_PLUS_in_numExpr1356 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_MINUS_in_numExpr1361 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_term_in_numExpr1365 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000300L});
    public static final BitSet FOLLOW_factor_in_term1379 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_MUL_in_term1384 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_DIV_in_term1389 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_MOD_in_term1394 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_factor_in_term1398 = new BitSet(new long[]{0x0100000000000002L,0x0000000000000C00L});
    public static final BitSet FOLLOW_PLUS_in_factor1411 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_MINUS_in_factor1416 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_atom_in_factor1421 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_atom1433 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1451 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_funccall_in_atom1463 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_predefined_in_atom1475 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSX_in_atom1487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSY_in_atom1499 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_atom1511 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_atom1514 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_atom1516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SIN_in_predefined1535 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_predefined1538 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_predefined1541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_predefined1543 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COS_in_predefined1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_predefined1563 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_predefined1566 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_predefined1568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SQRT_in_predefined1585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_predefined1588 = new BitSet(new long[]{0x3E00002000204000L,0x0000000000010300L});
    public static final BitSet FOLLOW_numExpr_in_predefined1591 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_predefined1593 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_side0 = new BitSet(new long[]{0x0000000000000002L});

}