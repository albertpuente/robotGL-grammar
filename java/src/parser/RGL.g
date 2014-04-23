grammar RGL;

options {
    output = AST;
    ASTLabelType = RGLTree;
}

// Imaginary tokens to create some AST nodes
tokens {
    ASSIGN;     // Assignment instruction
    //FUNCALL;    // Function call
    
    INSTRLIST;      //instruction list token
    ARGLIST;        //argument list token
    PROGRAM;        //main code
    ACTIONLIST;    //list of actions (defined functions)
    RGL;            //initial node
}

@header {
    package parser;
    import interp.RGLTree;
}

@lexer::header {
    package parser;
}


// A program is a list of instructions
prog    : actions? main EOF
         -> ^(RGL ^(ACTIONLIST actions?) ^(INSTRLIST main))
        ;

actions : ACTIONS! declaration* ENDACTIONS!
        ;

declaration : FUNC! ID^ argList ':'! instrList ENDFUNC!
        	;
        	
main    : BEGIN! instr+ END!
	    ;

instr   :
        //typical instructions
        whileExpr | forExpr                         //loops
        | ifExpr                                    //conditionals
        | CALL! ID^ (numExpr (','! numExpr)*)?      //func call
        | ID '='^ numExpr                           //assignation
        
        //robot commands
        | INITROBOT^ numExpr ','! numExpr ','! numExpr  //initRobot x, y, angle
        | MOVEFORWARD^ numExpr
        | STOPROBOT^ numExpr
        | MOVETO^ numExpr ','! numExpr
        | ROTATE^ numExpr
        | FACE^ direction
        | PICKOBJECT
        | RELEASEOBJECT
        | OBSTACLE^ numExpr ','! numExpr
        | BOX^ numExpr ','! numExpr
        | TRAIL^ (boolExpr | ON | OFF)
        | MARK^ numExpr ','! numExpr
        ;

argList : args? -> ^(ARGLIST args?)
        ;
args    : arg (','! arg)*
        ;

arg     : ID | INT
        ;

instrList   : instr*  -> ^(INSTRLIST instr*)
            ;    
                  
whileExpr   : WHILE^ boolExpr DO! instrList WEND!
            ;
            
forExpr     : FOR^ ID IN! INT '..'! INT DO! instrList FEND!
            ;
            
ifExpr      : IF^ boolExpr THEN! instrList (ELSE! instrList)? ENDIF!
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

direction   : NORTH | SOUTH | EAST | WEST
            ;
            
// Basic tokens
INITROBOT	: 'initRobot';
MOVEFORWARD	: 'moveForward';
MOVETO		: 'moveTo';
ROTATE		: 'rotate';
STOPROBOT   : 'stopRobot';
PICKOBJECT	: 'pickObject';
RELEASEOBJECT	: 'releaseObject';
DETECT		: 'detect';
OBSTACLE	: 'obstacle';
BOX		: 'box';
TRAIL	: 'trail';
MARK    : 'mark';
GETPOSX : 'getPosX';
GETPOSY : 'getPosY';
ON      : 'on';
OFF     : 'off';

FACE    : 'face';
NORTH   : 'north';
SOUTH   : 'south';
EAST    : 'east';
WEST    : 'west';

CALL	: 'call';
AND     : 'and';
OR      : 'or';
NOT     : 'not';
IF      : 'if';
ELSE 	: 'else';
THEN	: 'then';
ENDIF	: 'endif';
WHILE	: 'while';
DO  	: 'do';
WEND	: 'wend';
FOR	    : 'for';
IN	    : 'in';
FEND	: 'fend';
FUNC	: 'func';
ENDFUNC	: 'endfunc';
BEGIN	: 'BEGIN';
END	    : 'END';
ACTIONS	: 'ACTIONS';
ENDACTIONS  : 'ENDACTIONS';
TRUE   	: 'true';
FALSE 	: 'false';
RETURN	: 'return' ;
READ	: 'read' ;
WRITE	: 'write' ;
ID     	:   ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
INT    	:   '0'..'9'+ ;

EQUAL	: '=' ;

EQUALS  : '==' ;
NOT_EQUAL: '!=' ;
LT	    : '<' ;
LE	    : '<=';
GT	    : '>';
GE	    : '>=';
PLUS	: '+' ;
MINUS	: '-' ;
MUL	    : '*';
DIV	    : '/';
MOD	    : '%' ;
STRING  :  '"' ( ESC_SEQ | ~('\\'|'"') )* '"';
ESC_SEQ
    :   '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\')
    ;

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

