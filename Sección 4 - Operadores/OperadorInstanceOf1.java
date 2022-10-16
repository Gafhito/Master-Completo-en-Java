/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 48: Operador Instanceof (Tipo de)
*/

public class OperadorInstanceOf1 {

    public static void main(String[] args) {
        String texto = "Creando un objeto de la clase String";
        Integer numero = 7;
        Double decimal = 45.54;
        Boolean booleano = true;

        /* instanceof permite determinar si un objeto es de un determinado tipo,
           o si extiende de alguna clase */
        boolean b1 = texto instanceof String;
        System.out.println("texto es del tipo String: " + b1);

        // Cualquier objeto desciende de la clase Object (la superclase padre)
        boolean b2 = texto instanceof Object;
        System.out.println("texto es del tipo Object: " + b2);

        boolean b3 = numero instanceof Integer;
        System.out.println("numero es del tipo Integer: " + b3);

        /* Cualquier objeto de tipo numérico (Short, Integer, Long, Float, Double),
           desciende o hereda de la clase Number */
        boolean b4 = numero instanceof Number;
        System.out.println("numero es del tipo Number: " + b4);

        boolean b5 = numero instanceof Object;
        System.out.println("numero es del tipo Object: " + b2);

        boolean b6 = decimal instanceof Number;
        System.out.println("decimal es del tipo Number: " + b6);

        // NT: NO se puede usar instanceof con primitivos, solo se puede usar con objetos
        boolean b7 = booleano instanceof Boolean;
        System.out.println("booleano es del tipo Boolean: " + booleano);
    }

}
