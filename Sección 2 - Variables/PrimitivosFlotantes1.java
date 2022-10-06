/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 13: Primitivos numéricos de punto flotante
*/

public class PrimitivosFlotantes1 {

    public static void main(String[] args) {
        // Flotante de tipo float
        float realFloat1 = 1.0F;  // El tipo float exige que se coloque la letra F si se inicia el valor con parte decimal
        System.out.println("realFloat1 = " + realFloat1);

        // Notación científica
        float realFloat2 = 2.12e3F;  // 2120.0
        System.out.println("realFloat2 = " + realFloat2);

        float realFloat3 = 0.00000000015F;  // 1.5e-10F
        System.out.println("realFloat3 = " + realFloat3);

        // Flotante de tipo double
        double pi = 3.141592;
        System.out.println("pi = " + pi);
    }

}
