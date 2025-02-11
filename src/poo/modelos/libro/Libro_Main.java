package poo.modelos.libro;

public class Libro_Main {
  // Variable global: arreglo de objetos Libro
    private static Libro[] biblioteca;

    public static void main(String[] args) {
      // Inicializamos el arreglo con 3 posiciones
      biblioteca = new Libro[3];

      // Creamos instancias y las almacenamos en el arreglo
      biblioteca[0] = new Libro("1984", "George Orwell", 0);
      biblioteca[1] = new Libro("Cien años de soledad", "Gabriel García Márquez", 0);
      biblioteca[2] = new Libro("El principito", "Antoine de Saint-Exupéry", 0);

      // Usamos el metodo numeroPaginas() a cada libro
      biblioteca[0].numeroPaginas(50);
      biblioteca[1].numeroPaginas(80);
      biblioteca[2].numeroPaginas(30);

      // Imprimimos los detalles de cada libro almacenado
      System.out.println("Lista de libros en la biblioteca:");
      for (Libro libro : biblioteca) {
        libro.imprimirDetalles();
      }
    }
  }

