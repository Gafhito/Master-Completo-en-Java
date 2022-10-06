/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 22: Conversiones de tipo primitivos a cadenas
*/

public class ConversionDeTipos2 {

    public static void main(String[] args) {
        int numeroInt = 100;
        // El método toString() de la clase Integer convierte un entero a un String
        String numeroStr = Integer.toString(numeroInt);
        System.out.println("numeroStr = " + numeroStr);

        // El método valueOf() también convierte un entero a un String, pero hay que tener cuidado
        // con el tipo de dato que se le pasa por argumento, por ejemplo si es un String los concatena
        String otroNumeroStr = String.valueOf(numeroStr + 10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);

        double realDouble = 1.23456e2;
        // El método toString() de la clase Double convierte un real a un String
        String realStr = Double.toString(realDouble);
        System.out.println("realStr = " + realStr);

        // El método valueOf() de la clase String acepta sobrecarga de métodos, con lo cual puede
        // recibir parámetros de varios tipos de datos y convertirlos a String
        String otroRealStr = String.valueOf(1.23456e2F);
        System.out.println("otroRealStr = " + otroRealStr);
    }

}
