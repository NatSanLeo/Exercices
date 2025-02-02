package Exercices_Arreglos;

import java.util.Scanner;

public class Vector_Paralelo_Income {

    private String[] nombre;
    private double[] salario;
    double highestSalary = 0;
    int NamehighestSalary = 0;
    Scanner infoUsuario = new Scanner(System.in);

    public void capturar() {
        nombre = new String[5];
        salario = new double[5];

        for (int i = 0; i < nombre.length; i++) {
            System.out.print("Ingrese el nombre:");
            nombre[i] = infoUsuario.nextLine();
            System.out.print("Ingresa el salario");
            salario[i] = infoUsuario.nextDouble();
            infoUsuario.nextLine();
        }
    }

    public void CalculateTheHighestSalary() {
        for (int i = 0; i < nombre.length; i++) {
            if (salario[i] > highestSalary) {
                highestSalary = salario[i];
                NamehighestSalary = i;
            }
        }
        System.out.println("El salario mas alto es: " + highestSalary + " y pertece a: " + nombre[NamehighestSalary]);

    }

    public void PrintTheHighestSalaryAndName() {
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Nombre: " + nombre[i] + " " + "Salario:" + salario[i]);

        }
    }

    public static void main(String[] args) {
        Vector_Paralelo_Income vectorParaleloIncome = new Vector_Paralelo_Income();
        vectorParaleloIncome.capturar();
        vectorParaleloIncome.CalculateTheHighestSalary();
        vectorParaleloIncome.PrintTheHighestSalaryAndName();

    }


}
