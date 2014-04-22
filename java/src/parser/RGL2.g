grammar RGL;

options {
    output = AST;
    ASTLabelType = RGLTree;
}

// Imaginary tokens to create some AST nodes
tokens {
    INSTRLIST;     //instruction list token
}


@header {
    package parser;
    import interp.RGLTree;
}

@lexer::header {
    package parser;
}

/* TODO list
- arreglar arbre generat per funcions
- fer visibles els tokens BEGIN/END/ACTIONS/ENDACTIONS?
*/

/* MAYBE list
- funcions d'ints (i booleans?)
- variables de tipus bool
*/


// A program is a list of instructions

prog    :  main EOF
        ;

//actions : ACTIONS! declaration+ ENDACTIONS!
//        ;

//declaration : FUNC! ID^ argList? ':'! instrList? ENDFUNC!
//            ;

main    : BEGIN instr* END!
        ;

instr   :
        //typical instructions
        whileExpr | forExpr                         //loops
        | ifExpr                                    //conditionals
        | CALL! ID^ argList?                        //func call
        | ID '='^ numExpr                           //assignation
        
        //robot commands
        | INITROBOT^ numExpr ','! numExpr
        | MOVEFORWARD^ numExpr
        | PAUSEROBOT^ numExpr
        | STOPROBOT
        | MOVETO^ numExpr ','! numExpr
        | ROTATE^ numExpr
        | PICKOBJECT
        | RELEASEOBJECT
        | OBSTACLE^ numExpr ','! numExpr
        | BOX^ numExpr ','! numExpr
        | TRAIL^ (boolExpr | ON | OFF)
        | MARK^ numExpr ','! numExpr
        ;

argList : numExpr (','! numExpr)*
        ;

instrList   : instr* -> ^(INSTRLIST instr*)
            ;
       
whileExpr   : WHILE^ boolExpr DO! instr* WEND!
            ;
            
forExpr     : FOR^ ID IN! INT '..'! INT DO! instr* FEND!
            ;
            
ifExpr      : IF^ boolExpr THEN! instr* (ELSE! instr*)? ENDIF!
            ;

boolExpr    : boolterm (OR^ boolterm)*
            ;
            
boolterm    : (NOT^)? boolfact (AND^ boolfact)*
            ;
            
boolfact    : numExpr ('=='^ | '!='^ | '<'^ | '<='^ | '>'^ | '>='^) numExpr
            | TRUE | FALSE
            | DETECT^ numExpr
            ;

numExpr : term ( ('+'^ | '-'^) term)*
        ;

term    : factor ( ('*'^ | '/'^ | '%'^) factor)*
        ;

factor  : ('+'^ | '-'^)? atom
        ;

atom    : INT
        | ID
        | GETPOSX
        | GETPOSY
        | '('! numExpr ')'!
        ;

// Basic tokens
INITROBOT   : 'initRobot';
MOVEFORWARD : 'moveForward';
MOVETO      : 'moveTo';
ROTATE      : 'rotate';
PAUSEROBOT  : 'pauseRobot';
STOPROBOT   : 'stopRobot';
PICKOBJECT  : 'pickObject';
RELEASEOBJECT   : 'releaseObject';
DETECT      : 'detect';
OBSTACLE    : 'obstacle';
BOX     : 'box';
TRAIL   : 'trail';
MARK    : 'mark';
GETPOSX : 'getPosX';
GETPOSY : 'getPosY';
ON      : 'on';
OFF     : 'off';

CALL    : 'call';
AND     : 'and';
OR      : 'or';
NOT     : 'not';
IF      : 'if';
ELSE    : 'else';
THEN    : 'then';
ENDIF   : 'endif';
WHILE   : 'while';
DO      : 'do';
WEND    : 'wend';
FOR     : 'for';
IN      : 'in';
FEND    : 'fend';
FUNC    : 'func';
ENDFUNC : 'endfunc';
BEGIN   : 'BEGIN';
END     : 'END';
ACTIONS : 'ACTIONS';
ENDACTIONS  : 'ENDACTIONS';
TRUE    : 'true';
FALSE   : 'false';
ID      :   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INT     :   '0'..'9'+ ;

// C-style comments
COMMENT : '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
        | '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
        ;
// White spaces
WS      : ( ' '
        | '\t'
        | '\r'
        | '\n'
        ) {$channel=HIDDEN;}
        ;
