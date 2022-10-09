/*
Máster Completo en Java de Cero a Experto

Sección 3: Tipo String: Cadenas
Video 31: Métodos importantes del objeto String (Parte 1)
*/

public class MetodosString1 {

    public static void main(String[] args) {
        String nombre = "Gonzalo";

        // Devuelve el largo del String
        System.out.println("nombre.length() = " + nombre.length());

        // Convierte caracteres a mayúsculas
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());

        // Convierte caracteres a minúsculas
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());

        // Compara teniendo en cuenta mayúsculas y minúsculas
        System.out.println("nombre.equals(\"Gonzalo\") = " + nombre.equals("Gonzalo"));
        System.out.println("nombre.equals(\"gonzalo\") = " + nombre.equals("gonzalo"));

        // Compara sin tener en cuenta mayúsculas o minúsculas
        System.out.println("nombre.equalsIgnoreCase(\"gonzalo\") = " + nombre.equalsIgnoreCase("gonzalo"));

        // Compara dependiendo de una tabla lexico-gráfica de unicode (si el valor es 0, entonces es igual)
        System.out.println("nombre.compareTo(\"Gonzalo\") = " + nombre.compareTo("Gonzalo"));

        // NT: Si el valor es distinto a 0, es por el ordenamiento léxico-gráfico unicode
        System.out.println("nombre.compareTo(\"Germán\") = " + nombre.compareTo("Germán"));

        // Obtiene el caracter que se pasó como índice por argumento
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(5) = " + nombre.charAt(5));

        // Obtiene el último caracter (sin importar el String que sea)
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        // Crea una subcadena desde el caracter con índice pasado por argumento hasta el final
        System.out.println("nombre.substring(1) = " + nombre.substring(1));

        /* Crea una subcadena desde el caracter con índice pasado como primer argumento, hasta el
        caracter con índice pasado por el segundo argumento (sin incluirlo) */
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1, 4));

        // Forma de obtener los últimos dos caracteres con substring
        // NT: Modificando el valor que se le resta al largo se pueden obtener más caracteres de forma invertida
        System.out.println("nombre.substring(nombre.length()-2) = " + nombre.substring(nombre.length()-2));
    }
    
}
