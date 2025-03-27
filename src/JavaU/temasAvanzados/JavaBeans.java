package JavaU.temasAvanzados;

import java.io.Serializable;

public class JavaBeans {

  public static void main(String[] args) {
    PersonaJB personaJB = new PersonaJB();
    personaJB.setApellido("Santos");
    personaJB.setNombre("Nat");
    System.out.println("personaJB = " + personaJB);
  }

}

class PersonaJB implements Serializable {

  private String nombre;
  private String apellido;

  public PersonaJB() {
  }

  public String getApellido() {
    return apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  @Override
  public String toString() {
    return "PersonaJB{" +
        "nombre='" + nombre + '\'' +
        ", apellido='" + apellido + '\'' +
        '}';
  }
}
