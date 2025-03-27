package JavaU.temasAvanzados.listas;

import java.util.HashMap;

public class Map {

  public static void main(String[] args) {
    HashMap<Object, Object> persona = new HashMap<>();
    persona.put("nombre", "Diego");
    persona.put("Apellido", "Florez");
    persona.put("edad", "33");
    System.out.println("Valores de mapa: ");
    persona.entrySet().forEach(System.out::println);
    System.out.println("");
    persona.put("edad", "34");//modificamos el valor anterior -> debe ser la misma llave
    persona.remove("Apellido");
    System.out.println("Nuevos valores de mapa: ");
    persona.entrySet().forEach(System.out::println);
    //iterar solo sobre la llave o el valor
    System.out.println("Recorrido por separado (Llave Valor)");
    persona.forEach((llave, valor) -> System.out.println("Llave: " + llave + ", Valor " + valor)
    );
  }
}
