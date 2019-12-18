package dan.herr.san.intr.Session1;
/*
ava nos permite actualizar nuestras variables reutilizando los valores que tenían
 anteriormente, de esta forma evitamos errores o inconsistencias en nuestro código:
 */
public class UpdatingVariable {
    public static void main(String[] args) {
    // Actualizar datos numéricos:
    int salary = 1000;
    salary = salary + 200;
    System.out.println(salary); // 1200

    salary += 300;
    System.out.println(salary); // 1500

    // Actualizar variables de tipo String:
    String employeeName = "Anahí";
    employeeName = employeeName + "Salgado";
    System.out.println(salary); // Anahí Salgado

    employeeName += "Díaz de la Vega";
    System.out.println(employeeName); // Anahí Salgado Díaz de la Vega

    employeeName = "Irene" + employeeName;
    System.out.println(employeeName); // Irene Anahí Salgado Díaz de la Vega
}
}
