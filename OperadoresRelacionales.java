// Clase que demuestra el uso de operadores relacionales en Java
public class OperadoresRelacionales {
    public static void main(String[] args) {
        int edad = 20;
        int edadMinima = 18;

        // Operador de igualdad (==): compara si dos valores son iguales
        System.out.println("¿Edad es exactamente 20? " + (edad == 20)); // true

        // Operador de desigualdad (!=): compara si dos valores son distintos
        System.out.println("¿Edad es diferente a 30? " + (edad != 30)); // true

        // Operador mayor que (>)
        System.out.println("¿Edad es mayor que la mínima? " + (edad > edadMinima)); // true

        // Operador menor que (<)
        System.out.println("¿Edad es menor que 25? " + (edad < 25)); // true

        // Operador mayor o igual que (>=)
        System.out.println("¿Edad es mayor o igual a 18? " + (edad >= 18)); // true

        // Operador menor o igual que (<=)
        System.out.println("¿Edad es menor o igual a 20? " + (edad <= 20)); // true

        // Otro ejemplo práctico
        double saldo = 500.0;
        double costo = 499.99;

        System.out.println("¿Saldo suficiente? " + (saldo >= costo)); // true
        System.out.println("¿Saldo insuficiente? " + (saldo < costo)); // false
    }
}
