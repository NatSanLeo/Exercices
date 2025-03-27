package JavaU.aritmetica.prueba;

import JavaU.aritmetica.Aritmetica;

public class PruebaAritmetica {

  public static void main(String[] args) {
    System.out.println("**Ejemplo aritmetica**");
    Aritmetica aritmetica = new Aritmetica(5, 7);
    aritmetica.sumar();
    aritmetica.restar();

    Aritmetica aritmetica1 = new Aritmetica(23, 1);
    aritmetica1.sumar();
    aritmetica1.restar();
    System.out.println("Atributo operando1: " + aritmetica1.getOperando1());
    System.out.println("Atributo operando1: " + aritmetica1.getOperando2());

    aritmetica1.setOperando1(2);
    System.out.println(aritmetica1.getOperando1());


  }
}
