/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 45: Operador Ternario
*/

import java.util.Scanner;

public class OperadorTernario {

    public static void main(String[] args) {
        // Operador ternario
        String variable = 7 == 5 ? "Es verdadero" : "Es falso";
        System.out.println("variable = " + variable);

        // Ejemplo dinámico de operador ternario

        String estado = "";
        double promedio = 0.0;
        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la nota de matemáticas: ");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de ciencias: ");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de historia: ");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;
        System.out.println("promedio = " + promedio);

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado";
        System.out.println("estado = " + estado);

        /*
        NT: El operador ternario evita utilizar un bloque condicional if-else como el siguiente

        if (promedio >= 5.49) {
            estado = "Aprobado";
        } else {
            estado = "Rechazado";
        }
        */
    }

}
