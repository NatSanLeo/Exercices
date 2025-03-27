package JavaU.ventas;

public class PrubaVentas {

  public static void main(String[] args) {
    System.out.println("***Ventas***");
    Producto producto1 = new Producto("Blusa", 2.2);
    Producto producto2 = new Producto("Pantalon", 30.2);
    Orden orden1 = new Orden();
    orden1.agregarProducto(producto1);
    orden1.agregarProducto(producto2);
    System.out.println(orden1);
    //orden1.mostrarOrden();

    Orden orden2 = new Orden();
    orden2.agregarProducto(new Producto("Playera", 12.90));
    orden2.agregarProducto(new Producto("Sombrero", 890.2));
    orden2.agregarProducto(producto1);
    System.out.println(orden2);
    //orden2.mostrarOrden();
  }

}
