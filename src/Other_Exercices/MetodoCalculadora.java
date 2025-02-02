package Other_Exercices;

import java.util.Scanner;

public class MetodoCalculadora {
    public static void main(String[] args) {
        Act2();
    }
    public static void Act2() {
        menu();
    }
    public static void menu() {

        Scanner sc = new Scanner(System.in);
        int opcion, num1, num2;
        try {
            do {

                System.out.println("Elije el primer numero");
                num1 = sc.nextInt();
                System.out.println("Elije el segundo numero");
                num2 = sc.nextInt();
                System.out.println("Que operacion quieres realizar");
                System.out.println("1_Sumar");
                System.out.println("2_Restar");
                System.out.println("3_Multiplicar");
                System.out.println("4_Dividir");
                System.out.println("5_Salir");
                System.out.println("Elige una opción");
                opcion = sc.nextInt();
                switch (opcion) {
                    case 1:
                        System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                        break;
                    case 2:
                        System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
                        break;
                    case 3:
                        System.out.println(num1 + "x" + num2 + "=" + (num1 * num2));
                        break;
                    case 4:
                        if (num2 == 0) {
                            System.out.println("Elija un divisor distinto de 0");
                        } else {
                            System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
                        }
                        break;
                    case 5:
                        System.out.println("Saliendo del programa");
                        break;
                    default:
                        System.out.println("Opción no valida, Elija un N° del 1 al 5");
                        break;
                }

            } while (opcion != 5);
        } catch (Exception e) {
            System.out.println("Ingrese solo caracteres numéricos");
        }
        sc.close();
    }
}
