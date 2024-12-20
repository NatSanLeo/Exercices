import java.util.Scanner;

public class ClaseMath {


    public static void main(String[] args) {
        //Ejercicio1();
    }

    public static void Ejercicio1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero negativo: ");
        int numero = scanner.nextInt();
        if (numero < 0) {
            System.out.println("El valor absoluto es: " + Math.abs(numero));
        } else {
            System.out.println("El número debe ser negativo");
        }
        scanner.close();
    }

    public static void Ejercicio2() {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa un numero con decimales: ");
        double num2 = input.nextDouble();
        System.out.println("El valor redondeado es: " + Math.round(num2));
        input.close();

    }


    public static void Ejercicio3() {
        double numRedondeo = Math.floor(Math.random() * 355 + 1);
        System.out.print("el número radom entre 1 a 355 es:  " + numRedondeo);
    }

    public static void Ejercicio4() {

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero");
        int base = miScanner.nextInt();
        System.out.println("Ingrese un segundo numero entero");
        int exponente = miScanner.nextInt();
        System.out.println("El resultado es: " + Math.pow(base, exponente));

        miScanner.close();
    }

    public static void Ejercicio5() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero positivo: ");
        double numero = sc.nextDouble();

        if (numero > 0) {
            System.out.println(" La raiz cuadrada es " + Math.sqrt(numero));
        } else {
            System.out.println("El numero debe ser positivo");
        }

        sc.close();
    }


    public static void Ejercicio6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número entero para limite inferior: ");
        int inf = scanner.nextInt();
        System.out.println("Ingrese un número para limite superior: ");
        int sup = scanner.nextInt();
        if (inf < sup) {
            int numRed = (int) (Math.random() * (sup - inf + 1) + inf);
            System.out.print("El numero aleatorio es : " + numRed);

        } else {
            System.out.println("El limite inferior debe ser menor que el superior: ");
        }
        scanner.close();

    }


    public static void Ejercicio7() {

        Scanner miScanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero para limite inferior");
        int numInf = miScanner.nextInt();
        System.out.println("Ingresa un segundo numero para limite superior");
        int numSup = miScanner.nextInt();

        if (numInf < numSup) {
            int num = (int) (Math.random() * (numSup - numInf + 1) + numInf);
            System.out.println("El número ramdom entre " + numInf + " y " + numSup + " es: " + num);

        } else {
            System.out.println("El limite inferior debe ser menor que el limite superior");

        }
        miScanner.close();

    }

}







