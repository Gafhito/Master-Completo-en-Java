/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 49: Operador Instanceof con tipos abstractos
*/

public class OperadorInstanceOf2 {

    public static void main(String[] args) {
        // También se pueden declarar variables usando las clases padres
        Object texto = "Creando un objeto de la clase String";
        Number numero = 7;
        Number decimal = 45.54;

        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String: " + b1);

        boolean b2 = texto instanceof Object;
        System.out.println("texto es del tipo Object:  " + b2);

        boolean b3 = texto instanceof Integer;  // Al ser una variable más general se permiten estas comparaciones
        System.out.println("texto es del tipo Integer:  " + b3);
        System.out.println();

        boolean b4 = numero instanceof Integer;
        System.out.println("numero es del tipo Integer: " + b4);

        boolean b5 = numero instanceof Long;  // Al ser de un tipo general también permite comparar si es Long
        System.out.println("numero es del tipo Long: " + b5);
        System.out.println();

        boolean b6 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number: " + b6);

        boolean b7 = decimal instanceof Float;  // Se permite comparar si es flotante o no un real al declararlo genéricamente
        System.out.println("decimal es del tipo Float: " + b7);
    }

}
