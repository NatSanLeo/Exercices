package poo.modelos.Auto;

public class Auto_Main {
  public static void main(String[] args) {
    Auto auto1 = new Auto();
    Auto auto2 = new Auto("Ford");
    Auto auto3 = new Auto("Lamborghini", "Diabolo");
    Auto auto4 = new Auto("Toyota", "Yaris", 2023);

    auto1.imprimirDatos();
    auto2.imprimirDatos();
    auto3.imprimirDatos();
    auto4.imprimirDatos();
    
  }
}
