package dan.herr.san.intr.Session7;

public class Operations {
    /* Las funciones nos sirven para desarrollar código
    reutilizable, lo que hará mas óptimos nuetros desarrollos
    las funciones pueden ser del mismo tipo de los que vimos
     en variables siempre y cuando retornen el valor que se
     promete. También pueden no retornar nada si son del tipo
     void
    * */

    //todas las funciones deberían documentarse así:

    /**
     * Descriptción = función que retorna la suma de dos numeros
     * @param numero1 numero a sumar contra numero 2
     * @param numero2 numero b a sumar contra numero 2
     * @return retorna el resultado de la suma del número 1 contra el numero 2
     */

    public double sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return la resta del numero 1 y el numero 2
     */
    public double resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    /**
     * Descripción : funcion que retorna false sin importar la entrada
     * @param pregunta
     * @return false
     */
    public boolean no(String pregunta) {
        System.out.println(pregunta);
        System.out.println("NO!");
        return false;
    }

    /**
     * Descripción función que saluda según un nombre ingresado
     * @param nombre
     * @return String modificado
     */
    public String saludar(String nombre) {
        return String.format("hola mi nombre es %s", nombre);
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return la multiplicación
     */

    public double multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    /**
     *
     * @param numero1
     * @param numero2
     * @return la división
     */
    /**
     *
     * @param numero1
     * @param numero2
     * @return la división
     */
    public double division(double numero1, double numero2) {
        return numero1 / numero2;
    }

    /**
     * Descripción función que muestra en pantalla el resultado de multiples operaciones
     * @param suma
     * @param resta
     * @param multiplicaion
     * @param division
     */
    public void mostrar(double suma, double resta, double multiplicaion, double division) {
        System.out.println("la suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("la multipliacion es " + multiplicaion);
        System.out.println("la division es " + division);
    }
}
