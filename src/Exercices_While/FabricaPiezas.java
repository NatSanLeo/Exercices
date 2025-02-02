package Exercices_While;

import java.util.Scanner;

public class FabricaPiezas {
    /*    Una planta que fabrica perfiles de hierro posee un lote de n piezas.
        Confeccionar un programa que pida ingresar por teclado la cantidad de piezas a procesar y
        luego ingrese la longitud de cada perfil; sabiendo que la pieza cuya longitud
        esté comprendida en el rango de 1,20 y 1,30 son aptas. Imprimir por pantalla la
        cantidad de piezas aptas que hay en el lote.*/
    public static void main(String[] args) {
        int x = 1;
        int cantidad = 0;
        double medidaUser = 0;
        int n = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de piezas");
        n = sc.nextInt();

        while (x <= n) {

            System.out.println("Ingrese las medidas: ");
            medidaUser = sc.nextDouble();
            if (medidaUser >= 1.20 && medidaUser <= 1.30) {
                cantidad = cantidad + 1;

            }
            x = x + 1;

        }
        System.out.println("Cantidad de piezas disponibles: " + cantidad);


    }


}
