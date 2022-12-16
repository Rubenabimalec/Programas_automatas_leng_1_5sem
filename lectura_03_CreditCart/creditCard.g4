grammar creditCard;

// Sources: Luhn algorithm https://www.groundlabs.com/blog/anatomy-of-a-credit-card/
// https://www.dcode.fr/luhn-algorithm
creditCard: cards+;

cards:
	q1 = QUARTER q2 = QUARTER q3 = QUARTER q4 = QUARTER {
        //Create a method for verified credit card
        CreditCard Tarjeta= new CreditCard();
	boolean NumCard=Tarjeta.validador($q1.getText()+$q2.getText()+$q3.getText()+$q4.getText());
        System.out.println(NumCard);

};
DATE: [09]+ [/][0-9]+ -> skip;
PIN: 'PIN' [ \t]+ ';'? ':'? [0-9][0-9][0-9][0-9] -> skip;
QUARTER: [0-9]+;
SPACEWITH: ~[ ] -> skip;
ESPACIOS: [ \t\n\r]+ -> skip;
