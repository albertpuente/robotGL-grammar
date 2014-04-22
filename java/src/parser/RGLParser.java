// $ANTLR !Unknown version! /home/albert/Desktop/Projecte/java/src/parser/RGL.g 2014-04-22 19:04:20

    package parser;
    import interp.RGLTree;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class RGLParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ASSIGN", "INSTRLIST", "ARGLIST", "PROGRAM", "ACTIONLIST", "RGL", "ACTIONS", "ENDACTIONS", "FUNC", "ID", "ENDFUNC", "BEGIN", "END", "CALL", "INITROBOT", "MOVEFORWARD", "PAUSEROBOT", "STOPROBOT", "MOVETO", "ROTATE", "PICKOBJECT", "RELEASEOBJECT", "OBSTACLE", "BOX", "TRAIL", "ON", "OFF", "MARK", "INT", "WHILE", "DO", "WEND", "FOR", "IN", "FEND", "IF", "THEN", "ELSE", "ENDIF", "OR", "NOT", "AND", "TRUE", "FALSE", "DETECT", "GETPOSX", "GETPOSY", "RETURN", "READ", "WRITE", "EQUAL", "EQUALS", "NOT_EQUAL", "LT", "LE", "GT", "GE", "PLUS", "MINUS", "MUL", "DIV", "MOD", "ESC_SEQ", "STRING", "COMMENT", "WS", "':'", "','", "'..'", "'('", "')'"
    };
    public static final int PICKOBJECT=24;
    public static final int WEND=35;
    public static final int LT=57;
    public static final int WHILE=33;
    public static final int MOD=65;
    public static final int STOPROBOT=21;
    public static final int MOVEFORWARD=19;
    public static final int DO=34;
    public static final int FOR=36;
    public static final int ARGLIST=6;
    public static final int EQUALS=55;
    public static final int NOT=44;
    public static final int RGL=9;
    public static final int AND=45;
    public static final int ID=13;
    public static final int EOF=-1;
    public static final int IF=39;
    public static final int ACTIONS=10;
    public static final int BOX=27;
    public static final int ESC_SEQ=66;
    public static final int THEN=40;
    public static final int IN=37;
    public static final int INITROBOT=18;
    public static final int NOT_EQUAL=56;
    public static final int OFF=30;
    public static final int EQUAL=54;
    public static final int BEGIN=15;
    public static final int RETURN=51;
    public static final int ENDIF=42;
    public static final int PLUS=61;
    public static final int ENDFUNC=14;
    public static final int COMMENT=68;
    public static final int PAUSEROBOT=20;
    public static final int TRAIL=28;
    public static final int GE=60;
    public static final int ENDACTIONS=11;
    public static final int ACTIONLIST=8;
    public static final int MARK=31;
    public static final int RELEASEOBJECT=25;
    public static final int FEND=38;
    public static final int ELSE=41;
    public static final int ON=29;
    public static final int GETPOSY=50;
    public static final int INT=32;
    public static final int GETPOSX=49;
    public static final int ROTATE=23;
    public static final int MINUS=62;
    public static final int OBSTACLE=26;
    public static final int MUL=63;
    public static final int TRUE=46;
    public static final int WRITE=53;
    public static final int INSTRLIST=5;
    public static final int WS=69;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__70=70;
    public static final int READ=52;
    public static final int DETECT=48;
    public static final int FUNC=12;
    public static final int MOVETO=22;
    public static final int OR=43;
    public static final int ASSIGN=4;
    public static final int GT=59;
    public static final int PROGRAM=7;
    public static final int CALL=17;
    public static final int DIV=64;
    public static final int END=16;
    public static final int FALSE=47;
    public static final int T__74=74;
    public static final int T__73=73;
    public static final int LE=58;
    public static final int STRING=67;

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:38:1: declaration : FUNC ID ( argList )? ':' instrList ENDFUNC ;
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
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:38:13: ( FUNC ID ( argList )? ':' instrList ENDFUNC )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:38:15: FUNC ID ( argList )? ':' instrList ENDFUNC
            {
            root_0 = (RGLTree)adaptor.nil();

            FUNC7=(Token)match(input,FUNC,FOLLOW_FUNC_in_declaration232); 
            ID8=(Token)match(input,ID,FOLLOW_ID_in_declaration235); 
            ID8_tree = (RGLTree)adaptor.create(ID8);
            root_0 = (RGLTree)adaptor.becomeRoot(ID8_tree, root_0);

            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:38:25: ( argList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:38:25: argList
                    {
                    pushFollow(FOLLOW_argList_in_declaration238);
                    argList9=argList();

                    state._fsp--;

                    adaptor.addChild(root_0, argList9.getTree());

                    }
                    break;

            }

            char_literal10=(Token)match(input,70,FOLLOW_70_in_declaration241); 
            pushFollow(FOLLOW_instrList_in_declaration244);
            instrList11=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList11.getTree());
            ENDFUNC12=(Token)match(input,ENDFUNC,FOLLOW_ENDFUNC_in_declaration246); 

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:41:1: main : BEGIN ( instr )* END ;
    public final RGLParser.main_return main() throws RecognitionException {
        RGLParser.main_return retval = new RGLParser.main_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token BEGIN13=null;
        Token END15=null;
        RGLParser.instr_return instr14 = null;


        RGLTree BEGIN13_tree=null;
        RGLTree END15_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:41:9: ( BEGIN ( instr )* END )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:41:11: BEGIN ( instr )* END
            {
            root_0 = (RGLTree)adaptor.nil();

            BEGIN13=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_main277); 
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:41:18: ( instr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==ID||(LA4_0>=CALL && LA4_0<=TRAIL)||LA4_0==MARK||LA4_0==WHILE||LA4_0==FOR||LA4_0==IF) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:41:18: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_main280);
            	    instr14=instr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instr14.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            END15=(Token)match(input,END,FOLLOW_END_in_main283); 

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

    public static class instr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "instr"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:44:1: instr : ( whileExpr | forExpr | ifExpr | CALL ID ( numExpr ( ',' numExpr )* )? | ID '=' numExpr | INITROBOT numExpr ',' numExpr | MOVEFORWARD numExpr | PAUSEROBOT numExpr | STOPROBOT | MOVETO numExpr ',' numExpr | ROTATE numExpr | PICKOBJECT | RELEASEOBJECT | OBSTACLE numExpr ',' numExpr | BOX numExpr ',' numExpr | TRAIL ( boolExpr | ON | OFF ) | MARK numExpr ',' numExpr );
    public final RGLParser.instr_return instr() throws RecognitionException {
        RGLParser.instr_return retval = new RGLParser.instr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token CALL19=null;
        Token ID20=null;
        Token char_literal22=null;
        Token ID24=null;
        Token char_literal25=null;
        Token INITROBOT27=null;
        Token char_literal29=null;
        Token MOVEFORWARD31=null;
        Token PAUSEROBOT33=null;
        Token STOPROBOT35=null;
        Token MOVETO36=null;
        Token char_literal38=null;
        Token ROTATE40=null;
        Token PICKOBJECT42=null;
        Token RELEASEOBJECT43=null;
        Token OBSTACLE44=null;
        Token char_literal46=null;
        Token BOX48=null;
        Token char_literal50=null;
        Token TRAIL52=null;
        Token ON54=null;
        Token OFF55=null;
        Token MARK56=null;
        Token char_literal58=null;
        RGLParser.whileExpr_return whileExpr16 = null;

        RGLParser.forExpr_return forExpr17 = null;

        RGLParser.ifExpr_return ifExpr18 = null;

        RGLParser.numExpr_return numExpr21 = null;

        RGLParser.numExpr_return numExpr23 = null;

        RGLParser.numExpr_return numExpr26 = null;

        RGLParser.numExpr_return numExpr28 = null;

        RGLParser.numExpr_return numExpr30 = null;

        RGLParser.numExpr_return numExpr32 = null;

        RGLParser.numExpr_return numExpr34 = null;

        RGLParser.numExpr_return numExpr37 = null;

        RGLParser.numExpr_return numExpr39 = null;

        RGLParser.numExpr_return numExpr41 = null;

        RGLParser.numExpr_return numExpr45 = null;

        RGLParser.numExpr_return numExpr47 = null;

        RGLParser.numExpr_return numExpr49 = null;

        RGLParser.numExpr_return numExpr51 = null;

        RGLParser.boolExpr_return boolExpr53 = null;

        RGLParser.numExpr_return numExpr57 = null;

        RGLParser.numExpr_return numExpr59 = null;


        RGLTree CALL19_tree=null;
        RGLTree ID20_tree=null;
        RGLTree char_literal22_tree=null;
        RGLTree ID24_tree=null;
        RGLTree char_literal25_tree=null;
        RGLTree INITROBOT27_tree=null;
        RGLTree char_literal29_tree=null;
        RGLTree MOVEFORWARD31_tree=null;
        RGLTree PAUSEROBOT33_tree=null;
        RGLTree STOPROBOT35_tree=null;
        RGLTree MOVETO36_tree=null;
        RGLTree char_literal38_tree=null;
        RGLTree ROTATE40_tree=null;
        RGLTree PICKOBJECT42_tree=null;
        RGLTree RELEASEOBJECT43_tree=null;
        RGLTree OBSTACLE44_tree=null;
        RGLTree char_literal46_tree=null;
        RGLTree BOX48_tree=null;
        RGLTree char_literal50_tree=null;
        RGLTree TRAIL52_tree=null;
        RGLTree ON54_tree=null;
        RGLTree OFF55_tree=null;
        RGLTree MARK56_tree=null;
        RGLTree char_literal58_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:44:9: ( whileExpr | forExpr | ifExpr | CALL ID ( numExpr ( ',' numExpr )* )? | ID '=' numExpr | INITROBOT numExpr ',' numExpr | MOVEFORWARD numExpr | PAUSEROBOT numExpr | STOPROBOT | MOVETO numExpr ',' numExpr | ROTATE numExpr | PICKOBJECT | RELEASEOBJECT | OBSTACLE numExpr ',' numExpr | BOX numExpr ',' numExpr | TRAIL ( boolExpr | ON | OFF ) | MARK numExpr ',' numExpr )
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
            case INITROBOT:
                {
                alt8=6;
                }
                break;
            case MOVEFORWARD:
                {
                alt8=7;
                }
                break;
            case PAUSEROBOT:
                {
                alt8=8;
                }
                break;
            case STOPROBOT:
                {
                alt8=9;
                }
                break;
            case MOVETO:
                {
                alt8=10;
                }
                break;
            case ROTATE:
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
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:46:9: whileExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_whileExpr_in_instr317);
                    whileExpr16=whileExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, whileExpr16.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:46:21: forExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_forExpr_in_instr321);
                    forExpr17=forExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, forExpr17.getTree());

                    }
                    break;
                case 3 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:47:11: ifExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_ifExpr_in_instr358);
                    ifExpr18=ifExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, ifExpr18.getTree());

                    }
                    break;
                case 4 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:48:11: CALL ID ( numExpr ( ',' numExpr )* )?
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    CALL19=(Token)match(input,CALL,FOLLOW_CALL_in_instr406); 
                    ID20=(Token)match(input,ID,FOLLOW_ID_in_instr409); 
                    ID20_tree = (RGLTree)adaptor.create(ID20);
                    root_0 = (RGLTree)adaptor.becomeRoot(ID20_tree, root_0);

                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:48:21: ( numExpr ( ',' numExpr )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( (LA6_0==INT||(LA6_0>=GETPOSX && LA6_0<=GETPOSY)||(LA6_0>=PLUS && LA6_0<=MINUS)||LA6_0==73) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==ID) ) {
                        int LA6_2 = input.LA(2);

                        if ( ((LA6_2>=ID && LA6_2<=ENDFUNC)||(LA6_2>=END && LA6_2<=TRAIL)||LA6_2==MARK||LA6_2==WHILE||(LA6_2>=WEND && LA6_2<=FOR)||(LA6_2>=FEND && LA6_2<=IF)||(LA6_2>=ELSE && LA6_2<=ENDIF)||(LA6_2>=PLUS && LA6_2<=MOD)||LA6_2==71) ) {
                            alt6=1;
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:48:22: numExpr ( ',' numExpr )*
                            {
                            pushFollow(FOLLOW_numExpr_in_instr413);
                            numExpr21=numExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, numExpr21.getTree());
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:48:30: ( ',' numExpr )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==71) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:48:31: ',' numExpr
                            	    {
                            	    char_literal22=(Token)match(input,71,FOLLOW_71_in_instr416); 
                            	    pushFollow(FOLLOW_numExpr_in_instr419);
                            	    numExpr23=numExpr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, numExpr23.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop5;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:49:11: ID '=' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    ID24=(Token)match(input,ID,FOLLOW_ID_in_instr441); 
                    ID24_tree = (RGLTree)adaptor.create(ID24);
                    adaptor.addChild(root_0, ID24_tree);

                    char_literal25=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instr443); 
                    char_literal25_tree = (RGLTree)adaptor.create(char_literal25);
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal25_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr446);
                    numExpr26=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr26.getTree());

                    }
                    break;
                case 6 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:52:11: INITROBOT numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    INITROBOT27=(Token)match(input,INITROBOT,FOLLOW_INITROBOT_in_instr503); 
                    INITROBOT27_tree = (RGLTree)adaptor.create(INITROBOT27);
                    root_0 = (RGLTree)adaptor.becomeRoot(INITROBOT27_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr506);
                    numExpr28=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr28.getTree());
                    char_literal29=(Token)match(input,71,FOLLOW_71_in_instr508); 
                    pushFollow(FOLLOW_numExpr_in_instr511);
                    numExpr30=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr30.getTree());

                    }
                    break;
                case 7 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:53:11: MOVEFORWARD numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    MOVEFORWARD31=(Token)match(input,MOVEFORWARD,FOLLOW_MOVEFORWARD_in_instr523); 
                    MOVEFORWARD31_tree = (RGLTree)adaptor.create(MOVEFORWARD31);
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVEFORWARD31_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr526);
                    numExpr32=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr32.getTree());

                    }
                    break;
                case 8 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:54:11: PAUSEROBOT numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    PAUSEROBOT33=(Token)match(input,PAUSEROBOT,FOLLOW_PAUSEROBOT_in_instr538); 
                    PAUSEROBOT33_tree = (RGLTree)adaptor.create(PAUSEROBOT33);
                    root_0 = (RGLTree)adaptor.becomeRoot(PAUSEROBOT33_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr541);
                    numExpr34=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr34.getTree());

                    }
                    break;
                case 9 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:55:11: STOPROBOT
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    STOPROBOT35=(Token)match(input,STOPROBOT,FOLLOW_STOPROBOT_in_instr553); 
                    STOPROBOT35_tree = (RGLTree)adaptor.create(STOPROBOT35);
                    adaptor.addChild(root_0, STOPROBOT35_tree);


                    }
                    break;
                case 10 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:56:11: MOVETO numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    MOVETO36=(Token)match(input,MOVETO,FOLLOW_MOVETO_in_instr565); 
                    MOVETO36_tree = (RGLTree)adaptor.create(MOVETO36);
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVETO36_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr568);
                    numExpr37=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr37.getTree());
                    char_literal38=(Token)match(input,71,FOLLOW_71_in_instr570); 
                    pushFollow(FOLLOW_numExpr_in_instr573);
                    numExpr39=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr39.getTree());

                    }
                    break;
                case 11 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:57:11: ROTATE numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    ROTATE40=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_instr585); 
                    ROTATE40_tree = (RGLTree)adaptor.create(ROTATE40);
                    root_0 = (RGLTree)adaptor.becomeRoot(ROTATE40_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr588);
                    numExpr41=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr41.getTree());

                    }
                    break;
                case 12 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:58:11: PICKOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    PICKOBJECT42=(Token)match(input,PICKOBJECT,FOLLOW_PICKOBJECT_in_instr600); 
                    PICKOBJECT42_tree = (RGLTree)adaptor.create(PICKOBJECT42);
                    adaptor.addChild(root_0, PICKOBJECT42_tree);


                    }
                    break;
                case 13 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:59:11: RELEASEOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    RELEASEOBJECT43=(Token)match(input,RELEASEOBJECT,FOLLOW_RELEASEOBJECT_in_instr612); 
                    RELEASEOBJECT43_tree = (RGLTree)adaptor.create(RELEASEOBJECT43);
                    adaptor.addChild(root_0, RELEASEOBJECT43_tree);


                    }
                    break;
                case 14 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:60:11: OBSTACLE numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    OBSTACLE44=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_instr624); 
                    OBSTACLE44_tree = (RGLTree)adaptor.create(OBSTACLE44);
                    root_0 = (RGLTree)adaptor.becomeRoot(OBSTACLE44_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr627);
                    numExpr45=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr45.getTree());
                    char_literal46=(Token)match(input,71,FOLLOW_71_in_instr629); 
                    pushFollow(FOLLOW_numExpr_in_instr632);
                    numExpr47=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr47.getTree());

                    }
                    break;
                case 15 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:61:11: BOX numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    BOX48=(Token)match(input,BOX,FOLLOW_BOX_in_instr644); 
                    BOX48_tree = (RGLTree)adaptor.create(BOX48);
                    root_0 = (RGLTree)adaptor.becomeRoot(BOX48_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr647);
                    numExpr49=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr49.getTree());
                    char_literal50=(Token)match(input,71,FOLLOW_71_in_instr649); 
                    pushFollow(FOLLOW_numExpr_in_instr652);
                    numExpr51=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr51.getTree());

                    }
                    break;
                case 16 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:62:11: TRAIL ( boolExpr | ON | OFF )
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    TRAIL52=(Token)match(input,TRAIL,FOLLOW_TRAIL_in_instr664); 
                    TRAIL52_tree = (RGLTree)adaptor.create(TRAIL52);
                    root_0 = (RGLTree)adaptor.becomeRoot(TRAIL52_tree, root_0);

                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:62:18: ( boolExpr | ON | OFF )
                    int alt7=3;
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
                    case 73:
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
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:62:19: boolExpr
                            {
                            pushFollow(FOLLOW_boolExpr_in_instr668);
                            boolExpr53=boolExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, boolExpr53.getTree());

                            }
                            break;
                        case 2 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:62:30: ON
                            {
                            ON54=(Token)match(input,ON,FOLLOW_ON_in_instr672); 
                            ON54_tree = (RGLTree)adaptor.create(ON54);
                            adaptor.addChild(root_0, ON54_tree);


                            }
                            break;
                        case 3 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:62:35: OFF
                            {
                            OFF55=(Token)match(input,OFF,FOLLOW_OFF_in_instr676); 
                            OFF55_tree = (RGLTree)adaptor.create(OFF55);
                            adaptor.addChild(root_0, OFF55_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 17 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:63:11: MARK numExpr ',' numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    MARK56=(Token)match(input,MARK,FOLLOW_MARK_in_instr689); 
                    MARK56_tree = (RGLTree)adaptor.create(MARK56);
                    root_0 = (RGLTree)adaptor.becomeRoot(MARK56_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_instr692);
                    numExpr57=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr57.getTree());
                    char_literal58=(Token)match(input,71,FOLLOW_71_in_instr694); 
                    pushFollow(FOLLOW_numExpr_in_instr697);
                    numExpr59=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr59.getTree());

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:66:1: argList : args -> ^( ARGLIST args ) ;
    public final RGLParser.argList_return argList() throws RecognitionException {
        RGLParser.argList_return retval = new RGLParser.argList_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        RGLParser.args_return args60 = null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:66:9: ( args -> ^( ARGLIST args ) )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:66:11: args
            {
            pushFollow(FOLLOW_args_in_argList714);
            args60=args();

            state._fsp--;

            stream_args.add(args60.getTree());


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
            // 66:16: -> ^( ARGLIST args )
            {
                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:66:19: ^( ARGLIST args )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(ARGLIST, "ARGLIST"), root_1);

                adaptor.addChild(root_1, stream_args.nextTree());

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:1: args : arg ( ',' arg )* ;
    public final RGLParser.args_return args() throws RecognitionException {
        RGLParser.args_return retval = new RGLParser.args_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal62=null;
        RGLParser.arg_return arg61 = null;

        RGLParser.arg_return arg63 = null;


        RGLTree char_literal62_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:9: ( arg ( ',' arg )* )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:11: arg ( ',' arg )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_arg_in_args741);
            arg61=arg();

            state._fsp--;

            adaptor.addChild(root_0, arg61.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:15: ( ',' arg )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==71) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:68:16: ',' arg
            	    {
            	    char_literal62=(Token)match(input,71,FOLLOW_71_in_args744); 
            	    pushFollow(FOLLOW_arg_in_args747);
            	    arg63=arg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arg63.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "args"

    public static class arg_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "arg"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:71:1: arg : ( ID | INT );
    public final RGLParser.arg_return arg() throws RecognitionException {
        RGLParser.arg_return retval = new RGLParser.arg_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token set64=null;

        RGLTree set64_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:71:9: ( ID | INT )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();

            set64=(Token)input.LT(1);
            if ( input.LA(1)==ID||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, (RGLTree)adaptor.create(set64));
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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:74:1: instrList : ( instr )* -> ^( INSTRLIST ( instr )* ) ;
    public final RGLParser.instrList_return instrList() throws RecognitionException {
        RGLParser.instrList_return retval = new RGLParser.instrList_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        RGLParser.instr_return instr65 = null;


        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:74:13: ( ( instr )* -> ^( INSTRLIST ( instr )* ) )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:74:15: ( instr )*
            {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:74:15: ( instr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==ID||(LA10_0>=CALL && LA10_0<=TRAIL)||LA10_0==MARK||LA10_0==WHILE||LA10_0==FOR||LA10_0==IF) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:74:15: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_instrList793);
            	    instr65=instr();

            	    state._fsp--;

            	    stream_instr.add(instr65.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
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
            // 74:23: -> ^( INSTRLIST ( instr )* )
            {
                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:74:26: ^( INSTRLIST ( instr )* )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot((RGLTree)adaptor.create(INSTRLIST, "INSTRLIST"), root_1);

                // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:74:38: ( instr )*
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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:77:1: whileExpr : WHILE boolExpr DO instrList WEND ;
    public final RGLParser.whileExpr_return whileExpr() throws RecognitionException {
        RGLParser.whileExpr_return retval = new RGLParser.whileExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token WHILE66=null;
        Token DO68=null;
        Token WEND70=null;
        RGLParser.boolExpr_return boolExpr67 = null;

        RGLParser.instrList_return instrList69 = null;


        RGLTree WHILE66_tree=null;
        RGLTree DO68_tree=null;
        RGLTree WEND70_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:77:13: ( WHILE boolExpr DO instrList WEND )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:77:15: WHILE boolExpr DO instrList WEND
            {
            root_0 = (RGLTree)adaptor.nil();

            WHILE66=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExpr849); 
            WHILE66_tree = (RGLTree)adaptor.create(WHILE66);
            root_0 = (RGLTree)adaptor.becomeRoot(WHILE66_tree, root_0);

            pushFollow(FOLLOW_boolExpr_in_whileExpr852);
            boolExpr67=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr67.getTree());
            DO68=(Token)match(input,DO,FOLLOW_DO_in_whileExpr854); 
            pushFollow(FOLLOW_instrList_in_whileExpr857);
            instrList69=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList69.getTree());
            WEND70=(Token)match(input,WEND,FOLLOW_WEND_in_whileExpr859); 

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:80:1: forExpr : FOR ID IN INT '..' INT DO instrList FEND ;
    public final RGLParser.forExpr_return forExpr() throws RecognitionException {
        RGLParser.forExpr_return retval = new RGLParser.forExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token FOR71=null;
        Token ID72=null;
        Token IN73=null;
        Token INT74=null;
        Token string_literal75=null;
        Token INT76=null;
        Token DO77=null;
        Token FEND79=null;
        RGLParser.instrList_return instrList78 = null;


        RGLTree FOR71_tree=null;
        RGLTree ID72_tree=null;
        RGLTree IN73_tree=null;
        RGLTree INT74_tree=null;
        RGLTree string_literal75_tree=null;
        RGLTree INT76_tree=null;
        RGLTree DO77_tree=null;
        RGLTree FEND79_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:80:13: ( FOR ID IN INT '..' INT DO instrList FEND )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:80:15: FOR ID IN INT '..' INT DO instrList FEND
            {
            root_0 = (RGLTree)adaptor.nil();

            FOR71=(Token)match(input,FOR,FOLLOW_FOR_in_forExpr897); 
            FOR71_tree = (RGLTree)adaptor.create(FOR71);
            root_0 = (RGLTree)adaptor.becomeRoot(FOR71_tree, root_0);

            ID72=(Token)match(input,ID,FOLLOW_ID_in_forExpr900); 
            ID72_tree = (RGLTree)adaptor.create(ID72);
            adaptor.addChild(root_0, ID72_tree);

            IN73=(Token)match(input,IN,FOLLOW_IN_in_forExpr902); 
            INT74=(Token)match(input,INT,FOLLOW_INT_in_forExpr905); 
            INT74_tree = (RGLTree)adaptor.create(INT74);
            adaptor.addChild(root_0, INT74_tree);

            string_literal75=(Token)match(input,72,FOLLOW_72_in_forExpr907); 
            INT76=(Token)match(input,INT,FOLLOW_INT_in_forExpr910); 
            INT76_tree = (RGLTree)adaptor.create(INT76);
            adaptor.addChild(root_0, INT76_tree);

            DO77=(Token)match(input,DO,FOLLOW_DO_in_forExpr912); 
            pushFollow(FOLLOW_instrList_in_forExpr915);
            instrList78=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList78.getTree());
            FEND79=(Token)match(input,FEND,FOLLOW_FEND_in_forExpr917); 

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:83:1: ifExpr : IF boolExpr THEN instrList ( ELSE instrList )? ENDIF ;
    public final RGLParser.ifExpr_return ifExpr() throws RecognitionException {
        RGLParser.ifExpr_return retval = new RGLParser.ifExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token IF80=null;
        Token THEN82=null;
        Token ELSE84=null;
        Token ENDIF86=null;
        RGLParser.boolExpr_return boolExpr81 = null;

        RGLParser.instrList_return instrList83 = null;

        RGLParser.instrList_return instrList85 = null;


        RGLTree IF80_tree=null;
        RGLTree THEN82_tree=null;
        RGLTree ELSE84_tree=null;
        RGLTree ENDIF86_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:83:13: ( IF boolExpr THEN instrList ( ELSE instrList )? ENDIF )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:83:15: IF boolExpr THEN instrList ( ELSE instrList )? ENDIF
            {
            root_0 = (RGLTree)adaptor.nil();

            IF80=(Token)match(input,IF,FOLLOW_IF_in_ifExpr956); 
            IF80_tree = (RGLTree)adaptor.create(IF80);
            root_0 = (RGLTree)adaptor.becomeRoot(IF80_tree, root_0);

            pushFollow(FOLLOW_boolExpr_in_ifExpr959);
            boolExpr81=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr81.getTree());
            THEN82=(Token)match(input,THEN,FOLLOW_THEN_in_ifExpr961); 
            pushFollow(FOLLOW_instrList_in_ifExpr964);
            instrList83=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList83.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:83:44: ( ELSE instrList )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:83:45: ELSE instrList
                    {
                    ELSE84=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifExpr967); 
                    pushFollow(FOLLOW_instrList_in_ifExpr970);
                    instrList85=instrList();

                    state._fsp--;

                    adaptor.addChild(root_0, instrList85.getTree());

                    }
                    break;

            }

            ENDIF86=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExpr974); 

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:86:1: boolExpr : boolterm ( OR boolterm )* ;
    public final RGLParser.boolExpr_return boolExpr() throws RecognitionException {
        RGLParser.boolExpr_return retval = new RGLParser.boolExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token OR88=null;
        RGLParser.boolterm_return boolterm87 = null;

        RGLParser.boolterm_return boolterm89 = null;


        RGLTree OR88_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:86:13: ( boolterm ( OR boolterm )* )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:86:15: boolterm ( OR boolterm )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_boolterm_in_boolExpr999);
            boolterm87=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm87.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:86:24: ( OR boolterm )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:86:25: OR boolterm
            	    {
            	    OR88=(Token)match(input,OR,FOLLOW_OR_in_boolExpr1002); 
            	    OR88_tree = (RGLTree)adaptor.create(OR88);
            	    root_0 = (RGLTree)adaptor.becomeRoot(OR88_tree, root_0);

            	    pushFollow(FOLLOW_boolterm_in_boolExpr1005);
            	    boolterm89=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm89.getTree());

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
    // $ANTLR end "boolExpr"

    public static class boolterm_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolterm"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:1: boolterm : ( NOT )? boolfact ( AND boolfact )* ;
    public final RGLParser.boolterm_return boolterm() throws RecognitionException {
        RGLParser.boolterm_return retval = new RGLParser.boolterm_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token NOT90=null;
        Token AND92=null;
        RGLParser.boolfact_return boolfact91 = null;

        RGLParser.boolfact_return boolfact93 = null;


        RGLTree NOT90_tree=null;
        RGLTree AND92_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:13: ( ( NOT )? boolfact ( AND boolfact )* )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:15: ( NOT )? boolfact ( AND boolfact )*
            {
            root_0 = (RGLTree)adaptor.nil();

            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:15: ( NOT )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NOT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:16: NOT
                    {
                    NOT90=(Token)match(input,NOT,FOLLOW_NOT_in_boolterm1044); 
                    NOT90_tree = (RGLTree)adaptor.create(NOT90);
                    root_0 = (RGLTree)adaptor.becomeRoot(NOT90_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_boolfact_in_boolterm1049);
            boolfact91=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact91.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:32: ( AND boolfact )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:89:33: AND boolfact
            	    {
            	    AND92=(Token)match(input,AND,FOLLOW_AND_in_boolterm1052); 
            	    AND92_tree = (RGLTree)adaptor.create(AND92);
            	    root_0 = (RGLTree)adaptor.becomeRoot(AND92_tree, root_0);

            	    pushFollow(FOLLOW_boolfact_in_boolterm1055);
            	    boolfact93=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact93.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "boolterm"

    public static class boolfact_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "boolfact"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:1: boolfact : ( numExpr ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) numExpr | TRUE | FALSE | DETECT numExpr );
    public final RGLParser.boolfact_return boolfact() throws RecognitionException {
        RGLParser.boolfact_return retval = new RGLParser.boolfact_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token string_literal95=null;
        Token string_literal96=null;
        Token char_literal97=null;
        Token string_literal98=null;
        Token char_literal99=null;
        Token string_literal100=null;
        Token TRUE102=null;
        Token FALSE103=null;
        Token DETECT104=null;
        RGLParser.numExpr_return numExpr94 = null;

        RGLParser.numExpr_return numExpr101 = null;

        RGLParser.numExpr_return numExpr105 = null;


        RGLTree string_literal95_tree=null;
        RGLTree string_literal96_tree=null;
        RGLTree char_literal97_tree=null;
        RGLTree string_literal98_tree=null;
        RGLTree char_literal99_tree=null;
        RGLTree string_literal100_tree=null;
        RGLTree TRUE102_tree=null;
        RGLTree FALSE103_tree=null;
        RGLTree DETECT104_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:13: ( numExpr ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) numExpr | TRUE | FALSE | DETECT numExpr )
            int alt16=4;
            switch ( input.LA(1) ) {
            case ID:
            case INT:
            case GETPOSX:
            case GETPOSY:
            case PLUS:
            case MINUS:
            case 73:
                {
                alt16=1;
                }
                break;
            case TRUE:
                {
                alt16=2;
                }
                break;
            case FALSE:
                {
                alt16=3;
                }
                break;
            case DETECT:
                {
                alt16=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }

            switch (alt16) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:15: numExpr ( '==' | '!=' | '<' | '<=' | '>' | '>=' ) numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    pushFollow(FOLLOW_numExpr_in_boolfact1093);
                    numExpr94=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr94.getTree());
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:23: ( '==' | '!=' | '<' | '<=' | '>' | '>=' )
                    int alt15=6;
                    switch ( input.LA(1) ) {
                    case EQUALS:
                        {
                        alt15=1;
                        }
                        break;
                    case NOT_EQUAL:
                        {
                        alt15=2;
                        }
                        break;
                    case LT:
                        {
                        alt15=3;
                        }
                        break;
                    case LE:
                        {
                        alt15=4;
                        }
                        break;
                    case GT:
                        {
                        alt15=5;
                        }
                        break;
                    case GE:
                        {
                        alt15=6;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 0, input);

                        throw nvae;
                    }

                    switch (alt15) {
                        case 1 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:24: '=='
                            {
                            string_literal95=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_boolfact1096); 
                            string_literal95_tree = (RGLTree)adaptor.create(string_literal95);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal95_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:32: '!='
                            {
                            string_literal96=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1101); 
                            string_literal96_tree = (RGLTree)adaptor.create(string_literal96);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal96_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:40: '<'
                            {
                            char_literal97=(Token)match(input,LT,FOLLOW_LT_in_boolfact1106); 
                            char_literal97_tree = (RGLTree)adaptor.create(char_literal97);
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal97_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:47: '<='
                            {
                            string_literal98=(Token)match(input,LE,FOLLOW_LE_in_boolfact1111); 
                            string_literal98_tree = (RGLTree)adaptor.create(string_literal98);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal98_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:55: '>'
                            {
                            char_literal99=(Token)match(input,GT,FOLLOW_GT_in_boolfact1116); 
                            char_literal99_tree = (RGLTree)adaptor.create(char_literal99);
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal99_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:92:62: '>='
                            {
                            string_literal100=(Token)match(input,GE,FOLLOW_GE_in_boolfact1121); 
                            string_literal100_tree = (RGLTree)adaptor.create(string_literal100);
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal100_tree, root_0);


                            }
                            break;

                    }

                    pushFollow(FOLLOW_numExpr_in_boolfact1125);
                    numExpr101=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr101.getTree());

                    }
                    break;
                case 2 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:93:15: TRUE
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    TRUE102=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolfact1141); 
                    TRUE102_tree = (RGLTree)adaptor.create(TRUE102);
                    adaptor.addChild(root_0, TRUE102_tree);


                    }
                    break;
                case 3 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:93:22: FALSE
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    FALSE103=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolfact1145); 
                    FALSE103_tree = (RGLTree)adaptor.create(FALSE103);
                    adaptor.addChild(root_0, FALSE103_tree);


                    }
                    break;
                case 4 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:94:15: DETECT numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    DETECT104=(Token)match(input,DETECT,FOLLOW_DETECT_in_boolfact1161); 
                    DETECT104_tree = (RGLTree)adaptor.create(DETECT104);
                    root_0 = (RGLTree)adaptor.becomeRoot(DETECT104_tree, root_0);

                    pushFollow(FOLLOW_numExpr_in_boolfact1164);
                    numExpr105=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr105.getTree());

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
    // $ANTLR end "boolfact"

    public static class numExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "numExpr"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:97:1: numExpr : term ( ( '+' | '-' ) term )* ;
    public final RGLParser.numExpr_return numExpr() throws RecognitionException {
        RGLParser.numExpr_return retval = new RGLParser.numExpr_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal107=null;
        Token char_literal108=null;
        RGLParser.term_return term106 = null;

        RGLParser.term_return term109 = null;


        RGLTree char_literal107_tree=null;
        RGLTree char_literal108_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:97:9: ( term ( ( '+' | '-' ) term )* )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:97:11: term ( ( '+' | '-' ) term )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_term_in_numExpr1185);
            term106=term();

            state._fsp--;

            adaptor.addChild(root_0, term106.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:97:16: ( ( '+' | '-' ) term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( ((LA18_0>=PLUS && LA18_0<=MINUS)) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:97:18: ( '+' | '-' ) term
            	    {
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:97:18: ( '+' | '-' )
            	    int alt17=2;
            	    int LA17_0 = input.LA(1);

            	    if ( (LA17_0==PLUS) ) {
            	        alt17=1;
            	    }
            	    else if ( (LA17_0==MINUS) ) {
            	        alt17=2;
            	    }
            	    else {
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 17, 0, input);

            	        throw nvae;
            	    }
            	    switch (alt17) {
            	        case 1 :
            	            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:97:19: '+'
            	            {
            	            char_literal107=(Token)match(input,PLUS,FOLLOW_PLUS_in_numExpr1190); 
            	            char_literal107_tree = (RGLTree)adaptor.create(char_literal107);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal107_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:97:26: '-'
            	            {
            	            char_literal108=(Token)match(input,MINUS,FOLLOW_MINUS_in_numExpr1195); 
            	            char_literal108_tree = (RGLTree)adaptor.create(char_literal108);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal108_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_term_in_numExpr1199);
            	    term109=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term109.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:100:1: term : factor ( ( '*' | '/' | '%' ) factor )* ;
    public final RGLParser.term_return term() throws RecognitionException {
        RGLParser.term_return retval = new RGLParser.term_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal111=null;
        Token char_literal112=null;
        Token char_literal113=null;
        RGLParser.factor_return factor110 = null;

        RGLParser.factor_return factor114 = null;


        RGLTree char_literal111_tree=null;
        RGLTree char_literal112_tree=null;
        RGLTree char_literal113_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:100:9: ( factor ( ( '*' | '/' | '%' ) factor )* )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:100:11: factor ( ( '*' | '/' | '%' ) factor )*
            {
            root_0 = (RGLTree)adaptor.nil();

            pushFollow(FOLLOW_factor_in_term1221);
            factor110=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor110.getTree());
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:100:18: ( ( '*' | '/' | '%' ) factor )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( ((LA20_0>=MUL && LA20_0<=MOD)) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:100:20: ( '*' | '/' | '%' ) factor
            	    {
            	    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:100:20: ( '*' | '/' | '%' )
            	    int alt19=3;
            	    switch ( input.LA(1) ) {
            	    case MUL:
            	        {
            	        alt19=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt19=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt19=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 19, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt19) {
            	        case 1 :
            	            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:100:21: '*'
            	            {
            	            char_literal111=(Token)match(input,MUL,FOLLOW_MUL_in_term1226); 
            	            char_literal111_tree = (RGLTree)adaptor.create(char_literal111);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal111_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:100:28: '/'
            	            {
            	            char_literal112=(Token)match(input,DIV,FOLLOW_DIV_in_term1231); 
            	            char_literal112_tree = (RGLTree)adaptor.create(char_literal112);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal112_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:100:35: '%'
            	            {
            	            char_literal113=(Token)match(input,MOD,FOLLOW_MOD_in_term1236); 
            	            char_literal113_tree = (RGLTree)adaptor.create(char_literal113);
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal113_tree, root_0);


            	            }
            	            break;

            	    }

            	    pushFollow(FOLLOW_factor_in_term1240);
            	    factor114=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor114.getTree());

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
        }
        return retval;
    }
    // $ANTLR end "term"

    public static class factor_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "factor"
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:1: factor : ( '+' | '-' )? atom ;
    public final RGLParser.factor_return factor() throws RecognitionException {
        RGLParser.factor_return retval = new RGLParser.factor_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token char_literal115=null;
        Token char_literal116=null;
        RGLParser.atom_return atom117 = null;


        RGLTree char_literal115_tree=null;
        RGLTree char_literal116_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:9: ( ( '+' | '-' )? atom )
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:11: ( '+' | '-' )? atom
            {
            root_0 = (RGLTree)adaptor.nil();

            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:11: ( '+' | '-' )?
            int alt21=3;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==PLUS) ) {
                alt21=1;
            }
            else if ( (LA21_0==MINUS) ) {
                alt21=2;
            }
            switch (alt21) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:12: '+'
                    {
                    char_literal115=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1261); 
                    char_literal115_tree = (RGLTree)adaptor.create(char_literal115);
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal115_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:103:19: '-'
                    {
                    char_literal116=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1266); 
                    char_literal116_tree = (RGLTree)adaptor.create(char_literal116);
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal116_tree, root_0);


                    }
                    break;

            }

            pushFollow(FOLLOW_atom_in_factor1271);
            atom117=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom117.getTree());

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
    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:1: atom : ( INT | ID | GETPOSX | GETPOSY | '(' numExpr ')' );
    public final RGLParser.atom_return atom() throws RecognitionException {
        RGLParser.atom_return retval = new RGLParser.atom_return();
        retval.start = input.LT(1);

        RGLTree root_0 = null;

        Token INT118=null;
        Token ID119=null;
        Token GETPOSX120=null;
        Token GETPOSY121=null;
        Token char_literal122=null;
        Token char_literal124=null;
        RGLParser.numExpr_return numExpr123 = null;


        RGLTree INT118_tree=null;
        RGLTree ID119_tree=null;
        RGLTree GETPOSX120_tree=null;
        RGLTree GETPOSY121_tree=null;
        RGLTree char_literal122_tree=null;
        RGLTree char_literal124_tree=null;

        try {
            // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:9: ( INT | ID | GETPOSX | GETPOSY | '(' numExpr ')' )
            int alt22=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt22=1;
                }
                break;
            case ID:
                {
                alt22=2;
                }
                break;
            case GETPOSX:
                {
                alt22=3;
                }
                break;
            case GETPOSY:
                {
                alt22=4;
                }
                break;
            case 73:
                {
                alt22=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;
            }

            switch (alt22) {
                case 1 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:106:11: INT
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    INT118=(Token)match(input,INT,FOLLOW_INT_in_atom1291); 
                    INT118_tree = (RGLTree)adaptor.create(INT118);
                    adaptor.addChild(root_0, INT118_tree);


                    }
                    break;
                case 2 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:107:11: ID
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    ID119=(Token)match(input,ID,FOLLOW_ID_in_atom1303); 
                    ID119_tree = (RGLTree)adaptor.create(ID119);
                    adaptor.addChild(root_0, ID119_tree);


                    }
                    break;
                case 3 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:108:11: GETPOSX
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    GETPOSX120=(Token)match(input,GETPOSX,FOLLOW_GETPOSX_in_atom1315); 
                    GETPOSX120_tree = (RGLTree)adaptor.create(GETPOSX120);
                    adaptor.addChild(root_0, GETPOSX120_tree);


                    }
                    break;
                case 4 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:109:11: GETPOSY
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    GETPOSY121=(Token)match(input,GETPOSY,FOLLOW_GETPOSY_in_atom1327); 
                    GETPOSY121_tree = (RGLTree)adaptor.create(GETPOSY121);
                    adaptor.addChild(root_0, GETPOSY121_tree);


                    }
                    break;
                case 5 :
                    // /home/albert/Desktop/Projecte/java/src/parser/RGL.g:110:11: '(' numExpr ')'
                    {
                    root_0 = (RGLTree)adaptor.nil();

                    char_literal122=(Token)match(input,73,FOLLOW_73_in_atom1339); 
                    pushFollow(FOLLOW_numExpr_in_atom1342);
                    numExpr123=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr123.getTree());
                    char_literal124=(Token)match(input,74,FOLLOW_74_in_atom1344); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_actions_in_prog158 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_main_in_prog161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIONS_in_actions208 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_declaration_in_actions211 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_ENDACTIONS_in_actions214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_declaration232 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_declaration235 = new BitSet(new long[]{0x0000000100002000L,0x0000000000000040L});
    public static final BitSet FOLLOW_argList_in_declaration238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_declaration241 = new BitSet(new long[]{0x000000929FFE6000L});
    public static final BitSet FOLLOW_instrList_in_declaration244 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ENDFUNC_in_declaration246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_main277 = new BitSet(new long[]{0x000000929FFF2000L});
    public static final BitSet FOLLOW_instr_in_main280 = new BitSet(new long[]{0x000000929FFF2000L});
    public static final BitSet FOLLOW_END_in_main283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExpr_in_instr317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExpr_in_instr321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_instr358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_instr406 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_instr409 = new BitSet(new long[]{0x6006000100002002L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr416 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr419 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_instr441 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_EQUAL_in_instr443 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITROBOT_in_instr503 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr508 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEFORWARD_in_instr523 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PAUSEROBOT_in_instr538 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr541 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPROBOT_in_instr553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVETO_in_instr565 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr568 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr570 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr573 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_instr585 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr588 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICKOBJECT_in_instr600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASEOBJECT_in_instr612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_instr624 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr627 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr629 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr632 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOX_in_instr644 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr649 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRAIL_in_instr664 = new BitSet(new long[]{0x6007D00160002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_boolExpr_in_instr668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_instr672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFF_in_instr676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARK_in_instr689 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr694 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_instr697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_argList714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args741 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_args744 = new BitSet(new long[]{0x0000000100002000L});
    public static final BitSet FOLLOW_arg_in_args747 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_set_in_arg0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_instr_in_instrList793 = new BitSet(new long[]{0x000000929FFE2002L});
    public static final BitSet FOLLOW_WHILE_in_whileExpr849 = new BitSet(new long[]{0x6007D00100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_boolExpr_in_whileExpr852 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DO_in_whileExpr854 = new BitSet(new long[]{0x0000009A9FFE2000L});
    public static final BitSet FOLLOW_instrList_in_whileExpr857 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_WEND_in_whileExpr859 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forExpr897 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_ID_in_forExpr900 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_IN_in_forExpr902 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_forExpr905 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_forExpr907 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_INT_in_forExpr910 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_DO_in_forExpr912 = new BitSet(new long[]{0x000000D29FFE2000L});
    public static final BitSet FOLLOW_instrList_in_forExpr915 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_FEND_in_forExpr917 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr956 = new BitSet(new long[]{0x6007D00100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_boolExpr_in_ifExpr959 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr961 = new BitSet(new long[]{0x000006929FFE2000L});
    public static final BitSet FOLLOW_instrList_in_ifExpr964 = new BitSet(new long[]{0x0000060000000000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr967 = new BitSet(new long[]{0x000004929FFE2000L});
    public static final BitSet FOLLOW_instrList_in_ifExpr970 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ENDIF_in_ifExpr974 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr999 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_OR_in_boolExpr1002 = new BitSet(new long[]{0x6007D00100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1005 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_NOT_in_boolterm1044 = new BitSet(new long[]{0x6007D00100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1049 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_AND_in_boolterm1052 = new BitSet(new long[]{0x6007D00100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1055 = new BitSet(new long[]{0x0000200000000002L});
    public static final BitSet FOLLOW_numExpr_in_boolfact1093 = new BitSet(new long[]{0x1F80000000000000L});
    public static final BitSet FOLLOW_EQUALS_in_boolfact1096 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1101 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LT_in_boolfact1106 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_LE_in_boolfact1111 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_GT_in_boolfact1116 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_GE_in_boolfact1121 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_boolfact1125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolfact1141 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolfact1145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETECT_in_boolfact1161 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_boolfact1164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_numExpr1185 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_numExpr1190 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_MINUS_in_numExpr1195 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_term_in_numExpr1199 = new BitSet(new long[]{0x6000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1221 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_MUL_in_term1226 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_DIV_in_term1231 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_MOD_in_term1236 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_factor_in_term1240 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000003L});
    public static final BitSet FOLLOW_PLUS_in_factor1261 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_MINUS_in_factor1266 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_atom_in_factor1271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1291 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1303 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSX_in_atom1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSY_in_atom1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_atom1339 = new BitSet(new long[]{0x6006000100002000L,0x0000000000000200L});
    public static final BitSet FOLLOW_numExpr_in_atom1342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_74_in_atom1344 = new BitSet(new long[]{0x0000000000000002L});

}