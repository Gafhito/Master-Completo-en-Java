/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 36: Operadores Aritméticos
*/

import javax.swing.*;

public class OperadoresArtimeticos {

    public static void main(String[] args) {
        // Cuando son del mismo tipo se pueden declarar e inicializar más de una variable en una única línea
        int i=5, j=4;

        int suma = i + j;
        System.out.println("suma = " + suma);
        System.out.println("i + j = " + (i + j));  // Para sumar en junto a un String hay que utilizar paréntesis

        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i - j = " + (i - j));  // Para restar junto a un String también hay que utilizar paréntesis

        int multiplicacion = i * j;
        System.out.println("multiplicacion = " + multiplicacion);

        int division = i / j;  // Como el resultado se guarda en una variable entera, no se consideran los decimales
        System.out.println("division = " + division);

        float division2 = (float) i / j;  // Para dividir 2 enteros, hay que castear al menos uno a un tipo real
        System.out.println("division2 = " + division2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt( JOptionPane.showInputDialog("Ingrese un número") );

        if (numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }
    }

}
