package JavaU;

import java.util.Scanner;

public class EjerciciosOperadores {

  public static Scanner userData = new Scanner(System.in);


  public static void main(String[] args) {
    //ejemploAnd();
    // ejemploOr();
    //ejemploNot();
    //generacionTicket();
    //validacionPasswod();
    calcularAreaPerimetro();
  }

  public static void ejemploAnd() {
    // Scanner userData = new Scanner(System.in);
    final int NUM_PRODUCT_DESCUENTO = 10;
    System.out.print("Cuantos productos compraste hoy? ");
    int cantidadProductos = userData.nextInt();

    System.out.print("Tienes membresia de la tienda (true/false): ");
    boolean tienesMembresia = Boolean.parseBoolean(userData.next());

    boolean isElegibleDescuento = cantidadProductos >= 10 && tienesMembresia;
    System.out.println("¿El cliente puede acceder a descuento: ?" + isElegibleDescuento);
  }

  public static void ejemploOr() {
    final int DISTANCIA_PERMITIDA_KM = 3;
    System.out.print("Tienes credencial de estudiante: (true/false): ");
    boolean tieneCredencial = Boolean.parseBoolean(userData.nextLine());

    System.out.print("¿A cuantos KM vives de la biblioteca?: ");
    int distanciaBiblioteca = Integer.parseInt(userData.nextLine());

    boolean esElegiblePrestamo = tieneCredencial || distanciaBiblioteca <= DISTANCIA_PERMITIDA_KM;
    System.out.println("Es elegible para un prestamo? " + esElegiblePrestamo);
  }

  public static void ejemploNot() {
    System.out.print("Proporciona un dato entero: ");
    int datoEntero = Integer.parseInt(userData.nextLine());
    boolean estaDentroRango = datoEntero >= 1 && datoEntero <= 10;
    System.out.println("El número esta dentro rango? " + estaDentroRango);

    boolean estaFueraRango = !(datoEntero >= 1 && datoEntero <= 10);
    System.out.println("Esta fuera del rango: " + estaFueraRango);
  }

  public static void generacionTicket() {
    System.out.print("Precio de la leche: ");
    double precioLeche = Double.parseDouble(userData.nextLine());
    System.out.print("Precio del pan: ");
    double precioPan = Double.parseDouble(userData.nextLine());
    System.out.print("Precio de la lechuga: ");
    double precioLechuga = Double.parseDouble(userData.nextLine());
    System.out.print("Precio de los platanos: ");
    double precioPlatanos = Double.parseDouble(userData.nextLine());
    System.out.print("Aplicar algún descuento (%): ");
    double porcentajeDescuento = Integer.parseInt(userData.nextLine());

    //Subtotal Sin impuestos
    double subTotalSinImpuestos = precioLeche + precioPan + precioLechuga + precioPlatanos;
    System.out.println("Sub total sin impuestos: " + subTotalSinImpuestos);
    //impuesto del 19%
    double impuesto = subTotalSinImpuestos * 0.19;

    double descuento = subTotalSinImpuestos * (porcentajeDescuento / 100.0);
    double subTotalConDescuento = subTotalSinImpuestos - descuento;

    double costoTotalCompra = subTotalConDescuento + impuesto;
    System.out.printf("""
        **********************
        Sub total: $%.3f
        Impuesto (19%%): $%.3f 
        Total: $%.3f """, subTotalConDescuento, impuesto, costoTotalCompra);
  }

  public static void validacionPasswod() {
    System.out.println("**Sistema de autenticación**");
    final String PASSWORD = "123";
    final String USER = "samita";
    System.out.print("Ingrese la clave: ");
    String claveUsuario = userData.nextLine();
    System.out.print("Ingrese el usuario: ");
    String usuario = userData.nextLine();
    boolean sonDatosValidos = PASSWORD.equals(claveUsuario) && USER.equals(usuario);

    System.out.println("Datos son correctos? " + sonDatosValidos);
  }

  public static void calcularAreaPerimetro() {
    System.out.println("Calculando area y perimetro de un rectangulo");
    System.out.print("Ingresa la base del rectangulo: ");
    double baseRectangulo = userData.nextDouble();
    System.out.print("Ingresa la altura del rectangulo: ");
    double alturaRectangulo = userData.nextDouble();
    double area = baseRectangulo * alturaRectangulo;
    double perimetro = 2 * (baseRectangulo + alturaRectangulo);
    System.out.printf("""
        **********************************
        El area del rectangulo es: %.2f
        El perimeto del rectangulo es: %.2f
        """, area, perimetro);
  }
}

