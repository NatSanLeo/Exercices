package Exercices_Arreglos;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistroDeInvitados {

    public static Set<String> invitados = new HashSet<>();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        menu();
    }

    static void menu() {
        int opcion = 0;

        do {
            System.out.println("""
          ___________________________________________________________
          1. Agregar invitado
          2. Eliminar invitado
          3. Mostrar invitado
          4. Salir ❌
          ___________________________________________________________
          """);
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    agregarInvitado();
                    break;
                case 2:
                    eliminarNombre();
                    break;
                case 3:
                    mostrarInvitados();
                    break;
                case 4:
                    System.out.println("saliendo");
                    break;
                default:
                    System.out.println("Valor no valido");
                    break;
            }


        } while (opcion != 4);

    }

    static void agregarInvitado() {

        System.out.println("Ingrese un nombre: ");
        String nombre = sc.nextLine();

        invitados.add(nombre);
        System.out.println("agregado con éxito");
    }

    static void eliminarNombre() {

        if (invitados.isEmpty()) {
            System.out.println("No hay elementos en la lista");
            return;
        }

        System.out.println("Ingrese nombre a eliminar");
        String nombre = sc.nextLine();

        if (invitados.contains(nombre)) {
            invitados.remove(nombre);
            System.out.println("eliminado con éxito");
        }
    }

    static void mostrarInvitados() {
        if (invitados.isEmpty()) {
            System.out.println("No hay elementos en la lista");
            return;
        }

        for (String invitado : invitados) {
            System.out.println(invitado);
        }
    }
}