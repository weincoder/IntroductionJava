package dan.herr.san.intr.Session4;

public class MatchClassExample {
    public static void main(String[] args) {
        //Math es una clase de Java que nos ayuda a
        // ejecutar diferentes operaciones matemáticas:
        double x = 2.134;
        double y = 3;
        System.out.println(Math.PI);
        System.out.println(Math.E);

        // CEIL: Regresa un numero entero a partir del valor de la variable,
        // lo redondea hacia arriba
        System.out.println(Math.ceil(x));

        // CEIL: Regresa un numero entero a partir del valor de la variable,
        // lo redondea hacia abajo
        System.out.println(Math.floor(x));

        // Devuelve un  numero elevado a otro
        System.out.println(Math.pow(x,y));

        // devuelve un dato mayor entre 2 dados
        System.out.println(Math.max(x,y));

        // Devuelve la raiz Cuadrada
        System.out.println(Math.sqrt(x));

        // Calculo del area de un Circulo
        System.out.println(Math.PI*Math.pow(x,2));

        // Area de la espera
        System.out.println(Math.PI*4*Math.pow(y,2));

        // Volumen de la Esfera (4/3)*pi* radio'3
        System.out.println((Math.PI*(4/3)*Math.pow(y,3)));


    }
}