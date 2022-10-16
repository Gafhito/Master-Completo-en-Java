/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 42: Precedencia en los operadores lógicos
*/

public class PrecedenciaOperadoresLogicos {

    public static void main(String[] args) {
        // Primero siempre se evalúa la condición AND antes que OR
        boolean b1 = true || true && false;
        System.out.println("b1 = " + b1);

        // Si se utilizan paréntesis entonces cambia la precedencia de los operadores
        boolean b2 = (true || true) && false;
        System.out.println("b2 = " + b2);

        boolean b3 = true || (false && false) || false;  // true
        System.out.println("b3 = " + b3);

        boolean b4 = ((true || false) && false) || false;  // false
        System.out.println("b4 = " + b4);
    }

}
