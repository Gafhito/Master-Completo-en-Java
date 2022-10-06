/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 18: Sistemas numéricos: decimal, binario, octal y hexadecimal
*/

public class SistemasNumericos {

    public static void main(String[] args) {
        int numeroDecimal = 500;
        System.out.println("numeroDecimal = " + numeroDecimal);
        // El método toBinaryString de la clase Integer convierte el entero a un binario
        System.out.println("Número binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        int numeroBinario = 0b111110100;  // Con el código 0b al principio Java reconoce el número como un binario
        System.out.println("numeroBinario = " + numeroBinario);
        // El método toOctalString de la clase Integer convierte el entero a un octal
        System.out.println("Número octal de " + numeroBinario + " = " + Integer.toOctalString(numeroBinario));

        int numeroOctal = 0764;  // Anteponiendo el 0, Java reconoce al número como un octal
        System.out.println("numeroOctal = " + numeroOctal);
        // El método toHexString de la clase Integer convierte el entero a un hexadecimal
        System.out.println("Número hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));

        int numeroHex = 0x1f4;  // Con el código 0x al principio Java reconoce el número como un hexadecimal
        System.out.println("numeroHex = " + numeroHex);
    }

}
