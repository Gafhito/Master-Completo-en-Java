/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 17: Primitivo boolean o lógico binario
*/

public class PrimitivosBoolean {

    public static void main(String[] args) {
        // Primitivo boolean
        boolean datoLogico1 = true;
        boolean datoLogico2 = false;

        System.out.println("datoLogico1 = " + datoLogico1);
        System.out.println("datoLogico2 = " + datoLogico2);
        System.out.println();

        // Objeto de tipo boolean
        datoLogico1 = Boolean.FALSE.booleanValue();
        datoLogico2 = Boolean.TRUE.booleanValue();

        System.out.println("datoLogico1 = " + datoLogico1);
        System.out.println("datoLogico2 = " + datoLogico2);
        System.out.println();

        // Comparaciones relacionales
        double d = 98765.43e-3;  // 98.76543
        float f = 1.2345e2f;  // 123.45

        datoLogico1 = d > f;  // Mayor que
        datoLogico2 = d < f;  // Menor que
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("datoLogico1 = " + datoLogico1);
        System.out.println("datoLogico2 = " + datoLogico2);
        System.out.println();

        boolean esIgual = (3-2 == 1);  // Igual que
        System.out.println("esIgual = " + esIgual);
    }

}
