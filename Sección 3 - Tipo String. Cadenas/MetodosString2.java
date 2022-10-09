/*
Máster Completo en Java de Cero a Experto

Sección 3: Tipo String: Cadenas
Video 32: Métodos importantes del objeto String (Parte 2)
*/

public class MetodosString2 {

    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";

        // Reemplaza el primer caracter del argumento por el segundo caracter del argumento
        System.out.println("trabalenguas.replace(\"a\", \"A\") = " + trabalenguas.replace("a", "."));

        // Devuelve el índice donde se encuentra el caracter pasado por argumento
        System.out.println("trabalenguas.indexOf('a') = " + trabalenguas.indexOf('a'));

        // A diferencia de indexOf, éste método devuelve la última ocurrencia donde encuentra el caracter
        System.out.println("trabalenguas.lastIndexOf('a') = " + trabalenguas.lastIndexOf('a'));

        // Si indexOf no encuentra nada devuelve un -1
        System.out.println("trabalenguas.indexOf('z') = " + trabalenguas.indexOf('z'));
        
        // Devuelve un booleando para saber si el String pasado por argumento se encuentra en la cadena original
        System.out.println("trabalenguas.contains(\"a\") = " + trabalenguas.contains("a"));
        System.out.println("trabalenguas.contains(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("trabalenguas.contains(\"lenguas\") = " + trabalenguas.contains("lenguas"));

        // Devuelve un booleano para saber con que cadena comienza el String original
        System.out.println("trabalenguas.startsWith(\"lenguas\") = " + trabalenguas.startsWith("lenguas"));
        System.out.println("trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));

        // Devuelve un booleano para saber con que cadena termina el String original
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));

        // El método trim quita espacios en blanco al principio y al final
        System.out.println(" trabalenguas ".trim());
    }

}
