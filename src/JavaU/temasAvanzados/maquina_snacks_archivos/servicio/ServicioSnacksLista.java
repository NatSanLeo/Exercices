package JavaU.temasAvanzados.maquina_snacks_archivos.servicio;

import JavaU.temasAvanzados.maquina_snacks_archivos.dominio.Snack;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServcioSnack {

  private static final List<Snack> snacks;

  //Bloque de tipo static inicializador
  static {
    snacks = new ArrayList<>();
    snacks.add(new Snack("Papas", 70));
    snacks.add(new Snack("Refresco", 50));
    snacks.add(new Snack("Sandwich", 120));
    snacks.add(new Snack("Chocoramo", 720));
  }

  public void agregarSnack(Snack snack) {
    snacks.add(snack);
  }

  public void mostrarSnacks() {
    String inventarioSnacks = "";
    for (Object snack : snacks) {
      inventarioSnacks += snack.toString() + "\n";

    }
    System.out.println("---Snacks en el inventario");
    System.out.println(inventarioSnacks);

  }

  public List<Snack> getSnacks() {
    return snacks;
  }
}
