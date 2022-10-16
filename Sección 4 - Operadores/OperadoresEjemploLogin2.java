/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 44: Ejemplo login usando arreglos
*/

import java.util.Scanner;

public class OperadoresEjemploLogin2 {

    public static void main(String[] args) {
        // Creación de arreglos de tipo String que almacenará 2 valores en memoria cada uno
        String[] usernames = new String[3];
        String[] passwords = new String[3];
        // NT: Los arreglos los índices comienzan a contarse desde el número 0

        // Almacenamiento de valores en los arreglos (en la primera posición)
        usernames[0] = "gonzalo";
        passwords[0] = "123";

        // Almacenamiento de valores en los arreglos (en la segunda posición)
        usernames[1] = "admin";
        passwords[1] = "1234";

        // Almacenamiento de valores en los arreglos (en la tercera posición)
        usernames[2] = "pepe";
        passwords[2] = "12345";

        /*
        // Los arreglos en Java también se pueden declarar e inicializar de forma reducida:

        String[] usernames = {"gonzalo", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};
        */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username:");
        String u = scanner.next();

        System.out.println("Ingrese el password:");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i=0; i < usernames.length; i++) {
            if ( usernames[i].equals(u) && passwords[i].equals(p) ) {
                esAutenticado = true;
                break;
            }
        }

        if (esAutenticado) {
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Username o contraseña incorrecto!");
            System.out.println("Lo siento, requiere autenticación");
        }
    }

}
