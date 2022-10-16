/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 40: Operadores Relacionales
*/

public class OperadoresRelacionales {

    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        // Operador de igualdad
        boolean b1 = i == j;
        System.out.println("3 = 7: " + b1);

        // Operador de negación
        boolean b2 = !b1;
        System.out.println("not false = " + b2);

        // Operador de diferencia
        boolean b3 = i != j;
        System.out.println("3 != 7: " + b3);

        // Operador de igualdad (aplicado a valores booleanos)
        boolean b4 = m == true;
        System.out.println("false = true: " + b4);

        // Operador de diferencia (aplicado a booleanos)
        boolean b5 = m != true;
        System.out.println("false != true: " + b5);

        // Operador mayor que
        boolean b6 = i > j;
        System.out.println("3 > 7: " + b6);

        // Operador menor que
        boolean b7 = i < j;
        System.out.println("3 < 7: " + b7);

        // Operador mayor o igual que
        boolean b8 = l >= k;
        System.out.println("2141.3 >= 127e-7: " + b8);

        // Operador menor o igual que
        boolean b9 = l <= k;
        System.out.println("2141.3 <= 127e-7: " + b9);
        boolean b10 = l <= l;
        System.out.println("2141.3 <= 2141.3: " + b10);
    }

}
