/*
Máster Completo en Java de Cero a Experto

Sección 3: Tipo String: Cadenas
Video 34: Algunos métodos útiles para convertir un String en un Arreglo
*/

public class StringArreglos {

    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        // El método toCharArray convierte el String en un arreglo de caracteres
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());  // Muestra la referencia en memoria del arreglo

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;  // El length en un arreglo es una propiedad

        System.out.println("largo = " + largo);

        for (int i=0; i < largo; i++) {
            System.out.println(arreglo[i]);
        }
        System.out.println();

        // El método split devuelve un arreglo pero separando a partir del argumento que se le pase
        System.out.println("trabalenguas.split(\"a\") = " + trabalenguas.split("a"));  // Muestra la referencia en memoria

        String[] arreglo2 = trabalenguas.split("a");
        int l = arreglo2.length;

        for (int j=0; j < l; j++) {
            System.out.println(arreglo2[j]);
        }
        System.out.println();

        String archivo = "alguna.imagen.png";
        String[] archivoArr = archivo.split("\\.");  // Con doble '\' escapamos el caracter '.' para poder usarlo como expresión regular
        l = archivoArr.length;

        for (int j=0; j < l; j++) {
            System.out.println(archivoArr[j]);
        }
        System.out.println();

        System.out.println("Extensión = " + archivoArr[l - 1]);
    }

}
