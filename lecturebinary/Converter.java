
public class Converter {

    public int binaryToDecimal(String lexema) {
        String binario = lexema;
        int decimal = 0;
        for (int i = 0; i < binario.length(); ++i) {
             if(binario.charAt(i)=='1'){
            decimal += Math.pow(2, binario.length() - 1 - i);
             }
        }
        return decimal;
    }
}
/**
 * const = NumA.length;
 * let decimal = 0;
 * for (let i = 0; i < bitCount; i++) {
 * let posicion = bitCount - 1 - i; //posision de al inversa de i
 * let potencia_base = 2 ** i; //elevando a la base de el valor i
 * decimal = decimal + NumA[posicion] * potencia_base;
 * }
 * return decimal;
 * int number = Integer.parseInt(lexema, 2);
 * return number;
 */

/**
 * for (int i = 0; i < lexema.length(); i++) {
 * if(lexema.charAt(i)=='1'){number+=Math.pow(2,i);
 * }
 */