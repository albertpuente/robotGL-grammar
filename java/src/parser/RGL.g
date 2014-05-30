grammar RGL;

options {
    output = AST;
    ASTLabelType = RGLTree;
}

// Imaginary tokens to create some AST nodes
tokens {
    CALL;           //action call
    GET;            //func call (which returns a value)
    INSTRLIST;      //instruction list token
    ARGLIST;        //argument list token
    PROGRAM;        //main code
    DEFINELIST;     //list of actions (defined functions)
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
prog    : definitions? main EOF
         -> ^(RGL ^(DEFINELIST definitions?) ^(INSTRLIST main))
        ;

definitions : DEFINITIONS! declaration* ENDDEFINITIONS! ;

declaration : action | function ;
            
action  : ACTION^ ID argList ':'! instrList ENDACTION! ;
function : FUNC^ ID argList ':'! instrList ENDFUNC! ;
        	
main    : BEGIN! initialInstr instr* END! ;
	    
initialInstr :  setMap? setRobot ;
setMap  :   INITMAP^ INT ;
setRobot    : INITROBOT^ numExpr ','! numExpr ','! numExpr ;

instr   :
        //typical instructions
        whileExpr | forExpr                                 //loops
        | ifExpr                                            //conditionals
        | actioncall
        | ID '='^ numExpr                                   //assignation
        | RETURN^ numExpr
        
        //robot commands
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
        
actioncall  : ID '(' params? ')'
        -> ^(CALL ID params?)
        ;
        
funccall: ID '(' params? ')'
        -> ^(GET ID params?)
        ;
        
params : numExpr (','! numExpr)* ;

argList : args? -> ^(ARGLIST args?) ;
args    : arg (','! arg)* ;

arg     : ID 
        | DOUBLE
        ;

instrList   : instr*  -> ^(INSTRLIST instr*) ;    
                  
whileExpr   : WHILE^ boolExpr DO! instrList WEND! ;
            
forExpr     : FOR^ ID FROM! numExpr TO! numExpr (STEP! numExpr)? DO! instrList FEND! ;
            
ifExpr      : IF^ boolExpr THEN! instrList (ELSE! instrList)? ENDIF! ;


boolExpr    : boolterm (OR^ boolterm)* ;
            
boolterm    : boolfact (AND^ boolfact)* ;

boolfact    : (NOT^)? boolatom ;
            
boolatom   : numExpr ('=='^ | '!='^ | '<'^ | '<='^ | '>'^ | '>='^) numExpr
            | TRUE | FALSE
            | DETECT^ side
            ;

numExpr : term ( ('+'^ | '-'^) term)* ;

term    : factor ( ('*'^ | '/'^ | MOD^) factor)* ;

factor  : ('+'^ | '-'^)? atom ;

atom    : (DOUBLE | INT)
        | ID
        | funccall
        | predefined
        | GETPOSX
        | GETPOSY
        | '('! numExpr ')'!
        ;

predefined  : SIN^ '('! numExpr ')'!
            | COS^ '('! numExpr ')'!
            | SQRT^ '('! numExpr ')'!
            ;

direction   : NORTH | SOUTH | EAST | WEST ;
side      : FRONT | RIGHT | LEFT ;
            
// Basic tokens
INITROBOT	: 'initRobot';
INITMAP     : 'initMap';
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

SIN     : 'sin';
COS     : 'cos';
SQRT    : 'sqrt';

FACE    : 'face';
NORTH   : 'north';
SOUTH   : 'south';
EAST    : 'east';
WEST    : 'west';

FRONT   : 'front';
RIGHT   : 'right';
LEFT    : 'left';

RETURN  : 'return';
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
FROM    : 'from';
TO      : 'to';
STEP    : 'step';
FEND	: 'fend';

DEFINITIONS	: 'DEFINITIONS';
ENDDEFINITIONS  : 'ENDDEFINITIONS';
FUNC	: 'func';
ENDFUNC	: 'endfunc';
ACTION  : 'action';
ENDACTION   : 'endaction';
BEGIN	: 'BEGIN';
END	    : 'END';

TRUE   	: 'true';
FALSE 	: 'false';
ID     	: ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
DOUBLE	: ('0'..'9')+ '.' ('0'..'9')+ ;
INT     : '0'..'9'+;

EQUAL	: '=' ;
EQUALS  : '==' ;
NOT_EQUAL: '!=' ;
PLUS	: '+' ;
MINUS	: '-' ;
MUL	    : '*';
DIV	    : '/';
MOD	    : '%' ;

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

