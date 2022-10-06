/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 20: Sistemas numéricos y entradas de datos desde el terminal
*/

import java.util.Scanner;

public class EntradaDatos2 {

    public static void main(String[] args) {
        // Creación de un objeto de tipo Scanner para obtener datos desde la terminal
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un número entero: ");
        int numeroDecimal = 0;

        try {
            numeroDecimal = entrada.nextInt();  // El método nextInt() permite recibir un String y convertirlo a entero
        } catch (Exception e) {
            System.out.println("Error, debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        String mensaje = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNúmero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nNúmero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        System.out.println(mensaje);
    }

}
