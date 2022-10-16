/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 46: Ejemplo login con operador ternario
*/

import java.util.Scanner;

public class OperadoresEjemploLogin3 {

    public static void main(String[] args) {
        String[] usernames = {"gonzalo", "admin", "pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el username:");
        String u = scanner.next();

        System.out.println("Ingrese el password:");
        String p = scanner.next();

        boolean esAutenticado = false;

        for (int i=0; i < usernames.length; i++) {
            // NT: En un operador ternario NO se puede utilizar una instrucción break
            esAutenticado = ( usernames[i].equals(u) && passwords[i].equals(p) ) ? true : esAutenticado;
        }

        String mensaje = esAutenticado ? "Bienvenido usuario ".concat(u).concat("!") :
                "Username o contraseña incorrecto!\nLo siento, requiere autenticación";

        System.out.println(mensaje);
    }

}
