import java.util.Arrays;
import java.util.Scanner;

public class VectorParaleloOrdenamiento {
    /*    Confeccionar un programa que permita cargar los nombres de 5 alumnos y sus notas
        respectivas. Luego ordenar las notas de mayor a menor. Imprimir las notas y los nombres de
        los alumnos.*/
    public static Scanner userData = new Scanner(System.in);
    public static String[] nombre = new String[5];
    public static double[] notas = new double[5];
    public static double[] notascopia=new double[5];



    public static void main(String[] args) {
        getData();
        showData();
        orderedData();
    }

    public static void getData() {
        double notausuario=0;
        for (int i = 0; i < nombre.length; i++) {
            System.out.print("Ingresa nombre:");
            nombre[i] = userData.next();

            System.out.print("Ingresa nota:");
            notausuario= userData.nextDouble();
            notas[i] = notausuario;
            notascopia[i]=notausuario;
        }
    }

    public static void showData() {
        System.out.println("Arreglo Original");
        for (int i = 0; i < nombre.length; i++) {
            System.out.println("Nombre estudiante es: " + nombre[i] + " la nota del estudantes es: " + notas[i]);
        }
    }

    public static void orderedData() {
        System.out.println("Arreglo Ordenado");
        Arrays.sort(notas);
        for (int i = 0; i < nombre.length; i++) {

            System.out.println("Nombre estudiante es: " + nombre[i] + " la nota es:"+nombre[i]);


        }

    }
}
