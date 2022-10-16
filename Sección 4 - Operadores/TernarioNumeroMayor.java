/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 47: Operador Ternario número mayor
*/

import java.util.Scanner;

public class TernarioNumeroMayor {

    public static void main(String[] args) {
        int max = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese un segundo número: ");
        int num2 = scanner.nextInt();

        System.out.print("Ingrese un tercer número: ");
        int num3 = scanner.nextInt();

        System.out.print("Ingrese un cuarto número: ");
        int num4 = scanner.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("El número mayor es " + max);
    }

}
