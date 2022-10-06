/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 10: Reglas para definir una variable
*/

public class ReglasVariables {

    public static void main(String[] args) {
        String nombre;

        // Las variables siempre deben estar inicializadas antes de trabajar con ellas
        nombre = "Juan";

        int numero = 11;
        if (numero > 10) {
            nombre = "Gonzalo";
        }

        System.out.println("nombre = " + nombre);

        // Las variables no pueden tener alguna de las palabras reservadas del lenguaje por nombre
        // Por ej: int if = 15;

        // No pueden comenzar por un número
        // Por ej: int 1edad = 5;

        // Pero si pueden tener números en medio
        int e5dad = 5;
        System.out.println("e5dad = " + e5dad);

        // Las variables no pueden tener caracteres extraños, salvo el signo $ y el signo _
        String $nombre = "Fulano";
        String _nombre = "Mengano";

        System.out.println("$nombre = " + $nombre);
        System.out.println("_nombre = " + _nombre);

        // Por convención si el nombre de la variable está compuesto por más de una palabra se utiliza:
        int edad_persona = 23;  // Under case
        int edadPersona = 26;  // Camel case (ésta forma es el estándar del lenguaje Java)

        System.out.println("edad_persona = " + edad_persona);
        System.out.println("edadPersona = " + edadPersona);

        // No es recomendable utilizar acentos y/o la letra ñ para declarar nombres de variables
        int teléfonoñ = 5;

        System.out.println("teléfonoñ = " + teléfonoñ);
    }

}
