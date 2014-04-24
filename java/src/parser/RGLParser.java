// $ANTLR !Unknown version! /home/albert/Desktop/Projecte/java/src/parser/RGL.g 2014-04-24 16:17:58

    package parser;
    import interp.RGLTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RGLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "INSTRLIST", "ARGLIST", "PROGRAM", "ACTIONLIST", "RGL", "ACTIONS", "ENDACTIONS", "FUNC", "ID", "ENDFUNC", "BEGIN", "END", "INITROBOT", "CALL", "MOVEFORWARD", "STOPROBOT", "MOVETO", "ROTATE", "FACE", "PICKOBJECT", "RELEASEOBJECT", "OBSTACLE", "BOX", "TRAIL", "ON", "OFF", "MARK", "INT", "WHILE", "DO", "WEND", "FOR", "IN", "FEND", "IF", "THEN", "ELSE", "ENDIF", "OR", "AND", "NOT", "TRUE", "FALSE", "DETECT", "GETPOSX", "GETPOSY", "NORTH", "SOUTH", "EAST", "WEST", "FRONT", "RIGHT", "LEFT", "RETURN", "READ", "WRITE", "EQUAL", "EQUALS", "NOT_EQUAL", "LT", "LE", "GT", "GE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "ESC_SEQ", "STRING", "COMMENT", "WS", "':'", "','", "'..'", "'('", "')'"
    };
    public static final int PICKOBJECT=24;
    public static final int WEND=35;
    public static final int LT=64;
    public static final int WHILE=33;
    public static final int MOD=72;
    public static final int STOPROBOT=20;
    public static final int FACE=23;
    public static final int MOVEFORWARD=19;
    public static final int DO=34;
    public static final int FOR=36;
    public static final int ARGLIST=6;
    public static final int EQUALS=62;
    public static final int SOUTH=52;
    public static final int NOT=45;
    public static final int RGL=9;
    public static final int AND=44;
    public static final int ID=13;
    public static final int EOF=-1;
    public static final int IF=39;
    public static final int ACTIONS=10;
    public static final int WEST=54;
    public static final int BOX=27;
    public static final int ESC_SEQ=73;
    public static final int THEN=40;
    public static final int IN=37;
    public static final int INITROBOT=17;
    public static final int NOT_EQUAL=63;
    public static final int LEFT=57;
    public static final int OFF=30;
    public static final int EQUAL=61;
    public static final int BEGIN=15;
    public static final int RETURN=58;
    public static final int ENDIF=42;
    public static final int PLUS=68;
    public static final int ENDFUNC=14;
    public static final int COMMENT=75;
    public static final int TRAIL=28;
    public static final int GE=67;
    public static final int ENDACTIONS=11;
    public static final int T__80=80;
    public static final int ACTIONLIST=8;
    public static final int T__81=81;
    public static final int MARK=31;
    public static final int RELEASEOBJECT=25;
    public static final int FEND=38;
    public static final int ELSE=41;
    public static final int ON=29;
    public static final int RIGHT=56;
    public static final int GETPOSY=50;
    public static final int INT=32;
    public static final int GETPOSX=49;
    public static final int ROTATE=22;
    public static final int EAST=53;
    public static final int MINUS=69;
    public static final int OBSTACLE=26;
    public static final int MUL=70;
    public static final int TRUE=46;
    public static final int WRITE=60;
    public static final int INSTRLIST=5;
    public static final int WS=76;
    public static final int READ=59;
    public static final int DETECT=48;
    public static final int FUNC=12;
    public static final int MOVETO=21;
    public static final int OR=43;
    public static final int FRONT=55;
    public static final int ASSIGN=4;
    public static final int GT=66;
    public static final int NORTH=51;
    public static final int PROGRAM=7;
    public static final int CALL=18;
    public static final int DIV=71;
    public static final int END=16;
    public static final int FALSE=47;
    public static final int LE=65;
    public static final int T__79=79;
    public static final int STRING=74;
    public static final int T__78=78;
    public static final int T__77=77;

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
    public String getGrammarFileName() { return "/home/albert/Desktop/Projecte/java/src/parser/RGL.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "prog"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:31:1: prog : ( actions )? main EOF -> ^( RGL ^( ACTIONLIST ( actions )? ) ^( INSTRLIST main ) ) ;
    public final RGLParser.prog_return prog() throws RecognitionException {
        RGLParser.prog_return retval = new RGLParser.prog_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token EOF3=null;
        RGLParser.actions_return actions1 = null;

        RGLParser.main_return main2 = null;


        RGLTree EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_actions=new RewriteRuleSubtreeStream(adaptor,"rule actions");
        RewriteRuleSubtreeStream stream_main=new RewriteRuleSubtreeStream(adaptor,"rule main");
        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:31:9: ( ( actions )? main EOF -> ^( RGL ^( ACTIONLIST ( actions )? ) ^( INSTRLIST main ) ) )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:31:11: ( actions )? main EOF
            {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:31:11: ( actions )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ACTIONS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:31:11: actions
                    {
                    pushFollow(FOLLOW_actions_in_prog158);
                    actions1=actions();

                    state._fsp--;

                    stream_actions.add(actions1.getTree());

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
            // elements: actions, main
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (RGLTree)adaptor.nil();
            // 32:10: -> ^( RGL ^( ACTIONLIST ( actions )? ) ^( INSTRLIST main ) )
            {
                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:32:13: ^( RGL ^( ACTIONLIST ( actions )? ) ^( INSTRLIST main ) )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(RGL, "RGL"), root_1);

                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:32:19: ^( ACTIONLIST ( actions )? )
                {
                RGLTree root_2 = (RGLTree)adaptor.nil();
                root_2 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(ACTIONLIST, "ACTIONLIST"), root_2);

                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:32:32: ( actions )?
                if ( stream_actions.hasNext() ) {
                    adaptor.addChild(root_2, stream_actions.nextTree());

                }
                stream_actions.reset();

                adaptor.addChild(root_1, root_2);
                }
                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:32:42: ^( INSTRLIST main )
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

    public static class actions_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "actions"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:35:1: actions : ACTIONS ( declaration )* ENDACTIONS ;
    public final RGLParser.actions_return actions() throws RecognitionException {
        RGLParser.actions_return retval = new RGLParser.actions_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token ACTIONS4=null;
        Token ENDACTIONS6=null;
        RGLParser.declaration_return declaration5 = null;


        RGLTree ACTIONS4_tree=null;
        RGLTree ENDACTIONS6_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:35:9: ( ACTIONS ( declaration )* ENDACTIONS )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:35:11: ACTIONS ( declaration )* ENDACTIONS
            {
            root_0 = (RGLTree)adaptor.nil();

            ACTIONS4=(Token)match(input,ACTIONS,FOLLOW_ACTIONS_in_actions208); 
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:35:20: ( declaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FUNC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:35:20: declaration
            	    {
            	    pushFollow(FOLLOW_declaration_in_actions211);
            	    declaration5=declaration();

            	    state._fsp--;

            	    adaptor.addChild(root_0, declaration5.getTree());

            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            ENDACTIONS6=(Token)match(input,ENDACTIONS,FOLLOW_ENDACTIONS_in_actions214); 

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
    // $ANTLR end "actions"

    public static class declaration_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "declaration"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:38:1: declaration : FUNC ID argList ':' instrList ENDFUNC ;
    public final RGLParser.declaration_return declaration() throws RecognitionException {
        RGLParser.declaration_return retval = new RGLParser.declaration_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token FUNC7=null;
        Token ID8=null;
        Token char_literal10=null;
        Token ENDFUNC12=null;
        RGLParser.argList_return argList9 = null;

        RGLParser.instrList_return instrList11 = null;


        RGLTree FUNC7_tree=null;
        RGLTree ID8_tree=null;
        RGLTree char_literal10_tree=null;
        RGLTree ENDFUNC12_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:38:13: ( FUNC ID argList ':' instrList ENDFUNC )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:38:15: FUNC ID argList ':' instrList ENDFUNC
            {
            root_0 = (RGLTree)adaptor.nil();

            FUNC7=(Token)match(input,FUNC,FOLLOW_FUNC_in_declaration232); 
            ID8=(Token)match(input,ID,FOLLOW_ID_in_declaration235); 
            ID8_tree = (RGLTree)adaptor.create(ID8);
            root_0 = (RGLTree)adaptor.becomeRoot(ID8_tree, root_0);

            pushFollow(FOLLOW_argList_in_declaration238);
            argList9=argList();

            state._fsp--;

            adaptor.addChild(root_0, argList9.getTree());
            char_literal10=(Token)match(input,77,FOLLOW_77_in_declaration240); 
            pushFollow(FOLLOW_instrList_in_declaration243);
            instrList11=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList11.getTree());
            ENDFUNC12=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_declaration245); 

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

    public static class main_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "main"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:41:1: main : BEGIN initRobot instrList END ;
    public final RGLParser.main_return main() throws RecognitionException {
        RGLParser.main_return retval = new RGLParser.main_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token BEGIN13=null;
        Token END16=null;
        RGLParser.initRobot_return initRobot14 = null;

        RGLParser.instrList_return instrList15 = null;


        RGLTree BEGIN13_tree=null;
        RGLTree END16_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:41:9: ( BEGIN initRobot instrList END )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:41:11: BEGIN initRobot instrList END
            {
            root_0 = (RGLTree)adaptor.nil();

            BEGIN13=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_main276); 
            pushFollow(FOLLOW_initRobot_in_main279);
            initRobot14=initRobot();

            state._fsp--;

            adaptor.addChild(root_0, initRobot14.getTree());
            pushFollow(FOLLOW_instrList_in_main281);
            instrList15=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList15.getTree());
            END16=(Token)match(input,END,FOLLOW_END_in_main283); 

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

    public static class initRobot_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "initRobot"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:44:1: initRobot : INITROBOT numExpr ',' numExpr ',' numExpr ;
    public final RGLParser.initRobot_return initRobot() throws RecognitionException {
        RGLParser.initRobot_return retval = new RGLParser.initRobot_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token INITROBOT17=null;
        Token char_literal19=null;
        Token char_literal21=null;
        RGLParser.numExpr_return numExpr18 = null;

        RGLParser.numExpr_return numExpr20 = null;

        RGLParser.numExpr_return numExpr22 = null;


        RGLTree INITROBOT17_tree=null;
        RGLTree char_literal19_tree=null;
        RGLTree char_literal21_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:44:13: ( INITROBOT numExpr ',' numExpr ',' numExpr )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:44:15: INITROBOT numExpr ',' numExpr ',' numExpr
            {
            root_0 = (RGLTree)adaptor.nil();

            INITROBOT17=(Token)match(input,INITROBOT,FOLLOW_INITROBOT_in_initRobot305); 
            INITROBOT17_tree = (RGLTree)adaptor.create(INITROBOT17);
            root_0 = (RGLTree)adaptor.becomeRoot(INITROBOT17_tree, root_0);

            pushFollow(FOLLOW_numExpr_in_initRobot308);
            numExpr18=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr18.getTree());
            char_literal19=(Token)match(input,78,FOLLOW_78_in_initRobot310); 
            pushFollow(FOLLOW_numExpr_in_initRobot313);
            numExpr20=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr20.getTree());
            char_literal21=(Token)match(input,78,FOLLOW_78_in_initRobot315); 
            pushFollow(FOLLOW_numExpr_in_initRobot318);
            numExpr22=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr22.getTree());

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
    // $ANTLR end "initRobot"

    public static class instr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instr"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:47:1: instr : ( whileExpr | forExpr | ifExpr | CALL ID ( numExpr ( ',' numExpr )* )? | ID '=' numExpr | MOVEFORWARD numExpr | STOPROBOT numExpr | MOVETO numExpr ',' numExpr | ROTATE numExpr | FACE direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE numExpr ',' numExpr | BOX numExpr ',' numExpr | TRAIL ( boolExpr | ON | OFF ) | MARK numExpr ',' numExpr );
    public final RGLParser.instr_return instr() throws RecognitionException {
        RGLParser.instr_return retval = new RGLParser.instr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token CALL26=null;
        Token ID27=null;
        Token char_literal29=null;
        Token ID31=null;
        Token char_literal32=null;
        Token MOVEFORWARD34=null;
        Token STOPROBOT36=null;
        Token MOVETO38=null;
        Token char_literal40=null;
        Token ROTATE42=null;
        Token FACE44=null;
        Token PICKOBJECT46=null;
        Token RELEASEOBJECT47=null;
        Token OBSTACLE48=null;
        Token char_literal50=null;
        Token BOX52=null;
        Token char_literal54=null;
        Token TRAIL56=null;
        Token ON58=null;
        Token OFF59=null;
        Token MARK60=null;
        Token char_literal62=null;
        RGLParser.whileExpr_return whileExpr23 = null;

        RGLParser.forExpr_return forExpr24 = null;

        RGLParser.ifExpr_return ifExpr25 = null;

        RGLParser.numExpr_return numExpr28 = null;

        RGLParser.numExpr_return numExpr30 = null;

        RGLParser.numExpr_return numExpr33 = null;

        RGLParser.numExpr_return numExpr35 = null;

        RGLParser.numExpr_return numExpr37 = null;

        RGLParser.numExpr_return numExpr39 = null;

        RGLParser.numExpr_return numExpr41 = null;

        RGLParser.numExpr_return numExpr43 = null;

        RGLParser.direction_return direction45 = null;

        RGLParser.numExpr_return numExpr49 = null;

        RGLParser.numExpr_return numExpr51 = null;

        RGLParser.numExpr_return numExpr53 = null;

        RGLParser.numExpr_return numExpr55 = null;

        RGLParser.boolExpr_return boolExpr57 = null;

        RGLParser.numExpr_return numExpr61 = null;

        RGLParser.numExpr_return numExpr63 = null;


        RGLTree CALL26_tree=null;
        RGLTree ID27_tree=null;
        RGLTree char_literal29_tree=null;
        RGLTree ID31_tree=null;
        RGLTree char_literal32_tree=null;
        RGLTree MOVEFORWARD34_tree=null;
        RGLTree STOPROBOT36_tree=null;
        RGLTree MOVETO38_tree=null;
        RGLTree char_literal40_tree=null;
        RGLTree ROTATE42_tree=null;
        RGLTree FACE44_tree=null;
        RGLTree PICKOBJECT46_tree=null;
        RGLTree RELEASEOBJECT47_tree=null;
        RGLTree OBSTACLE48_tree=null;
        RGLTree char_literal50_tree=null;
        RGLTree BOX52_tree=null;
        RGLTree char_literal54_tree=null;
        RGLTree TRAIL56_tree=null;
        RGLTree ON58_tree=null;
        RGLTree OFF59_tree=null;
        RGLTree MARK60_tree=null;
        RGLTree char_literal62_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:47:9: ( whileExpr | forExpr | ifExpr | CALL ID ( numExpr ( ',' numExpr )* )? | ID '=' numExpr | MOVEFORWARD numExpr | STOPROBOT numExpr | MOVETO numExpr ',' numExpr | ROTATE numExpr | FACE direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE numExpr ',' numExpr | BOX numExpr ',' numExpr | TRAIL ( boolExpr | ON | OFF ) | MARK numExpr ',' numExpr )
            int alt6=16;
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
            case CALL:
                {
                alt6=4;
                }
                break;
            case ID:
                {
                alt6=5;
                }
                break;
            case MOVEFORWARD:
                {
                alt6=6;
                }
                break;
            case STOPROBOT:
                {
                alt6=7;
                }
                break;
            case MOVETO:
                {
                alt6=8;
                }
                break;
            case ROTATE:
                {
                alt6=9;
                }
                break;
            case FACE:
                {
                alt6=10;
                }
                break;
            case PICKOBJECT:
                {
                alt6=11;
                }
                break;
            case RELEASEOBJECT:
                {
                alt6=12;
                }
                break;
            case OBSTACLE:
                {
                alt6=13;
                }
                break;
            case BOX:
                {
                alt6=14;
                }
                break;
            case TRAIL:
                {
                alt6=15;
                }
                break;
            case MARK:
                {
                alt6=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:49:9: whileExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_whileExpr_in_instr358);
                    whileExpr23=whileExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, whileExpr23.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:49:21: forExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_forExpr_in_instr362);
                    forExpr24=forExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, forExpr24.getTree());

                    }
                    break;
                case 3 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:50:11: ifExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_ifExpr_in_instr399);
                    ifExpr25=ifExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, ifExpr25.getTree());

                    }
                    break;
                case 4 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:51:11: CALL ID ( numExpr ( ',' numExpr )* )?
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    CALL26=(Token)match(input,CALL,FOLLOW_CALL_in_instr447); 
                    ID27=(Token)match(input,ID,FOLLOW_ID_in_instr450); 
                    ID27_tree = (RGLTree)adaptor.create(ID27);
                    root_0 = (RGLTree)adaptor.becomeRoot(ID27_tree, root_0);

                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:51:21: ( numExpr ( ',' numExpr )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==INT||(LA4_0>=GETPOSX && LA4_0<=GETPOSY)||(LA4_0>=PLUS && LA4_0<=MINUS)||LA4_0==80) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==ID) ) {
                        int LA4_2 = input.LA(2);

                        if ( ((LA4_2>=ID && LA4_2<=ENDFUNC)||LA4_2==END||(LA4_2>=CALL && LA4_2<=TRAIL)||LA4_2==MARK||LA4_2==WHILE||(LA4_2>=WEND && LA4_2<=FOR)||(LA4_2>=FEND && LA4_2<=IF)||(LA4_2>=ELSE && LA4_2<=ENDIF)||(LA4_2>=PLUS && LA4_2<=MOD)||LA4_2==78) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:51:22: numExpr ( ',' numExpr )*
                            {
                            pushFollow(FOLLOW_numExpr_in_instr454);
                            numExpr28=numExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, numExpr28.getTree());
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:51:30: ( ',' numExpr )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==78) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:51:31: ',' numExpr
                            	    {
                            	    char_literal29=(Token)match(input,78,FOLLOW_78_in_instr457); 
                            	    pushFollow(FOLLOW_numExpr_in_instr460);
                            	    numExpr30=numExpr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, numExpr30.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop3;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:52:11: ID '=' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    ID31=(Token)match(input,ID,FOLLOW_ID_in_instr482); 
                    ID31_tree = (RGLTree)adaptor.create(ID31);
                    adaptor.addChild(root_0, ID31_tree);

                    char_literal32=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instr484); 
                    char_literal32_tree = (RGLTree)adaptor.create(char_literal32);
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal32_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr487);
                    numExpr33=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr33.getTree());

                    }
                    break;
                case 6 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:55:11: MOVEFORWARD numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    MOVEFORWARD34=(Token)match(input,MOVEFORWARD,FOLLOW_MOVEFORWARD_in_instr544); 
                    MOVEFORWARD34_tree = (RGLTree)adaptor.create(MOVEFORWARD34);
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVEFORWARD34_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr547);
                    numExpr35=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr35.getTree());

                    }
                    break;
                case 7 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:56:11: STOPROBOT numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    STOPROBOT36=(Token)match(input,STOPROBOT,FOLLOW_STOPROBOT_in_instr559); 
                    STOPROBOT36_tree = (RGLTree)adaptor.create(STOPROBOT36);
                    root_0 = (RGLTree)adaptor.becomeRoot(STOPROBOT36_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr562);
                    numExpr37=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr37.getTree());

                    }
                    break;
                case 8 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:57:11: MOVETO numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    MOVETO38=(Token)match(input,MOVETO,FOLLOW_MOVETO_in_instr574); 
                    MOVETO38_tree = (RGLTree)adaptor.create(MOVETO38);
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVETO38_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr577);
                    numExpr39=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr39.getTree());
                    char_literal40=(Token)match(input,78,FOLLOW_78_in_instr579); 
                    pushFollow(FOLLOW_numExpr_in_instr582);
                    numExpr41=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr41.getTree());

                    }
                    break;
                case 9 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:58:11: ROTATE numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    ROTATE42=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_instr594); 
                    ROTATE42_tree = (RGLTree)adaptor.create(ROTATE42);
                    root_0 = (RGLTree)adaptor.becomeRoot(ROTATE42_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr597);
                    numExpr43=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr43.getTree());

                    }
                    break;
                case 10 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:59:11: FACE direction
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    FACE44=(Token)match(input,FACE,FOLLOW_FACE_in_instr609); 
                    FACE44_tree = (RGLTree)adaptor.create(FACE44);
                    root_0 = (RGLTree)adaptor.becomeRoot(FACE44_tree, root_0);

                    pushFollow(FOLLOW_direction_in_instr612);
                    direction45=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction45.getTree());

                    }
                    break;
                case 11 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:60:11: PICKOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    PICKOBJECT46=(Token)match(input,PICKOBJECT,FOLLOW_PICKOBJECT_in_instr624); 
                    PICKOBJECT46_tree = (RGLTree)adaptor.create(PICKOBJECT46);
                    adaptor.addChild(root_0, PICKOBJECT46_tree);


                    }
                    break;
                case 12 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:61:11: RELEASEOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    RELEASEOBJECT47=(Token)match(input,RELEASEOBJECT,FOLLOW_RELEASEOBJECT_in_instr636); 
                    RELEASEOBJECT47_tree = (RGLTree)adaptor.create(RELEASEOBJECT47);
                    adaptor.addChild(root_0, RELEASEOBJECT47_tree);


                    }
                    break;
                case 13 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:62:11: OBSTACLE numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    OBSTACLE48=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_instr648); 
                    OBSTACLE48_tree = (RGLTree)adaptor.create(OBSTACLE48);
                    root_0 = (RGLTree)adaptor.becomeRoot(OBSTACLE48_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr651);
                    numExpr49=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr49.getTree());
                    char_literal50=(Token)match(input,78,FOLLOW_78_in_instr653); 
                    pushFollow(FOLLOW_numExpr_in_instr656);
                    numExpr51=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr51.getTree());

                    }
                    break;
                case 14 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:63:11: BOX numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    BOX52=(Token)match(input,BOX,FOLLOW_BOX_in_instr668); 
                    BOX52_tree = (RGLTree)adaptor.create(BOX52);
                    root_0 = (RGLTree)adaptor.becomeRoot(BOX52_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr671);
                    numExpr53=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr53.getTree());
                    char_literal54=(Token)match(input,78,FOLLOW_78_in_instr673); 
                    pushFollow(FOLLOW_numExpr_in_instr676);
                    numExpr55=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr55.getTree());

                    }
                    break;
                case 15 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:64:11: TRAIL ( boolExpr | ON | OFF )
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    TRAIL56=(Token)match(input,TRAIL,FOLLOW_TRAIL_in_instr688); 
                    TRAIL56_tree = (RGLTree)adaptor.create(TRAIL56);
                    root_0 = (RGLTree)adaptor.becomeRoot(TRAIL56_tree, root_0);

                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:64:18: ( boolExpr | ON | OFF )
                    int alt5=3;
                    switch ( input.LA(1) ) {
                    case ID:
                    case INT:
                    case NOT:
                    case TRUE:
                    case FALSE:
                    case DETECT:
                    case GETPOSX:
                    case GETPOSY:
                    case PLUS:
                    case MINUS:
                    case 80:
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
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:64:19: boolExpr
                            {
                            pushFollow(FOLLOW_boolExpr_in_instr692);
                            boolExpr57=boolExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, boolExpr57.getTree());

                            }
                            break;
                        case 2 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:64:30: ON
                            {
                            ON58=(Token)match(input,ON,FOLLOW_ON_in_instr696); 
                            ON58_tree = (RGLTree)adaptor.create(ON58);
                            adaptor.addChild(root_0, ON58_tree);


                            }
                            break;
                        case 3 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:64:35: OFF
                            {
                            OFF59=(Token)match(input,OFF,FOLLOW_OFF_in_instr700); 
                            OFF59_tree = (RGLTree)adaptor.create(OFF59);
                            adaptor.addChild(root_0, OFF59_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 16 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:65:11: MARK numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    MARK60=(Token)match(input,MARK,FOLLOW_MARK_in_instr713); 
                    MARK60_tree = (RGLTree)adaptor.create(MARK60);
                    root_0 = (RGLTree)adaptor.becomeRoot(MARK60_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr716);
                    numExpr61=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr61.getTree());
                    char_literal62=(Token)match(input,78,FOLLOW_78_in_instr718); 
                    pushFollow(FOLLOW_numExpr_in_instr721);
                    numExpr63=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr63.getTree());

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

    public static class argList_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "argList"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:1: argList : ( args )? -> ^( ARGLIST ( args )? ) ;
    public final RGLParser.argList_return argList() throws RecognitionException {
        RGLParser.argList_return retval = new RGLParser.argList_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        RGLParser.args_return args64 = null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:9: ( ( args )? -> ^( ARGLIST ( args )? ) )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:11: ( args )?
            {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:11: ( args )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==ID||LA7_0==INT) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:11: args
                    {
                    pushFollow(FOLLOW_args_in_argList738);
                    args64=args();

                    state._fsp--;

                    stream_args.add(args64.getTree());

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
            // 68:17: -> ^( ARGLIST ( args )? )
            {
                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:20: ^( ARGLIST ( args )? )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(ARGLIST, "ARGLIST"), root_1);

                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:30: ( args )?
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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:70:1: args : arg ( ',' arg )* ;
    public final RGLParser.args_return args() throws RecognitionException {
        RGLParser.args_return retval = new RGLParser.args_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal66=null;
        RGLParser.arg_return arg65 = null;

        RGLParser.arg_return arg67 = null;


        RGLTree char_literal66_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:70:9: ( arg ( ',' arg )* )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:70:11: arg ( ',' arg )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_arg_in_args767);
            arg65=arg();

            state._fsp--;

            adaptor.addChild(root_0, arg65.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:70:15: ( ',' arg )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==78) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:70:16: ',' arg
            	    {
            	    char_literal66=(Token)match(input,78,FOLLOW_78_in_args770); 
            	    pushFollow(FOLLOW_arg_in_args773);
            	    arg67=arg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arg67.getTree());

            	    }
            	    break;

            	default :
            	    break loop8;
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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:73:1: arg : ( ID | INT );
    public final RGLParser.arg_return arg() throws RecognitionException {
        RGLParser.arg_return retval = new RGLParser.arg_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token set68=null;

        RGLTree set68_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:73:9: ( ID | INT )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();

            set68=(Token)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, (RGLTree)adaptor.create(set68));
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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:76:1: instrList : ( instr )* -> ^( INSTRLIST ( instr )* ) ;
    public final RGLParser.instrList_return instrList() throws RecognitionException {
        RGLParser.instrList_return retval = new RGLParser.instrList_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        RGLParser.instr_return instr69 = null;


        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:76:13: ( ( instr )* -> ^( INSTRLIST ( instr )* ) )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:76:15: ( instr )*
            {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:76:15: ( instr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==ID||(LA9_0>=CALL && LA9_0<=TRAIL)||LA9_0==MARK||LA9_0==WHILE||LA9_0==FOR||LA9_0==IF) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:76:15: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_instrList819);
            	    instr69=instr();

            	    state._fsp--;

            	    stream_instr.add(instr69.getTree());

            	    }
            	    break;

            	default :
            	    break loop9;
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
            // 76:23: -> ^( INSTRLIST ( instr )* )
            {
                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:76:26: ^( INSTRLIST ( instr )* )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(INSTRLIST, "INSTRLIST"), root_1);

                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:76:38: ( instr )*
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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:79:1: whileExpr : WHILE boolExpr DO instrList WEND ;
    public final RGLParser.whileExpr_return whileExpr() throws RecognitionException {
        RGLParser.whileExpr_return retval = new RGLParser.whileExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token WHILE70=null;
        Token DO72=null;
        Token WEND74=null;
        RGLParser.boolExpr_return boolExpr71 = null;

        RGLParser.instrList_return instrList73 = null;


        RGLTree WHILE70_tree=null;
        RGLTree DO72_tree=null;
        RGLTree WEND74_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:79:13: ( WHILE boolExpr DO instrList WEND )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:79:15: WHILE boolExpr DO instrList WEND
            {
            root_0 = (RGLTree)adaptor.nil();

            WHILE70=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExpr875); 
            WHILE70_tree = (RGLTree)adaptor.create(WHILE70);
            root_0 = (RGLTree)adaptor.becomeRoot(WHILE70_tree, root_0);

            pushFollow(FOLLOW_boolExpr_in_whileExpr878);
            boolExpr71=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr71.getTree());
            DO72=(Token)match(input,DO,FOLLOW_DO_in_whileExpr880); 
            pushFollow(FOLLOW_instrList_in_whileExpr883);
            instrList73=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList73.getTree());
            WEND74=(Token)match(input,WEND,FOLLOW_WEND_in_whileExpr885); 

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:82:1: forExpr : FOR ID IN INT '..' INT DO instrList FEND ;
    public final RGLParser.forExpr_return forExpr() throws RecognitionException {
        RGLParser.forExpr_return retval = new RGLParser.forExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token FOR75=null;
        Token ID76=null;
        Token IN77=null;
        Token INT78=null;
        Token string_literal79=null;
        Token INT80=null;
        Token DO81=null;
        Token FEND83=null;
        RGLParser.instrList_return instrList82 = null;


        RGLTree FOR75_tree=null;
        RGLTree ID76_tree=null;
        RGLTree IN77_tree=null;
        RGLTree INT78_tree=null;
        RGLTree string_literal79_tree=null;
        RGLTree INT80_tree=null;
        RGLTree DO81_tree=null;
        RGLTree FEND83_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:82:13: ( FOR ID IN INT '..' INT DO instrList FEND )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:82:15: FOR ID IN INT '..' INT DO instrList FEND
            {
            root_0 = (RGLTree)adaptor.nil();

            FOR75=(Token)match(input,FOR,FOLLOW_FOR_in_forExpr923); 
            FOR75_tree = (RGLTree)adaptor.create(FOR75);
            root_0 = (RGLTree)adaptor.becomeRoot(FOR75_tree, root_0);

            ID76=(Token)match(input,ID,FOLLOW_ID_in_forExpr926); 
            ID76_tree = (RGLTree)adaptor.create(ID76);
            adaptor.addChild(root_0, ID76_tree);

            IN77=(Token)match(input,IN,FOLLOW_IN_in_forExpr928); 
            INT78=(Token)match(input,INT,FOLLOW_INT_in_forExpr931); 
            INT78_tree = (RGLTree)adaptor.create(INT78);
            adaptor.addChild(root_0, INT78_tree);

            string_literal79=(Token)match(input,79,FOLLOW_79_in_forExpr933); 
            INT80=(Token)match(input,INT,FOLLOW_INT_in_forExpr936); 
            INT80_tree = (RGLTree)adaptor.create(INT80);
            adaptor.addChild(root_0, INT80_tree);

            DO81=(Token)match(input,DO,FOLLOW_DO_in_forExpr938); 
            pushFollow(FOLLOW_instrList_in_forExpr941);
            instrList82=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList82.getTree());
            FEND83=(Token)match(input,FEND,FOLLOW_FEND_in_forExpr943); 

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:85:1: ifExpr : IF boolExpr THEN instrList ( ELSE instrList )? ENDIF ;
    public final RGLParser.ifExpr_return ifExpr() throws RecognitionException {
        RGLParser.ifExpr_return retval = new RGLParser.ifExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token IF84=null;
        Token THEN86=null;
        Token ELSE88=null;
        Token ENDIF90=null;
        RGLParser.boolExpr_return boolExpr85 = null;

        RGLParser.instrList_return instrList87 = null;

        RGLParser.instrList_return instrList89 = null;


        RGLTree IF84_tree=null;
        RGLTree THEN86_tree=null;
        RGLTree ELSE88_tree=null;
        RGLTree ENDIF90_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:85:13: ( IF boolExpr THEN instrList ( ELSE instrList )? ENDIF )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:85:15: IF boolExpr THEN instrList ( ELSE instrList )? ENDIF
            {
            root_0 = (RGLTree)adaptor.nil();

            IF84=(Token)match(input,IF,FOLLOW_IF_in_ifExpr982); 
            IF84_tree = (RGLTree)adaptor.create(IF84);
            root_0 = (RGLTree)adaptor.becomeRoot(IF84_tree, root_0);

            pushFollow(FOLLOW_boolExpr_in_ifExpr985);
            boolExpr85=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr85.getTree());
            THEN86=(Token)match(input,THEN,FOLLOW_THEN_in_ifExpr987); 
            pushFollow(FOLLOW_instrList_in_ifExpr990);
            instrList87=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList87.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:85:44: ( ELSE instrList )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==ELSE) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:85:45: ELSE instrList
                    {
                    ELSE88=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifExpr993); 
                    pushFollow(FOLLOW_instrList_in_ifExpr996);
                    instrList89=instrList();

                    state._fsp--;

                    adaptor.addChild(root_0, instrList89.getTree());

                    }
                    break;

            }

            ENDIF90=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExpr1000); 

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:1: boolExpr : boolterm ( OR boolterm )* ;
    public final RGLParser.boolExpr_return boolExpr() throws RecognitionException {
        RGLParser.boolExpr_return retval = new RGLParser.boolExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token OR92=null;
        RGLParser.boolterm_return boolterm91 = null;

        RGLParser.boolterm_return boolterm93 = null;


        RGLTree OR92_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:13: ( boolterm ( OR boolterm )* )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:15: boolterm ( OR boolterm )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_boolterm_in_boolExpr1026);
            boolterm91=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm91.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:24: ( OR boolterm )*
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==OR) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:25: OR boolterm
            	    {
            	    OR92=(Token)match(input,OR,FOLLOW_OR_in_boolExpr1029); 
            	    OR92_tree = (RGLTree)adaptor.create(OR92);
            	    root_0 = (RGLTree)adaptor.becomeRoot(OR92_tree, root_0);

            	    pushFollow(FOLLOW_boolterm_in_boolExpr1032);
            	    boolterm93=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm93.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "boolExpr"

    public static class boolterm_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolterm"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:1: boolterm : boolfact ( AND boolfact )* ;
    public final RGLParser.boolterm_return boolterm() throws RecognitionException {
        RGLParser.boolterm_return retval = new RGLParser.boolterm_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token AND95=null;
        RGLParser.boolfact_return boolfact94 = null;

        RGLParser.boolfact_return boolfact96 = null;


        RGLTree AND95_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:13: ( boolfact ( AND boolfact )* )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:15: boolfact ( AND boolfact )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_boolfact_in_boolterm1070);
            boolfact94=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact94.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:24: ( AND boolfact )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==AND) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:25: AND boolfact
            	    {
            	    AND95=(Token)match(input,AND,FOLLOW_AND_in_boolterm1073); 
            	    AND95_tree = (RGLTree)adaptor.create(AND95);
            	    root_0 = (RGLTree)adaptor.becomeRoot(AND95_tree, root_0);

            	    pushFollow(FOLLOW_boolfact_in_boolterm1076);
            	    boolfact96=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact96.getTree());

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
    // $ANTLR end "boolterm"

    public static class boolfact_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolfact"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:95:1: boolfact : ( NOT )? boolatom ;
    public final RGLParser.boolfact_return boolfact() throws RecognitionException {
        RGLParser.boolfact_return retval = new RGLParser.boolfact_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token NOT97=null;
        RGLParser.boolatom_return boolatom98 = null;


        RGLTree NOT97_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:95:13: ( ( NOT )? boolatom )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:95:15: ( NOT )? boolatom
            {
            root_0 = (RGLTree)adaptor.nil();

            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:95:15: ( NOT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NOT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:95:16: NOT
                    {
                    NOT97=(Token)match(input,NOT,FOLLOW_NOT_in_boolfact1103); 
                    NOT97_tree = (RGLTree)adaptor.create(NOT97);
                    root_0 = (RGLTree)adaptor.becomeRoot(NOT97_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_boolatom_in_boolfact1108);
            boolatom98=boolatom();

            state._fsp--;

            adaptor.addChild(root_0, boolatom98.getTree());

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:98:1: boolatom : ( numExpr ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) numExpr | TRUE | FALSE | DETECT side );
    public final RGLParser.boolatom_return boolatom() throws RecognitionException {
        RGLParser.boolatom_return retval = new RGLParser.boolatom_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token string_literal100=null;
        Token string_literal101=null;
        Token char_literal102=null;
        Token string_literal103=null;
        Token char_literal104=null;
        Token string_literal105=null;
        Token TRUE107=null;
        Token FALSE108=null;
        Token DETECT109=null;
        RGLParser.numExpr_return numExpr99 = null;

        RGLParser.numExpr_return numExpr106 = null;

        RGLParser.side_return side110 = null;


        RGLTree string_literal100_tree=null;
        RGLTree string_literal101_tree=null;
        RGLTree char_literal102_tree=null;
        RGLTree string_literal103_tree=null;
        RGLTree char_literal104_tree=null;
        RGLTree string_literal105_tree=null;
        RGLTree TRUE107_tree=null;
        RGLTree FALSE108_tree=null;
        RGLTree DETECT109_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:98:12: ( numExpr ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) numExpr | TRUE | FALSE | DETECT side )
            int alt15=4;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case GETPOSX:
            case GETPOSY:
            case PLUS:
            case MINUS:
            case 80:
                {
                alt15=1;
                }
                break;
            case TRUE:
                {
                alt15=2;
                }
                break;
            case FALSE:
                {
                alt15=3;
                }
                break;
            case DETECT:
                {
                alt15=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }

            switch (alt15) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:98:14: numExpr ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_numExpr_in_boolatom1143);
                    numExpr99=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr99.getTree());
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:98:22: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
                    int alt14=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt14=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt14=2;
                        }
                        break;
                    case LT:
                        {
                        alt14=3;
                        }
                        break;
                    case LE:
                        {
                        alt14=4;
                        }
                        break;
                    case GT:
                        {
                        alt14=5;
                        }
                        break;
                    case GE:
                        {
                        alt14=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 14, 0, input);

                        throw nvae;
                    }

                    switch (alt14) {
                        case 1 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:98:23: '=='
                            {
                            string_literal100=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_boolatom1146); 
                            string_literal100_tree = (RGLTree)adaptor.create(string_literal100);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal100_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:98:31: '!='
                            {
                            string_literal101=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolatom1151); 
                            string_literal101_tree = (RGLTree)adaptor.create(string_literal101);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal101_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:98:39: '<'
                            {
                            char_literal102=(Token)match(input,LT,FOLLOW_LT_in_boolatom1156); 
                            char_literal102_tree = (RGLTree)adaptor.create(char_literal102);
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal102_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:98:46: '<='
                            {
                            string_literal103=(Token)match(input,LE,FOLLOW_LE_in_boolatom1161); 
                            string_literal103_tree = (RGLTree)adaptor.create(string_literal103);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal103_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:98:54: '>'
                            {
                            char_literal104=(Token)match(input,GT,FOLLOW_GT_in_boolatom1166); 
                            char_literal104_tree = (RGLTree)adaptor.create(char_literal104);
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal104_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:98:61: '>='
                            {
                            string_literal105=(Token)match(input,GE,FOLLOW_GE_in_boolatom1171); 
                            string_literal105_tree = (RGLTree)adaptor.create(string_literal105);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal105_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_numExpr_in_boolatom1175);
                    numExpr106=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr106.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:99:15: TRUE
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    TRUE107=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolatom1191); 
                    TRUE107_tree = (RGLTree)adaptor.create(TRUE107);
                    adaptor.addChild(root_0, TRUE107_tree);


                    }
                    break;
                case 3 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:99:22: FALSE
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    FALSE108=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolatom1195); 
                    FALSE108_tree = (RGLTree)adaptor.create(FALSE108);
                    adaptor.addChild(root_0, FALSE108_tree);


                    }
                    break;
                case 4 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:100:15: DETECT side
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    DETECT109=(Token)match(input,DETECT,FOLLOW_DETECT_in_boolatom1211); 
                    DETECT109_tree = (RGLTree)adaptor.create(DETECT109);
                    root_0 = (RGLTree)adaptor.becomeRoot(DETECT109_tree, root_0);

                    pushFollow(FOLLOW_side_in_boolatom1214);
                    side110=side();

                    state._fsp--;

                    adaptor.addChild(root_0, side110.getTree());

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:1: numExpr : term ( ( '+' | '-' ) term )* ;
    public final RGLParser.numExpr_return numExpr() throws RecognitionException {
        RGLParser.numExpr_return retval = new RGLParser.numExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal112=null;
        Token char_literal113=null;
        RGLParser.term_return term111 = null;

        RGLParser.term_return term114 = null;


        RGLTree char_literal112_tree=null;
        RGLTree char_literal113_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:9: ( term ( ( '+' | '-' ) term )* )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:11: term ( ( '+' | '-' ) term )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_term_in_numExpr1235);
            term111=term();

            state._fsp--;

            adaptor.addChild(root_0, term111.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:16: ( ( '+' | '-' ) term )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( ((LA17_0>=PLUS && LA17_0<=MINUS)) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:18: ( '+' | '-' ) term
            	    {
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:18: ( '+' | '-' )
            	    int alt16=2;
            	    int LA16_0 = input.LA(1);

            	    if ( (LA16_0==PLUS) ) {
            	        alt16=1;
            	    }
            	    else if ( (LA16_0==MINUS) ) {
            	        alt16=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 16, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt16) {
            	        case 1 :
            	            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:19: '+'
            	            {
            	            char_literal112=(Token)match(input,PLUS,FOLLOW_PLUS_in_numExpr1240); 
            	            char_literal112_tree = (RGLTree)adaptor.create(char_literal112);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal112_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:26: '-'
            	            {
            	            char_literal113=(Token)match(input,MINUS,FOLLOW_MINUS_in_numExpr1245); 
            	            char_literal113_tree = (RGLTree)adaptor.create(char_literal113);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal113_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_numExpr1249);
            	    term114=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term114.getTree());

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
    // $ANTLR end "numExpr"

    public static class term_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "term"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:1: term : factor ( ( '*' | '/' | '%' ) factor )* ;
    public final RGLParser.term_return term() throws RecognitionException {
        RGLParser.term_return retval = new RGLParser.term_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal116=null;
        Token char_literal117=null;
        Token char_literal118=null;
        RGLParser.factor_return factor115 = null;

        RGLParser.factor_return factor119 = null;


        RGLTree char_literal116_tree=null;
        RGLTree char_literal117_tree=null;
        RGLTree char_literal118_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:9: ( factor ( ( '*' | '/' | '%' ) factor )* )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:11: factor ( ( '*' | '/' | '%' ) factor )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term1271);
            factor115=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor115.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:18: ( ( '*' | '/' | '%' ) factor )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( ((LA19_0>=MUL && LA19_0<=MOD)) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:20: ( '*' | '/' | '%' ) factor
            	    {
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:20: ( '*' | '/' | '%' )
            	    int alt18=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt18=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt18=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt18=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 18, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt18) {
            	        case 1 :
            	            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:21: '*'
            	            {
            	            char_literal116=(Token)match(input,MUL,FOLLOW_MUL_in_term1276); 
            	            char_literal116_tree = (RGLTree)adaptor.create(char_literal116);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal116_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:28: '/'
            	            {
            	            char_literal117=(Token)match(input,DIV,FOLLOW_DIV_in_term1281); 
            	            char_literal117_tree = (RGLTree)adaptor.create(char_literal117);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal117_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:35: '%'
            	            {
            	            char_literal118=(Token)match(input,MOD,FOLLOW_MOD_in_term1286); 
            	            char_literal118_tree = (RGLTree)adaptor.create(char_literal118);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal118_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_factor_in_term1290);
            	    factor119=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor119.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:109:1: factor : ( '+' | '-' )? atom ;
    public final RGLParser.factor_return factor() throws RecognitionException {
        RGLParser.factor_return retval = new RGLParser.factor_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal120=null;
        Token char_literal121=null;
        RGLParser.atom_return atom122 = null;


        RGLTree char_literal120_tree=null;
        RGLTree char_literal121_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:109:9: ( ( '+' | '-' )? atom )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:109:11: ( '+' | '-' )? atom
            {
            root_0 = (RGLTree)adaptor.nil();

            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:109:11: ( '+' | '-' )?
            int alt20=3;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==PLUS) ) {
                alt20=1;
            }
            else if ( (LA20_0==MINUS) ) {
                alt20=2;
            }
            switch (alt20) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:109:12: '+'
                    {
                    char_literal120=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1311); 
                    char_literal120_tree = (RGLTree)adaptor.create(char_literal120);
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal120_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:109:19: '-'
                    {
                    char_literal121=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1316); 
                    char_literal121_tree = (RGLTree)adaptor.create(char_literal121);
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal121_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_in_factor1321);
            atom122=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom122.getTree());

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:112:1: atom : ( INT | ID | GETPOSX | GETPOSY | '(' numExpr ')' );
    public final RGLParser.atom_return atom() throws RecognitionException {
        RGLParser.atom_return retval = new RGLParser.atom_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token INT123=null;
        Token ID124=null;
        Token GETPOSX125=null;
        Token GETPOSY126=null;
        Token char_literal127=null;
        Token char_literal129=null;
        RGLParser.numExpr_return numExpr128 = null;


        RGLTree INT123_tree=null;
        RGLTree ID124_tree=null;
        RGLTree GETPOSX125_tree=null;
        RGLTree GETPOSY126_tree=null;
        RGLTree char_literal127_tree=null;
        RGLTree char_literal129_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:112:9: ( INT | ID | GETPOSX | GETPOSY | '(' numExpr ')' )
            int alt21=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt21=1;
                }
                break;
            case ID:
                {
                alt21=2;
                }
                break;
            case GETPOSX:
                {
                alt21=3;
                }
                break;
            case GETPOSY:
                {
                alt21=4;
                }
                break;
            case 80:
                {
                alt21=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;
            }

            switch (alt21) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:112:11: INT
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    INT123=(Token)match(input,INT,FOLLOW_INT_in_atom1341); 
                    INT123_tree = (RGLTree)adaptor.create(INT123);
                    adaptor.addChild(root_0, INT123_tree);


                    }
                    break;
                case 2 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:113:11: ID
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    ID124=(Token)match(input,ID,FOLLOW_ID_in_atom1353); 
                    ID124_tree = (RGLTree)adaptor.create(ID124);
                    adaptor.addChild(root_0, ID124_tree);


                    }
                    break;
                case 3 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:114:11: GETPOSX
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    GETPOSX125=(Token)match(input,GETPOSX,FOLLOW_GETPOSX_in_atom1365); 
                    GETPOSX125_tree = (RGLTree)adaptor.create(GETPOSX125);
                    adaptor.addChild(root_0, GETPOSX125_tree);


                    }
                    break;
                case 4 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:115:11: GETPOSY
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    GETPOSY126=(Token)match(input,GETPOSY,FOLLOW_GETPOSY_in_atom1377); 
                    GETPOSY126_tree = (RGLTree)adaptor.create(GETPOSY126);
                    adaptor.addChild(root_0, GETPOSY126_tree);


                    }
                    break;
                case 5 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:116:11: '(' numExpr ')'
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    char_literal127=(Token)match(input,80,FOLLOW_80_in_atom1389); 
                    pushFollow(FOLLOW_numExpr_in_atom1392);
                    numExpr128=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr128.getTree());
                    char_literal129=(Token)match(input,81,FOLLOW_81_in_atom1394); 

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

    public static class direction_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "direction"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:119:1: direction : ( NORTH | SOUTH | EAST | WEST );
    public final RGLParser.direction_return direction() throws RecognitionException {
        RGLParser.direction_return retval = new RGLParser.direction_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token set130=null;

        RGLTree set130_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:119:13: ( NORTH | SOUTH | EAST | WEST )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();

            set130=(Token)input.LT(1);
            if ( (input.LA(1)>=NORTH && input.LA(1)<=WEST) ) {
                input.consume();
                adaptor.addChild(root_0, (RGLTree)adaptor.create(set130));
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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:121:1: side : ( FRONT | RIGHT | LEFT );
    public final RGLParser.side_return side() throws RecognitionException {
        RGLParser.side_return retval = new RGLParser.side_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token set131=null;

        RGLTree set131_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:121:11: ( FRONT | RIGHT | LEFT )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();

            set131=(Token)input.LT(1);
            if ( (input.LA(1)>=FRONT && input.LA(1)<=LEFT) ) {
                input.consume();
                adaptor.addChild(root_0, (RGLTree)adaptor.create(set131));
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


 

    public static final BitSet FOLLOW_actions_in_prog158 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_main_in_prog161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIONS_in_actions208 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_declaration_in_actions211 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ENDACTIONS_in_actions214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_declaration232 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_declaration235 = new BitSet(new long[]{0x0000000100002000L,0x0000000000002000L});
    public static final BitSet FOLLOW_argList_in_declaration238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_declaration240 = new BitSet(new long[]{0x000000929FFC6000L});
    public static final BitSet FOLLOW_instrList_in_declaration243 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDFUNC_in_declaration245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_main276 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_initRobot_in_main279 = new BitSet(new long[]{0x000000929FFD2000L});
    public static final BitSet FOLLOW_instrList_in_main281 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_END_in_main283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITROBOT_in_initRobot305 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_initRobot308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_initRobot310 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_initRobot313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_initRobot315 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_initRobot318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExpr_in_instr358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExpr_in_instr362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_instr399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_instr447 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_instr450 = new BitSet(new long[]{0x0006000100002002L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr454 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_instr457 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr460 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_ID_in_instr482 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_instr484 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEFORWARD_in_instr544 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPROBOT_in_instr559 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr562 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVETO_in_instr574 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr577 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_instr579 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_instr594 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_instr609 = new BitSet(new long[]{0x0078000000000000L});
    public static final BitSet FOLLOW_direction_in_instr612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICKOBJECT_in_instr624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASEOBJECT_in_instr636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_instr648 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr651 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_instr653 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOX_in_instr668 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr671 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_instr673 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRAIL_in_instr688 = new BitSet(new long[]{0x0007E00160002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_boolExpr_in_instr692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_instr696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFF_in_instr700 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARK_in_instr713 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_instr718 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_instr721 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_argList738 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args767 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_args770 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_arg_in_args773 = new BitSet(new long[]{0x0000000000000002L,0x0000000000004000L});
    public static final BitSet FOLLOW_set_in_arg0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instr_in_instrList819 = new BitSet(new long[]{0x000000929FFC2002L});
    public static final BitSet FOLLOW_WHILE_in_whileExpr875 = new BitSet(new long[]{0x0007E00100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_boolExpr_in_whileExpr878 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DO_in_whileExpr880 = new BitSet(new long[]{0x0000009A9FFC2000L});
    public static final BitSet FOLLOW_instrList_in_whileExpr883 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_WEND_in_whileExpr885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forExpr923 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_forExpr926 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IN_in_forExpr928 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_forExpr931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000008000L});
    public static final BitSet FOLLOW_79_in_forExpr933 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_forExpr936 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DO_in_forExpr938 = new BitSet(new long[]{0x000000D29FFC2000L});
    public static final BitSet FOLLOW_instrList_in_forExpr941 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_FEND_in_forExpr943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr982 = new BitSet(new long[]{0x0007E00100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_boolExpr_in_ifExpr985 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr987 = new BitSet(new long[]{0x000006929FFC2000L});
    public static final BitSet FOLLOW_instrList_in_ifExpr990 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr993 = new BitSet(new long[]{0x000004929FFC2000L});
    public static final BitSet FOLLOW_instrList_in_ifExpr996 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ENDIF_in_ifExpr1000 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1026 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_OR_in_boolExpr1029 = new BitSet(new long[]{0x0007E00100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1032 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1070 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_AND_in_boolterm1073 = new BitSet(new long[]{0x0007E00100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1076 = new BitSet(new long[]{0x0000100000000002L});
    public static final BitSet FOLLOW_NOT_in_boolfact1103 = new BitSet(new long[]{0x0007E00100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_boolatom_in_boolfact1108 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numExpr_in_boolatom1143 = new BitSet(new long[]{0xC000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_EQUALS_in_boolatom1146 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolatom1151 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_LT_in_boolatom1156 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_LE_in_boolatom1161 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_GT_in_boolatom1166 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_GE_in_boolatom1171 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_boolatom1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolatom1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolatom1195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETECT_in_boolatom1211 = new BitSet(new long[]{0x0380000000000000L});
    public static final BitSet FOLLOW_side_in_boolatom1214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_numExpr1235 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_PLUS_in_numExpr1240 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_MINUS_in_numExpr1245 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_term_in_numExpr1249 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000030L});
    public static final BitSet FOLLOW_factor_in_term1271 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_MUL_in_term1276 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_DIV_in_term1281 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_MOD_in_term1286 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_factor_in_term1290 = new BitSet(new long[]{0x0000000000000002L,0x00000000000001C0L});
    public static final BitSet FOLLOW_PLUS_in_factor1311 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_MINUS_in_factor1316 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_atom_in_factor1321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1353 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSX_in_atom1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSY_in_atom1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_atom1389 = new BitSet(new long[]{0x0006000100002000L,0x0000000000010030L});
    public static final BitSet FOLLOW_numExpr_in_atom1392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_atom1394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_direction0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_side0 = new BitSet(new long[]{0x0000000000000002L});

}