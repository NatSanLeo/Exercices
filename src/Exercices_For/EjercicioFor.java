package Exercices_For;

public class EjercicioFor {
    public static void main(String[] args) {
        //EjercioArray1();
        EjercioArray3();
    }

    public static void EjercioArray1() {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El elemento en la posición " + i + " es: " + numeros[i]);
        }
        System.out.println("La longitud del arreglo es : " + numeros.length);
        System.out.println("El tipo del arreglo es: " + numeros.getClass().getTypeName());
    }

    public static void EjercioArray2() {
        int[] numeros = {1, 2, 3, 4, 5, -2, 7, 8, -7, 10};
        int min = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (min > numeros[i]) {
                min = numeros[i];
            }
        }
        System.out.println("El valor minimo del arreglo es " + min);
    }

    public static void  EjercioArray3() {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < num.length; i++) {
            System.out.print(num.length - i + " ");
        }
    }
}
