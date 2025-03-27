package JavaU.persona;

public class Persona {

  private static int contadorPersonas = 0;


  public int idPersona = 0;
  private String nombre;
  private String apellido;

  public Persona(String nombre, String apellido) {
    this.nombre = nombre;
    this.apellido = apellido;
    //Asigamos el idUnico con ayuda de la variable Estatica.
    this.idPersona = ++Persona.contadorPersonas;

  }

  @Override
  public String toString() {
    return "id: " + this.idPersona + ",Nombre: " + this.nombre + ", Apellido: " + this.apellido +
        super.toString();
  }

  public String getNombre() {
    return this.nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getApellido() {
    return this.apellido;
  }

  public void setApellido(String apellido) {
    this.apellido = apellido;
  }

  public int getIdPersona() {
    return this.idPersona;
  }

  public static int getContadorPersonas() {
    return contadorPersonas;
  }

  public void mostrarPersona() {
    System.out.println("Nombre: " + this.nombre);
    System.out.println("Apellido:  " + this.apellido);
  }
}
