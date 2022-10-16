/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 39: Operadores de Incremento y Decremento
*/

public class OperadoresIncrementales {

    public static void main(String[] args) {
        // Pre incremento
        int i = 1;
        int j = ++i;  // i = i + 1
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println();

        // Post incremento
        i = 2;
        System.out.println("Valor inicial de i = " + i);

        j = i++;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println();

        // Pre decremento
        i = 3;
        j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println();

        // Post decremento
        i = 4;
        System.out.println("Valor inicial de i = " + i);

        j = i--;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        System.out.println();

        System.out.println("(++j) = " + (++j));
        System.out.println("(j++) = " + (j++));
        System.out.println("Valor final de j = " + j);
    }

}
