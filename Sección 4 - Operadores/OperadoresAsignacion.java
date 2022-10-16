/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 37: Operadores de Asignación
*/

public class OperadoresAsignacion {

    public static void main(String[] args) {
        // Operador de asignación de igualdad
        int i = 5;
        int j = i + 4;
        System.out.println("i = " + i);
        System.out.println("j = " + j);

        // Operador de asignación en suma
        i += 2;  // Esto es igual a decir 'i = i + 2'
        System.out.println("Suma: i = " + i);

        // Operador de asignación en resta
        j -= 4;  // Esto es igual a decir 'j = j - 4'
        System.out.println("Resta: j = " + j);

        // Operador en asignación en multiplicación
        i *= 3;  // Esto es igual a decir 'i = i * 3'
        System.out.println("Multiplicación: i = " + i);

        // Operador en asignación en división
        j /= 5;  // j = j / 5;
        System.out.println("División: j = " + j);

        // Operador en asignación de resto
        i %= 5;  // i = i % 5;
        System.out.println("Resto: i = " + i);

        // Operadores de asignación con Strings
        String sqlString = "select * from clientes as c";
        sqlString += " where c.nombre='Gonzalo'";
        sqlString += " and c.activo=1";
        System.out.println("sqlString = " + sqlString);
    }

}
