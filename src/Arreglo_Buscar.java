import java.util.Scanner;

public class Arreglo_Buscar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arreglo de nombres
        String[] nombres = {"Ana", "Luis", "Sofía", "Pedro", "María"};

        System.out.print("Ingresa el nombre que quieres buscar: ");
        String nombreBuscado = scanner.nextLine(); // Leer el nombre a buscar

        // Variable para indicar si lo encontramos
        boolean encontrado = false;

        // Buscar el nombre en el arreglo
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].equalsIgnoreCase(nombreBuscado)) { // Comparar ignorando mayúsculas
                System.out.println("Nombre '" + nombreBuscado + "' encontrado en la posición " + i + ".");
                encontrado = true;
                break;
            }
        }

        // Si no se encontró
        if (!encontrado) {
            System.out.println("Nombre '" + nombreBuscado + "' no encontrado en el arreglo.");
        }
    }
}
