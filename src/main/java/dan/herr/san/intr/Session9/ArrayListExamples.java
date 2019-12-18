package dan.herr.san.intr.Session9;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExamples {
    public static void main(String[] args) {
        /*
        también podemos hacer uso de ArrayList
        el cual nos permite adicionar elementos
        sin necesidad de definir el tamaño incial
         */
        List<String> electrodomestico = new ArrayList<>();
        electrodomestico.add("TV");
        electrodomestico.add("nevera");
        electrodomestico.add("horno");
        electrodomestico.add("lavadora");

        //Esto es una lambda mas adelante explicaremos del tema en detall
        //básicamente por cada elemento de la lista imprimimos en pantalla su valor
        electrodomestico.forEach((n) -> System.out.println(n));
    }
}

