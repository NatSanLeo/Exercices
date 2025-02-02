package Exercices_Arreglos;

import java.util.Scanner;

public class Vector_Empleados {
    public double incomesShiftMorning[];
    public double incomesShiftAfternoon[];
    double totalIncomesShiftMorning;
    double totalIncomesShiftAfternoon;
    Scanner enterIncomeUser = new Scanner(System.in);

    private void saveIncomes() {
        try {
            incomesShiftMorning = new double[4];
            for (int i = 0; i <= 3; i++) {
                System.out.println("Ingresa los salarios de los empleados de la MAÑANA:");
                incomesShiftMorning[i] = enterIncomeUser.nextDouble();
            }
            incomesShiftAfternoon = new double[4];
            for (int i = 0; i <= 3; i++) {
                System.out.println("Ingresa los salarios de los empleados de la TARDE:");
                incomesShiftAfternoon[i] = enterIncomeUser.nextDouble();
            }
        } catch (Exception InputMismatchException) {
            System.out.println("Decimales con coma no con punto");
        }
    }

    private void obtainIncomes() {
        try {
            for (int i = 0; i <= 3; i++) {
                totalIncomesShiftMorning = totalIncomesShiftMorning + incomesShiftMorning[i];
                totalIncomesShiftAfternoon = totalIncomesShiftAfternoon + incomesShiftAfternoon[i];
            }
            System.out.println("Total incomes in the morning: " + totalIncomesShiftMorning);
            System.out.println("Total incomes in the afternnon: " + totalIncomesShiftAfternoon);
        } catch (Exception NullPointerException) {
            System.out.println("Ejecuta de nuevo el programa");
        }
    }

    public static void main(String[] args) {
        Vector_Empleados vectorEmpleados = new Vector_Empleados();
        vectorEmpleados.saveIncomes();
        vectorEmpleados.obtainIncomes();
    }
}
