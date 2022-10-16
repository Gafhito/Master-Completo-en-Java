/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 41: Operadores Lógicos
*/

public class OperadoresLogicos {

    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7F;
        double l = 2.1413e3;
        boolean m = false;

        // Operador AND
        boolean b1 = i == j && k < l && m == false;
        System.out.println("(3 = 7) and (127e-7 < 2141.3) and (false = false): " + b1);

        // Operador OR
        boolean b2 = i == j || k < l;
        System.out.println("(3 = 7) or (127e-7 < 2141.3): " + b2);

        // Se puede cambiar la precedencia de los operadores utilizando paréntesis
        boolean b3 = i == j && k > l || m == false;
        System.out.println("3 = 7 and 127e-7 > 2141.3 or false = false: " + b3);

        boolean b4 = i == j && (k > l || m == false);
        System.out.println("3 = 7 and (127e-7 > 2141.3 or false = false): " + b4);
    }

}
