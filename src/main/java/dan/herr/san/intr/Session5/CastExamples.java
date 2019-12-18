package dan.herr.san.intr.Session5;

public class CastExamples {
    public  static  void  main (String [] args ) {
        //En la programación hay situaciones donde necesitamos
        // cambiar el tipo de dato de nuestras variables, esto lo conocemos como Cast.

        //Estimación:
        // casteo de Variables
        // cambio de double a entero, elimina la parte decimal del numero
        double d = 86.69;
        int i = (int) d;
        System.out.println("EL VALOR DE D ES : "+ d);
        System.out.println("EL VALOR DE I ES : "+ i);

        //Ubicar 30 GATOS al año, deseo saber cuantos perritos ubiqué al mes

        double monthlyCats = 30/12;
        int estimatedMonthlyCats= (int ) monthlyCats;
        System.out.println("EL NUMERO ESTIMADO DE GATOS  UBICADOS ES "+estimatedMonthlyCats);

        // Exactitud
        int a = 30;
        int b = 12;
        System.out.println("EL NUMERO EXACTO DE GATOS AL MES ES: "+((double) (a/b)));

        /*
        Java nos ayuda a realizar casteo automático de los
        tipos de datos más pequños a otros más grandes.
        Sin embargo, en algunos casos vamos a necesitar realizar
        un cast manualmente, así como aprendimos en la
        clase anterior ((dataType) variableOperación).

        Por ejemplo: supongamos que declaramos dos variables a y b de
        tipo int y una variable c de tipo double que es igual a la división
        de las primeras dos variables.

        En este caso, aunque definimos que el tipo de dato de c es double,
        Java automáticamente convertirá el resultado de la división a tipo int,
        ya que este es el tipo de datos de las dos variables que dividimos,
        pero seguirá respetando que la variable c es de tipo double y añadirá
        un decimal al final (.0).

        Esto significa que muchas de nuestras operaciones pueden verse afectadas.
        Por ejemplo:
*/
        int numero_a = 30;
        int numero_b = 12;

        double numero_c = numero_a / numero_b;
        System.out.println(numero_c); // 2.0 (??)

        /*
        En este caso, ya que Java convierte nuestras variables automáticamente,
        debemos indicarle a nuestra variable c (de tipo double) que debe
        hacer cast de su valor para que Java no altere los valores de las variables y
        el resultado de la operación sea correcto:
        */

        numero_c = (double) a / b;
        System.out.println(numero_c); // 2.5
        /*
        Es decir, como a y b son de tipo int, el resultado de una operación
        entre ambas variables será de tipo int, por lo que no tendrá decimales,
        pero si guardamos el resultado de esta división en una variable de tipo
        double añadiremos un .0.

        Esto podemos solucionarlo si indicamos que además de que
        la variable c es de tipo double, el valor de esta variable
        también debe ser de tipo double. Esto significa que Java
        ejecutará la división entre a y b como si fueran de tipo double,
        por lo que tendrán decimales a pesar de haber sido definidas
        inicialmente como números enteros.

         */
    }
}
