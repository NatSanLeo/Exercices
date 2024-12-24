import java.util.Scanner;

public class BuscarElemento {
    Scanner userData = new Scanner(System.in);
    private int[] numero;
    int cantVector;
    int numeroMenor = 0;


    public void cargar() {
        System.out.print("Ingrese el tamaño del vector: ");
        cantVector = userData.nextInt();
        numero = new int[cantVector];

        for (int i = 0; i < numero.length; i++) {
            System.out.print("Ingrese un número: ");
            numero[i] = userData.nextInt();
        }


    }

    public void buscarMenor() {
        numeroMenor = numero[0];
        for (int i = 1; i < numero.length; i++) {
            if (numero[i] < numeroMenor) {
                numeroMenor = numero[i];
            }
        }
        System.out.println("El número menor es: " + numeroMenor);
    }

    public void buscarCoincidencia() {
        int numeroRepetido = 0;

        for (int i = 0; i < numero.length; i++) {
            if (numero[i] == numeroMenor) {
                numeroRepetido++;
            }
        }
        System.out.println("El numero esta repetido: " + (numeroRepetido > 1));


    }

    public static void main(String[] args) {
        BuscarElemento buscarElemento = new BuscarElemento();
        buscarElemento.cargar();
        buscarElemento.buscarMenor();
        buscarElemento.buscarCoincidencia();
    }

}
