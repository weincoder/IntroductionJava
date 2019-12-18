package dan.herr.san.intr.Sesion7;

public class Operations {
    /* Las funciones nos sirven para desarrollar código
    reutilizable, lo que hará mas óptimos nuetros desarrollos
    las funciones pueden ser del mismo tipo de los que vimos
     en variables siempre y cuando retornen el valor que se
     promete. También pueden no retornar nada si son del tipo
     void
    * */

    public double sumar(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public double resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public boolean no(String pregunta) {
        System.out.println(pregunta);
        System.out.println("NO!");
        return false;
    }

    public String saludar(String nombre) {
        return String.format("hola mi nombre es %s", nombre);
    }

    public double multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public double division(double numero1, double numero2) {
        return numero1 / numero2;
    }

    public void mostrar(double suma, double resta, double multiplicaion, double division) {
        System.out.println("la suma es " + suma);
        System.out.println("la resta es " + resta);
        System.out.println("la multipliacion es " + multiplicaion);
        System.out.println("la division es " + division);
    }
}
