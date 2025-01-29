import java.util.Scanner;

public class Metodo {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String nombre = obtenerNombre();
        int edad = obtenerEdad();
        imprimirNombreYEdad(nombre, edad);
        sc.close();
    }
    public static String obtenerNombre(){
        System.out.println("Por favor ingrese un nombre:");
        return sc.nextLine();
    }
    public static int obtenerEdad(){
        System.out.println("Por favor ingrese una edad:");
        return sc.nextInt();

    }
    private static void imprimirNombreYEdad(String nombre, int edad) {
        System.out.println("Mi nombre es "+nombre+" y mi edad es "+edad);
    }
}
