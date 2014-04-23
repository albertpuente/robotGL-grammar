// $ANTLR 3.4 /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g 2014-04-23 09:41:05

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTIONLIST", "ACTIONS", "AND", "ARGLIST", "ASSIGN", "BEGIN", "BOX", "CALL", "COMMENT", "DETECT", "DIV", "DO", "ELSE", "END", "ENDACTIONS", "ENDFUNC", "ENDIF", "EQUAL", "EQUALS", "ESC_SEQ", "FALSE", "FEND", "FOR", "FUNC", "GE", "GETPOSX", "GETPOSY", "GT", "ID", "IF", "IN", "INITROBOT", "INSTRLIST", "INT", "LE", "LT", "MARK", "MINUS", "MOD", "MOVEFORWARD", "MOVETO", "MUL", "NOT", "NOT_EQUAL", "OBSTACLE", "OFF", "ON", "OR", "PICKOBJECT", "PLUS", "PROGRAM", "READ", "RELEASEOBJECT", "RETURN", "RGL", "ROTATE", "STOPROBOT", "STRING", "THEN", "TRAIL", "TRUE", "WEND", "WHILE", "WRITE", "WS", "'('", "')'", "','", "'..'", "':'"
    };

    public static final int EOF=-1;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
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
    public static final int ELSE=16;
    public static final int END=17;
    public static final int ENDACTIONS=18;
    public static final int ENDFUNC=19;
    public static final int ENDIF=20;
    public static final int EQUAL=21;
    public static final int EQUALS=22;
    public static final int ESC_SEQ=23;
    public static final int FALSE=24;
    public static final int FEND=25;
    public static final int FOR=26;
    public static final int FUNC=27;
    public static final int GE=28;
    public static final int GETPOSX=29;
    public static final int GETPOSY=30;
    public static final int GT=31;
    public static final int ID=32;
    public static final int IF=33;
    public static final int IN=34;
    public static final int INITROBOT=35;
    public static final int INSTRLIST=36;
    public static final int INT=37;
    public static final int LE=38;
    public static final int LT=39;
    public static final int MARK=40;
    public static final int MINUS=41;
    public static final int MOD=42;
    public static final int MOVEFORWARD=43;
    public static final int MOVETO=44;
    public static final int MUL=45;
    public static final int NOT=46;
    public static final int NOT_EQUAL=47;
    public static final int OBSTACLE=48;
    public static final int OFF=49;
    public static final int ON=50;
    public static final int OR=51;
    public static final int PICKOBJECT=52;
    public static final int PLUS=53;
    public static final int PROGRAM=54;
    public static final int READ=55;
    public static final int RELEASEOBJECT=56;
    public static final int RETURN=57;
    public static final int RGL=58;
    public static final int ROTATE=59;
    public static final int STOPROBOT=60;
    public static final int STRING=61;
    public static final int THEN=62;
    public static final int TRAIL=63;
    public static final int TRUE=64;
    public static final int WEND=65;
    public static final int WHILE=66;
    public static final int WRITE=67;
    public static final int WS=68;

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:38:1: declaration : FUNC ! ID ^ ( argList )? ':' ! instrList ENDFUNC !;
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
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:38:13: ( FUNC ! ID ^ ( argList )? ':' ! instrList ENDFUNC !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:38:15: FUNC ! ID ^ ( argList )? ':' ! instrList ENDFUNC !
            {
            root_0 = (RGLTree)adaptor.nil();


            FUNC7=(Token)match(input,FUNC,FOLLOW_FUNC_in_declaration232); 

            ID8=(Token)match(input,ID,FOLLOW_ID_in_declaration235); 
            ID8_tree = 
            (RGLTree)adaptor.create(ID8)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(ID8_tree, root_0);


            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:38:25: ( argList )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==ID||LA3_0==INT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:38:25: argList
                    {
                    pushFollow(FOLLOW_argList_in_declaration238);
                    argList9=argList();

                    state._fsp--;

                    adaptor.addChild(root_0, argList9.getTree());

                    }
                    break;

            }


            char_literal10=(Token)match(input,73,FOLLOW_73_in_declaration241); 

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:41:1: main : BEGIN ! ( instr )* END !;
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
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:41:9: ( BEGIN ! ( instr )* END !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:41:11: BEGIN ! ( instr )* END !
            {
            root_0 = (RGLTree)adaptor.nil();


            BEGIN13=(Token)match(input,BEGIN,FOLLOW_BEGIN_in_main277); 

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:41:18: ( instr )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= BOX && LA4_0 <= CALL)||LA4_0==FOR||(LA4_0 >= ID && LA4_0 <= IF)||LA4_0==INITROBOT||LA4_0==MARK||(LA4_0 >= MOVEFORWARD && LA4_0 <= MOVETO)||LA4_0==OBSTACLE||LA4_0==PICKOBJECT||LA4_0==RELEASEOBJECT||(LA4_0 >= ROTATE && LA4_0 <= STOPROBOT)||LA4_0==TRAIL||LA4_0==WHILE) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:41:18: instr
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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:44:1: instr : ( whileExpr | forExpr | ifExpr | CALL ! ID ^ ( numExpr ( ',' ! numExpr )* )? | ID '=' ^ numExpr | INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr | MOVEFORWARD ^ numExpr | STOPROBOT ^ numExpr | MOVETO ^ numExpr ',' ! numExpr | ROTATE ^ numExpr | PICKOBJECT | RELEASEOBJECT | OBSTACLE ^ numExpr ',' ! numExpr | BOX ^ numExpr ',' ! numExpr | TRAIL ^ ( boolExpr | ON | OFF ) | MARK ^ numExpr ',' ! numExpr );
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
        Token PICKOBJECT43=null;
        Token RELEASEOBJECT44=null;
        Token OBSTACLE45=null;
        Token char_literal47=null;
        Token BOX49=null;
        Token char_literal51=null;
        Token TRAIL53=null;
        Token ON55=null;
        Token OFF56=null;
        Token MARK57=null;
        Token char_literal59=null;
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

        RGLParser.numExpr_return numExpr46 =null;

        RGLParser.numExpr_return numExpr48 =null;

        RGLParser.numExpr_return numExpr50 =null;

        RGLParser.numExpr_return numExpr52 =null;

        RGLParser.boolExpr_return boolExpr54 =null;

        RGLParser.numExpr_return numExpr58 =null;

        RGLParser.numExpr_return numExpr60 =null;


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
        RGLTree PICKOBJECT43_tree=null;
        RGLTree RELEASEOBJECT44_tree=null;
        RGLTree OBSTACLE45_tree=null;
        RGLTree char_literal47_tree=null;
        RGLTree BOX49_tree=null;
        RGLTree char_literal51_tree=null;
        RGLTree TRAIL53_tree=null;
        RGLTree ON55_tree=null;
        RGLTree OFF56_tree=null;
        RGLTree MARK57_tree=null;
        RGLTree char_literal59_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:44:9: ( whileExpr | forExpr | ifExpr | CALL ! ID ^ ( numExpr ( ',' ! numExpr )* )? | ID '=' ^ numExpr | INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr | MOVEFORWARD ^ numExpr | STOPROBOT ^ numExpr | MOVETO ^ numExpr ',' ! numExpr | ROTATE ^ numExpr | PICKOBJECT | RELEASEOBJECT | OBSTACLE ^ numExpr ',' ! numExpr | BOX ^ numExpr ',' ! numExpr | TRAIL ^ ( boolExpr | ON | OFF ) | MARK ^ numExpr ',' ! numExpr )
            int alt8=16;
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
            case PICKOBJECT:
                {
                alt8=11;
                }
                break;
            case RELEASEOBJECT:
                {
                alt8=12;
                }
                break;
            case OBSTACLE:
                {
                alt8=13;
                }
                break;
            case BOX:
                {
                alt8=14;
                }
                break;
            case TRAIL:
                {
                alt8=15;
                }
                break;
            case MARK:
                {
                alt8=16;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:46:9: whileExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_whileExpr_in_instr317);
                    whileExpr16=whileExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, whileExpr16.getTree());

                    }
                    break;
                case 2 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:46:21: forExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_forExpr_in_instr321);
                    forExpr17=forExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, forExpr17.getTree());

                    }
                    break;
                case 3 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:47:11: ifExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_ifExpr_in_instr358);
                    ifExpr18=ifExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, ifExpr18.getTree());

                    }
                    break;
                case 4 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:48:11: CALL ! ID ^ ( numExpr ( ',' ! numExpr )* )?
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    CALL19=(Token)match(input,CALL,FOLLOW_CALL_in_instr406); 

                    ID20=(Token)match(input,ID,FOLLOW_ID_in_instr409); 
                    ID20_tree = 
                    (RGLTree)adaptor.create(ID20)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(ID20_tree, root_0);


                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:48:21: ( numExpr ( ',' ! numExpr )* )?
                    int alt6=2;
                    int LA6_0 = input.LA(1);

                    if ( ((LA6_0 >= GETPOSX && LA6_0 <= GETPOSY)||LA6_0==INT||LA6_0==MINUS||LA6_0==PLUS||LA6_0==69) ) {
                        alt6=1;
                    }
                    else if ( (LA6_0==ID) ) {
                        int LA6_2 = input.LA(2);

                        if ( ((LA6_2 >= BOX && LA6_2 <= CALL)||LA6_2==DIV||(LA6_2 >= ELSE && LA6_2 <= END)||(LA6_2 >= ENDFUNC && LA6_2 <= ENDIF)||(LA6_2 >= FEND && LA6_2 <= FOR)||(LA6_2 >= ID && LA6_2 <= IF)||LA6_2==INITROBOT||(LA6_2 >= MARK && LA6_2 <= MUL)||LA6_2==OBSTACLE||(LA6_2 >= PICKOBJECT && LA6_2 <= PLUS)||LA6_2==RELEASEOBJECT||(LA6_2 >= ROTATE && LA6_2 <= STOPROBOT)||LA6_2==TRAIL||(LA6_2 >= WEND && LA6_2 <= WHILE)||LA6_2==71) ) {
                            alt6=1;
                        }
                    }
                    switch (alt6) {
                        case 1 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:48:22: numExpr ( ',' ! numExpr )*
                            {
                            pushFollow(FOLLOW_numExpr_in_instr413);
                            numExpr21=numExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, numExpr21.getTree());

                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:48:30: ( ',' ! numExpr )*
                            loop5:
                            do {
                                int alt5=2;
                                int LA5_0 = input.LA(1);

                                if ( (LA5_0==71) ) {
                                    alt5=1;
                                }


                                switch (alt5) {
                            	case 1 :
                            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:48:31: ',' ! numExpr
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
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:49:11: ID '=' ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ID24=(Token)match(input,ID,FOLLOW_ID_in_instr441); 
                    ID24_tree = 
                    (RGLTree)adaptor.create(ID24)
                    ;
                    adaptor.addChild(root_0, ID24_tree);


                    char_literal25=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instr443); 
                    char_literal25_tree = 
                    (RGLTree)adaptor.create(char_literal25)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal25_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr446);
                    numExpr26=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr26.getTree());

                    }
                    break;
                case 6 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:52:11: INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    INITROBOT27=(Token)match(input,INITROBOT,FOLLOW_INITROBOT_in_instr503); 
                    INITROBOT27_tree = 
                    (RGLTree)adaptor.create(INITROBOT27)
                    ;
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

                    char_literal31=(Token)match(input,71,FOLLOW_71_in_instr513); 

                    pushFollow(FOLLOW_numExpr_in_instr516);
                    numExpr32=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr32.getTree());

                    }
                    break;
                case 7 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:53:11: MOVEFORWARD ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MOVEFORWARD33=(Token)match(input,MOVEFORWARD,FOLLOW_MOVEFORWARD_in_instr530); 
                    MOVEFORWARD33_tree = 
                    (RGLTree)adaptor.create(MOVEFORWARD33)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVEFORWARD33_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr533);
                    numExpr34=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr34.getTree());

                    }
                    break;
                case 8 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:54:11: STOPROBOT ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    STOPROBOT35=(Token)match(input,STOPROBOT,FOLLOW_STOPROBOT_in_instr545); 
                    STOPROBOT35_tree = 
                    (RGLTree)adaptor.create(STOPROBOT35)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(STOPROBOT35_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr548);
                    numExpr36=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr36.getTree());

                    }
                    break;
                case 9 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:55:11: MOVETO ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MOVETO37=(Token)match(input,MOVETO,FOLLOW_MOVETO_in_instr560); 
                    MOVETO37_tree = 
                    (RGLTree)adaptor.create(MOVETO37)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVETO37_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr563);
                    numExpr38=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr38.getTree());

                    char_literal39=(Token)match(input,71,FOLLOW_71_in_instr565); 

                    pushFollow(FOLLOW_numExpr_in_instr568);
                    numExpr40=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr40.getTree());

                    }
                    break;
                case 10 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:56:11: ROTATE ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ROTATE41=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_instr580); 
                    ROTATE41_tree = 
                    (RGLTree)adaptor.create(ROTATE41)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(ROTATE41_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr583);
                    numExpr42=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr42.getTree());

                    }
                    break;
                case 11 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:57:11: PICKOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    PICKOBJECT43=(Token)match(input,PICKOBJECT,FOLLOW_PICKOBJECT_in_instr595); 
                    PICKOBJECT43_tree = 
                    (RGLTree)adaptor.create(PICKOBJECT43)
                    ;
                    adaptor.addChild(root_0, PICKOBJECT43_tree);


                    }
                    break;
                case 12 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:58:11: RELEASEOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    RELEASEOBJECT44=(Token)match(input,RELEASEOBJECT,FOLLOW_RELEASEOBJECT_in_instr607); 
                    RELEASEOBJECT44_tree = 
                    (RGLTree)adaptor.create(RELEASEOBJECT44)
                    ;
                    adaptor.addChild(root_0, RELEASEOBJECT44_tree);


                    }
                    break;
                case 13 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:59:11: OBSTACLE ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    OBSTACLE45=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_instr619); 
                    OBSTACLE45_tree = 
                    (RGLTree)adaptor.create(OBSTACLE45)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(OBSTACLE45_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr622);
                    numExpr46=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr46.getTree());

                    char_literal47=(Token)match(input,71,FOLLOW_71_in_instr624); 

                    pushFollow(FOLLOW_numExpr_in_instr627);
                    numExpr48=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr48.getTree());

                    }
                    break;
                case 14 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:60:11: BOX ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    BOX49=(Token)match(input,BOX,FOLLOW_BOX_in_instr639); 
                    BOX49_tree = 
                    (RGLTree)adaptor.create(BOX49)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(BOX49_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr642);
                    numExpr50=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr50.getTree());

                    char_literal51=(Token)match(input,71,FOLLOW_71_in_instr644); 

                    pushFollow(FOLLOW_numExpr_in_instr647);
                    numExpr52=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr52.getTree());

                    }
                    break;
                case 15 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:61:11: TRAIL ^ ( boolExpr | ON | OFF )
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    TRAIL53=(Token)match(input,TRAIL,FOLLOW_TRAIL_in_instr659); 
                    TRAIL53_tree = 
                    (RGLTree)adaptor.create(TRAIL53)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(TRAIL53_tree, root_0);


                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:61:18: ( boolExpr | ON | OFF )
                    int alt7=3;
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
                    case 69:
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
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:61:19: boolExpr
                            {
                            pushFollow(FOLLOW_boolExpr_in_instr663);
                            boolExpr54=boolExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, boolExpr54.getTree());

                            }
                            break;
                        case 2 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:61:30: ON
                            {
                            ON55=(Token)match(input,ON,FOLLOW_ON_in_instr667); 
                            ON55_tree = 
                            (RGLTree)adaptor.create(ON55)
                            ;
                            adaptor.addChild(root_0, ON55_tree);


                            }
                            break;
                        case 3 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:61:35: OFF
                            {
                            OFF56=(Token)match(input,OFF,FOLLOW_OFF_in_instr671); 
                            OFF56_tree = 
                            (RGLTree)adaptor.create(OFF56)
                            ;
                            adaptor.addChild(root_0, OFF56_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 16 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:62:11: MARK ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MARK57=(Token)match(input,MARK,FOLLOW_MARK_in_instr684); 
                    MARK57_tree = 
                    (RGLTree)adaptor.create(MARK57)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MARK57_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr687);
                    numExpr58=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr58.getTree());

                    char_literal59=(Token)match(input,71,FOLLOW_71_in_instr689); 

                    pushFollow(FOLLOW_numExpr_in_instr692);
                    numExpr60=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr60.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:65:1: argList : args -> ^( ARGLIST args ) ;
    public final RGLParser.argList_return argList() throws RecognitionException {
        RGLParser.argList_return retval = new RGLParser.argList_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.args_return args61 =null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:65:9: ( args -> ^( ARGLIST args ) )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:65:11: args
            {
            pushFollow(FOLLOW_args_in_argList709);
            args61=args();

            state._fsp--;

            stream_args.add(args61.getTree());

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
            // 65:16: -> ^( ARGLIST args )
            {
                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:65:19: ^( ARGLIST args )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_1);

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:67:1: args : arg ( ',' ! arg )* ;
    public final RGLParser.args_return args() throws RecognitionException {
        RGLParser.args_return retval = new RGLParser.args_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal63=null;
        RGLParser.arg_return arg62 =null;

        RGLParser.arg_return arg64 =null;


        RGLTree char_literal63_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:67:9: ( arg ( ',' ! arg )* )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:67:11: arg ( ',' ! arg )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_arg_in_args736);
            arg62=arg();

            state._fsp--;

            adaptor.addChild(root_0, arg62.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:67:15: ( ',' ! arg )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==71) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:67:16: ',' ! arg
            	    {
            	    char_literal63=(Token)match(input,71,FOLLOW_71_in_args739); 

            	    pushFollow(FOLLOW_arg_in_args742);
            	    arg64=arg();

            	    state._fsp--;

            	    adaptor.addChild(root_0, arg64.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:70:1: arg : ( ID | INT );
    public final RGLParser.arg_return arg() throws RecognitionException {
        RGLParser.arg_return retval = new RGLParser.arg_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set65=null;

        RGLTree set65_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:70:9: ( ID | INT )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set65=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==INT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set65)
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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:73:1: instrList : ( instr )* -> ^( INSTRLIST ( instr )* ) ;
    public final RGLParser.instrList_return instrList() throws RecognitionException {
        RGLParser.instrList_return retval = new RGLParser.instrList_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.instr_return instr66 =null;


        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:73:13: ( ( instr )* -> ^( INSTRLIST ( instr )* ) )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:73:15: ( instr )*
            {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:73:15: ( instr )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( ((LA10_0 >= BOX && LA10_0 <= CALL)||LA10_0==FOR||(LA10_0 >= ID && LA10_0 <= IF)||LA10_0==INITROBOT||LA10_0==MARK||(LA10_0 >= MOVEFORWARD && LA10_0 <= MOVETO)||LA10_0==OBSTACLE||LA10_0==PICKOBJECT||LA10_0==RELEASEOBJECT||(LA10_0 >= ROTATE && LA10_0 <= STOPROBOT)||LA10_0==TRAIL||LA10_0==WHILE) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:73:15: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_instrList788);
            	    instr66=instr();

            	    state._fsp--;

            	    stream_instr.add(instr66.getTree());

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
            // 73:23: -> ^( INSTRLIST ( instr )* )
            {
                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:73:26: ^( INSTRLIST ( instr )* )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(INSTRLIST, "INSTRLIST")
                , root_1);

                // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:73:38: ( instr )*
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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:76:1: whileExpr : WHILE ^ boolExpr DO ! instrList WEND !;
    public final RGLParser.whileExpr_return whileExpr() throws RecognitionException {
        RGLParser.whileExpr_return retval = new RGLParser.whileExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token WHILE67=null;
        Token DO69=null;
        Token WEND71=null;
        RGLParser.boolExpr_return boolExpr68 =null;

        RGLParser.instrList_return instrList70 =null;


        RGLTree WHILE67_tree=null;
        RGLTree DO69_tree=null;
        RGLTree WEND71_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:76:13: ( WHILE ^ boolExpr DO ! instrList WEND !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:76:15: WHILE ^ boolExpr DO ! instrList WEND !
            {
            root_0 = (RGLTree)adaptor.nil();


            WHILE67=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExpr844); 
            WHILE67_tree = 
            (RGLTree)adaptor.create(WHILE67)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(WHILE67_tree, root_0);


            pushFollow(FOLLOW_boolExpr_in_whileExpr847);
            boolExpr68=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr68.getTree());

            DO69=(Token)match(input,DO,FOLLOW_DO_in_whileExpr849); 

            pushFollow(FOLLOW_instrList_in_whileExpr852);
            instrList70=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList70.getTree());

            WEND71=(Token)match(input,WEND,FOLLOW_WEND_in_whileExpr854); 

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:79:1: forExpr : FOR ^ ID IN ! INT '..' ! INT DO ! instrList FEND !;
    public final RGLParser.forExpr_return forExpr() throws RecognitionException {
        RGLParser.forExpr_return retval = new RGLParser.forExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token FOR72=null;
        Token ID73=null;
        Token IN74=null;
        Token INT75=null;
        Token string_literal76=null;
        Token INT77=null;
        Token DO78=null;
        Token FEND80=null;
        RGLParser.instrList_return instrList79 =null;


        RGLTree FOR72_tree=null;
        RGLTree ID73_tree=null;
        RGLTree IN74_tree=null;
        RGLTree INT75_tree=null;
        RGLTree string_literal76_tree=null;
        RGLTree INT77_tree=null;
        RGLTree DO78_tree=null;
        RGLTree FEND80_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:79:13: ( FOR ^ ID IN ! INT '..' ! INT DO ! instrList FEND !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:79:15: FOR ^ ID IN ! INT '..' ! INT DO ! instrList FEND !
            {
            root_0 = (RGLTree)adaptor.nil();


            FOR72=(Token)match(input,FOR,FOLLOW_FOR_in_forExpr892); 
            FOR72_tree = 
            (RGLTree)adaptor.create(FOR72)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(FOR72_tree, root_0);


            ID73=(Token)match(input,ID,FOLLOW_ID_in_forExpr895); 
            ID73_tree = 
            (RGLTree)adaptor.create(ID73)
            ;
            adaptor.addChild(root_0, ID73_tree);


            IN74=(Token)match(input,IN,FOLLOW_IN_in_forExpr897); 

            INT75=(Token)match(input,INT,FOLLOW_INT_in_forExpr900); 
            INT75_tree = 
            (RGLTree)adaptor.create(INT75)
            ;
            adaptor.addChild(root_0, INT75_tree);


            string_literal76=(Token)match(input,72,FOLLOW_72_in_forExpr902); 

            INT77=(Token)match(input,INT,FOLLOW_INT_in_forExpr905); 
            INT77_tree = 
            (RGLTree)adaptor.create(INT77)
            ;
            adaptor.addChild(root_0, INT77_tree);


            DO78=(Token)match(input,DO,FOLLOW_DO_in_forExpr907); 

            pushFollow(FOLLOW_instrList_in_forExpr910);
            instrList79=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList79.getTree());

            FEND80=(Token)match(input,FEND,FOLLOW_FEND_in_forExpr912); 

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:82:1: ifExpr : IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !;
    public final RGLParser.ifExpr_return ifExpr() throws RecognitionException {
        RGLParser.ifExpr_return retval = new RGLParser.ifExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token IF81=null;
        Token THEN83=null;
        Token ELSE85=null;
        Token ENDIF87=null;
        RGLParser.boolExpr_return boolExpr82 =null;

        RGLParser.instrList_return instrList84 =null;

        RGLParser.instrList_return instrList86 =null;


        RGLTree IF81_tree=null;
        RGLTree THEN83_tree=null;
        RGLTree ELSE85_tree=null;
        RGLTree ENDIF87_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:82:13: ( IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !)
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:82:15: IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !
            {
            root_0 = (RGLTree)adaptor.nil();


            IF81=(Token)match(input,IF,FOLLOW_IF_in_ifExpr951); 
            IF81_tree = 
            (RGLTree)adaptor.create(IF81)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(IF81_tree, root_0);


            pushFollow(FOLLOW_boolExpr_in_ifExpr954);
            boolExpr82=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr82.getTree());

            THEN83=(Token)match(input,THEN,FOLLOW_THEN_in_ifExpr956); 

            pushFollow(FOLLOW_instrList_in_ifExpr959);
            instrList84=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList84.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:82:44: ( ELSE ! instrList )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:82:45: ELSE ! instrList
                    {
                    ELSE85=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifExpr962); 

                    pushFollow(FOLLOW_instrList_in_ifExpr965);
                    instrList86=instrList();

                    state._fsp--;

                    adaptor.addChild(root_0, instrList86.getTree());

                    }
                    break;

            }


            ENDIF87=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExpr969); 

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:85:1: boolExpr : boolterm ( OR ^ boolterm )* ;
    public final RGLParser.boolExpr_return boolExpr() throws RecognitionException {
        RGLParser.boolExpr_return retval = new RGLParser.boolExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token OR89=null;
        RGLParser.boolterm_return boolterm88 =null;

        RGLParser.boolterm_return boolterm90 =null;


        RGLTree OR89_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:85:13: ( boolterm ( OR ^ boolterm )* )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:85:15: boolterm ( OR ^ boolterm )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolExpr994);
            boolterm88=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm88.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:85:24: ( OR ^ boolterm )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:85:25: OR ^ boolterm
            	    {
            	    OR89=(Token)match(input,OR,FOLLOW_OR_in_boolExpr997); 
            	    OR89_tree = 
            	    (RGLTree)adaptor.create(OR89)
            	    ;
            	    root_0 = (RGLTree)adaptor.becomeRoot(OR89_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolExpr1000);
            	    boolterm90=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm90.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:88:1: boolterm : ( NOT ^)? boolfact ( AND ^ boolfact )* ;
    public final RGLParser.boolterm_return boolterm() throws RecognitionException {
        RGLParser.boolterm_return retval = new RGLParser.boolterm_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token NOT91=null;
        Token AND93=null;
        RGLParser.boolfact_return boolfact92 =null;

        RGLParser.boolfact_return boolfact94 =null;


        RGLTree NOT91_tree=null;
        RGLTree AND93_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:88:13: ( ( NOT ^)? boolfact ( AND ^ boolfact )* )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:88:15: ( NOT ^)? boolfact ( AND ^ boolfact )*
            {
            root_0 = (RGLTree)adaptor.nil();


            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:88:15: ( NOT ^)?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==NOT) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:88:16: NOT ^
                    {
                    NOT91=(Token)match(input,NOT,FOLLOW_NOT_in_boolterm1039); 
                    NOT91_tree = 
                    (RGLTree)adaptor.create(NOT91)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(NOT91_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_boolfact_in_boolterm1044);
            boolfact92=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact92.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:88:32: ( AND ^ boolfact )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==AND) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:88:33: AND ^ boolfact
            	    {
            	    AND93=(Token)match(input,AND,FOLLOW_AND_in_boolterm1047); 
            	    AND93_tree = 
            	    (RGLTree)adaptor.create(AND93)
            	    ;
            	    root_0 = (RGLTree)adaptor.becomeRoot(AND93_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1050);
            	    boolfact94=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact94.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:91:1: boolfact : ( numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr | TRUE | FALSE | DETECT ^ numExpr );
    public final RGLParser.boolfact_return boolfact() throws RecognitionException {
        RGLParser.boolfact_return retval = new RGLParser.boolfact_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token string_literal96=null;
        Token string_literal97=null;
        Token char_literal98=null;
        Token string_literal99=null;
        Token char_literal100=null;
        Token string_literal101=null;
        Token TRUE103=null;
        Token FALSE104=null;
        Token DETECT105=null;
        RGLParser.numExpr_return numExpr95 =null;

        RGLParser.numExpr_return numExpr102 =null;

        RGLParser.numExpr_return numExpr106 =null;


        RGLTree string_literal96_tree=null;
        RGLTree string_literal97_tree=null;
        RGLTree char_literal98_tree=null;
        RGLTree string_literal99_tree=null;
        RGLTree char_literal100_tree=null;
        RGLTree string_literal101_tree=null;
        RGLTree TRUE103_tree=null;
        RGLTree FALSE104_tree=null;
        RGLTree DETECT105_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:91:13: ( numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr | TRUE | FALSE | DETECT ^ numExpr )
            int alt16=4;
            switch ( input.LA(1) ) {
            case GETPOSX:
            case GETPOSY:
            case ID:
            case INT:
            case MINUS:
            case PLUS:
            case 69:
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
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:91:15: numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_numExpr_in_boolfact1088);
                    numExpr95=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr95.getTree());

                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:91:23: ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^)
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
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:91:24: '==' ^
                            {
                            string_literal96=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_boolfact1091); 
                            string_literal96_tree = 
                            (RGLTree)adaptor.create(string_literal96)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal96_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:91:32: '!=' ^
                            {
                            string_literal97=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolfact1096); 
                            string_literal97_tree = 
                            (RGLTree)adaptor.create(string_literal97)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal97_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:91:40: '<' ^
                            {
                            char_literal98=(Token)match(input,LT,FOLLOW_LT_in_boolfact1101); 
                            char_literal98_tree = 
                            (RGLTree)adaptor.create(char_literal98)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal98_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:91:47: '<=' ^
                            {
                            string_literal99=(Token)match(input,LE,FOLLOW_LE_in_boolfact1106); 
                            string_literal99_tree = 
                            (RGLTree)adaptor.create(string_literal99)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal99_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:91:55: '>' ^
                            {
                            char_literal100=(Token)match(input,GT,FOLLOW_GT_in_boolfact1111); 
                            char_literal100_tree = 
                            (RGLTree)adaptor.create(char_literal100)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal100_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:91:62: '>=' ^
                            {
                            string_literal101=(Token)match(input,GE,FOLLOW_GE_in_boolfact1116); 
                            string_literal101_tree = 
                            (RGLTree)adaptor.create(string_literal101)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal101_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_numExpr_in_boolfact1120);
                    numExpr102=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr102.getTree());

                    }
                    break;
                case 2 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:15: TRUE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    TRUE103=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolfact1136); 
                    TRUE103_tree = 
                    (RGLTree)adaptor.create(TRUE103)
                    ;
                    adaptor.addChild(root_0, TRUE103_tree);


                    }
                    break;
                case 3 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:92:22: FALSE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    FALSE104=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolfact1140); 
                    FALSE104_tree = 
                    (RGLTree)adaptor.create(FALSE104)
                    ;
                    adaptor.addChild(root_0, FALSE104_tree);


                    }
                    break;
                case 4 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:93:15: DETECT ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    DETECT105=(Token)match(input,DETECT,FOLLOW_DETECT_in_boolfact1156); 
                    DETECT105_tree = 
                    (RGLTree)adaptor.create(DETECT105)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(DETECT105_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_boolfact1159);
                    numExpr106=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr106.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:96:1: numExpr : term ( ( '+' ^| '-' ^) term )* ;
    public final RGLParser.numExpr_return numExpr() throws RecognitionException {
        RGLParser.numExpr_return retval = new RGLParser.numExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal108=null;
        Token char_literal109=null;
        RGLParser.term_return term107 =null;

        RGLParser.term_return term110 =null;


        RGLTree char_literal108_tree=null;
        RGLTree char_literal109_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:96:9: ( term ( ( '+' ^| '-' ^) term )* )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:96:11: term ( ( '+' ^| '-' ^) term )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_numExpr1180);
            term107=term();

            state._fsp--;

            adaptor.addChild(root_0, term107.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:96:16: ( ( '+' ^| '-' ^) term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:96:18: ( '+' ^| '-' ^) term
            	    {
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:96:18: ( '+' ^| '-' ^)
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
            	            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:96:19: '+' ^
            	            {
            	            char_literal108=(Token)match(input,PLUS,FOLLOW_PLUS_in_numExpr1185); 
            	            char_literal108_tree = 
            	            (RGLTree)adaptor.create(char_literal108)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal108_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:96:26: '-' ^
            	            {
            	            char_literal109=(Token)match(input,MINUS,FOLLOW_MINUS_in_numExpr1190); 
            	            char_literal109_tree = 
            	            (RGLTree)adaptor.create(char_literal109)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal109_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_numExpr1194);
            	    term110=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term110.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:99:1: term : factor ( ( '*' ^| '/' ^| '%' ^) factor )* ;
    public final RGLParser.term_return term() throws RecognitionException {
        RGLParser.term_return retval = new RGLParser.term_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal112=null;
        Token char_literal113=null;
        Token char_literal114=null;
        RGLParser.factor_return factor111 =null;

        RGLParser.factor_return factor115 =null;


        RGLTree char_literal112_tree=null;
        RGLTree char_literal113_tree=null;
        RGLTree char_literal114_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:99:9: ( factor ( ( '*' ^| '/' ^| '%' ^) factor )* )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:99:11: factor ( ( '*' ^| '/' ^| '%' ^) factor )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1216);
            factor111=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor111.getTree());

            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:99:18: ( ( '*' ^| '/' ^| '%' ^) factor )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DIV||LA20_0==MOD||LA20_0==MUL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:99:20: ( '*' ^| '/' ^| '%' ^) factor
            	    {
            	    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:99:20: ( '*' ^| '/' ^| '%' ^)
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
            	            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:99:21: '*' ^
            	            {
            	            char_literal112=(Token)match(input,MUL,FOLLOW_MUL_in_term1221); 
            	            char_literal112_tree = 
            	            (RGLTree)adaptor.create(char_literal112)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal112_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:99:28: '/' ^
            	            {
            	            char_literal113=(Token)match(input,DIV,FOLLOW_DIV_in_term1226); 
            	            char_literal113_tree = 
            	            (RGLTree)adaptor.create(char_literal113)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal113_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:99:35: '%' ^
            	            {
            	            char_literal114=(Token)match(input,MOD,FOLLOW_MOD_in_term1231); 
            	            char_literal114_tree = 
            	            (RGLTree)adaptor.create(char_literal114)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal114_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1235);
            	    factor115=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor115.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:102:1: factor : ( '+' ^| '-' ^)? atom ;
    public final RGLParser.factor_return factor() throws RecognitionException {
        RGLParser.factor_return retval = new RGLParser.factor_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal116=null;
        Token char_literal117=null;
        RGLParser.atom_return atom118 =null;


        RGLTree char_literal116_tree=null;
        RGLTree char_literal117_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:102:9: ( ( '+' ^| '-' ^)? atom )
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:102:11: ( '+' ^| '-' ^)? atom
            {
            root_0 = (RGLTree)adaptor.nil();


            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:102:11: ( '+' ^| '-' ^)?
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
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:102:12: '+' ^
                    {
                    char_literal116=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1256); 
                    char_literal116_tree = 
                    (RGLTree)adaptor.create(char_literal116)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal116_tree, root_0);


                    }
                    break;
                case 2 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:102:19: '-' ^
                    {
                    char_literal117=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1261); 
                    char_literal117_tree = 
                    (RGLTree)adaptor.create(char_literal117)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal117_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1266);
            atom118=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom118.getTree());

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
    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:105:1: atom : ( INT | ID | GETPOSX | GETPOSY | '(' ! numExpr ')' !);
    public final RGLParser.atom_return atom() throws RecognitionException {
        RGLParser.atom_return retval = new RGLParser.atom_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token INT119=null;
        Token ID120=null;
        Token GETPOSX121=null;
        Token GETPOSY122=null;
        Token char_literal123=null;
        Token char_literal125=null;
        RGLParser.numExpr_return numExpr124 =null;


        RGLTree INT119_tree=null;
        RGLTree ID120_tree=null;
        RGLTree GETPOSX121_tree=null;
        RGLTree GETPOSY122_tree=null;
        RGLTree char_literal123_tree=null;
        RGLTree char_literal125_tree=null;

        try {
            // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:105:9: ( INT | ID | GETPOSX | GETPOSY | '(' ! numExpr ')' !)
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
            case 69:
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
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:105:11: INT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    INT119=(Token)match(input,INT,FOLLOW_INT_in_atom1286); 
                    INT119_tree = 
                    (RGLTree)adaptor.create(INT119)
                    ;
                    adaptor.addChild(root_0, INT119_tree);


                    }
                    break;
                case 2 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:106:11: ID
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ID120=(Token)match(input,ID,FOLLOW_ID_in_atom1298); 
                    ID120_tree = 
                    (RGLTree)adaptor.create(ID120)
                    ;
                    adaptor.addChild(root_0, ID120_tree);


                    }
                    break;
                case 3 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:107:11: GETPOSX
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GETPOSX121=(Token)match(input,GETPOSX,FOLLOW_GETPOSX_in_atom1310); 
                    GETPOSX121_tree = 
                    (RGLTree)adaptor.create(GETPOSX121)
                    ;
                    adaptor.addChild(root_0, GETPOSX121_tree);


                    }
                    break;
                case 4 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:108:11: GETPOSY
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GETPOSY122=(Token)match(input,GETPOSY,FOLLOW_GETPOSY_in_atom1322); 
                    GETPOSY122_tree = 
                    (RGLTree)adaptor.create(GETPOSY122)
                    ;
                    adaptor.addChild(root_0, GETPOSY122_tree);


                    }
                    break;
                case 5 :
                    // /dades/albert.puente/linux/CL/Projecte/robotgl/java/src/parser/RGL.g:109:11: '(' ! numExpr ')' !
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    char_literal123=(Token)match(input,69,FOLLOW_69_in_atom1334); 

                    pushFollow(FOLLOW_numExpr_in_atom1337);
                    numExpr124=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr124.getTree());

                    char_literal125=(Token)match(input,70,FOLLOW_70_in_atom1339); 

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

    // Delegated rules


 

    public static final BitSet FOLLOW_actions_in_prog158 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_main_in_prog161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIONS_in_actions208 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_declaration_in_actions211 = new BitSet(new long[]{0x0000000008040000L});
    public static final BitSet FOLLOW_ENDACTIONS_in_actions214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_declaration232 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_declaration235 = new BitSet(new long[]{0x0000002100000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_argList_in_declaration238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_73_in_declaration241 = new BitSet(new long[]{0x9911190B04080C00L,0x0000000000000004L});
    public static final BitSet FOLLOW_instrList_in_declaration244 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ENDFUNC_in_declaration246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_main277 = new BitSet(new long[]{0x9911190B04020C00L,0x0000000000000004L});
    public static final BitSet FOLLOW_instr_in_main280 = new BitSet(new long[]{0x9911190B04020C00L,0x0000000000000004L});
    public static final BitSet FOLLOW_END_in_main283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExpr_in_instr317 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExpr_in_instr321 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_instr358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_instr406 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_instr409 = new BitSet(new long[]{0x0020022160000002L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr413 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr416 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr419 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_ID_in_instr441 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_EQUAL_in_instr443 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITROBOT_in_instr503 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr506 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr508 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr511 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr513 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr516 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEFORWARD_in_instr530 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPROBOT_in_instr545 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr548 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVETO_in_instr560 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr563 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr565 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr568 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_instr580 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICKOBJECT_in_instr595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASEOBJECT_in_instr607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_instr619 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr624 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOX_in_instr639 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr642 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr644 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr647 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRAIL_in_instr659 = new BitSet(new long[]{0x0026422161002000L,0x0000000000000021L});
    public static final BitSet FOLLOW_boolExpr_in_instr663 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_instr667 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFF_in_instr671 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARK_in_instr684 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_instr689 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_instr692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_argList709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args736 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_71_in_args739 = new BitSet(new long[]{0x0000002100000000L});
    public static final BitSet FOLLOW_arg_in_args742 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000080L});
    public static final BitSet FOLLOW_instr_in_instrList788 = new BitSet(new long[]{0x9911190B04000C02L,0x0000000000000004L});
    public static final BitSet FOLLOW_WHILE_in_whileExpr844 = new BitSet(new long[]{0x0020422161002000L,0x0000000000000021L});
    public static final BitSet FOLLOW_boolExpr_in_whileExpr847 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DO_in_whileExpr849 = new BitSet(new long[]{0x9911190B04000C00L,0x0000000000000006L});
    public static final BitSet FOLLOW_instrList_in_whileExpr852 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_WEND_in_whileExpr854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forExpr892 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_ID_in_forExpr895 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_IN_in_forExpr897 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_forExpr900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_forExpr902 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_INT_in_forExpr905 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DO_in_forExpr907 = new BitSet(new long[]{0x9911190B06000C00L,0x0000000000000004L});
    public static final BitSet FOLLOW_instrList_in_forExpr910 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_FEND_in_forExpr912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr951 = new BitSet(new long[]{0x0020422161002000L,0x0000000000000021L});
    public static final BitSet FOLLOW_boolExpr_in_ifExpr954 = new BitSet(new long[]{0x4000000000000000L});
    public static final BitSet FOLLOW_THEN_in_ifExpr956 = new BitSet(new long[]{0x9911190B04110C00L,0x0000000000000004L});
    public static final BitSet FOLLOW_instrList_in_ifExpr959 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr962 = new BitSet(new long[]{0x9911190B04100C00L,0x0000000000000004L});
    public static final BitSet FOLLOW_instrList_in_ifExpr965 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_ENDIF_in_ifExpr969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr994 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_OR_in_boolExpr997 = new BitSet(new long[]{0x0020422161002000L,0x0000000000000021L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1000 = new BitSet(new long[]{0x0008000000000002L});
    public static final BitSet FOLLOW_NOT_in_boolterm1039 = new BitSet(new long[]{0x0020022161002000L,0x0000000000000021L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1044 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_boolterm1047 = new BitSet(new long[]{0x0020022161002000L,0x0000000000000021L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1050 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_numExpr_in_boolfact1088 = new BitSet(new long[]{0x000080C090400000L});
    public static final BitSet FOLLOW_EQUALS_in_boolfact1091 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolfact1096 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LT_in_boolfact1101 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_LE_in_boolfact1106 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GT_in_boolfact1111 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_GE_in_boolfact1116 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_boolfact1120 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolfact1136 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolfact1140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETECT_in_boolfact1156 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_boolfact1159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_numExpr1180 = new BitSet(new long[]{0x0020020000000002L});
    public static final BitSet FOLLOW_PLUS_in_numExpr1185 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_MINUS_in_numExpr1190 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_term_in_numExpr1194 = new BitSet(new long[]{0x0020020000000002L});
    public static final BitSet FOLLOW_factor_in_term1216 = new BitSet(new long[]{0x0000240000004002L});
    public static final BitSet FOLLOW_MUL_in_term1221 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_DIV_in_term1226 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_MOD_in_term1231 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_factor_in_term1235 = new BitSet(new long[]{0x0000240000004002L});
    public static final BitSet FOLLOW_PLUS_in_factor1256 = new BitSet(new long[]{0x0000002160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_MINUS_in_factor1261 = new BitSet(new long[]{0x0000002160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_atom_in_factor1266 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_atom1286 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSX_in_atom1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSY_in_atom1322 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_69_in_atom1334 = new BitSet(new long[]{0x0020022160000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_numExpr_in_atom1337 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_70_in_atom1339 = new BitSet(new long[]{0x0000000000000002L});

}