// Clase principal que contiene el programa
public class OperadoresAritmeticos {
    public static void main(String[] args) {

        // Declaramos dos variables enteras
        int a = 15;
        int b = 4;

        // SUMA: se usa el operador +
        int suma = a + b;
        System.out.println("Suma (" + a + " + " + b + ") = " + suma); // 15 + 4 = 19

        // RESTA: se usa el operador -
        int resta = a - b;
        System.out.println("Resta (" + a + " - " + b + ") = " + resta); // 15 - 4 = 11

        // MULTIPLICACIÓN: se usa el operador *
        int multiplicacion = a * b;
        System.out.println("Multiplicación (" + a + " * " + b + ") = " + multiplicacion); // 15 * 4 = 60

        // DIVISIÓN: se usa el operador /
        // Como estamos usando enteros, se descartan los decimales
        int division = a / b;
        System.out.println("División entera (" + a + " / " + b + ") = " + division); // 15 / 4 = 3

        // DIVISIÓN CON DECIMALES: para obtener decimales, usamos al menos un número tipo double
        double divisionReal = (double) a / b;
        System.out.println("División real (" + a + " / " + b + ") = " + divisionReal); // 15 / 4 = 3.75

        // MÓDULO: se usa el operador % y devuelve el residuo de la división
        int modulo = a % b;
        System.out.println("Módulo (" + a + " % " + b + ") = " + modulo); // 15 % 4 = 3

        // BONUS: operación combinada
        int resultado = (a + b) * 2;
        System.out.println("Operación combinada: (" + a + " + " + b + ") * 2 = " + resultado); // (15+4)*2 = 38
    }
}
