package dan.herr.san.intr.Session7;

public class functionsExamples {
    public static void  main ( String [] args ){
        Operations helper = new Operations() ;
        var numero_a = 37;
        var numero_b = 33;
        var suma = helper.sumar(numero_a,numero_b);
        var resta = helper.resta(numero_a,numero_b);
        var multip = helper.multiplicacion(numero_a,numero_b);
        var dividir = helper.division(numero_a,numero_b);

        helper.mostrar(suma,resta,multip,dividir);
        System.out.println(helper.no("¿si pinocho dice voy a mentir le crece o no la nariz?"));
        System.out.println(helper.saludar("Daniel Herrera Sánchez"));


    }
}
