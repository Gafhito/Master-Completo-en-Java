/*
Máster Completo en Java de Cero a Experto

Sección 3: Tipo String: Cadenas
Video 26: Creando objeto String en la literal vs operador new
*/

public class EjemploString {

    public static void main(String[] args) {
        // Creación del objeto String de forma literal
        String curso = "Programación Java";

        // Creación del objeto String por constructor (usando el operador new)
        String curso2 = new String("programación java");

        // Comparación por referencia del objeto (compara si son el mismo objeto en memoria)
        boolean esIgual = curso == curso2;
        System.out.println("curso == curso2: " + esIgual);

        // Comparación por valor del objeto (compara el contenido)
        esIgual = curso.equals(curso2);  // Compara teniendo en cuenta mayúsculas y minúsculas
        System.out.println("curso.equals(curso2): " + esIgual);

        esIgual = curso.equalsIgnoreCase(curso2);  // Compara sin tener en cuenta las mayúsculas y minúsculas
        System.out.println("curso.equalsIgnoreCase(curso2): " + esIgual);

        // En caso de crear un objeto con un valor ya existente, el nuevo
        // objeto hace referencia al primero en memoria (es decir son el mismo objeto)
        String curso3 = "Programación Java";
        esIgual = curso == curso3;
        System.out.println("curso == curso3: " + esIgual);
    }

}
