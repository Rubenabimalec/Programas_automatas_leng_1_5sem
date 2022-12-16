grammar grama3;

programa: grama3;

grama3:tags;
array: open_tags data close_tag ;
open_tags: MAY TEXT MEN | MAY TEXTT IGUAL COMILLA COMILLA MEN;
data: tags+ |TEXT;
close_tag; MAY SLASH TEXT MEN;

TEXT:[a-zA-Z09':!]+;
MAY:'<';
MEN:'>';
IGUAL:'=';
COMILLA:'"';
SLASH:'/';
ESPACIOS: [ \t\r\n]+ -> skip;