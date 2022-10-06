/*
Máster Completo en Java de Cero a Experto

Sección 2: Variables
Video 21: Conversión de cadenas a primitivos
*/

public class ConversionDeTipos1 {

    public static void main(String[] args) {
        // El método parseInt() convierte el String a un tipo int
        String numeroStr = "50";
        int numeroInt = Integer.parseInt(numeroStr);
        System.out.println("numeroInt = " + numeroInt);

        // El método parseDouble() convierte el String a un tipo double
        String realStr = "98765.43e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);

        // El método parseBoolean() convierte el String a un tipo boolean
        String logicoStr = "TruE"; // No es case sensitive
        boolean logicoBoolean = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBoolean = " + logicoBoolean);
    }

}
