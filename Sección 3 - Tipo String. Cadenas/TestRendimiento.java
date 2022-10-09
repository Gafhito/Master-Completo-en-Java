/*
Máster Completo en Java de Cero a Experto

Sección 3: Tipo String: Cadenas
Video 29: Test rendimiento concatenar con operador (+) vs método concat() vs StringBuilder
*/

public class TestRendimiento {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        // Crea una instancia de tipo String pero a diferencia de ésta, el StringBuilder es mutable (puede cambiar)
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for (int i=0; i < 100000; i++) {
            // c = c.concat(a).concat(b).concat("\n"); // 500 it => 2ms, 1.000 it => 5ms, 10.000 it => 105ms, 100.000 it => 4334ms
            // c += a + b + "\n";  // 500 it => 13ms, 1.000 it => 14ms, 10.000 it => 65ms, 100.000 it => 1730ms
            sb.append(a).append(b).append("\n");  // 500 it => 0ms, 1.000 it => 0ms, 10.000 ti => 2ms, 100.000 it => 10ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio + "ms");
    }

}
