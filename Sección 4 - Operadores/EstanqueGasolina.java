/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Tarea 5: Sistema Estanque de gasolina
*/

import java.util.Scanner;

public class EstanqueGasolina {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int capTotal = 70;

        System.out.print("Ingrese la capacidad actual del estanque en litros: ");
        double capActual = input.nextDouble();

        if (capActual == capTotal) System.out.println("Estanque lleno");
        else if (capActual >= 60 && capActual < capTotal) System.out.println("Estanque casi lleno");
        else if (capActual >= 40 && capActual < 60) System.out.println("Estanque 3/4");
        else if (capActual >= 35 && capActual < 40) System.out.println("Medio estanque");
        else if (capActual >= 20 && capActual < 35) System.out.println("Suficiente");
        else if (capActual >= 1 && capActual < 20) System.out.println("Insuficiente");
        else System.out.println("El valor ingresado no es correcto");
    }

}
