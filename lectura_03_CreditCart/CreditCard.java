public class CreditCard {
    static boolean validador(String NumCard) {
        int suma = 0;
        int countNum = NumCard.length();
        boolean verified = false;
        for (int i = countNum - 1; i > 0; i--) {
            int t = NumCard.charAt(i) - '0';
            // duplicamos cada 2do digito digito
            if (verified == true) {
                t = t * 2;
            }
            suma += t / 10;
            suma += t % 10;

            verified = !verified;

        }
        return (suma % 10 == 0);
    }

    String NumCard = new String();
    {
        if (validador(NumCard))
            System.out.println("Tarjeta validada correctamente");
        else
            System.out.println("Tarjeta no validada");

    }
}