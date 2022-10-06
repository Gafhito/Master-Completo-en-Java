/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Tarea 2: Detalle de la factura
*/

import java.util.Scanner;

public class DetalleDeFactura {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un nombre o descripción para la factura:");
        String nombre = entrada.nextLine();

        System.out.println("Ingrese el precio del primer producto:");
        double precio1 = entrada.nextDouble();

        System.out.println("Ingrese el precio del segundo producto:");
        double precio2 = entrada.nextDouble();

        double totalBruto = precio1 + precio2;
        double impuesto = totalBruto * 0.19;
        double totalNeto = totalBruto + impuesto;

        String detalle = "La factura " + nombre + " tiene un total bruto de " + totalBruto;
        detalle += ", con un impuesto de " + impuesto;
        detalle += " y el monto después de impuesto es de " + totalNeto;

        System.out.println(detalle);
    }

}
