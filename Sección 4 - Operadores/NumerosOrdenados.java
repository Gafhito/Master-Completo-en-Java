/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Tarea 4: Mostrar ordenados dos números
*/

import java.util.Scanner;

public class NumerosOrdenados {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero1 = input.nextInt();

        System.out.print("Ingrese otro número: ");
        int numero2 = input.nextInt();
        System.out.println();

        String numeros = (numero1 > numero2) ? (numero1 + ", " + numero2) : (numero2 + ", " + numero1);
        System.out.println("Orden de mayor a menor: " + numeros);
    }

}
