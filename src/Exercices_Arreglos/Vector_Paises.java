package Exercices_Arreglos;
/*Definir un vector donde almacenar los nombres de 5 paises.
Confeccionar el algoritmo de ordenamiento alfabético.*/


import java.util.Arrays;
import java.util.Scanner;

public class Vector_Paises {
    public static String[] arreglocountries = new String[5];
    public  static Scanner userData = new Scanner(System.in);
    public static void main(String[] args) {
        getCountries();
        showCountries();
        orderCountriees();
    }

    public static void getCountries() {
        for (int i=0; i<arreglocountries.length;i++){
            System.out.print("Ingresa el nombre de la ciudad:");
            arreglocountries[i]=userData.nextLine();
        }
    }

    public static void showCountries() {
        System.out.println("Arreglo Original");
        for (int i=0; i<arreglocountries.length;i++){
            System.out.println("Nombre de la posicion "+i+ " es: "+ arreglocountries[i]);
        }
    }
    public static void orderCountriees(){
        System.out.println("Arreglo Ordenado");
        Arrays.sort(arreglocountries);
        for (int i=0;i<arreglocountries.length;i++){
            System.out.println("Ciudad en la posicion "+i+" es: "+arreglocountries[i]);

        }
    }
}
