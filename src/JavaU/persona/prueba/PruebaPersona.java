package JavaU.persona.prueba;

import JavaU.persona.Persona;

public class PruebaPersona {

  public static void main(String[] args) {
    System.out.println("**Creación de clase y objeto PERSONA**");
    System.out.println("Contador statico: " + Persona.getContadorPersonas());
    Persona persona = new Persona("Nat", "Santos");

    persona.mostrarPersona();
    System.out.println("Contador statico: " + Persona.getContadorPersonas());

    Persona persona1 = new Persona("Sam", "Santos");
    persona1.mostrarPersona();
    persona1.setNombre("Juan");
    persona1.mostrarPersona();
    System.out.println("toString");
    System.out.print(persona1);
    System.out.println("Contador statico: " + Persona.getContadorPersonas());


  }
}
