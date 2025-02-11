package poo.modelos.planoCarteciano;

public class Punto_Ejecutable {
  // Variable global: arreglo de objetos Punto
  private static Punto[] puntos;

  public static void main(String[] args) {
    // Inicializamos el arreglo con 3 posiciones
    puntos = new Punto[3];

    // Creamos instancias y las almacenamos en el arreglo
    puntos[0] = new Punto(1, 2);
    puntos[1] = new Punto(2, 4);
    puntos[2] = new Punto(3, 6);

    // Verificamos si los puntos están alineados usando el metodo de la clase Punto
    if (Punto.estanAlineados(puntos[0], puntos[1], puntos[2])) {
      System.out.println("Los puntos están alineados.");
    } else {
      System.out.println("Los puntos NO están alineados.");
    }
  }

}
