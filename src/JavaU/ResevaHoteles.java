package JavaU;

public class ResevaHoteles {

  public static void main(String[] args) {
    String nombreCliente = "Nat Santos Le";
    int diasEstancia = 23;
    double tarifaDiaria = 230091.1;
    boolean isAvailable = true;
    System.out.println("El cliente " + nombreCliente + " tiene una taria oficial de " + tarifaDiaria
        + " para " + diasEstancia + " días de estancia" + " la habitación se encuentra disponible?: " + isAvailable);

    nombreCliente = "Nat Santos Leon";
    diasEstancia = 2;
    tarifaDiaria = 1009.111;
    isAvailable = false;
    System.out.println("El cliente " + nombreCliente + " tiene una taria oficial de " + tarifaDiaria
        + " para " + diasEstancia + " días de estancia" + " la habitación se encuentra disponible?: " + isAvailable);
  }

}
