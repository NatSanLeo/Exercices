import java.util.Scanner;

public class ClaseString {

    public static void main(String[] args) {
        Ejercicio10();
    }

    public static void Ejercicio1() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Ingrese una palabra...");
        String palabra = scn.nextLine();
        System.out.println(palabra.length());
        scn.close();
    }

    public static void Ejercicio2() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el nombre...");
        String nombre = teclado.nextLine();
        System.out.println("Ingrese el apellido...");
        String apellido = teclado.nextLine();
        System.out.println(nombre.concat(" " + apellido));
        teclado.close();
    }

    public static void Ejercicio3() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una cadena de caracteres:");
        String cadena = teclado.nextLine();
        int primeraSub;
        int segundaSub;
        System.out.print("Ingresa el primer indice:");
        primeraSub = teclado.nextInt();
        System.out.print("Ingresa el segundo indice:");
        segundaSub = teclado.nextInt();
        System.out.println("La cadena original es: " + cadena);
        System.out.println("La subcadena es: " + cadena.substring(primeraSub, segundaSub));
        teclado.close();

    }

    public static void Ejercicio4() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = input.nextLine();
        System.out.print("Ingrese un caracter: ");
        String caracter = input.nextLine();
        int resultado = palabra.indexOf(caracter);
        String mensaje =
                resultado != -1 ? "El caracter fue encontrado en la posicion " + resultado : "No se encuentra el caracter";
        System.out.println(mensaje);
        input.close();

    }

    public static void Ejercicio5() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingresa una cadena de texto:");
        String cadena = teclado.nextLine();
        System.out.println("La cadena en minuscula es: " + cadena.toLowerCase() + "\n" + " La cadena en mayuscula es: "
                + cadena.toUpperCase());
    }

    public static void Ejecicio6() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese una frase: ");
        String frase = teclado.nextLine();
        System.out.print("Ingrese el caracter uno: ");
        String char1 = teclado.nextLine();
        System.out.print("Ingrese el caracter dos: ");
        String char2 = teclado.nextLine();
        String resultado = frase.toLowerCase().replace(char1.toLowerCase(), char2.toLowerCase());
        System.out.println("La frase resultante al reemplazar " + char1 + " por " + char2 + " es: " + resultado);
        teclado.close();
    }

    public static void Ejecicio7() {
        Scanner texto = new Scanner(System.in);
        String cadena = texto.nextLine();
        System.out.println("Su frase sin espacios es: " + cadena.trim());

        texto.close();

    }

    public static void Ejercicio8() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese una palabra: ");
        String palabra = input.nextLine();
        System.out.print("Ingrese un caracter: ");
        String caracter = input.nextLine();
        int resultado = palabra.indexOf(caracter);
        System.out.println(
                resultado != -1 ? "El caracter fue encontrado en la posicion " + resultado : "No se encuentra el caracter");
        //System.out.println(mensaje);
        input.close();

    }

    public static void Ejercicio9() {
        Scanner scn = new Scanner(System.in);
        System.out.print("Ingrese la primer palabra: ");
        String primeraPalabra = scn.nextLine();
        System.out.print("Ingrese la segunda palabra: ");
        String segundaPalabra = scn.nextLine();
        String msj = primeraPalabra.equals(segundaPalabra) ? "Ambas palabras son iguales" : "Palabras diferentes";
        System.out.println(msj);
        scn.close();

    }

    public static void Ejercicio10() {
        Scanner read = new Scanner(System.in);
        System.out.println("Complementaria 4");
        System.out.println("\nIngresate una frase loco: ");
        String frase = read.nextLine();
        String fraseSinEspacios = frase.replace(" ", "");
        System.out.println("La frase tiene: " + fraseSinEspacios.length() + " letras");
    }
}
