// $ANTLR 3.4 /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g 2014-05-07 09:41:45

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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ACTIONLIST", "ACTIONS", "AND", "ARGLIST", "ASSIGN", "BEGIN", "BOX", "CALL", "COMMENT", "DETECT", "DIV", "DO", "DOUBLE", "EAST", "ELSE", "END", "ENDACTIONS", "ENDFUNC", "ENDIF", "EQUAL", "EQUALS", "ESC_SEQ", "FACE", "FALSE", "FEND", "FOR", "FROM", "FRONT", "FUNC", "GE", "GETPOSX", "GETPOSY", "GT", "ID", "IF", "INITROBOT", "INSTRLIST", "LE", "LEFT", "LT", "MARK", "MINUS", "MOD", "MOVEFORWARD", "MOVETO", "MUL", "NORTH", "NOT", "NOT_EQUAL", "OBSTACLE", "OFF", "ON", "OR", "PICKOBJECT", "PLUS", "PROGRAM", "READ", "RELEASEOBJECT", "RETURN", "RGL", "RIGHT", "ROTATE", "SOUTH", "STEP", "STOPROBOT", "STRING", "THEN", "TO", "TRAIL", "TRUE", "WEND", "WEST", "WHILE", "WRITE", "WS", "'('", "')'", "','", "':'"
    };

    public static final int EOF=-1;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
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
    public static final int DOUBLE=16;
    public static final int EAST=17;
    public static final int ELSE=18;
    public static final int END=19;
    public static final int ENDACTIONS=20;
    public static final int ENDFUNC=21;
    public static final int ENDIF=22;
    public static final int EQUAL=23;
    public static final int EQUALS=24;
    public static final int ESC_SEQ=25;
    public static final int FACE=26;
    public static final int FALSE=27;
    public static final int FEND=28;
    public static final int FOR=29;
    public static final int FROM=30;
    public static final int FRONT=31;
    public static final int FUNC=32;
    public static final int GE=33;
    public static final int GETPOSX=34;
    public static final int GETPOSY=35;
    public static final int GT=36;
    public static final int ID=37;
    public static final int IF=38;
    public static final int INITROBOT=39;
    public static final int INSTRLIST=40;
    public static final int LE=41;
    public static final int LEFT=42;
    public static final int LT=43;
    public static final int MARK=44;
    public static final int MINUS=45;
    public static final int MOD=46;
    public static final int MOVEFORWARD=47;
    public static final int MOVETO=48;
    public static final int MUL=49;
    public static final int NORTH=50;
    public static final int NOT=51;
    public static final int NOT_EQUAL=52;
    public static final int OBSTACLE=53;
    public static final int OFF=54;
    public static final int ON=55;
    public static final int OR=56;
    public static final int PICKOBJECT=57;
    public static final int PLUS=58;
    public static final int PROGRAM=59;
    public static final int READ=60;
    public static final int RELEASEOBJECT=61;
    public static final int RETURN=62;
    public static final int RGL=63;
    public static final int RIGHT=64;
    public static final int ROTATE=65;
    public static final int SOUTH=66;
    public static final int STEP=67;
    public static final int STOPROBOT=68;
    public static final int STRING=69;
    public static final int THEN=70;
    public static final int TO=71;
    public static final int TRAIL=72;
    public static final int TRUE=73;
    public static final int WEND=74;
    public static final int WEST=75;
    public static final int WHILE=76;
    public static final int WRITE=77;
    public static final int WS=78;

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
    public String getGrammarFileName() { return "/home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:31:1: prog : ( actions )? main EOF -> ^( RGL ^( ACTIONLIST ( actions )? ) ^( INSTRLIST main ) ) ;
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
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:31:9: ( ( actions )? main EOF -> ^( RGL ^( ACTIONLIST ( actions )? ) ^( INSTRLIST main ) ) )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:31:11: ( actions )? main EOF
            {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:31:11: ( actions )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==ACTIONS) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:31:11: actions
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
                // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:32:13: ^( RGL ^( ACTIONLIST ( actions )? ) ^( INSTRLIST main ) )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(RGL, "RGL")
                , root_1);

                // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:32:19: ^( ACTIONLIST ( actions )? )
                {
                RGLTree root_2 = (RGLTree)adaptor.nil();
                root_2 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(ACTIONLIST, "ACTIONLIST")
                , root_2);

                // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:32:32: ( actions )?
                if ( stream_actions.hasNext() ) {
                    adaptor.addChild(root_2, stream_actions.nextTree());

                }
                stream_actions.reset();

                adaptor.addChild(root_1, root_2);
                }

                // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:32:42: ^( INSTRLIST main )
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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:35:1: actions : ACTIONS ! ( declaration )* ENDACTIONS !;
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
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:35:9: ( ACTIONS ! ( declaration )* ENDACTIONS !)
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:35:11: ACTIONS ! ( declaration )* ENDACTIONS !
            {
            root_0 = (RGLTree)adaptor.nil();


            ACTIONS4=(Token)match(input,ACTIONS,FOLLOW_ACTIONS_in_actions208); 

            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:35:20: ( declaration )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==FUNC) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:35:20: declaration
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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:38:1: declaration : FUNC ! ID ^ argList ':' ! instrList ENDFUNC !;
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
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:38:13: ( FUNC ! ID ^ argList ':' ! instrList ENDFUNC !)
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:38:15: FUNC ! ID ^ argList ':' ! instrList ENDFUNC !
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

            char_literal10=(Token)match(input,82,FOLLOW_82_in_declaration240); 

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:41:1: main : BEGIN ! initRobot instrList END !;
    public final RGLParser.main_return main() throws RecognitionException {
        RGLParser.main_return retval = new RGLParser.main_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token BEGIN13=null;
        Token END16=null;
        RGLParser.initRobot_return initRobot14 =null;

        RGLParser.instrList_return instrList15 =null;


        RGLTree BEGIN13_tree=null;
        RGLTree END16_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:41:9: ( BEGIN ! initRobot instrList END !)
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:41:11: BEGIN ! initRobot instrList END !
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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "main"


    public static class initRobot_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initRobot"
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:44:1: initRobot : INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr ;
    public final RGLParser.initRobot_return initRobot() throws RecognitionException {
        RGLParser.initRobot_return retval = new RGLParser.initRobot_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token INITROBOT17=null;
        Token char_literal19=null;
        Token char_literal21=null;
        RGLParser.numExpr_return numExpr18 =null;

        RGLParser.numExpr_return numExpr20 =null;

        RGLParser.numExpr_return numExpr22 =null;


        RGLTree INITROBOT17_tree=null;
        RGLTree char_literal19_tree=null;
        RGLTree char_literal21_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:44:13: ( INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:44:15: INITROBOT ^ numExpr ',' ! numExpr ',' ! numExpr
            {
            root_0 = (RGLTree)adaptor.nil();


            INITROBOT17=(Token)match(input,INITROBOT,FOLLOW_INITROBOT_in_initRobot305); 
            INITROBOT17_tree = 
            (RGLTree)adaptor.create(INITROBOT17)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(INITROBOT17_tree, root_0);


            pushFollow(FOLLOW_numExpr_in_initRobot308);
            numExpr18=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr18.getTree());

            char_literal19=(Token)match(input,81,FOLLOW_81_in_initRobot310); 

            pushFollow(FOLLOW_numExpr_in_initRobot313);
            numExpr20=numExpr();

            state._fsp--;

            adaptor.addChild(root_0, numExpr20.getTree());

            char_literal21=(Token)match(input,81,FOLLOW_81_in_initRobot315); 

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
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initRobot"


    public static class instr_return extends ParserRuleReturnScope {
        RGLTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "instr"
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:47:1: instr : ( whileExpr | forExpr | ifExpr | CALL ^ ID ( numExpr ( ',' ! numExpr )* )? | ID '=' ^ numExpr | MOVEFORWARD ^ numExpr | STOPROBOT ^ numExpr | MOVETO ^ numExpr ',' ! numExpr | ROTATE ^ numExpr | FACE ^ direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE ^ numExpr ',' ! numExpr | BOX ^ numExpr ',' ! numExpr | TRAIL ^ ( boolExpr | ON | OFF ) | MARK ^ numExpr ',' ! numExpr );
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
        RGLParser.whileExpr_return whileExpr23 =null;

        RGLParser.forExpr_return forExpr24 =null;

        RGLParser.ifExpr_return ifExpr25 =null;

        RGLParser.numExpr_return numExpr28 =null;

        RGLParser.numExpr_return numExpr30 =null;

        RGLParser.numExpr_return numExpr33 =null;

        RGLParser.numExpr_return numExpr35 =null;

        RGLParser.numExpr_return numExpr37 =null;

        RGLParser.numExpr_return numExpr39 =null;

        RGLParser.numExpr_return numExpr41 =null;

        RGLParser.numExpr_return numExpr43 =null;

        RGLParser.direction_return direction45 =null;

        RGLParser.numExpr_return numExpr49 =null;

        RGLParser.numExpr_return numExpr51 =null;

        RGLParser.numExpr_return numExpr53 =null;

        RGLParser.numExpr_return numExpr55 =null;

        RGLParser.boolExpr_return boolExpr57 =null;

        RGLParser.numExpr_return numExpr61 =null;

        RGLParser.numExpr_return numExpr63 =null;


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
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:47:9: ( whileExpr | forExpr | ifExpr | CALL ^ ID ( numExpr ( ',' ! numExpr )* )? | ID '=' ^ numExpr | MOVEFORWARD ^ numExpr | STOPROBOT ^ numExpr | MOVETO ^ numExpr ',' ! numExpr | ROTATE ^ numExpr | FACE ^ direction | PICKOBJECT | RELEASEOBJECT | OBSTACLE ^ numExpr ',' ! numExpr | BOX ^ numExpr ',' ! numExpr | TRAIL ^ ( boolExpr | ON | OFF ) | MARK ^ numExpr ',' ! numExpr )
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
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:49:9: whileExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_whileExpr_in_instr358);
                    whileExpr23=whileExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, whileExpr23.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:49:21: forExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_forExpr_in_instr362);
                    forExpr24=forExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, forExpr24.getTree());

                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:50:11: ifExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_ifExpr_in_instr399);
                    ifExpr25=ifExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, ifExpr25.getTree());

                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:51:11: CALL ^ ID ( numExpr ( ',' ! numExpr )* )?
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    CALL26=(Token)match(input,CALL,FOLLOW_CALL_in_instr447); 
                    CALL26_tree = 
                    (RGLTree)adaptor.create(CALL26)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(CALL26_tree, root_0);


                    ID27=(Token)match(input,ID,FOLLOW_ID_in_instr450); 
                    ID27_tree = 
                    (RGLTree)adaptor.create(ID27)
                    ;
                    adaptor.addChild(root_0, ID27_tree);


                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:51:20: ( numExpr ( ',' ! numExpr )* )?
                    int alt4=2;
                    int LA4_0 = input.LA(1);

                    if ( (LA4_0==DOUBLE||(LA4_0 >= GETPOSX && LA4_0 <= GETPOSY)||LA4_0==MINUS||LA4_0==PLUS||LA4_0==79) ) {
                        alt4=1;
                    }
                    else if ( (LA4_0==ID) ) {
                        int LA4_2 = input.LA(2);

                        if ( ((LA4_2 >= BOX && LA4_2 <= CALL)||LA4_2==DIV||(LA4_2 >= ELSE && LA4_2 <= END)||(LA4_2 >= ENDFUNC && LA4_2 <= ENDIF)||LA4_2==FACE||(LA4_2 >= FEND && LA4_2 <= FOR)||(LA4_2 >= ID && LA4_2 <= IF)||(LA4_2 >= MARK && LA4_2 <= MUL)||LA4_2==OBSTACLE||(LA4_2 >= PICKOBJECT && LA4_2 <= PLUS)||LA4_2==RELEASEOBJECT||LA4_2==ROTATE||LA4_2==STOPROBOT||LA4_2==TRAIL||LA4_2==WEND||LA4_2==WHILE||LA4_2==81) ) {
                            alt4=1;
                        }
                    }
                    switch (alt4) {
                        case 1 :
                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:51:21: numExpr ( ',' ! numExpr )*
                            {
                            pushFollow(FOLLOW_numExpr_in_instr453);
                            numExpr28=numExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, numExpr28.getTree());

                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:51:29: ( ',' ! numExpr )*
                            loop3:
                            do {
                                int alt3=2;
                                int LA3_0 = input.LA(1);

                                if ( (LA3_0==81) ) {
                                    alt3=1;
                                }


                                switch (alt3) {
                            	case 1 :
                            	    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:51:30: ',' ! numExpr
                            	    {
                            	    char_literal29=(Token)match(input,81,FOLLOW_81_in_instr456); 

                            	    pushFollow(FOLLOW_numExpr_in_instr459);
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
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:52:11: ID '=' ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ID31=(Token)match(input,ID,FOLLOW_ID_in_instr481); 
                    ID31_tree = 
                    (RGLTree)adaptor.create(ID31)
                    ;
                    adaptor.addChild(root_0, ID31_tree);


                    char_literal32=(Token)match(input,EQUAL,FOLLOW_EQUAL_in_instr483); 
                    char_literal32_tree = 
                    (RGLTree)adaptor.create(char_literal32)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal32_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr486);
                    numExpr33=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr33.getTree());

                    }
                    break;
                case 6 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:55:11: MOVEFORWARD ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MOVEFORWARD34=(Token)match(input,MOVEFORWARD,FOLLOW_MOVEFORWARD_in_instr543); 
                    MOVEFORWARD34_tree = 
                    (RGLTree)adaptor.create(MOVEFORWARD34)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVEFORWARD34_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr546);
                    numExpr35=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr35.getTree());

                    }
                    break;
                case 7 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:56:11: STOPROBOT ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    STOPROBOT36=(Token)match(input,STOPROBOT,FOLLOW_STOPROBOT_in_instr558); 
                    STOPROBOT36_tree = 
                    (RGLTree)adaptor.create(STOPROBOT36)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(STOPROBOT36_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr561);
                    numExpr37=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr37.getTree());

                    }
                    break;
                case 8 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:57:11: MOVETO ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MOVETO38=(Token)match(input,MOVETO,FOLLOW_MOVETO_in_instr573); 
                    MOVETO38_tree = 
                    (RGLTree)adaptor.create(MOVETO38)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MOVETO38_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr576);
                    numExpr39=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr39.getTree());

                    char_literal40=(Token)match(input,81,FOLLOW_81_in_instr578); 

                    pushFollow(FOLLOW_numExpr_in_instr581);
                    numExpr41=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr41.getTree());

                    }
                    break;
                case 9 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:58:11: ROTATE ^ numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ROTATE42=(Token)match(input,ROTATE,FOLLOW_ROTATE_in_instr593); 
                    ROTATE42_tree = 
                    (RGLTree)adaptor.create(ROTATE42)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(ROTATE42_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr596);
                    numExpr43=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr43.getTree());

                    }
                    break;
                case 10 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:59:11: FACE ^ direction
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    FACE44=(Token)match(input,FACE,FOLLOW_FACE_in_instr608); 
                    FACE44_tree = 
                    (RGLTree)adaptor.create(FACE44)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(FACE44_tree, root_0);


                    pushFollow(FOLLOW_direction_in_instr611);
                    direction45=direction();

                    state._fsp--;

                    adaptor.addChild(root_0, direction45.getTree());

                    }
                    break;
                case 11 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:60:11: PICKOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    PICKOBJECT46=(Token)match(input,PICKOBJECT,FOLLOW_PICKOBJECT_in_instr623); 
                    PICKOBJECT46_tree = 
                    (RGLTree)adaptor.create(PICKOBJECT46)
                    ;
                    adaptor.addChild(root_0, PICKOBJECT46_tree);


                    }
                    break;
                case 12 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:61:11: RELEASEOBJECT
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    RELEASEOBJECT47=(Token)match(input,RELEASEOBJECT,FOLLOW_RELEASEOBJECT_in_instr635); 
                    RELEASEOBJECT47_tree = 
                    (RGLTree)adaptor.create(RELEASEOBJECT47)
                    ;
                    adaptor.addChild(root_0, RELEASEOBJECT47_tree);


                    }
                    break;
                case 13 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:62:11: OBSTACLE ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    OBSTACLE48=(Token)match(input,OBSTACLE,FOLLOW_OBSTACLE_in_instr647); 
                    OBSTACLE48_tree = 
                    (RGLTree)adaptor.create(OBSTACLE48)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(OBSTACLE48_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr650);
                    numExpr49=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr49.getTree());

                    char_literal50=(Token)match(input,81,FOLLOW_81_in_instr652); 

                    pushFollow(FOLLOW_numExpr_in_instr655);
                    numExpr51=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr51.getTree());

                    }
                    break;
                case 14 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:63:11: BOX ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    BOX52=(Token)match(input,BOX,FOLLOW_BOX_in_instr667); 
                    BOX52_tree = 
                    (RGLTree)adaptor.create(BOX52)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(BOX52_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr670);
                    numExpr53=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr53.getTree());

                    char_literal54=(Token)match(input,81,FOLLOW_81_in_instr672); 

                    pushFollow(FOLLOW_numExpr_in_instr675);
                    numExpr55=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr55.getTree());

                    }
                    break;
                case 15 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:64:11: TRAIL ^ ( boolExpr | ON | OFF )
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    TRAIL56=(Token)match(input,TRAIL,FOLLOW_TRAIL_in_instr687); 
                    TRAIL56_tree = 
                    (RGLTree)adaptor.create(TRAIL56)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(TRAIL56_tree, root_0);


                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:64:18: ( boolExpr | ON | OFF )
                    int alt5=3;
                    switch ( input.LA(1) ) {
                    case DETECT:
                    case DOUBLE:
                    case FALSE:
                    case GETPOSX:
                    case GETPOSY:
                    case ID:
                    case MINUS:
                    case NOT:
                    case PLUS:
                    case TRUE:
                    case 79:
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
                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:64:19: boolExpr
                            {
                            pushFollow(FOLLOW_boolExpr_in_instr691);
                            boolExpr57=boolExpr();

                            state._fsp--;

                            adaptor.addChild(root_0, boolExpr57.getTree());

                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:64:30: ON
                            {
                            ON58=(Token)match(input,ON,FOLLOW_ON_in_instr695); 
                            ON58_tree = 
                            (RGLTree)adaptor.create(ON58)
                            ;
                            adaptor.addChild(root_0, ON58_tree);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:64:35: OFF
                            {
                            OFF59=(Token)match(input,OFF,FOLLOW_OFF_in_instr699); 
                            OFF59_tree = 
                            (RGLTree)adaptor.create(OFF59)
                            ;
                            adaptor.addChild(root_0, OFF59_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 16 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:65:11: MARK ^ numExpr ',' ! numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    MARK60=(Token)match(input,MARK,FOLLOW_MARK_in_instr712); 
                    MARK60_tree = 
                    (RGLTree)adaptor.create(MARK60)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(MARK60_tree, root_0);


                    pushFollow(FOLLOW_numExpr_in_instr715);
                    numExpr61=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr61.getTree());

                    char_literal62=(Token)match(input,81,FOLLOW_81_in_instr717); 

                    pushFollow(FOLLOW_numExpr_in_instr720);
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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:68:1: argList : ( args )? -> ^( ARGLIST ( args )? ) ;
    public final RGLParser.argList_return argList() throws RecognitionException {
        RGLParser.argList_return retval = new RGLParser.argList_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.args_return args64 =null;


        RewriteRuleSubtreeStream stream_args=new RewriteRuleSubtreeStream(adaptor,"rule args");
        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:68:9: ( ( args )? -> ^( ARGLIST ( args )? ) )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:68:11: ( args )?
            {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:68:11: ( args )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==DOUBLE||LA7_0==ID) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:68:11: args
                    {
                    pushFollow(FOLLOW_args_in_argList737);
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
                // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:68:20: ^( ARGLIST ( args )? )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(ARGLIST, "ARGLIST")
                , root_1);

                // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:68:30: ( args )?
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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:70:1: args : arg ( ',' ! arg )* ;
    public final RGLParser.args_return args() throws RecognitionException {
        RGLParser.args_return retval = new RGLParser.args_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal66=null;
        RGLParser.arg_return arg65 =null;

        RGLParser.arg_return arg67 =null;


        RGLTree char_literal66_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:70:9: ( arg ( ',' ! arg )* )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:70:11: arg ( ',' ! arg )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_arg_in_args766);
            arg65=arg();

            state._fsp--;

            adaptor.addChild(root_0, arg65.getTree());

            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:70:15: ( ',' ! arg )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==81) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:70:16: ',' ! arg
            	    {
            	    char_literal66=(Token)match(input,81,FOLLOW_81_in_args769); 

            	    pushFollow(FOLLOW_arg_in_args772);
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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:73:1: arg : ( ID | DOUBLE );
    public final RGLParser.arg_return arg() throws RecognitionException {
        RGLParser.arg_return retval = new RGLParser.arg_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set68=null;

        RGLTree set68_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:73:9: ( ID | DOUBLE )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set68=(Token)input.LT(1);

            if ( input.LA(1)==DOUBLE||input.LA(1)==ID ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set68)
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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:76:1: instrList : ( instr )* -> ^( INSTRLIST ( instr )* ) ;
    public final RGLParser.instrList_return instrList() throws RecognitionException {
        RGLParser.instrList_return retval = new RGLParser.instrList_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        RGLParser.instr_return instr69 =null;


        RewriteRuleSubtreeStream stream_instr=new RewriteRuleSubtreeStream(adaptor,"rule instr");
        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:76:13: ( ( instr )* -> ^( INSTRLIST ( instr )* ) )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:76:15: ( instr )*
            {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:76:15: ( instr )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= BOX && LA9_0 <= CALL)||LA9_0==FACE||LA9_0==FOR||(LA9_0 >= ID && LA9_0 <= IF)||LA9_0==MARK||(LA9_0 >= MOVEFORWARD && LA9_0 <= MOVETO)||LA9_0==OBSTACLE||LA9_0==PICKOBJECT||LA9_0==RELEASEOBJECT||LA9_0==ROTATE||LA9_0==STOPROBOT||LA9_0==TRAIL||LA9_0==WHILE) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:76:15: instr
            	    {
            	    pushFollow(FOLLOW_instr_in_instrList818);
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
                // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:76:26: ^( INSTRLIST ( instr )* )
                {
                RGLTree root_1 = (RGLTree)adaptor.nil();
                root_1 = (RGLTree)adaptor.becomeRoot(
                (RGLTree)adaptor.create(INSTRLIST, "INSTRLIST")
                , root_1);

                // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:76:38: ( instr )*
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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:79:1: whileExpr : WHILE ^ boolExpr DO ! instrList WEND !;
    public final RGLParser.whileExpr_return whileExpr() throws RecognitionException {
        RGLParser.whileExpr_return retval = new RGLParser.whileExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token WHILE70=null;
        Token DO72=null;
        Token WEND74=null;
        RGLParser.boolExpr_return boolExpr71 =null;

        RGLParser.instrList_return instrList73 =null;


        RGLTree WHILE70_tree=null;
        RGLTree DO72_tree=null;
        RGLTree WEND74_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:79:13: ( WHILE ^ boolExpr DO ! instrList WEND !)
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:79:15: WHILE ^ boolExpr DO ! instrList WEND !
            {
            root_0 = (RGLTree)adaptor.nil();


            WHILE70=(Token)match(input,WHILE,FOLLOW_WHILE_in_whileExpr874); 
            WHILE70_tree = 
            (RGLTree)adaptor.create(WHILE70)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(WHILE70_tree, root_0);


            pushFollow(FOLLOW_boolExpr_in_whileExpr877);
            boolExpr71=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr71.getTree());

            DO72=(Token)match(input,DO,FOLLOW_DO_in_whileExpr879); 

            pushFollow(FOLLOW_instrList_in_whileExpr882);
            instrList73=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList73.getTree());

            WEND74=(Token)match(input,WEND,FOLLOW_WEND_in_whileExpr884); 

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:82:1: forExpr : FOR ^ ID FROM ! DOUBLE TO ! DOUBLE ( STEP ! DOUBLE )? DO ! instrList FEND !;
    public final RGLParser.forExpr_return forExpr() throws RecognitionException {
        RGLParser.forExpr_return retval = new RGLParser.forExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token FOR75=null;
        Token ID76=null;
        Token FROM77=null;
        Token DOUBLE78=null;
        Token TO79=null;
        Token DOUBLE80=null;
        Token STEP81=null;
        Token DOUBLE82=null;
        Token DO83=null;
        Token FEND85=null;
        RGLParser.instrList_return instrList84 =null;


        RGLTree FOR75_tree=null;
        RGLTree ID76_tree=null;
        RGLTree FROM77_tree=null;
        RGLTree DOUBLE78_tree=null;
        RGLTree TO79_tree=null;
        RGLTree DOUBLE80_tree=null;
        RGLTree STEP81_tree=null;
        RGLTree DOUBLE82_tree=null;
        RGLTree DO83_tree=null;
        RGLTree FEND85_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:82:13: ( FOR ^ ID FROM ! DOUBLE TO ! DOUBLE ( STEP ! DOUBLE )? DO ! instrList FEND !)
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:82:15: FOR ^ ID FROM ! DOUBLE TO ! DOUBLE ( STEP ! DOUBLE )? DO ! instrList FEND !
            {
            root_0 = (RGLTree)adaptor.nil();


            FOR75=(Token)match(input,FOR,FOLLOW_FOR_in_forExpr922); 
            FOR75_tree = 
            (RGLTree)adaptor.create(FOR75)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(FOR75_tree, root_0);


            ID76=(Token)match(input,ID,FOLLOW_ID_in_forExpr925); 
            ID76_tree = 
            (RGLTree)adaptor.create(ID76)
            ;
            adaptor.addChild(root_0, ID76_tree);


            FROM77=(Token)match(input,FROM,FOLLOW_FROM_in_forExpr927); 

            DOUBLE78=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forExpr930); 
            DOUBLE78_tree = 
            (RGLTree)adaptor.create(DOUBLE78)
            ;
            adaptor.addChild(root_0, DOUBLE78_tree);


            TO79=(Token)match(input,TO,FOLLOW_TO_in_forExpr932); 

            DOUBLE80=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forExpr935); 
            DOUBLE80_tree = 
            (RGLTree)adaptor.create(DOUBLE80)
            ;
            adaptor.addChild(root_0, DOUBLE80_tree);


            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:82:47: ( STEP ! DOUBLE )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==STEP) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:82:48: STEP ! DOUBLE
                    {
                    STEP81=(Token)match(input,STEP,FOLLOW_STEP_in_forExpr938); 

                    DOUBLE82=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_forExpr941); 
                    DOUBLE82_tree = 
                    (RGLTree)adaptor.create(DOUBLE82)
                    ;
                    adaptor.addChild(root_0, DOUBLE82_tree);


                    }
                    break;

            }


            DO83=(Token)match(input,DO,FOLLOW_DO_in_forExpr965); 

            pushFollow(FOLLOW_instrList_in_forExpr968);
            instrList84=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList84.getTree());

            FEND85=(Token)match(input,FEND,FOLLOW_FEND_in_forExpr970); 

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:86:1: ifExpr : IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !;
    public final RGLParser.ifExpr_return ifExpr() throws RecognitionException {
        RGLParser.ifExpr_return retval = new RGLParser.ifExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token IF86=null;
        Token THEN88=null;
        Token ELSE90=null;
        Token ENDIF92=null;
        RGLParser.boolExpr_return boolExpr87 =null;

        RGLParser.instrList_return instrList89 =null;

        RGLParser.instrList_return instrList91 =null;


        RGLTree IF86_tree=null;
        RGLTree THEN88_tree=null;
        RGLTree ELSE90_tree=null;
        RGLTree ENDIF92_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:86:13: ( IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !)
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:86:15: IF ^ boolExpr THEN ! instrList ( ELSE ! instrList )? ENDIF !
            {
            root_0 = (RGLTree)adaptor.nil();


            IF86=(Token)match(input,IF,FOLLOW_IF_in_ifExpr1009); 
            IF86_tree = 
            (RGLTree)adaptor.create(IF86)
            ;
            root_0 = (RGLTree)adaptor.becomeRoot(IF86_tree, root_0);


            pushFollow(FOLLOW_boolExpr_in_ifExpr1012);
            boolExpr87=boolExpr();

            state._fsp--;

            adaptor.addChild(root_0, boolExpr87.getTree());

            THEN88=(Token)match(input,THEN,FOLLOW_THEN_in_ifExpr1014); 

            pushFollow(FOLLOW_instrList_in_ifExpr1017);
            instrList89=instrList();

            state._fsp--;

            adaptor.addChild(root_0, instrList89.getTree());

            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:86:44: ( ELSE ! instrList )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ELSE) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:86:45: ELSE ! instrList
                    {
                    ELSE90=(Token)match(input,ELSE,FOLLOW_ELSE_in_ifExpr1020); 

                    pushFollow(FOLLOW_instrList_in_ifExpr1023);
                    instrList91=instrList();

                    state._fsp--;

                    adaptor.addChild(root_0, instrList91.getTree());

                    }
                    break;

            }


            ENDIF92=(Token)match(input,ENDIF,FOLLOW_ENDIF_in_ifExpr1027); 

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:90:1: boolExpr : boolterm ( OR ^ boolterm )* ;
    public final RGLParser.boolExpr_return boolExpr() throws RecognitionException {
        RGLParser.boolExpr_return retval = new RGLParser.boolExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token OR94=null;
        RGLParser.boolterm_return boolterm93 =null;

        RGLParser.boolterm_return boolterm95 =null;


        RGLTree OR94_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:90:13: ( boolterm ( OR ^ boolterm )* )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:90:15: boolterm ( OR ^ boolterm )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_boolterm_in_boolExpr1053);
            boolterm93=boolterm();

            state._fsp--;

            adaptor.addChild(root_0, boolterm93.getTree());

            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:90:24: ( OR ^ boolterm )*
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==OR) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:90:25: OR ^ boolterm
            	    {
            	    OR94=(Token)match(input,OR,FOLLOW_OR_in_boolExpr1056); 
            	    OR94_tree = 
            	    (RGLTree)adaptor.create(OR94)
            	    ;
            	    root_0 = (RGLTree)adaptor.becomeRoot(OR94_tree, root_0);


            	    pushFollow(FOLLOW_boolterm_in_boolExpr1059);
            	    boolterm95=boolterm();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolterm95.getTree());

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:93:1: boolterm : boolfact ( AND ^ boolfact )* ;
    public final RGLParser.boolterm_return boolterm() throws RecognitionException {
        RGLParser.boolterm_return retval = new RGLParser.boolterm_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token AND97=null;
        RGLParser.boolfact_return boolfact96 =null;

        RGLParser.boolfact_return boolfact98 =null;


        RGLTree AND97_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:93:13: ( boolfact ( AND ^ boolfact )* )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:93:15: boolfact ( AND ^ boolfact )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_boolfact_in_boolterm1097);
            boolfact96=boolfact();

            state._fsp--;

            adaptor.addChild(root_0, boolfact96.getTree());

            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:93:24: ( AND ^ boolfact )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==AND) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:93:25: AND ^ boolfact
            	    {
            	    AND97=(Token)match(input,AND,FOLLOW_AND_in_boolterm1100); 
            	    AND97_tree = 
            	    (RGLTree)adaptor.create(AND97)
            	    ;
            	    root_0 = (RGLTree)adaptor.becomeRoot(AND97_tree, root_0);


            	    pushFollow(FOLLOW_boolfact_in_boolterm1103);
            	    boolfact98=boolfact();

            	    state._fsp--;

            	    adaptor.addChild(root_0, boolfact98.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:96:1: boolfact : ( NOT ^)? boolatom ;
    public final RGLParser.boolfact_return boolfact() throws RecognitionException {
        RGLParser.boolfact_return retval = new RGLParser.boolfact_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token NOT99=null;
        RGLParser.boolatom_return boolatom100 =null;


        RGLTree NOT99_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:96:13: ( ( NOT ^)? boolatom )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:96:15: ( NOT ^)? boolatom
            {
            root_0 = (RGLTree)adaptor.nil();


            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:96:15: ( NOT ^)?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==NOT) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:96:16: NOT ^
                    {
                    NOT99=(Token)match(input,NOT,FOLLOW_NOT_in_boolfact1130); 
                    NOT99_tree = 
                    (RGLTree)adaptor.create(NOT99)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(NOT99_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_boolatom_in_boolfact1135);
            boolatom100=boolatom();

            state._fsp--;

            adaptor.addChild(root_0, boolatom100.getTree());

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:99:1: boolatom : ( numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr | TRUE | FALSE | DETECT ^ side );
    public final RGLParser.boolatom_return boolatom() throws RecognitionException {
        RGLParser.boolatom_return retval = new RGLParser.boolatom_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token string_literal102=null;
        Token string_literal103=null;
        Token char_literal104=null;
        Token string_literal105=null;
        Token char_literal106=null;
        Token string_literal107=null;
        Token TRUE109=null;
        Token FALSE110=null;
        Token DETECT111=null;
        RGLParser.numExpr_return numExpr101 =null;

        RGLParser.numExpr_return numExpr108 =null;

        RGLParser.side_return side112 =null;


        RGLTree string_literal102_tree=null;
        RGLTree string_literal103_tree=null;
        RGLTree char_literal104_tree=null;
        RGLTree string_literal105_tree=null;
        RGLTree char_literal106_tree=null;
        RGLTree string_literal107_tree=null;
        RGLTree TRUE109_tree=null;
        RGLTree FALSE110_tree=null;
        RGLTree DETECT111_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:99:12: ( numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr | TRUE | FALSE | DETECT ^ side )
            int alt16=4;
            switch ( input.LA(1) ) {
            case DOUBLE:
            case GETPOSX:
            case GETPOSY:
            case ID:
            case MINUS:
            case PLUS:
            case 79:
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
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:99:14: numExpr ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^) numExpr
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    pushFollow(FOLLOW_numExpr_in_boolatom1170);
                    numExpr101=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr101.getTree());

                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:99:22: ( '==' ^| '!=' ^| '<' ^| '<=' ^| '>' ^| '>=' ^)
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
                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:99:23: '==' ^
                            {
                            string_literal102=(Token)match(input,EQUALS,FOLLOW_EQUALS_in_boolatom1173); 
                            string_literal102_tree = 
                            (RGLTree)adaptor.create(string_literal102)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal102_tree, root_0);


                            }
                            break;
                        case 2 :
                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:99:31: '!=' ^
                            {
                            string_literal103=(Token)match(input,NOT_EQUAL,FOLLOW_NOT_EQUAL_in_boolatom1178); 
                            string_literal103_tree = 
                            (RGLTree)adaptor.create(string_literal103)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal103_tree, root_0);


                            }
                            break;
                        case 3 :
                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:99:39: '<' ^
                            {
                            char_literal104=(Token)match(input,LT,FOLLOW_LT_in_boolatom1183); 
                            char_literal104_tree = 
                            (RGLTree)adaptor.create(char_literal104)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal104_tree, root_0);


                            }
                            break;
                        case 4 :
                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:99:46: '<=' ^
                            {
                            string_literal105=(Token)match(input,LE,FOLLOW_LE_in_boolatom1188); 
                            string_literal105_tree = 
                            (RGLTree)adaptor.create(string_literal105)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal105_tree, root_0);


                            }
                            break;
                        case 5 :
                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:99:54: '>' ^
                            {
                            char_literal106=(Token)match(input,GT,FOLLOW_GT_in_boolatom1193); 
                            char_literal106_tree = 
                            (RGLTree)adaptor.create(char_literal106)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(char_literal106_tree, root_0);


                            }
                            break;
                        case 6 :
                            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:99:61: '>=' ^
                            {
                            string_literal107=(Token)match(input,GE,FOLLOW_GE_in_boolatom1198); 
                            string_literal107_tree = 
                            (RGLTree)adaptor.create(string_literal107)
                            ;
                            root_0 = (RGLTree)adaptor.becomeRoot(string_literal107_tree, root_0);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_numExpr_in_boolatom1202);
                    numExpr108=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr108.getTree());

                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:100:15: TRUE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    TRUE109=(Token)match(input,TRUE,FOLLOW_TRUE_in_boolatom1218); 
                    TRUE109_tree = 
                    (RGLTree)adaptor.create(TRUE109)
                    ;
                    adaptor.addChild(root_0, TRUE109_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:100:22: FALSE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    FALSE110=(Token)match(input,FALSE,FOLLOW_FALSE_in_boolatom1222); 
                    FALSE110_tree = 
                    (RGLTree)adaptor.create(FALSE110)
                    ;
                    adaptor.addChild(root_0, FALSE110_tree);


                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:101:15: DETECT ^ side
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    DETECT111=(Token)match(input,DETECT,FOLLOW_DETECT_in_boolatom1238); 
                    DETECT111_tree = 
                    (RGLTree)adaptor.create(DETECT111)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(DETECT111_tree, root_0);


                    pushFollow(FOLLOW_side_in_boolatom1241);
                    side112=side();

                    state._fsp--;

                    adaptor.addChild(root_0, side112.getTree());

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:104:1: numExpr : term ( ( '+' ^| '-' ^) term )* ;
    public final RGLParser.numExpr_return numExpr() throws RecognitionException {
        RGLParser.numExpr_return retval = new RGLParser.numExpr_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal114=null;
        Token char_literal115=null;
        RGLParser.term_return term113 =null;

        RGLParser.term_return term116 =null;


        RGLTree char_literal114_tree=null;
        RGLTree char_literal115_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:104:9: ( term ( ( '+' ^| '-' ^) term )* )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:104:11: term ( ( '+' ^| '-' ^) term )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_term_in_numExpr1262);
            term113=term();

            state._fsp--;

            adaptor.addChild(root_0, term113.getTree());

            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:104:16: ( ( '+' ^| '-' ^) term )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==MINUS||LA18_0==PLUS) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:104:18: ( '+' ^| '-' ^) term
            	    {
            	    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:104:18: ( '+' ^| '-' ^)
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
            	            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:104:19: '+' ^
            	            {
            	            char_literal114=(Token)match(input,PLUS,FOLLOW_PLUS_in_numExpr1267); 
            	            char_literal114_tree = 
            	            (RGLTree)adaptor.create(char_literal114)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal114_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:104:26: '-' ^
            	            {
            	            char_literal115=(Token)match(input,MINUS,FOLLOW_MINUS_in_numExpr1272); 
            	            char_literal115_tree = 
            	            (RGLTree)adaptor.create(char_literal115)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal115_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_numExpr1276);
            	    term116=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term116.getTree());

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:107:1: term : factor ( ( '*' ^| '/' ^| '%' ^) factor )* ;
    public final RGLParser.term_return term() throws RecognitionException {
        RGLParser.term_return retval = new RGLParser.term_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal118=null;
        Token char_literal119=null;
        Token char_literal120=null;
        RGLParser.factor_return factor117 =null;

        RGLParser.factor_return factor121 =null;


        RGLTree char_literal118_tree=null;
        RGLTree char_literal119_tree=null;
        RGLTree char_literal120_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:107:9: ( factor ( ( '*' ^| '/' ^| '%' ^) factor )* )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:107:11: factor ( ( '*' ^| '/' ^| '%' ^) factor )*
            {
            root_0 = (RGLTree)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1298);
            factor117=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor117.getTree());

            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:107:18: ( ( '*' ^| '/' ^| '%' ^) factor )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==DIV||LA20_0==MOD||LA20_0==MUL) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:107:20: ( '*' ^| '/' ^| '%' ^) factor
            	    {
            	    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:107:20: ( '*' ^| '/' ^| '%' ^)
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
            	            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:107:21: '*' ^
            	            {
            	            char_literal118=(Token)match(input,MUL,FOLLOW_MUL_in_term1303); 
            	            char_literal118_tree = 
            	            (RGLTree)adaptor.create(char_literal118)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal118_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:107:28: '/' ^
            	            {
            	            char_literal119=(Token)match(input,DIV,FOLLOW_DIV_in_term1308); 
            	            char_literal119_tree = 
            	            (RGLTree)adaptor.create(char_literal119)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal119_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:107:35: '%' ^
            	            {
            	            char_literal120=(Token)match(input,MOD,FOLLOW_MOD_in_term1313); 
            	            char_literal120_tree = 
            	            (RGLTree)adaptor.create(char_literal120)
            	            ;
            	            root_0 = (RGLTree)adaptor.becomeRoot(char_literal120_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1317);
            	    factor121=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor121.getTree());

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:110:1: factor : ( '+' ^| '-' ^)? atom ;
    public final RGLParser.factor_return factor() throws RecognitionException {
        RGLParser.factor_return retval = new RGLParser.factor_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token char_literal122=null;
        Token char_literal123=null;
        RGLParser.atom_return atom124 =null;


        RGLTree char_literal122_tree=null;
        RGLTree char_literal123_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:110:9: ( ( '+' ^| '-' ^)? atom )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:110:11: ( '+' ^| '-' ^)? atom
            {
            root_0 = (RGLTree)adaptor.nil();


            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:110:11: ( '+' ^| '-' ^)?
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
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:110:12: '+' ^
                    {
                    char_literal122=(Token)match(input,PLUS,FOLLOW_PLUS_in_factor1338); 
                    char_literal122_tree = 
                    (RGLTree)adaptor.create(char_literal122)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal122_tree, root_0);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:110:19: '-' ^
                    {
                    char_literal123=(Token)match(input,MINUS,FOLLOW_MINUS_in_factor1343); 
                    char_literal123_tree = 
                    (RGLTree)adaptor.create(char_literal123)
                    ;
                    root_0 = (RGLTree)adaptor.becomeRoot(char_literal123_tree, root_0);


                    }
                    break;

            }


            pushFollow(FOLLOW_atom_in_factor1348);
            atom124=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom124.getTree());

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:113:1: atom : ( DOUBLE | ID | GETPOSX | GETPOSY | '(' ! numExpr ')' !);
    public final RGLParser.atom_return atom() throws RecognitionException {
        RGLParser.atom_return retval = new RGLParser.atom_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token DOUBLE125=null;
        Token ID126=null;
        Token GETPOSX127=null;
        Token GETPOSY128=null;
        Token char_literal129=null;
        Token char_literal131=null;
        RGLParser.numExpr_return numExpr130 =null;


        RGLTree DOUBLE125_tree=null;
        RGLTree ID126_tree=null;
        RGLTree GETPOSX127_tree=null;
        RGLTree GETPOSY128_tree=null;
        RGLTree char_literal129_tree=null;
        RGLTree char_literal131_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:113:9: ( DOUBLE | ID | GETPOSX | GETPOSY | '(' ! numExpr ')' !)
            int alt22=5;
            switch ( input.LA(1) ) {
            case DOUBLE:
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
            case 79:
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
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:113:11: DOUBLE
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    DOUBLE125=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_atom1368); 
                    DOUBLE125_tree = 
                    (RGLTree)adaptor.create(DOUBLE125)
                    ;
                    adaptor.addChild(root_0, DOUBLE125_tree);


                    }
                    break;
                case 2 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:114:11: ID
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    ID126=(Token)match(input,ID,FOLLOW_ID_in_atom1380); 
                    ID126_tree = 
                    (RGLTree)adaptor.create(ID126)
                    ;
                    adaptor.addChild(root_0, ID126_tree);


                    }
                    break;
                case 3 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:115:11: GETPOSX
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GETPOSX127=(Token)match(input,GETPOSX,FOLLOW_GETPOSX_in_atom1392); 
                    GETPOSX127_tree = 
                    (RGLTree)adaptor.create(GETPOSX127)
                    ;
                    adaptor.addChild(root_0, GETPOSX127_tree);


                    }
                    break;
                case 4 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:116:11: GETPOSY
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    GETPOSY128=(Token)match(input,GETPOSY,FOLLOW_GETPOSY_in_atom1404); 
                    GETPOSY128_tree = 
                    (RGLTree)adaptor.create(GETPOSY128)
                    ;
                    adaptor.addChild(root_0, GETPOSY128_tree);


                    }
                    break;
                case 5 :
                    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:117:11: '(' ! numExpr ')' !
                    {
                    root_0 = (RGLTree)adaptor.nil();


                    char_literal129=(Token)match(input,79,FOLLOW_79_in_atom1416); 

                    pushFollow(FOLLOW_numExpr_in_atom1419);
                    numExpr130=numExpr();

                    state._fsp--;

                    adaptor.addChild(root_0, numExpr130.getTree());

                    char_literal131=(Token)match(input,80,FOLLOW_80_in_atom1421); 

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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:120:1: direction : ( NORTH | SOUTH | EAST | WEST );
    public final RGLParser.direction_return direction() throws RecognitionException {
        RGLParser.direction_return retval = new RGLParser.direction_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set132=null;

        RGLTree set132_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:120:13: ( NORTH | SOUTH | EAST | WEST )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set132=(Token)input.LT(1);

            if ( input.LA(1)==EAST||input.LA(1)==NORTH||input.LA(1)==SOUTH||input.LA(1)==WEST ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set132)
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
    // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:122:1: side : ( FRONT | RIGHT | LEFT );
    public final RGLParser.side_return side() throws RecognitionException {
        RGLParser.side_return retval = new RGLParser.side_return();
        retval.start = input.LT(1);


        RGLTree root_0 = null;

        Token set133=null;

        RGLTree set133_tree=null;

        try {
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:122:11: ( FRONT | RIGHT | LEFT )
            // /home2/users/alumnes/1160193/Desktop/CL/Projecte/robotgl/java/src/parser/RGL.g:
            {
            root_0 = (RGLTree)adaptor.nil();


            set133=(Token)input.LT(1);

            if ( input.LA(1)==FRONT||input.LA(1)==LEFT||input.LA(1)==RIGHT ) {
                input.consume();
                adaptor.addChild(root_0, 
                (RGLTree)adaptor.create(set133)
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


 

    public static final BitSet FOLLOW_actions_in_prog158 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_main_in_prog161 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_prog163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ACTIONS_in_actions208 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_declaration_in_actions211 = new BitSet(new long[]{0x0000000100100000L});
    public static final BitSet FOLLOW_ENDACTIONS_in_actions214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FUNC_in_declaration232 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_declaration235 = new BitSet(new long[]{0x0000002000010000L,0x0000000000040000L});
    public static final BitSet FOLLOW_argList_in_declaration238 = new BitSet(new long[]{0x0000000000000000L,0x0000000000040000L});
    public static final BitSet FOLLOW_82_in_declaration240 = new BitSet(new long[]{0x2221906024200C00L,0x0000000000001112L});
    public static final BitSet FOLLOW_instrList_in_declaration243 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_ENDFUNC_in_declaration245 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BEGIN_in_main276 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_initRobot_in_main279 = new BitSet(new long[]{0x2221906024080C00L,0x0000000000001112L});
    public static final BitSet FOLLOW_instrList_in_main281 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_END_in_main283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INITROBOT_in_initRobot305 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_initRobot308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_initRobot310 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_initRobot313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_initRobot315 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_initRobot318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileExpr_in_instr358 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forExpr_in_instr362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifExpr_in_instr399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CALL_in_instr447 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_instr450 = new BitSet(new long[]{0x0400202C00010002L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr453 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_instr456 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr459 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_ID_in_instr481 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_EQUAL_in_instr483 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr486 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVEFORWARD_in_instr543 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STOPROBOT_in_instr558 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MOVETO_in_instr573 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_instr578 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr581 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ROTATE_in_instr593 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr596 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FACE_in_instr608 = new BitSet(new long[]{0x0004000000020000L,0x0000000000000804L});
    public static final BitSet FOLLOW_direction_in_instr611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PICKOBJECT_in_instr623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RELEASEOBJECT_in_instr635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OBSTACLE_in_instr647 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr650 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_instr652 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr655 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOX_in_instr667 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr670 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_instr672 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRAIL_in_instr687 = new BitSet(new long[]{0x04C8202C08012000L,0x0000000000008200L});
    public static final BitSet FOLLOW_boolExpr_in_instr691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ON_in_instr695 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_OFF_in_instr699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MARK_in_instr712 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr715 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_instr717 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_instr720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_args_in_argList737 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arg_in_args766 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_81_in_args769 = new BitSet(new long[]{0x0000002000010000L});
    public static final BitSet FOLLOW_arg_in_args772 = new BitSet(new long[]{0x0000000000000002L,0x0000000000020000L});
    public static final BitSet FOLLOW_instr_in_instrList818 = new BitSet(new long[]{0x2221906024000C02L,0x0000000000001112L});
    public static final BitSet FOLLOW_WHILE_in_whileExpr874 = new BitSet(new long[]{0x0408202C08012000L,0x0000000000008200L});
    public static final BitSet FOLLOW_boolExpr_in_whileExpr877 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DO_in_whileExpr879 = new BitSet(new long[]{0x2221906024000C00L,0x0000000000001512L});
    public static final BitSet FOLLOW_instrList_in_whileExpr882 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000400L});
    public static final BitSet FOLLOW_WEND_in_whileExpr884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FOR_in_forExpr922 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_ID_in_forExpr925 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_FROM_in_forExpr927 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOUBLE_in_forExpr930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_TO_in_forExpr932 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOUBLE_in_forExpr935 = new BitSet(new long[]{0x0000000000008000L,0x0000000000000008L});
    public static final BitSet FOLLOW_STEP_in_forExpr938 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_DOUBLE_in_forExpr941 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_DO_in_forExpr965 = new BitSet(new long[]{0x2221906034000C00L,0x0000000000001112L});
    public static final BitSet FOLLOW_instrList_in_forExpr968 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_FEND_in_forExpr970 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_IF_in_ifExpr1009 = new BitSet(new long[]{0x0408202C08012000L,0x0000000000008200L});
    public static final BitSet FOLLOW_boolExpr_in_ifExpr1012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_THEN_in_ifExpr1014 = new BitSet(new long[]{0x2221906024440C00L,0x0000000000001112L});
    public static final BitSet FOLLOW_instrList_in_ifExpr1017 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_ELSE_in_ifExpr1020 = new BitSet(new long[]{0x2221906024400C00L,0x0000000000001112L});
    public static final BitSet FOLLOW_instrList_in_ifExpr1023 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ENDIF_in_ifExpr1027 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1053 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_OR_in_boolExpr1056 = new BitSet(new long[]{0x0408202C08012000L,0x0000000000008200L});
    public static final BitSet FOLLOW_boolterm_in_boolExpr1059 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1097 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_AND_in_boolterm1100 = new BitSet(new long[]{0x0408202C08012000L,0x0000000000008200L});
    public static final BitSet FOLLOW_boolfact_in_boolterm1103 = new BitSet(new long[]{0x0000000000000042L});
    public static final BitSet FOLLOW_NOT_in_boolfact1130 = new BitSet(new long[]{0x0400202C08012000L,0x0000000000008200L});
    public static final BitSet FOLLOW_boolatom_in_boolfact1135 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_numExpr_in_boolatom1170 = new BitSet(new long[]{0x00100A1201000000L});
    public static final BitSet FOLLOW_EQUALS_in_boolatom1173 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_NOT_EQUAL_in_boolatom1178 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LT_in_boolatom1183 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_LE_in_boolatom1188 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_GT_in_boolatom1193 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_GE_in_boolatom1198 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_boolatom1202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TRUE_in_boolatom1218 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FALSE_in_boolatom1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DETECT_in_boolatom1238 = new BitSet(new long[]{0x0000040080000000L,0x0000000000000001L});
    public static final BitSet FOLLOW_side_in_boolatom1241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_numExpr1262 = new BitSet(new long[]{0x0400200000000002L});
    public static final BitSet FOLLOW_PLUS_in_numExpr1267 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_MINUS_in_numExpr1272 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_term_in_numExpr1276 = new BitSet(new long[]{0x0400200000000002L});
    public static final BitSet FOLLOW_factor_in_term1298 = new BitSet(new long[]{0x0002400000004002L});
    public static final BitSet FOLLOW_MUL_in_term1303 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_DIV_in_term1308 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_MOD_in_term1313 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_factor_in_term1317 = new BitSet(new long[]{0x0002400000004002L});
    public static final BitSet FOLLOW_PLUS_in_factor1338 = new BitSet(new long[]{0x0000002C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_MINUS_in_factor1343 = new BitSet(new long[]{0x0000002C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_atom_in_factor1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_atom1368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom1380 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSX_in_atom1392 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GETPOSY_in_atom1404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_atom1416 = new BitSet(new long[]{0x0400202C00010000L,0x0000000000008000L});
    public static final BitSet FOLLOW_numExpr_in_atom1419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
    public static final BitSet FOLLOW_80_in_atom1421 = new BitSet(new long[]{0x0000000000000002L});

}