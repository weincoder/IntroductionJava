package dan.herr.san.intr.Session8;

public class ExampleCycleWhile {
    public static void main(String[] args) {
        /*
         while se ejecutará hasta que se cumpla la condición
         */
        int contador = 1;
        while (contador <= 5) {
            System.out.println(
                    String.format("el contador aun no es mayor que 5 %s", contador));
            contador++;
        }
    }
}
