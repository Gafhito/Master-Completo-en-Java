/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 19: Sistemas numéricos y entradas de datos desde ventana de diálogo
*/

import javax.swing.*;  // Para utilizar la clase JOptionPane se debe importar el paquete javax.swing

public class EntradaDatos1 {

    public static void main(String[] args) {
        // JOptionPane.showInputDialog() permite crear una ventana para ingresar datos de tipo String
        String numeroStr = JOptionPane.showInputDialog(null, "Ingrese un número entero");
        int numeroDecimal = 0;

        // try-catch es un bloque para controlar errores
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch (NumberFormatException e) {
            // Si no puede convertirse el String a un entero se muestra el siguiente error

            // JOptionPane.showMessageDialog sirve para mostrar una ventana de mensaje simple
            JOptionPane.showMessageDialog(null, "Error, debe ingresar un número entero");
            main(args);  // Se vuelve a repetir el proceso ejecutando de forma recursiva el método main
            System.exit(0);  // Al finalizar el proceso devuelve un status 0 (ejecutado con éxito)
        }

        String mensaje = "Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nNúmero octal de " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nNúmero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal);

        JOptionPane.showMessageDialog(null, mensaje);
    }

}
