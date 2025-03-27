package JavaU.temasAvanzados.maquina_snacks_archivos.presentacion;

import JavaU.temasAvanzados.maquina_snacks_archivos.dominio.Snack;
import JavaU.temasAvanzados.maquina_snacks_archivos.servicio.IServcioSnack;
import JavaU.temasAvanzados.maquina_snacks_archivos.servicio.ServicioSnacksArchivos;
import JavaU.temasAvanzados.maquina_snacks_archivos.servicio.ServicioSnacksLista;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Maquina_Snacks {

  public static void main(String[] args) {
    maquinaSancks();
  }

  private static void maquinaSancks() {
    boolean salir = false;
    Scanner scanner = new Scanner(System.in);
    //Creamos el objeto para ontener el servicio de snacks tipo lista
    // IServcioSnack servcioSnacks = new ServicioSnacksLista();
    IServcioSnack servcioSnacks = new ServicioSnacksArchivos();

    //Creamos la lisgta de los productos comprados
    List<Snack> productos = new ArrayList<>();
    System.out.println("**Maquina de Snacks**");
    servcioSnacks.mostrarSnacks();

    while (!salir) {
      try {
        int opcion = mostrarMenu(scanner);
        salir = ejecutarOpciones(opcion, scanner, productos, servcioSnacks);

      } catch (Exception e) {
        System.out.println("Ocurrio un error." + e);
      } finally {
        System.out.println();
      }
    }
  }

  private static int mostrarMenu(Scanner scanner) {
    System.out.print("""
        Menu:
        1. Comprar snack.
        2. Mostar ticket.
        3. Agregar nuevo snack.
        4. Inventario Snacks
        5. Salir.
        Elije una opción: \s""");
    return Integer.parseInt(scanner.nextLine());
  }

  private static boolean ejecutarOpciones(int opcion, Scanner scanner, List<Snack> productos,
      IServcioSnack servicioSnacks) {
    boolean salir = false;
    switch (opcion) {
      case 1 -> comprarSnack(scanner, productos, servicioSnacks);
      case 2 -> mostrarTicket(productos);
      case 3 -> agregarSnack(scanner, servicioSnacks);
      case 4 -> listarInventarioSnack(scanner, servicioSnacks);
      case 5 -> {
        System.out.println("Regresa pronto");
        salir = true;
      }
      default -> System.out.println("Opcion invalida " + opcion);

    }
    return salir;
  }

  private static void listarInventarioSnack(Scanner scanner, IServcioSnack servcioSnacks) {
    servcioSnacks.mostrarSnacks();

  }

  private static void comprarSnack(Scanner scanner, List<Snack> productos, IServcioSnack servcioSnacks) {
    System.out.print("¿Que snack quieres comprar (id)?");
    int idSnack = Integer.parseInt(scanner.nextLine());
    //validando que el snack exista.
    boolean snackEncontrado = false;
    for (var snack : servcioSnacks.getSnacks()) {
      if (idSnack == snack.getIdSnack()) {
        productos.add(snack);
        System.out.println("Ok, snack agregado" + snack);
        snackEncontrado = true;
        break;
      }
    }
    if (!snackEncontrado) {
      System.out.println("Id de snack no encontrado: " + idSnack);
    }
  }

  private static void mostrarTicket(List<Snack> productos) {
    String ticket = "*** Ticket de venta ***";
    double total = 0.0;
    for (var producto : productos) {
      ticket += "\n\t-" + producto.getNombre() + " - $ precio: " + producto.getPrecio();
      total += producto.getPrecio();
    }
    ticket += "\n\tTotal-> $" + total;
    System.out.println(ticket);
  }

  private static void agregarSnack(Scanner scanner, IServcioSnack servcioSnacks) {
    System.out.println("Ingresa el nombre del snack: ");
    String nombre = scanner.nextLine();
    System.out.println("Precio del snack");
    double precio = Double.parseDouble(scanner.nextLine());
    servcioSnacks.agregarSnack(new Snack(nombre, precio));
    System.out.println("Tu snack se ha agredado correctamente");
    servcioSnacks.mostrarSnacks();
  }
}
