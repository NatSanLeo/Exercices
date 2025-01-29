public class Arreglos_1 {
    public static void main(String[] args) {
        String[] nombres = {"Ana", "Carlos", "Juan", "Sofía"};
        System.out.println("El segundo amigo es: " + nombres[1]);
        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Amigo " + (i + 1) + ": " + nombres[i]);
        }
    }
}
