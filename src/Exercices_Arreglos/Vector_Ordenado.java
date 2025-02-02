package Exercices_Arreglos;

/*
Se debe crear un vector donde almacenar 5 sueldos. Ordenar el vector sueldos de menor a mayor.
*/

import java.util.Arrays;
import java.util.Scanner;

public class Vector_Ordenado {
    public static double[] arregloSalarios = new double[5];
    public static Scanner dataUser = new Scanner(System.in);

    public static void main(String[] args) {

        getIncome();
        showIncomes();
        orderIncomes();
    }

    public static void getIncome() {
        for (int i = 0; i < arregloSalarios.length; i++) {
            System.out.print("Ingresa salario: ");
            arregloSalarios[i] = dataUser.nextDouble();
        }
    }

    public static void showIncomes() {
        System.out.println("Arreglo original");
        for (int i = 0; i < arregloSalarios.length; i++) {
            System.out.println("Salarios en la poiscion: " + i + " es: " + arregloSalarios[i]);
        }
    }

    public static void orderIncomes() {
        Arrays.sort(arregloSalarios);
        System.out.println("Arreglo ordenado:");


        for (int i = 0; i < arregloSalarios.length; i++) {
            System.out.println("Salario en la posición: " + i + " es:" + arregloSalarios[i]);
        }

    }
}
