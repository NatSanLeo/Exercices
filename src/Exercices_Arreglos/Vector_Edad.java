package Exercices_Arreglos;

import java.util.Scanner;
public class Vector_Edad {
    private Scanner teclado;
    private String[] nombres;
    private int[] edades;

    public void cargar() {
        teclado=new Scanner(System.in);
        nombres=new String[5];
        edades=new int[5];
        for(int f=0;f<nombres.length;f++) {
            System.out.print("Ingrese nombre:");
            nombres[f]=teclado.next();
            System.out.print("Ingrese edad:");
            edades[f]=teclado.nextInt();
        }
    }

    public void mayoresEdad() {
        System.out.println("Personas mayores de edad:");
        for(int f=0;f<nombres.length;f++) {
            if (edades[f]>=18) {
                System.out.println(nombres[f]+": "+edades[f]);
            }
        }
    }

    public static void main(String[] ar) {
        Vector_Edad pv=new Vector_Edad();
        pv.cargar();
        pv.mayoresEdad();
    }
}