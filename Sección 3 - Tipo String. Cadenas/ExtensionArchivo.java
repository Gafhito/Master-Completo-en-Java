/*
Máster Completo en Java de Cero a Experto

Sección 3: Tipo String: Cadenas
Video 33: Obtener la extensión de un archivo
*/

public class ExtensionArchivo {

    public static void main(String[] args) {
        String archivo = "alguna.imagen.jpeg";
        int i = archivo.lastIndexOf(".");  // Devuelve la última ocurrencia donde aparece el punto

        // A partir del índice donde aparece el punto,
        // se obtiene un substring para obtener cualquier extensión de archivo
        System.out.println(archivo.substring(i+1));
    }

}
