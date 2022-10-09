/*
Máster Completo en Java de Cero a Experto

Sección 3: Tipo String: Cadenas
Video 30: Validar un String
*/

public class ValidarStrings {

    public static void main(String[] args) {
        // ** VALIDAR SI ES NULL **

        String curso = null;  // El tipo nulo significa que el objeto no tiene contenido alguno

        boolean esNulo = curso == null;
        System.out.println("esNulo = " + esNulo);

        // Si se tratase de usar algún método lanzará una excepción de NullPointerException
        //System.out.println(curso.toUpperCase());

        if (esNulo == false) {
            System.out.println(curso.toUpperCase());
        }

        // Con el operador + se pueden concatenar Strings con valores null
        System.out.println("Bienvenido al curso " + curso);

        // Al utilizar una variable booleana en una condición solo se escibre la misma
        if (esNulo) {
            curso = "Programación Java";
        }

        System.out.println(curso.toUpperCase());
        System.out.println("Bienvenido al curso ".concat(curso));

        // ** VALIDAR SI ES VACÍO **

        curso = "";
        boolean esVacio = curso.length() == 0;  // Con el método length se obtiene la cantidad de elementos del String
        System.out.println("esVacio = " + esVacio);

        boolean esVacio2 = curso.isEmpty();  // El método isEmpty evalúa si el String está vacío
        System.out.println("esVacio2 = " + esVacio2);

        // Valida si es distinto que vacío
        if (!esVacio) {
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }

        // ** VALIDAR SI TIENE UN ESPACIO EN BLANCO **

        curso = " ";

        boolean esBlanco = curso.isBlank();  // Valida si el String tiene un espacio en blanco o si está vacío
        System.out.println("esBlanco = " + esBlanco);

        if (esBlanco) {
            curso = "Programación en Java";
            System.out.println(curso.toUpperCase());
            System.out.println("Bienvenido al curso ".concat(curso));
        }
    }

}
