package JavaU;

public class DetalleLibro {

  public static void main(String[] args) {

    String tituloLibro = "El señor de los anillos";
    int anioPublicacion = 1954;
    boolean libroDisponible = true;
    double precio = 500.50;

    System.out.println("El libro " + tituloLibro + " que se publico el año " + anioPublicacion + " Esta disponible? "
        + libroDisponible + " y tiene un valor de " + precio);
    tituloLibro = "EL SEÑOR DE LOS ANILLOS";
    System.out.println(tituloLibro);
  }

}
