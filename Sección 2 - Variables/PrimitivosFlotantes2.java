/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 14: Primitivos numéricos de punto flotante y sus constantes
*/

public class PrimitivosFlotantes2 {

    static float flotante;  // Variable de clase para ver valor por defecto

    public static void main(String[] args) {
        // Flotante de tipo float
        float realFloat = 0.00000000015F;
        System.out.println("realFloat = " + realFloat);
        System.out.println("El tipo float corresponde a " + Float.BYTES + " bytes");
        System.out.println("El tipo float corresponde a " + Float.SIZE + " bits");
        System.out.println("El valor máximo de un float es: " + Float.MAX_VALUE);
        System.out.println("El valor mínimo de un float es: " + Float.MIN_VALUE);
        System.out.println();

        // Flotante de tipo double
        double realDouble = 3.4028235E38;
        System.out.println("realDouble = " + realDouble);
        System.out.println("El tipo double corresponde a " + Double.BYTES + " bytes");
        System.out.println("El tipo double corresponde a " + Double.SIZE + " bits");
        System.out.println("El valor máximo de un double es: " + Double.MAX_VALUE);
        System.out.println("El valor mínimo de un double es: " + Double.MIN_VALUE);
        System.out.println();

        // Variable de tipo dinámico

        var varFlotante = 3.1416F;
        System.out.println("varFlotante = " + varFlotante);
        System.out.println();

        // Valores por defecto de variables flotantes
        System.out.println("flotante = " + flotante);
    }

}
