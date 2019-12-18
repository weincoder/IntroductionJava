package dan.herr.san.intr.Session6;

public class Conditionals {
    public static void main(String[] args) {
        /*Los condicionales son la forma en que las computadoras toman decisiones, evaluaran
        si la condición para ejecutar una parte del código se cumple.
        Si el resultado de la operación es verdadero ejecutarán esta parte del código,
        en caso de que no, seguirán con las siguientes instrucciones.

        La forma de programar condicionales es usando la sentencia
            if (condición) {
              // instrucciones
            }
         */
        boolean isBluetoothEnabled = false;
        int filesSended = 3;

        if (isBluetoothEnabled) {
            filesSended++;
            System.out.println("Archivo enviado");
        } else {
            System.out.println("El Bluetooth no está activado");
        }
     /*La sentencia ELSE es todo lo contrario a la sentencia IF:
     en vez de ejecutar una parte del código si la condición es verdadera,
     solo lo hará si la condición NO se cumple
     */

     /*
     Nuestros condicionales no solo pueden evaluar variables booleanas,
     también pueden evaluar si el resultado de una operación es verdadero o falso.

     Por ejemplo:
     */
        boolean condicionA = true; // verdadero
        boolean condicionB = false; // falso

        boolean condicionC = 2 + 2 == 4; // verdadero
        boolean condicionD = 2 + 2 == 5; // falso

        boolean condicionE = "Pepito" == "Pepito"; // verdadero
        boolean condicionF = "Pepito" == "Pepe"; // falso

        /*
        Para esto debemos usar los operadores lógicos:

        Operadores de equidad:

        Igualdad: ==
        Desigualdad: !=
        Operadores Relacionales:

        Menor que: <
        Mayor que: >
        Menor o igual que: <=
        Mayor o igual que: >=
        Operadores lógicos:

        &&: AND (evaluar si dos o más condiciones son verdaderas).
        ||: OR (evaluar si al menos una de las condiciones es verdadera).
        !: NOT (evaluar que la condición NO sea verdadera).
        Recuerda que además de las sentencias IF y ELSE, también podemos usarELSE IF. Esta la usamos cuando queremos evaluar alguna condición diferente a la condición delIF` pero no exactamente al revés.

        Por ejemplo:
        */
        boolean noHayInternet = false;
        boolean hayInternetPeroMuyPoco = false;
        boolean hayBuenInternetPeroNoEsSuficiente = true;

        if (noHayInternet) {
          System.out.println("No hay Internet");
        } else if (hayInternetPeroMuyPoco) {
          System.out.println("Tienes muy poco Internet");
        } else if (hayBuenInternetPeroNoEsSuficiente) {
          System.out.println("Casi casi, falta solo un poco más de internet");
        } else {
          System.out.println("¡Tienes suficiente Internet!");
        }



    }
}
