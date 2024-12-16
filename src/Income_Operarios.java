import java.util.Scanner;
//Se desea almacenar los sueldos de operarios. Cuando se ejecuta el programa se
// debe pedir la cantidad de sueldos a ingresar. Luego crear un vector con dicho tamaño.



public class Income_Operarios {
    Scanner cant_Salarios = new Scanner(System.in);
    public int salariosIngresados[];
    int totalSalarios;


    private void obtainSalarios(){
        System.out.println("Ingresa cantidad de salarios:");
        totalSalarios=cant_Salarios.nextInt();
        salariosIngresados=new int [totalSalarios];
        for (int i=0;i<salariosIngresados.length;i++){
            System.out.println("Ingrese el valor de cada uno de los salarios:");
            salariosIngresados[i]=cant_Salarios.nextInt();
        }
    }


    private void printTotalSalarios(){
        System.out.println("El tamaño del vector es: "+salariosIngresados.length);
    }

    public static void main(String[] args) {
        Income_Operarios incomeOperarios=new Income_Operarios();
        incomeOperarios.obtainSalarios();
        incomeOperarios.printTotalSalarios();
    }
}
