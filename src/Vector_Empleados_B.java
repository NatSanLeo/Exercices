import java.util.Scanner;

public class Vector_Empleados_B {
    public double incomesShiftMorning[];
    public double incomesShiftAfternoon[];
    double totalIncomesShiftMorning;
    double totalIncomesShiftAfternoon;
    Scanner enterIncomeUser = new Scanner(System.in);

    private void saveIncomes() {
        incomesShiftMorning = new double[4];
        for (int i = 0; i <= 3; i++) {
            System.out.println("Ingresa los salarios de los empleados de la MAÑANA");
            incomesShiftMorning[i]=enterIncomeUser.nextDouble();
            totalIncomesShiftMorning=totalIncomesShiftMorning+incomesShiftMorning[i];
        }
        incomesShiftAfternoon=new double[4];
        for (int i = 0; i <= 3; i++) {
            System.out.println("Ingresa los salarios de los empleados de la TARDE");
            incomesShiftAfternoon[i]=enterIncomeUser.nextDouble();
            totalIncomesShiftAfternoon=totalIncomesShiftAfternoon+incomesShiftAfternoon[i];

        }
        System.out.println("Total incomes in the morning: " +totalIncomesShiftMorning);
        System.out.println("Total incomes in the afternnon: " +totalIncomesShiftAfternoon);
    }
    private void addIncomes(){

    }

    public static void main(String[] args) {
        Vector_Empleados_B vectorEmpleados = new Vector_Empleados_B();
        vectorEmpleados.saveIncomes();

    }


}
