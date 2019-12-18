package dan.herr.san.intr.Session9;

public class ListExamples {
    public static void  main (String [] args) {
        /*
          los arrays son listas que nos permiten almacenar variables
          en un conjunto ordenado, en este caso debes definir bien el
          tipo de variable pues solo pueden ser del mismo tipo
         */
        String[] galletas = {"Oreo", "Ducales", "Galletas saladas", "mantequilla"};
        int [] edades = {11,22,33,44,55};
        System.out.println(
                String.format("contamos con %s sabores de galleta",galletas.length));// cantidad de galletas
        System.out.println("la galleta "+galletas[0]+" Es la más rica");

        for (String elemento : galletas) {
            System.out.println(
                    String.format("El siguiente es un sabor de galleta %s",elemento));
        }

        for (int elemento : edades) {
            System.out.println(
                    String.format("Esta es una de las edades registradas %s años",elemento));
        }

    }

}
