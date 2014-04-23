// $ANTLR 3.4 /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g 2014-04-23 11:39:31

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTIONLIST", "ACTIONS", "AND", "ARGLIST", "ASSIGN", "BEGIN", "BOX", "CALL", "COMMENT", "DETECT", "DIV", "DO", "EAST", "ELSE", "END", "ENDACTIONS", "ENDFUNC", "ENDIF", "EQUAL", "EQUALS", "ESC_SEQ", "FACE", "FALSE", "FEND", "FOR", "FUNC", "GE", "GETPOSX", "GETPOSY", "GT", "ID", "IF", "IN", "INITROBOT", "INSTRLIST", "INT", "LE", "LT", "MARK", "MINUS", "MOD", "MOVEFORWARD", "MOVETO", "MUL", "NORTH", "NOT", "NOT_EQUAL", "OBSTACLE", "OFF", "ON", "OR", "PICKOBJECT", "PLUS", "PROGRAM", "READ", "RELEASEOBJECT", "RETURN", "RGL", "ROTATE", "SOUTH", "STOPROBOT", "STRING", "THEN", "TRAIL", "TRUE", "WEND", "WEST", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'..'", "':'"
    };

    public static final int EOF=-1;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int ACTIONLIST=4;
    public static final int ACTIONS=5;
    public static final int AND=6;
    public static final int ARGLIST=7;
    public static final int ASSIGN=8;
    public static final int BEGIN=9;
    public static final int BOX=10;
    public static final int CALL=11;
    public static final int COMMENT=12;
    public static final int DETECT=13;
    public static final int DIV=14;
    public static final int DO=15;
    public static final int EAST=16;
    public static final int ELSE=17;
    public static final int END=18;
    public static final int ENDACTIONS=19;
    public static final int ENDFUNC=20;
    public static final int ENDIF=21;
    public static final int EQUAL=22;
    public static final int EQUALS=23;
    public static final int ESC_SEQ=24;
    public static final int FACE=25;
    public static final int FALSE=26;
    public static final int FEND=27;
    public static final int FOR=28;
    public static final int FUNC=29;
    public static final int GE=30;
    public static final int GETPOSX=31;
    public static final int GETPOSY=32;
    public static final int GT=33;
    public static final int ID=34;
    public static final int IF=35;
    public static final int IN=36;
    public static final int INITROBOT=37;
    public static final int INSTRLIST=38;
    public static final int INT=39;
    public static final int LE=40;
    public static final int LT=41;
    public static final int MARK=42;
    public static final int MINUS=43;
    public static final int MOD=44;
    public static final int MOVEFORWARD=45;
    public static final int MOVETO=46;
    public static final int MUL=47;
    public static final int NORTH=48;
    public static final int NOT=49;
    public static final int NOT_EQUAL=50;
    public static final int OBSTACLE=51;
    public static final int OFF=52;
    public static final int ON=53;
    public static final int OR=54;
    public static final int PICKOBJECT=55;
    public static final int PLUS=56;
    public static final int PROGRAM=57;
    public static final int READ=58;
    public static final int RELEASEOBJECT=59;
    public static final int RETURN=60;
    public static final int RGL=61;
    public static final int ROTATE=62;
    public static final int SOUTH=63;
    public static final int STOPROBOT=64;
    public static final int STRING=65;
    public static final int THEN=66;
    public static final int TRAIL=67;
    public static final int TRUE=68;
    public static final int WEND=69;
    public static final int WEST=70;
    public static final int WHILE=71;
    public static final int WRITE=72;
    public static final int WS=73;

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
    public String getGrammarFileName() { return "/dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:31:1: prog : ( actions )? main EOF -> ^( RGL ^( ACTIONLIST ( actions )? ) ^( INSTRLIST main ) ) ;
    public final RGLParser.prog_return prog() throws RecognitionException {
        RGLParser.prog_return retval = new RGLParser.prog_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token EOF3=null;
        RGLParser.actions_return actions1 =null;

        RGLParser.main_return main2 =null;


        RGLTree EOF3_tree=null;
        RewriteRuleTokenStream stream_EOF=new RewriteRuleTokenStream(adaptor,"token EOF");
        RewriteRuleSubtreeStream stream_actions=new RewriteRuleSubtreeStream(adaptor,"rule actions");
        RewriteRuleSubtreeStream stream_main=new RewriteRuleSubtreeStream(adaptor,"rule main");
        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:31:9: ( ( actions )? main EOF -> ^( RGL ^( ACTIONLIST ( actions )? ) ^( INSTRLIST main ) ) )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:31:11: ( actions )? main EOF
            {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:31:11: ( actions )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ACTIONS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:31:11: actions
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
            // elements: main, actions
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
                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:32:13: ^( RGL ^( ACTIONLIST ( actions )? ) ^( INSTRLIST main ) )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(RGL, "RGL")
                , root_1);

                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:32:19: ^( ACTIONLIST ( actions )? )
                {
                RGLTree root_2 = (RGLTree)adaptor.nil();
                root_2 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(ACTIONLIST, "ACTIONLIST")
                , root_2);

                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:32:32: ( actions )?
                if ( stream_actions.hasNext() ) {
                    adaptor.addChild(root_2, stream_actions.nextTree());

                }
                stream_actions.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:32:42: ^( INSTRLIST main )
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


    public static class actions_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "actions"
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:35:1: actions : ACTIONS ! ( declaration )* ENDACTIONS !;
    public final RGLParser.actions_return actions() throws RecognitionException {
        RGLParser.actions_return retval = new RGLParser.actions_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token ACTIONS4=null;
        Token ENDACTIONS6=null;
        RGLParser.declaration_return declaration5 =null;


        RGLTree ACTIONS4_tree=null;
        RGLTree ENDACTIONS6_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:35:9: ( ACTIONS ! ( declaration )* ENDACTIONS !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:35:11: ACTIONS ! ( declaration )* ENDACTIONS !
            {
            root_0 = (RGLTree)adaptor.nil();


            ACTIONS4=(Token)match(input,ACTIONS,FOLLOW_ACTIONS_in_actions208); 

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:35:20: ( declaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FUNC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:35:20: declaration
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "actions"


    public static class declaration_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:38:1: declaration : FUNC ! ID ^ argList ':' ! instrList ENDFUNC !;
    public final RGLParser.declaration_return declaration() throws RecognitionException {
        RGLParser.declaration_return retval = new RGLParser.declaration_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token FUNC7=null;
        Token ID8=null;
        Token char_literal10=null;
        Token ENDFUNC12=null;
        RGLParser.argList_return argList9 =null;

        RGLParser.instrList_return instrList11 =null;


        RGLTree FUNC7_tree=null;
        RGLTree ID8_tree=null;
        RGLTree char_literal10_tree=null;
        RGLTree ENDFUNC12_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:38:13: ( FUNC ! ID ^ argList ':' ! instrList ENDFUNC !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:38:15: FUNC ! ID ^ argList ':' ! instrList ENDFUNC !
            {
            root_0 = (RGLTree)adaptor.nil();


            FUNC7=(Token)match(input,FUNC,FOLLOW_FUNC_in_declaration232); 

            ID8=(Token)match(input,ID,FOLLOW_ID_in_declaration235); 
            ID8_tree = 
            (RGLTree)adaptor.create(ID8)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(ID8_tree, root_0);


            pushFollow(FOLLOW_argList_in_declaration238);
            argList9=argList();

            state._fsp--;

            adaptor.addChild(root_0, argList9.getTree());

            char_literal10=(Token)match(input,78,FOLLOW_78_in_declaration240); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class main_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "main"
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:41:1: main : BEGIN ! ( instr )+ END !;
    public final RGLParser.main_return main() throws RecognitionException {
        RGLParser.main_return retval = new RGLParser.main_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token BEGIN13=null;
        Token END15=null;
        RGLParser.instr_return instr14 =null;


        RGLTree BEGIN13_tree=null;
        RGLTree END15_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:41:9: ( BEGIN ! ( instr )+ END !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:41:11: BEGIN ! ( instr )+ END !
            {
            root_0 = (RGLTree)adaptor.nil();


            BEGIN13=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_main276); 

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:41:18: ( instr )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= BOX && LA3_0 <= CALL)||LA3_0==FACE||LA3_0==FOR||(LA3_0 >= ID && LA3_0 <= IF)||LA3_0==INITROBOT||LA3_0==MARK||(LA3_0 >= MOVEFORWARD && LA3_0 <= MOVETO)||LA3_0==OBSTACLE||LA3_0==PICKOBJECT||LA3_0==RELEASEOBJECT||LA3_0==ROTATE||LA3_0==STOPROBOT||LA3_0==TRAIL||LA3_0==WHILE) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:41:18: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_main279);
            	    instr14=instr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, instr14.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            END15=(Token)match(input,END,FOLLOW_END_in_main282); 

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


    public static class instr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instr"
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:44:1: instr : ( whileExpr | forExpr | ifExpr | CALL ! ID ^ ( numExpr ( ',' ! numExpr )* )? | ID '=' ^ numExpr | INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr | MOVEFORWARD ^ numExpr | STOPROBOT ^ numExpr | MOVETO ^ numExpr ',' ! numExpr | ROTATE ^ numExpr | FACE ^ direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE ^ numExpr ',' ! numExpr | BOX ^ numExpr ',' ! numExpr | TRAIL ^ ( boolExpr | ON | OFF ) | MARK ^ numExpr ',' ! numExpr );
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
        Token char_literal31=null;
        Token MOVEFORWARD33=null;
        Token STOPROBOT35=null;
        Token MOVETO37=null;
        Token char_literal39=null;
        Token ROTATE41=null;
        Token FACE43=null;
        Token PICKOBJECT45=null;
        Token RELEASEOBJECT46=null;
        Token OBSTACLE47=null;
        Token char_literal49=null;
        Token BOX51=null;
        Token char_literal53=null;
        Token TRAIL55=null;
        Token ON57=null;
        Token OFF58=null;
        Token MARK59=null;
        Token char_literal61=null;
        RGLParser.whileExpr_return whileExpr16 =null;

        RGLParser.forExpr_return forExpr17 =null;

        RGLParser.ifExpr_return ifExpr18 =null;

        RGLParser.numExpr_return numExpr21 =null;

        RGLParser.numExpr_return numExpr23 =null;

        RGLParser.numExpr_return numExpr26 =null;

        RGLParser.numExpr_return numExpr28 =null;

        RGLParser.numExpr_return numExpr30 =null;

        RGLParser.numExpr_return numExpr32 =null;

        RGLParser.numExpr_return numExpr34 =null;

        RGLParser.numExpr_return numExpr36 =null;

        RGLParser.numExpr_return numExpr38 =null;

        RGLParser.numExpr_return numExpr40 =null;

        RGLParser.numExpr_return numExpr42 =null;

        RGLParser.direction_return direction44 =null;

        RGLParser.numExpr_return numExpr48 =null;

        RGLParser.numExpr_return numExpr50 =null;

        RGLParser.numExpr_return numExpr52 =null;

        RGLParser.numExpr_return numExpr54 =null;

        RGLParser.boolExpr_return boolExpr56 =null;

        RGLParser.numExpr_return numExpr60 =null;

        RGLParser.numExpr_return numExpr62 =null;


        RGLTree CALL19_tree=null;
        RGLTree ID20_tree=null;
        RGLTree char_literal22_tree=null;
        RGLTree ID24_tree=null;
        RGLTree char_literal25_tree=null;
        RGLTree INITROBOT27_tree=null;
        RGLTree char_literal29_tree=null;
        RGLTree char_literal31_tree=null;
        RGLTree MOVEFORWARD33_tree=null;
        RGLTree STOPROBOT35_tree=null;
        RGLTree MOVETO37_tree=null;
        RGLTree char_literal39_tree=null;
        RGLTree ROTATE41_tree=null;
        RGLTree FACE43_tree=null;
        RGLTree PICKOBJECT45_tree=null;
        RGLTree RELEASEOBJECT46_tree=null;
        RGLTree OBSTACLE47_tree=null;
        RGLTree char_literal49_tree=null;
        RGLTree BOX51_tree=null;
        RGLTree char_literal53_tree=null;
        RGLTree TRAIL55_tree=null;
        RGLTree ON57_tree=null;
        RGLTree OFF58_tree=null;
        RGLTree MARK59_tree=null;
        RGLTree char_literal61_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:44:9: ( whileExpr | forExpr | ifExpr | CALL ! ID ^ ( numExpr ( ',' ! numExpr )* )? | ID '=' ^ numExpr | INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr | MOVEFORWARD ^ numExpr | STOPROBOT ^ numExpr | MOVETO ^ numExpr ',' ! numExpr | ROTATE ^ numExpr | FACE ^ direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE ^ numExpr ',' ! numExpr | BOX ^ numExpr ',' ! numExpr | TRAIL ^ ( boolExpr | ON | OFF ) | MARK ^ numExpr ',' ! numExpr )
            int alt7=17;
            switch ( input.LA(1) ) {
            case WHILE:
                {
                alt7=1;
                }
                break;
            case FOR:
                {
                alt7=2;
                }
                break;
            case IF:
                {
                alt7=3;
                }
                break;
            case CALL:
                {
                alt7=4;
                }
                break;
            case ID:
                {
                alt7=5;
                }
                break;
            case INITROBOT:
                {
                alt7=6;
                }
                break;
            case MOVEFORWARD:
                {
                alt7=7;
                }
                break;
            case STOPROBOT:
                {
                alt7=8;
                }
                break;
            case MOVETO:
                {
                alt7=9;
                }
                break;
            case ROTATE:
                {
                alt7=10;
                }
                break;
            case FACE:
                {
                alt7=11;
                }
                break;
            case PICKOBJECT:
                {
                alt7=12;
                }
                break;
            case RELEASEOBJECT:
                {
                alt7=13;
                }
                break;
            case OBSTACLE:
                {
                alt7=14;
                }
                break;
            case BOX:
                {
                alt7=15;
                }
                break;
            case TRAIL:
                {
                alt7=16;
                }
                break;
            case MARK:
                {
                alt7=17;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }

            switch (alt7) {
                case 1 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:46:9: whileExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_whileExpr_in_instr316);
                    whileExpr16=whileExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, whileExpr16.getTree());

                    }
                    break;
                case 2 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:46:21: forExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_forExpr_in_instr320);
                    forExpr17=forExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, forExpr17.getTree());

                    }
                    break;
                case 3 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:47:11: ifExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_ifExpr_in_instr357);
                    ifExpr18=ifExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, ifExpr18.getTree());

                    }
                    break;
                case 4 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:48:11: CALL ! ID ^ ( numExpr ( ',' ! numExpr )* )?
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    CALL19=(Token)match(input,CALL,FOLLOW_CALL_in_instr405); 

                    ID20=(Token)match(input,ID,FOLLOW_ID_in_instr408); 
                    ID20_tree = 
                    (RGLTree)adaptor.create(ID20)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(ID20_tree, root_0);


                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:48:21: ( numExpr ( ',' ! numExpr )* )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( ((LA5_0 >= GETPOSX && LA5_0 <= GETPOSY)||LA5_0==INT||LA5_0==MINUS||LA5_0==PLUS||LA5_0==74) ) {
                        alt5=1;
                    }
                    else if ( (LA5_0==ID) ) {
                        int LA5_2 = input.LA(2);

                        if ( ((LA5_2 >= BOX && LA5_2 <= CALL)||LA5_2==DIV||(LA5_2 >= ELSE && LA5_2 <= END)||(LA5_2 >= ENDFUNC && LA5_2 <= ENDIF)||LA5_2==FACE||(LA5_2 >= FEND && LA5_2 <= FOR)||(LA5_2 >= ID && LA5_2 <= IF)||LA5_2==INITROBOT||(LA5_2 >= MARK && LA5_2 <= MUL)||LA5_2==OBSTACLE||(LA5_2 >= PICKOBJECT && LA5_2 <= PLUS)||LA5_2==RELEASEOBJECT||LA5_2==ROTATE||LA5_2==STOPROBOT||LA5_2==TRAIL||LA5_2==WEND||LA5_2==WHILE||LA5_2==76) ) {
                            alt5=1;
                        }
                    }
                    switch (alt5) {
                        case 1 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:48:22: numExpr ( ',' ! numExpr )*
                            {
                            pushFollow(FOLLOW_numExpr_in_instr412);
                            numExpr21=numExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, numExpr21.getTree());

                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:48:30: ( ',' ! numExpr )*
                            loop4:
                            do {
                                int alt4=2;
                                int LA4_0 = input.LA(1);

                                if ( (LA4_0==76) ) {
                                    alt4=1;
                                }


                                switch (alt4) {
                            	case 1 :
                            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:48:31: ',' ! numExpr
                            	    {
                            	    char_literal22=(Token)match(input,76,FOLLOW_76_in_instr415); 

                            	    pushFollow(FOLLOW_numExpr_in_instr418);
                            	    numExpr23=numExpr();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, numExpr23.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop4;
                                }
                            } while (true);


                            }
                            break;

                    }


                    }
                    break;
                case 5 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:49:11: ID '=' ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ID24=(Token)match(input,ID,FOLLOW_ID_in_instr440); 
                    ID24_tree = 
                    (RGLTree)adaptor.create(ID24)
                    ;
                    adaptor.addChild(root_0, ID24_tree);


                    char_literal25=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instr442); 
                    char_literal25_tree = 
                    (RGLTree)adaptor.create(char_literal25)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal25_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr445);
                    numExpr26=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr26.getTree());

                    }
                    break;
                case 6 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:52:11: INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    INITROBOT27=(Token)match(input,INITROBOT,FOLLOW_INITROBOT_in_instr502); 
                    INITROBOT27_tree = 
                    (RGLTree)adaptor.create(INITROBOT27)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(INITROBOT27_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr505);
                    numExpr28=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr28.getTree());

                    char_literal29=(Token)match(input,76,FOLLOW_76_in_instr507); 

                    pushFollow(FOLLOW_numExpr_in_instr510);
                    numExpr30=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr30.getTree());

                    char_literal31=(Token)match(input,76,FOLLOW_76_in_instr512); 

                    pushFollow(FOLLOW_numExpr_in_instr515);
                    numExpr32=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr32.getTree());

                    }
                    break;
                case 7 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:53:11: MOVEFORWARD ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MOVEFORWARD33=(Token)match(input,MOVEFORWARD,FOLLOW_MOVEFORWARD_in_instr529); 
                    MOVEFORWARD33_tree = 
                    (RGLTree)adaptor.create(MOVEFORWARD33)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVEFORWARD33_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr532);
                    numExpr34=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr34.getTree());

                    }
                    break;
                case 8 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:54:11: STOPROBOT ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    STOPROBOT35=(Token)match(input,STOPROBOT,FOLLOW_STOPROBOT_in_instr544); 
                    STOPROBOT35_tree = 
                    (RGLTree)adaptor.create(STOPROBOT35)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(STOPROBOT35_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr547);
                    numExpr36=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr36.getTree());

                    }
                    break;
                case 9 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:55:11: MOVETO ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MOVETO37=(Token)match(input,MOVETO,FOLLOW_MOVETO_in_instr559); 
                    MOVETO37_tree = 
                    (RGLTree)adaptor.create(MOVETO37)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVETO37_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr562);
                    numExpr38=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr38.getTree());

                    char_literal39=(Token)match(input,76,FOLLOW_76_in_instr564); 

                    pushFollow(FOLLOW_numExpr_in_instr567);
                    numExpr40=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr40.getTree());

                    }
                    break;
                case 10 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:56:11: ROTATE ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ROTATE41=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_instr579); 
                    ROTATE41_tree = 
                    (RGLTree)adaptor.create(ROTATE41)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(ROTATE41_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr582);
                    numExpr42=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr42.getTree());

                    }
                    break;
                case 11 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:57:11: FACE ^ direction
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    FACE43=(Token)match(input,FACE,FOLLOW_FACE_in_instr594); 
                    FACE43_tree = 
                    (RGLTree)adaptor.create(FACE43)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(FACE43_tree, root_0);


                    pushFollow(FOLLOW_direction_in_instr597);
                    direction44=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction44.getTree());

                    }
                    break;
                case 12 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:58:11: PICKOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    PICKOBJECT45=(Token)match(input,PICKOBJECT,FOLLOW_PICKOBJECT_in_instr609); 
                    PICKOBJECT45_tree = 
                    (RGLTree)adaptor.create(PICKOBJECT45)
                    ;
                    adaptor.addChild(root_0, PICKOBJECT45_tree);


                    }
                    break;
                case 13 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:59:11: RELEASEOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    RELEASEOBJECT46=(Token)match(input,RELEASEOBJECT,FOLLOW_RELEASEOBJECT_in_instr621); 
                    RELEASEOBJECT46_tree = 
                    (RGLTree)adaptor.create(RELEASEOBJECT46)
                    ;
                    adaptor.addChild(root_0, RELEASEOBJECT46_tree);


                    }
                    break;
                case 14 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:60:11: OBSTACLE ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    OBSTACLE47=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_instr633); 
                    OBSTACLE47_tree = 
                    (RGLTree)adaptor.create(OBSTACLE47)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(OBSTACLE47_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr636);
                    numExpr48=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr48.getTree());

                    char_literal49=(Token)match(input,76,FOLLOW_76_in_instr638); 

                    pushFollow(FOLLOW_numExpr_in_instr641);
                    numExpr50=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr50.getTree());

                    }
                    break;
                case 15 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:61:11: BOX ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    BOX51=(Token)match(input,BOX,FOLLOW_BOX_in_instr653); 
                    BOX51_tree = 
                    (RGLTree)adaptor.create(BOX51)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(BOX51_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr656);
                    numExpr52=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr52.getTree());

                    char_literal53=(Token)match(input,76,FOLLOW_76_in_instr658); 

                    pushFollow(FOLLOW_numExpr_in_instr661);
                    numExpr54=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr54.getTree());

                    }
                    break;
                case 16 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:62:11: TRAIL ^ ( boolExpr | ON | OFF )
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    TRAIL55=(Token)match(input,TRAIL,FOLLOW_TRAIL_in_instr673); 
                    TRAIL55_tree = 
                    (RGLTree)adaptor.create(TRAIL55)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(TRAIL55_tree, root_0);


                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:62:18: ( boolExpr | ON | OFF )
                    int alt6=3;
                    switch ( input.LA(1) ) {
                    case DETECT:
                    case FALSE:
                    case GETPOSX:
                    case GETPOSY:
                    case ID:
                    case INT:
                    case MINUS:
                    case NOT:
                    case PLUS:
                    case TRUE:
                    case 74:
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
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:62:19: boolExpr
                            {
                            pushFollow(FOLLOW_boolExpr_in_instr677);
                            boolExpr56=boolExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, boolExpr56.getTree());

                            }
                            break;
                        case 2 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:62:30: ON
                            {
                            ON57=(Token)match(input,ON,FOLLOW_ON_in_instr681); 
                            ON57_tree = 
                            (RGLTree)adaptor.create(ON57)
                            ;
                            adaptor.addChild(root_0, ON57_tree);


                            }
                            break;
                        case 3 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:62:35: OFF
                            {
                            OFF58=(Token)match(input,OFF,FOLLOW_OFF_in_instr685); 
                            OFF58_tree = 
                            (RGLTree)adaptor.create(OFF58)
                            ;
                            adaptor.addChild(root_0, OFF58_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 17 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:63:11: MARK ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MARK59=(Token)match(input,MARK,FOLLOW_MARK_in_instr698); 
                    MARK59_tree = 
                    (RGLTree)adaptor.create(MARK59)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MARK59_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr701);
                    numExpr60=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr60.getTree());

                    char_literal61=(Token)match(input,76,FOLLOW_76_in_instr703); 

                    pushFollow(FOLLOW_numExpr_in_instr706);
                    numExpr62=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr62.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:66:1: argList : ( args )? -> ^( ARGLIST ( args )? ) ;
    public final RGLParser.argList_return argList() throws RecognitionException {
        RGLParser.argList_return retval = new RGLParser.argList_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.args_return args63 =null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:66:9: ( ( args )? -> ^( ARGLIST ( args )? ) )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:66:11: ( args )?
            {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:66:11: ( args )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==ID||LA8_0==INT) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:66:11: args
                    {
                    pushFollow(FOLLOW_args_in_argList723);
                    args63=args();

                    state._fsp--;

                    stream_args.add(args63.getTree());

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
            // 66:17: -> ^( ARGLIST ( args )? )
            {
                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:66:20: ^( ARGLIST ( args )? )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_1);

                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:66:30: ( args )?
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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:68:1: args : arg ( ',' ! arg )* ;
    public final RGLParser.args_return args() throws RecognitionException {
        RGLParser.args_return retval = new RGLParser.args_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal65=null;
        RGLParser.arg_return arg64 =null;

        RGLParser.arg_return arg66 =null;


        RGLTree char_literal65_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:68:9: ( arg ( ',' ! arg )* )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:68:11: arg ( ',' ! arg )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_arg_in_args752);
            arg64=arg();

            state._fsp--;

            adaptor.addChild(root_0, arg64.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:68:15: ( ',' ! arg )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==76) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:68:16: ',' ! arg
            	    {
            	    char_literal65=(Token)match(input,76,FOLLOW_76_in_args755); 

            	    pushFollow(FOLLOW_arg_in_args758);
            	    arg66=arg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arg66.getTree());

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
    // $ANTLR end "args"


    public static class arg_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arg"
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:71:1: arg : ( ID | INT );
    public final RGLParser.arg_return arg() throws RecognitionException {
        RGLParser.arg_return retval = new RGLParser.arg_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set67=null;

        RGLTree set67_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:71:9: ( ID | INT )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set67=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set67)
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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:74:1: instrList : ( instr )* -> ^( INSTRLIST ( instr )* ) ;
    public final RGLParser.instrList_return instrList() throws RecognitionException {
        RGLParser.instrList_return retval = new RGLParser.instrList_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.instr_return instr68 =null;


        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:74:13: ( ( instr )* -> ^( INSTRLIST ( instr )* ) )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:74:15: ( instr )*
            {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:74:15: ( instr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= BOX && LA10_0 <= CALL)||LA10_0==FACE||LA10_0==FOR||(LA10_0 >= ID && LA10_0 <= IF)||LA10_0==INITROBOT||LA10_0==MARK||(LA10_0 >= MOVEFORWARD && LA10_0 <= MOVETO)||LA10_0==OBSTACLE||LA10_0==PICKOBJECT||LA10_0==RELEASEOBJECT||LA10_0==ROTATE||LA10_0==STOPROBOT||LA10_0==TRAIL||LA10_0==WHILE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:74:15: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_instrList804);
            	    instr68=instr();

            	    state._fsp--;

            	    stream_instr.add(instr68.getTree());

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
                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:74:26: ^( INSTRLIST ( instr )* )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(INSTRLIST, "INSTRLIST")
                , root_1);

                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:74:38: ( instr )*
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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:77:1: whileExpr : WHILE ^ boolExpr DO ! instrList WEND !;
    public final RGLParser.whileExpr_return whileExpr() throws RecognitionException {
        RGLParser.whileExpr_return retval = new RGLParser.whileExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token WHILE69=null;
        Token DO71=null;
        Token WEND73=null;
        RGLParser.boolExpr_return boolExpr70 =null;

        RGLParser.instrList_return instrList72 =null;


        RGLTree WHILE69_tree=null;
        RGLTree DO71_tree=null;
        RGLTree WEND73_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:77:13: ( WHILE ^ boolExpr DO ! instrList WEND !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:77:15: WHILE ^ boolExpr DO ! instrList WEND !
            {
            root_0 = (RGLTree)adaptor.nil();


            WHILE69=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExpr860); 
            WHILE69_tree = 
            (RGLTree)adaptor.create(WHILE69)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(WHILE69_tree, root_0);


            pushFollow(FOLLOW_boolExpr_in_whileExpr863);
            boolExpr70=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr70.getTree());

            DO71=(Token)match(input,DO,FOLLOW_DO_in_whileExpr865); 

            pushFollow(FOLLOW_instrList_in_whileExpr868);
            instrList72=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList72.getTree());

            WEND73=(Token)match(input,WEND,FOLLOW_WEND_in_whileExpr870); 

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:80:1: forExpr : FOR ^ ID IN ! INT '..' ! INT DO ! instrList FEND !;
    public final RGLParser.forExpr_return forExpr() throws RecognitionException {
        RGLParser.forExpr_return retval = new RGLParser.forExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token FOR74=null;
        Token ID75=null;
        Token IN76=null;
        Token INT77=null;
        Token string_literal78=null;
        Token INT79=null;
        Token DO80=null;
        Token FEND82=null;
        RGLParser.instrList_return instrList81 =null;


        RGLTree FOR74_tree=null;
        RGLTree ID75_tree=null;
        RGLTree IN76_tree=null;
        RGLTree INT77_tree=null;
        RGLTree string_literal78_tree=null;
        RGLTree INT79_tree=null;
        RGLTree DO80_tree=null;
        RGLTree FEND82_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:80:13: ( FOR ^ ID IN ! INT '..' ! INT DO ! instrList FEND !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:80:15: FOR ^ ID IN ! INT '..' ! INT DO ! instrList FEND !
            {
            root_0 = (RGLTree)adaptor.nil();


            FOR74=(Token)match(input,FOR,FOLLOW_FOR_in_forExpr908); 
            FOR74_tree = 
            (RGLTree)adaptor.create(FOR74)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(FOR74_tree, root_0);


            ID75=(Token)match(input,ID,FOLLOW_ID_in_forExpr911); 
            ID75_tree = 
            (RGLTree)adaptor.create(ID75)
            ;
            adaptor.addChild(root_0, ID75_tree);


            IN76=(Token)match(input,IN,FOLLOW_IN_in_forExpr913); 

            INT77=(Token)match(input,INT,FOLLOW_INT_in_forExpr916); 
            INT77_tree = 
            (RGLTree)adaptor.create(INT77)
            ;
            adaptor.addChild(root_0, INT77_tree);


            string_literal78=(Token)match(input,77,FOLLOW_77_in_forExpr918); 

            INT79=(Token)match(input,INT,FOLLOW_INT_in_forExpr921); 
            INT79_tree = 
            (RGLTree)adaptor.create(INT79)
            ;
            adaptor.addChild(root_0, INT79_tree);


            DO80=(Token)match(input,DO,FOLLOW_DO_in_forExpr923); 

            pushFollow(FOLLOW_instrList_in_forExpr926);
            instrList81=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList81.getTree());

            FEND82=(Token)match(input,FEND,FOLLOW_FEND_in_forExpr928); 

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:83:1: ifExpr : IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !;
    public final RGLParser.ifExpr_return ifExpr() throws RecognitionException {
        RGLParser.ifExpr_return retval = new RGLParser.ifExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token IF83=null;
        Token THEN85=null;
        Token ELSE87=null;
        Token ENDIF89=null;
        RGLParser.boolExpr_return boolExpr84 =null;

        RGLParser.instrList_return instrList86 =null;

        RGLParser.instrList_return instrList88 =null;


        RGLTree IF83_tree=null;
        RGLTree THEN85_tree=null;
        RGLTree ELSE87_tree=null;
        RGLTree ENDIF89_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:83:13: ( IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:83:15: IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !
            {
            root_0 = (RGLTree)adaptor.nil();


            IF83=(Token)match(input,IF,FOLLOW_IF_in_ifExpr967); 
            IF83_tree = 
            (RGLTree)adaptor.create(IF83)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(IF83_tree, root_0);


            pushFollow(FOLLOW_boolExpr_in_ifExpr970);
            boolExpr84=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr84.getTree());

            THEN85=(Token)match(input,THEN,FOLLOW_THEN_in_ifExpr972); 

            pushFollow(FOLLOW_instrList_in_ifExpr975);
            instrList86=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList86.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:83:44: ( ELSE ! instrList )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:83:45: ELSE ! instrList
                    {
                    ELSE87=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifExpr978); 

                    pushFollow(FOLLOW_instrList_in_ifExpr981);
                    instrList88=instrList();

                    state._fsp--;

                    adaptor.addChild(root_0, instrList88.getTree());

                    }
                    break;

            }


            ENDIF89=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExpr985); 

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:86:1: boolExpr : boolterm ( OR ^ boolterm )* ;
    public final RGLParser.boolExpr_return boolExpr() throws RecognitionException {
        RGLParser.boolExpr_return retval = new RGLParser.boolExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token OR91=null;
        RGLParser.boolterm_return boolterm90 =null;

        RGLParser.boolterm_return boolterm92 =null;


        RGLTree OR91_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:86:13: ( boolterm ( OR ^ boolterm )* )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:86:15: boolterm ( OR ^ boolterm )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolExpr1010);
            boolterm90=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm90.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:86:24: ( OR ^ boolterm )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:86:25: OR ^ boolterm
            	    {
            	    OR91=(Token)match(input,OR,FOLLOW_OR_in_boolExpr1013); 
            	    OR91_tree = 
            	    (RGLTree)adaptor.create(OR91)
            	    ;
            	    root_0 = (RGLTree)adaptor.becomeRoot(OR91_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolExpr1016);
            	    boolterm92=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm92.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:89:1: boolterm : ( NOT ^)? boolfact ( AND ^ boolfact )* ;
    public final RGLParser.boolterm_return boolterm() throws RecognitionException {
        RGLParser.boolterm_return retval = new RGLParser.boolterm_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token NOT93=null;
        Token AND95=null;
        RGLParser.boolfact_return boolfact94 =null;

        RGLParser.boolfact_return boolfact96 =null;


        RGLTree NOT93_tree=null;
        RGLTree AND95_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:89:13: ( ( NOT ^)? boolfact ( AND ^ boolfact )* )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:89:15: ( NOT ^)? boolfact ( AND ^ boolfact )*
            {
            root_0 = (RGLTree)adaptor.nil();


            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:89:15: ( NOT ^)?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NOT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:89:16: NOT ^
                    {
                    NOT93=(Token)match(input,NOT,FOLLOW_NOT_in_boolterm1055); 
                    NOT93_tree = 
                    (RGLTree)adaptor.create(NOT93)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(NOT93_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_boolfact_in_boolterm1060);
            boolfact94=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact94.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:89:32: ( AND ^ boolfact )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:89:33: AND ^ boolfact
            	    {
            	    AND95=(Token)match(input,AND,FOLLOW_AND_in_boolterm1063); 
            	    AND95_tree = 
            	    (RGLTree)adaptor.create(AND95)
            	    ;
            	    root_0 = (RGLTree)adaptor.becomeRoot(AND95_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1066);
            	    boolfact96=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact96.getTree());

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
    // $ANTLR end "boolterm"


    public static class boolfact_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "boolfact"
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:1: boolfact : ( numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr | TRUE | FALSE | DETECT ^ numExpr );
    public final RGLParser.boolfact_return boolfact() throws RecognitionException {
        RGLParser.boolfact_return retval = new RGLParser.boolfact_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token string_literal98=null;
        Token string_literal99=null;
        Token char_literal100=null;
        Token string_literal101=null;
        Token char_literal102=null;
        Token string_literal103=null;
        Token TRUE105=null;
        Token FALSE106=null;
        Token DETECT107=null;
        RGLParser.numExpr_return numExpr97 =null;

        RGLParser.numExpr_return numExpr104 =null;

        RGLParser.numExpr_return numExpr108 =null;


        RGLTree string_literal98_tree=null;
        RGLTree string_literal99_tree=null;
        RGLTree char_literal100_tree=null;
        RGLTree string_literal101_tree=null;
        RGLTree char_literal102_tree=null;
        RGLTree string_literal103_tree=null;
        RGLTree TRUE105_tree=null;
        RGLTree FALSE106_tree=null;
        RGLTree DETECT107_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:13: ( numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr | TRUE | FALSE | DETECT ^ numExpr )
            int alt16=4;
            switch ( input.LA(1) ) {
            case GETPOSX:
            case GETPOSY:
            case ID:
            case INT:
            case MINUS:
            case PLUS:
            case 74:
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
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:15: numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_numExpr_in_boolfact1104);
                    numExpr97=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr97.getTree());

                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:23: ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^)
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
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:24: '==' ^
                            {
                            string_literal98=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_boolfact1107); 
                            string_literal98_tree = 
                            (RGLTree)adaptor.create(string_literal98)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal98_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:32: '!=' ^
                            {
                            string_literal99=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1112); 
                            string_literal99_tree = 
                            (RGLTree)adaptor.create(string_literal99)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal99_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:40: '<' ^
                            {
                            char_literal100=(Token)match(input,LT,FOLLOW_LT_in_boolfact1117); 
                            char_literal100_tree = 
                            (RGLTree)adaptor.create(char_literal100)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal100_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:47: '<=' ^
                            {
                            string_literal101=(Token)match(input,LE,FOLLOW_LE_in_boolfact1122); 
                            string_literal101_tree = 
                            (RGLTree)adaptor.create(string_literal101)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal101_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:55: '>' ^
                            {
                            char_literal102=(Token)match(input,GT,FOLLOW_GT_in_boolfact1127); 
                            char_literal102_tree = 
                            (RGLTree)adaptor.create(char_literal102)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal102_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:62: '>=' ^
                            {
                            string_literal103=(Token)match(input,GE,FOLLOW_GE_in_boolfact1132); 
                            string_literal103_tree = 
                            (RGLTree)adaptor.create(string_literal103)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal103_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_numExpr_in_boolfact1136);
                    numExpr104=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr104.getTree());

                    }
                    break;
                case 2 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:93:15: TRUE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    TRUE105=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolfact1152); 
                    TRUE105_tree = 
                    (RGLTree)adaptor.create(TRUE105)
                    ;
                    adaptor.addChild(root_0, TRUE105_tree);


                    }
                    break;
                case 3 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:93:22: FALSE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    FALSE106=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolfact1156); 
                    FALSE106_tree = 
                    (RGLTree)adaptor.create(FALSE106)
                    ;
                    adaptor.addChild(root_0, FALSE106_tree);


                    }
                    break;
                case 4 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:94:15: DETECT ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    DETECT107=(Token)match(input,DETECT,FOLLOW_DETECT_in_boolfact1172); 
                    DETECT107_tree = 
                    (RGLTree)adaptor.create(DETECT107)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(DETECT107_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_boolfact1175);
                    numExpr108=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr108.getTree());

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
    // $ANTLR end "boolfact"


    public static class numExpr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "numExpr"
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:97:1: numExpr : term ( ( '+' ^| '-' ^) term )* ;
    public final RGLParser.numExpr_return numExpr() throws RecognitionException {
        RGLParser.numExpr_return retval = new RGLParser.numExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal110=null;
        Token char_literal111=null;
        RGLParser.term_return term109 =null;

        RGLParser.term_return term112 =null;


        RGLTree char_literal110_tree=null;
        RGLTree char_literal111_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:97:9: ( term ( ( '+' ^| '-' ^) term )* )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:97:11: term ( ( '+' ^| '-' ^) term )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_numExpr1196);
            term109=term();

            state._fsp--;

            adaptor.addChild(root_0, term109.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:97:16: ( ( '+' ^| '-' ^) term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:97:18: ( '+' ^| '-' ^) term
            	    {
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:97:18: ( '+' ^| '-' ^)
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
            	            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:97:19: '+' ^
            	            {
            	            char_literal110=(Token)match(input,PLUS,FOLLOW_PLUS_in_numExpr1201); 
            	            char_literal110_tree = 
            	            (RGLTree)adaptor.create(char_literal110)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal110_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:97:26: '-' ^
            	            {
            	            char_literal111=(Token)match(input,MINUS,FOLLOW_MINUS_in_numExpr1206); 
            	            char_literal111_tree = 
            	            (RGLTree)adaptor.create(char_literal111)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal111_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_numExpr1210);
            	    term112=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term112.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:100:1: term : factor ( ( '*' ^| '/' ^| '%' ^) factor )* ;
    public final RGLParser.term_return term() throws RecognitionException {
        RGLParser.term_return retval = new RGLParser.term_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal114=null;
        Token char_literal115=null;
        Token char_literal116=null;
        RGLParser.factor_return factor113 =null;

        RGLParser.factor_return factor117 =null;


        RGLTree char_literal114_tree=null;
        RGLTree char_literal115_tree=null;
        RGLTree char_literal116_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:100:9: ( factor ( ( '*' ^| '/' ^| '%' ^) factor )* )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:100:11: factor ( ( '*' ^| '/' ^| '%' ^) factor )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1232);
            factor113=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor113.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:100:18: ( ( '*' ^| '/' ^| '%' ^) factor )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DIV||LA20_0==MOD||LA20_0==MUL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:100:20: ( '*' ^| '/' ^| '%' ^) factor
            	    {
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:100:20: ( '*' ^| '/' ^| '%' ^)
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
            	            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:100:21: '*' ^
            	            {
            	            char_literal114=(Token)match(input,MUL,FOLLOW_MUL_in_term1237); 
            	            char_literal114_tree = 
            	            (RGLTree)adaptor.create(char_literal114)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal114_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:100:28: '/' ^
            	            {
            	            char_literal115=(Token)match(input,DIV,FOLLOW_DIV_in_term1242); 
            	            char_literal115_tree = 
            	            (RGLTree)adaptor.create(char_literal115)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal115_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:100:35: '%' ^
            	            {
            	            char_literal116=(Token)match(input,MOD,FOLLOW_MOD_in_term1247); 
            	            char_literal116_tree = 
            	            (RGLTree)adaptor.create(char_literal116)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal116_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1251);
            	    factor117=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor117.getTree());

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
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:103:1: factor : ( '+' ^| '-' ^)? atom ;
    public final RGLParser.factor_return factor() throws RecognitionException {
        RGLParser.factor_return retval = new RGLParser.factor_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal118=null;
        Token char_literal119=null;
        RGLParser.atom_return atom120 =null;


        RGLTree char_literal118_tree=null;
        RGLTree char_literal119_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:103:9: ( ( '+' ^| '-' ^)? atom )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:103:11: ( '+' ^| '-' ^)? atom
            {
            root_0 = (RGLTree)adaptor.nil();


            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:103:11: ( '+' ^| '-' ^)?
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
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:103:12: '+' ^
                    {
                    char_literal118=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1272); 
                    char_literal118_tree = 
                    (RGLTree)adaptor.create(char_literal118)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal118_tree, root_0);


                    }
                    break;
                case 2 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:103:19: '-' ^
                    {
                    char_literal119=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1277); 
                    char_literal119_tree = 
                    (RGLTree)adaptor.create(char_literal119)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal119_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1282);
            atom120=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom120.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:106:1: atom : ( INT | ID | GETPOSX | GETPOSY | '(' ! numExpr ')' !);
    public final RGLParser.atom_return atom() throws RecognitionException {
        RGLParser.atom_return retval = new RGLParser.atom_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token INT121=null;
        Token ID122=null;
        Token GETPOSX123=null;
        Token GETPOSY124=null;
        Token char_literal125=null;
        Token char_literal127=null;
        RGLParser.numExpr_return numExpr126 =null;


        RGLTree INT121_tree=null;
        RGLTree ID122_tree=null;
        RGLTree GETPOSX123_tree=null;
        RGLTree GETPOSY124_tree=null;
        RGLTree char_literal125_tree=null;
        RGLTree char_literal127_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:106:9: ( INT | ID | GETPOSX | GETPOSY | '(' ! numExpr ')' !)
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
            case 74:
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
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:106:11: INT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    INT121=(Token)match(input,INT,FOLLOW_INT_in_atom1302); 
                    INT121_tree = 
                    (RGLTree)adaptor.create(INT121)
                    ;
                    adaptor.addChild(root_0, INT121_tree);


                    }
                    break;
                case 2 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:107:11: ID
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ID122=(Token)match(input,ID,FOLLOW_ID_in_atom1314); 
                    ID122_tree = 
                    (RGLTree)adaptor.create(ID122)
                    ;
                    adaptor.addChild(root_0, ID122_tree);


                    }
                    break;
                case 3 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:108:11: GETPOSX
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GETPOSX123=(Token)match(input,GETPOSX,FOLLOW_GETPOSX_in_atom1326); 
                    GETPOSX123_tree = 
                    (RGLTree)adaptor.create(GETPOSX123)
                    ;
                    adaptor.addChild(root_0, GETPOSX123_tree);


                    }
                    break;
                case 4 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:109:11: GETPOSY
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GETPOSY124=(Token)match(input,GETPOSY,FOLLOW_GETPOSY_in_atom1338); 
                    GETPOSY124_tree = 
                    (RGLTree)adaptor.create(GETPOSY124)
                    ;
                    adaptor.addChild(root_0, GETPOSY124_tree);


                    }
                    break;
                case 5 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:110:11: '(' ! numExpr ')' !
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    char_literal125=(Token)match(input,74,FOLLOW_74_in_atom1350); 

                    pushFollow(FOLLOW_numExpr_in_atom1353);
                    numExpr126=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr126.getTree());

                    char_literal127=(Token)match(input,75,FOLLOW_75_in_atom1355); 

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:113:1: direction : ( NORTH | SOUTH | EAST | WEST );
    public final RGLParser.direction_return direction() throws RecognitionException {
        RGLParser.direction_return retval = new RGLParser.direction_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set128=null;

        RGLTree set128_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:113:13: ( NORTH | SOUTH | EAST | WEST )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set128=(Token)input.LT(1);

            if ( input.LA(1)==EAST||input.LA(1)==NORTH||input.LA(1)==SOUTH||input.LA(1)==WEST ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set128)
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

    // Delegated rules


 

    public static final BitSet FOLLOW_actions_in_prog158 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_main_in_prog161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIONS_in_actions208 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_declaration_in_actions211 = new BitSet(new long[]{0x0000000020080000L});
    public static final BitSet FOLLOW_ENDACTIONS_in_actions214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_declaration232 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_declaration235 = new BitSet(new long[]{0x0000008400000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_argList_in_declaration238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000004000L});
    public static final BitSet FOLLOW_78_in_declaration240 = new BitSet(new long[]{0x4888642C12100C00L,0x0000000000000089L});
    public static final BitSet FOLLOW_instrList_in_declaration243 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ENDFUNC_in_declaration245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_main276 = new BitSet(new long[]{0x4888642C12000C00L,0x0000000000000089L});
    public static final BitSet FOLLOW_instr_in_main279 = new BitSet(new long[]{0x4888642C12040C00L,0x0000000000000089L});
    public static final BitSet FOLLOW_END_in_main282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExpr_in_instr316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExpr_in_instr320 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_instr357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_instr405 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_instr408 = new BitSet(new long[]{0x0100088580000002L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr412 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_instr415 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr418 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_ID_in_instr440 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_EQUAL_in_instr442 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITROBOT_in_instr502 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr505 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_instr507 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr510 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_instr512 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr515 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEFORWARD_in_instr529 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPROBOT_in_instr544 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVETO_in_instr559 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_instr564 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr567 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_instr579 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr582 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_instr594 = new BitSet(new long[]{0x8001000000010000L,0x0000000000000040L});
    public static final BitSet FOLLOW_direction_in_instr597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICKOBJECT_in_instr609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASEOBJECT_in_instr621 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_instr633 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr636 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_instr638 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOX_in_instr653 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_instr658 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRAIL_in_instr673 = new BitSet(new long[]{0x0132088584002000L,0x0000000000000410L});
    public static final BitSet FOLLOW_boolExpr_in_instr677 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_instr681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFF_in_instr685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARK_in_instr698 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr701 = new BitSet(new long[]{0x0000000000000000L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_instr703 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_instr706 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_argList723 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args752 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_76_in_args755 = new BitSet(new long[]{0x0000008400000000L});
    public static final BitSet FOLLOW_arg_in_args758 = new BitSet(new long[]{0x0000000000000002L,0x0000000000001000L});
    public static final BitSet FOLLOW_instr_in_instrList804 = new BitSet(new long[]{0x4888642C12000C02L,0x0000000000000089L});
    public static final BitSet FOLLOW_WHILE_in_whileExpr860 = new BitSet(new long[]{0x0102088584002000L,0x0000000000000410L});
    public static final BitSet FOLLOW_boolExpr_in_whileExpr863 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DO_in_whileExpr865 = new BitSet(new long[]{0x4888642C12000C00L,0x00000000000000A9L});
    public static final BitSet FOLLOW_instrList_in_whileExpr868 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_WEND_in_whileExpr870 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forExpr908 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_ID_in_forExpr911 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_IN_in_forExpr913 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_forExpr916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000002000L});
    public static final BitSet FOLLOW_77_in_forExpr918 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_INT_in_forExpr921 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DO_in_forExpr923 = new BitSet(new long[]{0x4888642C1A000C00L,0x0000000000000089L});
    public static final BitSet FOLLOW_instrList_in_forExpr926 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_FEND_in_forExpr928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr967 = new BitSet(new long[]{0x0102088584002000L,0x0000000000000410L});
    public static final BitSet FOLLOW_boolExpr_in_ifExpr970 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_THEN_in_ifExpr972 = new BitSet(new long[]{0x4888642C12220C00L,0x0000000000000089L});
    public static final BitSet FOLLOW_instrList_in_ifExpr975 = new BitSet(new long[]{0x0000000000220000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr978 = new BitSet(new long[]{0x4888642C12200C00L,0x0000000000000089L});
    public static final BitSet FOLLOW_instrList_in_ifExpr981 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDIF_in_ifExpr985 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1010 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_OR_in_boolExpr1013 = new BitSet(new long[]{0x0102088584002000L,0x0000000000000410L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1016 = new BitSet(new long[]{0x0040000000000002L});
    public static final BitSet FOLLOW_NOT_in_boolterm1055 = new BitSet(new long[]{0x0100088584002000L,0x0000000000000410L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1060 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_boolterm1063 = new BitSet(new long[]{0x0100088584002000L,0x0000000000000410L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1066 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_numExpr_in_boolfact1104 = new BitSet(new long[]{0x0004030240800000L});
    public static final BitSet FOLLOW_EQUALS_in_boolfact1107 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1112 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LT_in_boolfact1117 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_LE_in_boolfact1122 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_GT_in_boolfact1127 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_GE_in_boolfact1132 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_boolfact1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolfact1152 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolfact1156 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETECT_in_boolfact1172 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_boolfact1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_numExpr1196 = new BitSet(new long[]{0x0100080000000002L});
    public static final BitSet FOLLOW_PLUS_in_numExpr1201 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_MINUS_in_numExpr1206 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_term_in_numExpr1210 = new BitSet(new long[]{0x0100080000000002L});
    public static final BitSet FOLLOW_factor_in_term1232 = new BitSet(new long[]{0x0000900000004002L});
    public static final BitSet FOLLOW_MUL_in_term1237 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_DIV_in_term1242 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_MOD_in_term1247 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_factor_in_term1251 = new BitSet(new long[]{0x0000900000004002L});
    public static final BitSet FOLLOW_PLUS_in_factor1272 = new BitSet(new long[]{0x0000008580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_MINUS_in_factor1277 = new BitSet(new long[]{0x0000008580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_atom_in_factor1282 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1302 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSX_in_atom1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSY_in_atom1338 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_atom1350 = new BitSet(new long[]{0x0100088580000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_numExpr_in_atom1353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_75_in_atom1355 = new BitSet(new long[]{0x0000000000000002L});

}