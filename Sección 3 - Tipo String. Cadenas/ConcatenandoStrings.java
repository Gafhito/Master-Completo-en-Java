/*
Máster Completo en Java de Cero a Experto

Sección 3: Tipo String: Cadenas
Video 27: Concatenando String
*/

public class ConcatenandoStrings {

    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        // Para concatenar Strings se utiliza el operador +
        String detalle = curso + " con el instructor " + profesor;
        System.out.println(detalle);

        int a = 10;
        int b = 5;

        // Dependiendo de la precedencia de operadores tratará los números como strings
        System.out.println(detalle + a + b);

        // Si una parte está entre paréntesis, realizará primero esa operación
        System.out.println(detalle + (a + b));

        // Por la precedencia de operadores, si primero hay números los suma y luego concatena con los Strings
        System.out.println(a + b + detalle);

        // Se puede usar el método concat() para concatenar varios Strings
        String detalle2 = curso.concat(" con ").concat(profesor);
        System.out.println("detalle2 = " + detalle2);
    }

}
