package poo.modelos.Persona;

public class Persona {
    String nombre;
    int edad;

  public Persona(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
  }
public  void imprimirDatos(){
  System.out.println("El nombre de la persona es: "+ nombre+" la edad es: "+ edad);
}

  public Persona() {

  }

}
