package JavaU;

import java.util.Scanner;
import java.util.function.BiFunction;

public class DecisionIf {

  public static Scanner dataUser = new Scanner(System.in);

  public static void main(String[] args) {
    //validarEdad();
    //validaNumero();
    //tiendaOnLine();
    //calculadoraPF();
    ifTernarioDos();
  }

  public static void validarEdad() {
    int edadLimtMin = 13;
    int edadLimtMax = 18;
    System.out.print("Ingresa la edad: ");
    int edadUsuario = dataUser.nextInt();
    if (edadUsuario >= edadLimtMax) {
      System.out.println("Eres MAYOR de edad.");

    } else if (edadUsuario >= edadLimtMin) {
      System.out.println("Eres adolecente.");
    } else {
      System.out.println("Eres un NIÑO.");
    }
  }

  public static void validaNumero() {
    System.out.print("Ingresa un número:");
    int numeroUsuario = dataUser.nextInt();
    if (numeroUsuario > 0) {
      System.out.printf("Es positivo: %s", numeroUsuario);
    } else if (numeroUsuario < 0) {
      System.out.printf("Es negativo: %s", numeroUsuario);
    } else {
      System.out.printf("Es cero: %s", numeroUsuario);
    }
  }

  public static void tiendaOnLine() {
    System.out.println("Tienda OnLine");
    double montoMin = 1000;
    double descuentoCinco = 0.05;
    double descuentoDiez = 0.10;

    System.out.print("Ingresa el monto de la compra: ");
    double montoCompra = dataUser.nextDouble();
    System.out.print("¿Eres miembro de la tienda? (true/false): ");
    boolean esMiembro = Boolean.parseBoolean(dataUser.next());

    if (montoCompra >= montoMin && esMiembro) {
      System.out.println(
          "El valor de la compra es: " + montoCompra * (1 - descuentoDiez) + " tiene un descuento de 10%");
    } else if (montoCompra < montoMin && esMiembro) {
      System.out.println(
          "El monto de la compra es: " + montoCompra * (1 - descuentoCinco) + " tiene un descuento de 5%");
    } else {
      System.out.println("Valor de la compra es: " + montoCompra + " tiene un descuento del 0%");
    }
  }

  public static void tiendaOnLinePF() {
    final double MONTO_MIN = 1000;
    final double DESCUENTO_CINCO = 0.05;
    final double DESCUENTO_DIEZ = 0.10;
    System.out.print("Ingresa el monto de la compra: ");
    double montoCompra = dataUser.nextDouble();
    System.out.print("¿Eres miembro de la tienda? (true/false): ");
    boolean esMiembro = Boolean.parseBoolean(dataUser.next());

    BiFunction<Double, Boolean, Double> calcularDescuento = (monto, miembro) -> {
      if (monto >= MONTO_MIN && miembro) {
        return monto * (1 - DESCUENTO_DIEZ);
      }
      if (monto < MONTO_MIN && miembro) {
        return monto * (1 - DESCUENTO_CINCO);
      }
      return monto;
    };

    double montoFinal = calcularDescuento.apply(montoCompra, esMiembro);
    System.out.println("El monto final de la compra es: " + montoFinal);
  }

  public static void calculadoraPF() {
    BiFunction<Integer, Integer, Integer> sumarNumeros = (numeroUno, numeroDos) -> numeroUno + numeroDos;
    {

      Integer resultadoFinal = sumarNumeros.apply(2, 3);
      System.out.println("El resultado es:" + resultadoFinal);
    }
  }

  public static void ifTernario() {
    int edad = 20;
    String mensaje = (edad >= 18) ? "Mayor de edad" : "Menor de edad";
    System.out.println(mensaje);

  }

  public static void ifTernarioDos() {
    int mood = 6;
    String estadoMood = (mood > 5) ? "You are OK" : "You are upset";
    System.out.println(estadoMood);
  }
}