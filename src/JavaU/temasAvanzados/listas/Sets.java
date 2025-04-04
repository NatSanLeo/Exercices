package JavaU.temasAvanzados.listas;

import java.util.Set;
import java.util.TreeSet;

public class Sets {

  public static void main(String[] args) {
    Set<String> conjunto = new TreeSet<>();
    conjunto.add("Lunes");
    conjunto.add("Lunes");
    conjunto.add("Miercoles");

    conjunto.forEach(System.out::println);

    conjunto.remove("Miercoles");
    conjunto.forEach(System.out::println);
  }
}