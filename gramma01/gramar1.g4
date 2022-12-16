grammar gramar1;

programa: gramar1;

//tonks
gramar1: tags;
tags: open_tag data close_tag;
open_tag:
	MEN TEXT MAY
	| MEN TEXT IGUAL COMILLA TEXT COMILLA MAY;
data: tags+ | TEXT;
close_tag: MEN SLASH TEXT MAY;

TEXT: [a-zA-Z0-9':! ]+;
MAY: '<';
MEN: '>';
IGUAL: '=';
COMILLA: '"';
SLASH: '/';
ESPACIOS: [ \t\r\n]+ -> skip;
