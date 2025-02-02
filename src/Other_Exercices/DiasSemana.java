package Other_Exercices;

import java.util.Scanner;

public class DiasSemana {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa un numero entre 1 y 7");
        int numero = entrada.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Es lunes");
                break;
            case 2:
                System.out.println("Es martes");
                break;
            case 3:
                System.out.println("Es miercoles");
                break;
            case 4:
                System.out.println("Es jueves");
                break;
            case 5:
                System.out.println("Es viernes");
                break;
            case 6:
                System.out.println("Es sabado");
                break;
            case 7:
                System.out.println("Es domingo");
                break;
            default:
                System.out.println("Ingresaste un caracter o numero fuera del rango");
                break;
        }

        entrada.close();
    }

}
