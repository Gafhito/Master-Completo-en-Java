/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 23: Conversiones entre tipos primitivos
*/

public class ConversionDeTipos3 {

    public static void main(String[] args) {
        int i = 42768;

        // El tipo int se puede castear a un tipo short, pero si excede el
        // máximo valor permitido entonces hay pérdida de información (ambigüedad en los datos)
        short s = (short) i;
        System.out.println("s = " + s);

        // El tipo int se puede castear a un tipo long sin problemas
        // porque el máximo valor de un long es superior al tipo int
        long l = i;
        System.out.println("l = " + l);

        // El tipo int también se puede castear a un tipo char, pero
        // en este caso mostrará el carácter decimal correspondiente
        char c = (char) i;
        System.out.println("c = " + c);

        // El tipo int se puede castear sin problemas en un tipo de dato float
        float f = (float) i;
        System.out.println("f = " + f);
    }

}
