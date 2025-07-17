import java.util.Scanner;

public class EstructurasDeControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 1. IF-ELSE: Decisión según edad
        System.out.print("Ingresa tu edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        } else {
            System.out.println("Eres menor de edad.");
        }

        // 2. SWITCH: Menú de selección de bebida
        System.out.println("\nMenú:");
        System.out.println("1. Agua");
        System.out.println("2. Café");
        System.out.println("3. Té");
        System.out.print("Elige una opción (1-3): ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Elegiste Agua.");
                break;
            case 2:
                System.out.println("Elegiste Café.");
                break;
            case 3:
                System.out.println("Elegiste Té.");
                break;
            default:
                System.out.println("Opción inválida.");
        }

        // 3. WHILE: Contador que cuenta hasta 5
        System.out.println("\nContando con while:");
        int contador = 1;
        while (contador <= 5) {
            System.out.println("Número: " + contador);
            contador++;
        }

        // 4. FOR: Suma los números del 1 al 5
        int suma = 0;
        for (int i = 1; i <= 5; i++) {
            suma += i;
        }
        System.out.println("\nSuma de 1 a 5 con for: " + suma);

        sc.close(); // Cerrar el Scanner
    }
}
