package dan.herr.san.intr.Session6;

public class SwitchExample {

    public  static  void  main (String [] args) {
        /* se considera que los switch case   son más eficientes que los
        * condicionales sobre todo cuando se cuenta con muchas condiciones*/
        String profe = "Daniel";
        switch (profe) {
            case "Gio":
                System.out.println("¡Profesor de Java!");
                break;
            case "Nano":
                System.out.println("¡Profesor de React.js!");
                break;
            case "Daniel":
                System.out.println("¡Profesor de python!");
                break;
            default:
                System.out.println("¡Un nuevo profe!");
                break;
        }
    }
}
