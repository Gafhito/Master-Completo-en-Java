/*
Máster Completo en Java de Cero a Experto

Sección 3: Tipo String: Cadenas
Video 28: Inmutabilidad
*/

public class InmutabilidadStrings {

    public static void main(String[] args) {
        String curso = "Programación Java";
        String profesor = "Andrés Guzmán";

        // Al crear una nueva instancia se guarda allí la concatenación
        String resultado = curso.concat(profesor);
        System.out.println("curso = " + curso);
        System.out.println("resultado = " + resultado);
        System.out.println(curso == resultado);  // Como lo concatenado es un nuevo objeto, no serán iguales

        // transform() retorna un String modificado, con lo cual no modifica el original
        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });
        System.out.println("curso = " + curso);
        System.out.println("resultado2 = " + resultado2);

        // replace() retorna el cambio de una cadena del String por una nueva
        String resultado3 = resultado.replace("a", "A");
        System.out.println("resultado = " + resultado);
        System.out.println("resultado3 = " + resultado3);
    }

}
