package JavaU.temasAvanzados.listas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {

  public static void main(String[] args) {
    List<String> milista = new ArrayList<>();
    //List milista = new ArrayList();
    milista.add("Lunes");
    milista.add("Martes");
    milista.add("Miercoles");
    milista.add("Jueves");
    milista.add("Viernes");
    milista.add("Sabado");
    milista.add("Domingo");
    milista.add("Domingo");

    System.out.println("For programación poo");
    for (String diasSemana : milista) {
      System.out.println("Día de la semana: " + diasSemana);
    }
    System.out.println("For con funcionesLambda");
    milista.forEach(diasSemana -> {
      System.out.println("Días semana: (FL)" + diasSemana);
    });
    System.out.println("Opción de funcion lambda");
    milista.forEach(System.out::println); //Metodos de referencias

    System.out.println("Creación lista y valores al mismo tiempo");
    List<String> nombre = Arrays.asList("Juan", "Pedro", "Sam"); //Listas genericas
    nombre.forEach(System.out::println);
  }
}
