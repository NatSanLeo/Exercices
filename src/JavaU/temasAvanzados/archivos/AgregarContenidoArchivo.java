package JavaU.temasAvanzados.archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenidoArchivo {

  public static void main(String[] args) {
    Boolean anexar = false;
    String nombreArchivo = "mi_archivo.txt";
    File archivo = new File(nombreArchivo);
    try {
//Revisar si exixte archivo
      anexar = archivo.exists();
      PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
      String nuevoContenido = "\nNuevo \nContenido";
      salida.println(nuevoContenido);
      salida.close();
      System.out.println("Se agrego contenido al archivo de manera correcta");
    } catch (Exception e) {
      System.out.println("Error al escribir el archivo" + e);
    }
  }
}
