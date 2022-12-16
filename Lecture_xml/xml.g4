grammar xml;

programa: xml;

//tonks
xml: tags;
tags: open_tag data close_tag;
open_tag:
	MAY TEXT MEN
	| MAY TEXT IGUAL COMILLA TEXT COMILLA MEN;
data: tags+ | TEXT;
close_tag: MAY SLASH TEXT MEN;

TEXT: [a-zA-Z0-9':! ]+;
MAY: '<';
MEN: '>';
IGUAL: '=';
COMILLA: '"';
SLASH: '/';
ESPACIOS: [ \t\r\n]+ -> skip;