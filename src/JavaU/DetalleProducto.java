package JavaU;

public class DetalleProducto {

  public static void main(String[] args) {
    String nombreProducto = "Mani";
    double precio = 2030.34;
    int cantidadProducto = 33000;
    boolean isAvailable = true;
    System.out.println("El producto " + nombreProducto + " tiene un valor de: " + precio +
        " el producto se encuentra disponible? " + isAvailable + " la cantidad del producto disponible es "
        + cantidadProducto);

    nombreProducto = "Arroz";
    precio = 3400.56;
    cantidadProducto = 0;
    isAvailable = false;
    System.out.println("El producto " + nombreProducto + " tiene un valor de: " + precio +
        " el producto se encuentra disponible? " + isAvailable + " la cantidad del producto disponible es "
        + cantidadProducto);

  }
}
