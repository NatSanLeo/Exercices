package Exercices_Arreglos;

import java.util.ArrayList;
import java.util.Scanner;

public class arrayListCiudades {

    public static Scanner teclado = new Scanner(System.in);
    public  static ArrayList<String> ciudades = new ArrayList<>();

    public static void main(String[] args) {
        agregarCiudades();
        mostrarCiudades();

    }
    public static void agregarCiudades(){
        while (true){

            System.out.print("Ingrese el nombre de la ciudad: ");
            String ciudad = teclado.nextLine();
            ciudades.add(ciudad);

            System.out.println("¿Desea agregar mas ciudades? (si/no): ");
            String respuesta = teclado.nextLine().toLowerCase().trim();
            if (respuesta.equals("no")){
                break;
            }
        }
    }

    public static void mostrarCiudades(){
        System.out.println("Lista de ciudades ingresadas: ");
        for (String ciudad:ciudades){
            System.out.println("- " + ciudad);

        }
    }
}
