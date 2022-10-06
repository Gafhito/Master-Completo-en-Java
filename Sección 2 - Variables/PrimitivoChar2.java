/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 16: Char y caracteres especiales
*/

public class PrimitivoChar2 {

    public static void main(String[] args) {
        char espacio = '\u0020';
        System.out.println("Una cosa" + espacio + "y otra cosa");

        char retroceso = '\b';
        System.out.println("Algo" + retroceso);

        char tabulador = '\t';
        System.out.println("Una cosa" + tabulador + "y otra cosa");
        System.out.println();

        char nuevaLinea = '\n';
        System.out.println("Ésta es la primera línea" + nuevaLinea + "y ésta es la segunda línea");
        System.out.println();

        char retornoCarro = '\r';
        System.out.println("Ésta es la primera línea" + retornoCarro + "y ésta es la segunda línea");
    }

}
