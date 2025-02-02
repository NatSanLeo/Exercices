package Exercices_If;

import java.util.Scanner;

public class Descuento {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        double precioFinal;
        double calculoDescuento = 0.10;

        if (precio >= 100) {
            double descTotal = precio * calculoDescuento;
            precioFinal = precio - descTotal;
            System.out.print("El precio final del producto es: " + precioFinal);
        } else {
            System.out.print("El precio no lleva descuento: " + precio);
        }
    }
}