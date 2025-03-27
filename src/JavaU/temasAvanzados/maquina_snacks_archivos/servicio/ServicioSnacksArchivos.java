package JavaU.temasAvanzados.maquina_snacks_archivos.servicio;

import JavaU.temasAvanzados.maquina_snacks_archivos.dominio.Snack;
import java.awt.event.PaintEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServcioSnack {

  private final String NOMBRE_ARCHIVO = "snacks.txt";
  //Crear lista snacks
  private List<Snack> snacks = new ArrayList<>();

  public ServicioSnacksArchivos() {
    File archivo = new File(NOMBRE_ARCHIVO);
    Boolean existe = false;
    try {
      existe = archivo.exists();
      if (existe) {
        this.snacks = obtenerSnacks();
      } else {
        PrintWriter salida = new PrintWriter(new FileWriter(archivo));
        salida.close();
        System.out.println("Se ha creado el archivo");
      }
    } catch (Exception e) {
      System.out.println("Error al crear el archivo:" + e.getMessage());
    }
    //Cargamos elementos al archivo
    if (!existe) {
      cargarSnacksIniciales();
    }
  }

  private void cargarSnacksIniciales() {
    this.agregarSnack(new Snack("Papitas", 90));
    this.agregarSnack(new Snack("Helado", 20));
    this.agregarSnack(new Snack("Sandwich", 30));
  }

  private List<Snack> obtenerSnacks() {
    ArrayList snacks = new ArrayList<>();
    try {
      List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
      for (String linea : lineas) {
        String[] lineaSnack = linea.split(",");
        var idSnack = lineaSnack[0];
        var nombre = lineaSnack[1];
        var precio = Double.parseDouble(lineaSnack[2]);
        Snack snack = new Snack(nombre, precio);
        snacks.add(snack);
      }

    } catch (Exception e) {
      System.out.println("Error al leer archivo de snacks: " + e.getMessage());
    }
    return snacks;
  }

  @Override
  public void agregarSnack(Snack snack) {
    this.snacks.add(snack);
    this.agregarSnackArchivo(snack);

  }

  private void agregarSnackArchivo(Snack snack) {
    boolean anexar = false;
    File archivo = new File(NOMBRE_ARCHIVO);
    try {
      anexar = archivo.exists();
      PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
      salida.println(snack.escribirSnack());
      salida.close();

    } catch (Exception e) {
      System.out.println("Error al agregar snack" + e.getMessage());
    }
  }

  @Override
  public void mostrarSnacks() {
    System.out.println("--- Snacks en el inventario ---");
    String inventarioSnacks = "";
    for (var snack : this.snacks) {
      inventarioSnacks += snack.toString() + "\n";
    }
    System.out.println(inventarioSnacks);
  }

  @Override
  public List<Snack> getSnacks() {
    return this.snacks;
  }
}
