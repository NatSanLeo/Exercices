package JavaU;

public class Variables {

  public static void main(String[] args) {
    int edad = 332;
    double precio = 3.40;
    boolean diponible = true;
    char genero;
    genero = 'M';

    System.out.println(edad);
    edad = 909;
    System.out.println(edad);
    System.out.println("El precio es: " + precio + " esta disponible? " + diponible + " el genero es: " + genero);

    //Valor por defecto es cero
    byte tipoByte = (byte) 137; //puede tener problemas con la conversion
    System.out.println("tipoByte = " + tipoByte);
    byte maxtipoByte = 127;
    System.out.println("maxtipoByte = " + maxtipoByte);
    short tipoShort = (short) 320000;//puede tener problemas con la conversion
    System.out.println("tipoShort = " + tipoShort);
    short maxTipoShort = 32000;
    System.out.println("maxTipoShort = " + maxTipoShort);
    int tipoInt = 2147483647;
    System.out.println("tipoInt = " + tipoInt);
    long tipoLong = 987654321;
    System.out.println("tipoLong = " + tipoLong);
    long maxTipoLong = 9876543219L; // se agrega la L para poderlo soportar
    System.out.println("maxTipoLong = " + maxTipoLong);

    //Valor por defecto 0.0
    float tipoFloat = 3.14F;//F para indicar que es tipo float
    System.out.println("tipoFloat = " + tipoFloat);
    double tipoDouble = 3.133212;
    System.out.println("tipoDouble = " + tipoDouble);

    //Valor por defecto ('\u0000')
    char tipoChar = 'A';//Caracteres de UniCode
    System.out.println("tipoChar = " + tipoChar);
    tipoChar = 65; //corresponde a la letra A en unicode
    System.out.println("tipoChar = " + tipoChar);
    tipoChar = '@';
    System.out.println("tipoChar = " + tipoChar);
    //Valor por defecto es falso
    boolean tipoBoolean = true;
    System.out.println("tipoBoolean = " + tipoBoolean);
    tipoBoolean = false;
    System.out.println("tipoBoolean = " + tipoBoolean);

    //para los tipos object o referencia cuando no tiene un valor asignado es null o ausencia de valor
    String nombre = null;
    System.out.println("nombre = " + nombre);
    nombre = "NatSantos";
    System.out.println("nombre = " + nombre);

    System.out.println("**Uso de VAR en JAVA**");
    String nombreUno = "Sam";
    System.out.println("nombreUno = " + nombreUno);
    var nombreVar = "Samita";
    System.out.println("nombreVar = " + nombreVar);

    var edadDos = 12;
    System.out.println("edadDos = " + edadDos);
    var valorProducto = 34.12F;
    System.out.println("valorProducto = " + valorProducto);
    var isAvailable = false;
    System.out.println("isAvailable = " + isAvailable);

  }
}
