/* Los operadores lógicos más comunes son:

&& (AND),

|| (OR) y

! (NOT)

*/


// Clase que muestra ejemplos de operadores lógicos en Java
public class OperadoresLogicos {
    public static void main(String[] args) {
        // Declaramos algunas condiciones booleanas
        boolean esMayorDeEdad = true;
        boolean tieneIdentificacion = false;

        // Operador AND (&&): devuelve true si ambas condiciones son verdaderas
        boolean puedeEntrar = esMayorDeEdad && tieneIdentificacion;
        System.out.println("¿Puede entrar con AND (mayor de edad Y con identificación)? " + puedeEntrar);
        // Resultado: false porque aunque es mayor de edad, NO tiene identificación

        // Operador OR (||): devuelve true si al menos una condición es verdadera
        boolean accesoParcial = esMayorDeEdad || tieneIdentificacion;
        System.out.println("¿Acceso parcial con OR (mayor de edad O identificación)? " + accesoParcial);
        // Resultado: true porque es mayor de edad

        // Operador NOT (!): invierte el valor de una condición
        boolean noTieneID = !tieneIdentificacion;
        System.out.println("¿No tiene identificación? " + noTieneID);
        // Resultado: true porque tieneIdentificacion es false

        // Ejemplo combinado: verificar si alguien NO es mayor de edad O NO tiene identificación
        boolean denegado = !esMayorDeEdad || !tieneIdentificacion;
        System.out.println("¿Acceso denegado? (no es mayor O no tiene ID): " + denegado);
        // Resultado: true porque aunque sí es mayor de edad, no tiene identificación
    }
}
