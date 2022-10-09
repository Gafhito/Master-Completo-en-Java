/*
Máster Completo en Java de Cero a Experto

Sección 3: Tipo String: Cadenas
Tarea 3: Nombres de familiares
*/

import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        String nombre1, nombre2, nombre3;

        System.out.print("Ingresa el primer nombre: ");
        nombre1 = teclado.next();
        System.out.print("Ingresa el segundo nombre: ");
        nombre2 = teclado.next();
        System.out.print("Ingresa el tercer nombre: ");
        nombre3 = teclado.next();
        System.out.println();

        nombre1 = nombre1.substring(1,2).toUpperCase().concat(".").concat(nombre1.substring(nombre1.length()-2));
        nombre2 = nombre2.substring(1,2).toUpperCase().concat(".").concat(nombre2.substring(nombre2.length()-2));
        nombre3 = nombre3.substring(1,2).toUpperCase().concat(".").concat(nombre3.substring(nombre3.length()-2));

        String resultado = nombre1 + "_" + nombre2 + "_" + nombre3;
        System.out.println(resultado);

    }
}
