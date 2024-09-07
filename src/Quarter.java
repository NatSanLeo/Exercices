import java.util.Scanner;

public class Quarter {
 /*   Se carga una fecha (día, mes y año) por teclado. Mostrar un mensaje si corresponde al primer trimestre del año
  (enero, febrero o marzo) Cargar por teclado el valor numérico del día, mes y año.
    Ejemplo: dia:10 mes:1 año:2010.*/

    public static void main(String[] args) {
        int day;
        int month;
        int year;

        Scanner date = new Scanner(System.in);
        System.out.println("A continuación debes ingresar la fecha en el siguiente formato: día-mes-año. Ejemplo 02-02-2020");

        System.out.println("Ingrese el día: ");
        day = date.nextInt();

        System.out.println("Ingrese el mes: ");
        month = date.nextInt();

        System.out.println("Ingrese el year: ");
        year = date.nextInt();

        if (month==01|| month==02|| month==03){
            System.out.println("Corresponde al primer trimestre del año");

        }else System.out.println("No corresponde al primer trimestre del año");


    }
}
