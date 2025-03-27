package JavaU.ventas;

public class Producto {

  public final int idProducto;
  private String nombre;
  private double precio;
  private static int contadorProductos;

  public Producto(String nombre, double precio) {
    this.idProducto = ++Producto.contadorProductos;
    this.nombre = nombre;
    this.precio = precio;
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getIdProducto() {
    return this.idProducto;
  }

  public double getPrecio() {
    return this.precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  @Override
  public String toString() {
    return "Producto{" +
        "idProducto=" + this.idProducto +
        ", nombre='" + this.nombre + '\'' +
        ", precio=" + this.precio +
        '}';
  }
}
