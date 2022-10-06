/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 15: Primitivo char o character
*/

public class PrimitivoChar1 {

    public static void main(String[] args) {
        // Las variables de tipo char se declaran con comilla simple

        char caracter = '@';
        char caracterUnicode = '\u0040';
        char caracterDecimal = 64;

        System.out.println("caracter = " + caracter);
        System.out.println("caracterUnicode = " + caracterUnicode);
        System.out.println("caracterDecimal = " + caracterDecimal);
        System.out.println();

        System.out.println("caracter = unicode: " + (caracter == caracterUnicode));
        System.out.println("unicode = decimal: " + (caracterUnicode == caracterDecimal));
        System.out.println();

        // Variable de tipado dinámico
        var caracterVar1 = '\u0040';  // Esta variable se detecta como un char
        var caracterVar2 = 64;  // Esta variable se detecta como un entero (int)

        System.out.println("caracterVar1 = " + caracterVar1);
        System.out.println("caracterVar2 = " + caracterVar2);
        System.out.println();

        System.out.println("El tipo char corresponde a " + Character.BYTES + " bytes");
        System.out.println("El tipo char corresponde a " + Character.SIZE + " bits");
        System.out.println("El valor máximo de un char es: " + Character.MAX_VALUE);
        System.out.println("El valor mínimo de un char es: " + Character.MIN_VALUE);
    }

}
