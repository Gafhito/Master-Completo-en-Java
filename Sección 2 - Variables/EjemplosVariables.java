/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 9: Ejemplos de variables
*/

public class EjemplosVariables {

    public static void main(String[] args) {
        // Esto es un comentario en una única línea

        /*
        Y esto es un comentario
        en múltiples
        líneas
         */

        // Declaración e iniciación de variable de tipo String
        String saludar = "Hola Mundo desde Java";
        System.out.println(saludar);
        System.out.println("saludar = " + saludar.toUpperCase());  // Método de objeto de tipo String

        // Declaración e iniciación de variable de tipo int
        int numero = 10;
        System.out.println("numero = " + numero);

        // Variable de tipo booleana
        boolean valor = true;
        int numero2 = 5;

        if (valor) {
            System.out.println("numero = " + numero);
            numero2 = 10;
        }

        System.out.println("numero2 = " + numero2);

        // Variable de tipado dinámico
        var numero3 = "15";
        System.out.println("numero3 = " + numero3);
    }

}
