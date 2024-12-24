import java.util.Scanner;

public class MayorMenorElemento {
    private Scanner dataUser;
    private String[] nombres;
    private double[] salario;


    public void capturarInfo() {
        dataUser = new Scanner(System.in);
        nombres = new String[5];
        salario = new double[5];

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Ingrese el nombre del usuario:");
            nombres[i] = dataUser.next();
            System.out.print("Ingrese el salario del usuario:");
            salario[i] = dataUser.nextDouble();

        }


    }

    public void buscarInformacion() {
        double mayorSalario = 0;
        String nombreMayorSalario = "";

        for (int i = 0; i < salario.length; i++) {
            if (salario[i] > mayorSalario) {
                mayorSalario = salario[i];
                nombreMayorSalario = nombres[i];
            }
        }
        System.out.println("El salario mas alto es: " + mayorSalario + " y es del empleado:  " + nombreMayorSalario);

    }

    public static void main(String[] args) {
        MayorMenorElemento mayorMenorElemento = new MayorMenorElemento();
        mayorMenorElemento.capturarInfo();
        mayorMenorElemento.buscarInformacion();
    }
}
