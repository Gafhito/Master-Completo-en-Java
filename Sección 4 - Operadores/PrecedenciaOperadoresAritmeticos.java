/*
Máster Completo en Java de Cero a Experto

Sección 4: Operadores
Video 50: Precedencia de los operadores
*/

public class PrecedenciaOperadoresAritmeticos {

    public static void main(String[] args) {
        int i = 14;
        int j = 8;
        int k = 20;

        /*
        Éstas dos expresiones son iguales:

        double promedio = i + j + k / 3;
        double promedio = i + j + (k / 3);
        */

        // La idea es que primero se sumen las variables, por lo tanto se usan paréntesis para dar prioridad
        double promedio1 = (i + j + k) / 3d;
        System.out.println("promedio1 = " + promedio1);

        double promedio2 = i + j + k / 3d * 10;  // 14 + 8 + 66.6 --> Primero realiza la división, luego multiplica y finalmente suma
        System.out.println("promedio2 = " + promedio2);

        double promedio3 = (i + j + k) / 3d * 10;  // ((14 + 8 + 20) / 3) * 10
        System.out.println("promedio3 = " + promedio3);

        double promedio4 = ++i + j-- + k / 3d * 10;  // (15 + 8) + 66.6
        System.out.println("promedio4 = " + promedio4);
        System.out.println("i = " + i);
        System.out.println("j = " + j);
    }

}
