grammar JSParser;

parse
 : block EOF
 ;

block
 : stat*
 ;

stat
 : assignment
 | if_stat
 | while_stat
 | log
 | OTHER {System.err.println("unknown char: " + $OTHER.text);}
 ;

assignment
 : ID ASSIGN expr SCOL
 ;

if_stat
 : IF condition_block (ELSE IF condition_block)* (ELSE stat_block)?
 ;

condition_block
 : expr stat_block
 ;

stat_block
 : OBRACE block CBRACE
 | stat
 ;

while_stat
 : WHILE expr stat_block
 ;

log
 : LOG OPAR expr CPAR SCOL
    | LOG OPAR STRING CPAR SCOL
 ;

expr
 : <assoc=right>expr POW expr          #power
 | MINUS expr                           #unaryMinus
 | NOT expr                             #not
 | expr op=(MULT | DIV | MOD) expr      #multiplication
 | expr op=(PLUS | MINUS) expr          #additive
 | expr op=(LTEQ | GTEQ | LT | GT) expr #relational
 | expr op=(EQ | NEQ) expr              #equality
 | expr AND expr                        #and
 | expr OR expr                         #or
 | atom                                 #atomic
 ;

atom
 : OPAR expr CPAR #par
 | (INT | FLOAT)  #number
 | (TRUE | FALSE) #boolean
 | ID             #id
 | STRING         #string
 | NIL            #nil
 ;

OR : '||';
AND : '&&';
EQ : '==';
NEQ : '!=';
GT : '>';
LT : '<';
GTEQ : '>=';
LTEQ : '<=';
PLUS : '+';
MINUS : '-';
MULT : '*';
DIV : '/';
MOD : '%';
POW : '^';
NOT : '!';

SCOL : ';';
ASSIGN : '=';
OPAR : '(';
CPAR : ')';
OBRACE : '{';
CBRACE : '}';

TRUE : 'true';
FALSE : 'false';
NIL : 'nil';
IF : 'if';
ELSE : 'else';
WHILE : 'while';
LOG : 'console.log';

ID
 : [a-zA-Z_] [a-zA-Z_0-9]*
 ;

INT
 : [0-9]+
 ;

FLOAT
 : [0-9]+ '.' [0-9]*
 | '.' [0-9]+
 ;

STRING
 : '"' (~["\r\n] | '""')* '"'
 ;

COMMENT
 : '#' ~[\r\n]* -> skip
 ;

SPACE
 : [ \t\r\n] -> skip
 ;
OTHER
 : .
 ;