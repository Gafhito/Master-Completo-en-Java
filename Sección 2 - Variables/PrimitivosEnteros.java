/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 12: Primitivos numéricos enteros
*/

public class PrimitivosEnteros {

    public static void main(String[] args) {
        // Entero de tipo byte
        byte numeroByte = 127;
        System.out.println("numeroByte = " + numeroByte);
        System.out.println("El tipo byte corresponde a " + Byte.BYTES + " bytes");
        System.out.println("El tipo byte corresponde a " + Byte.SIZE + " bits");
        System.out.println("El valor máximo de un byte es: " + Byte.MAX_VALUE);
        System.out.println("El valor mínimo de un byte es: " + Byte.MIN_VALUE);
        System.out.println();

        // Entero de tipo short
        short numeroShort = 32767;
        System.out.println("numeroShort = " + numeroShort);
        System.out.println("El tipo short corresponde a " + Short.BYTES + " bytes");
        System.out.println("El tipo short corresponde a " + Short.SIZE + " bits");
        System.out.println("El valor máximo de un short es: " + Short.MAX_VALUE);
        System.out.println("El valor mínimo de un short es: " + Short.MIN_VALUE);
        System.out.println();

        // Entero de tipo integer
        int numeroInt = 2147483647;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("El tipo int corresponde a " + Integer.BYTES + " bytes");
        System.out.println("El tipo int corresponde a " + Integer.SIZE + " bits");
        System.out.println("El valor máximo de un int es: " + Integer.MAX_VALUE);
        System.out.println("El valor mínimo de un int es: " + Integer.MIN_VALUE);
        System.out.println();

        // Entero de tipo long
        long numeroLong = 9223372036854775807L;  // El tipo long exige que se coloque la letra L al final
        System.out.println("numeroLong = " + numeroLong);
        System.out.println("El tipo long corresponde a " + Long.BYTES + " bytes");
        System.out.println("El tipo long corresponde a " + Long.SIZE + " bits");
        System.out.println("El valor máximo de un long es: " + Long.MAX_VALUE);
        System.out.println("El valor mínimo de un long es: " + Long.MIN_VALUE);
        System.out.println();

        // Variable de tipo dinámico
        var numeroVar1 = 127;  // En caso que una variable de tipo var se le asigne un número, ésta será un integer
        System.out.println("numeroVar1 = " + numeroVar1);

        var numeroVar2 = 2147483648L;  // Si el valor sobrepasa el límite de un entero, entonces se debe declarar como long
        System.out.println("numeroVar2 = " + numeroVar2);

        var numeroVar3 = 9223372036854775808F;  // Si el valor sobrepasa un long, entonces se debe declarar como float o double
        System.out.println("numeroVar3 = " + numeroVar3);
    }

}
