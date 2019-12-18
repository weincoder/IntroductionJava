package dan.herr.san.intr.Session8;

public class ExampleFor {
    public static void  main (String [] args) {
        /*
        // Estructura:
        for (inicialización; condición; incremento o decremento;) {
            // Instrucciones
        }
*/
        // En este ejemplo el mensaje de printSOS se
        // ejecutará 10 veces:
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    String.format("soy un for terminaré cuando llegue a 10 voy en %s", i));
        }

    }
}
