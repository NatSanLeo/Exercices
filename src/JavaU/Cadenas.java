package JavaU;

public class Cadenas {

  public static void main(String[] args) {
    //cadenasAll();
    formatCadenas();
  }

  public static void cadenasAll() {
    System.out.println("*** Cadenas ***");
    String cadenaUno = "Hello";
    System.out.println("cadenaUno = " + cadenaUno);

    String cadenaDos = new String("Hello Two");
    System.out.println("cadenaDos = " + cadenaDos);

    String cadenaThree = cadenaUno + " " + cadenaDos;
    System.out.println("cadenaThree = " + cadenaThree);

    System.out.println("""
        🕶️ Wherever
        🛵 it
        ✈️ takes""");

    System.out.println("*** Indices en una cadenas ***");
    String sayHello = ("Hello world");
    char firtsCharacter = sayHello.charAt(0);
    System.out.println("firtsCharacter = " + firtsCharacter);
    char lastChacter = sayHello.charAt(9);
    System.out.println("lastChacter = " + lastChacter);

    char middleCharacter = sayHello.charAt(6);
    System.out.println("middleCharacter = " + middleCharacter);

    System.out.println("*** Inmutabilidad de las cadenas: ***");
    String sayHi = "Hello";
    System.out.println("sayHi = " + sayHi);
    sayHi = "Say bye";
    System.out.println("sayHi = " + sayHi);

    System.out.println("*** Comparación de cadenas y pool de cadenas ***");
    String namePetOne = "Samita";
    String namePetTwo = "Samita";
    String namePetThree = new String("Samita");
    System.out.print("La cadena uno es igual en referencia que la cadena dos: ");
    System.out.println(namePetOne == namePetTwo);

    System.out.print("La cadena dos es igual en referencia que la cadena tres: ");
    System.out.println(namePetOne == namePetThree);

    //para comprar contenido y no referencia se hace con el equals
    System.out.println("Cadena uno es igual en contenido que cadena tres: ");
    System.out.print(namePetOne.equals(namePetThree));

    System.out.println("*** Métodos de cadenas ***");
    String obtainLongString = "PlayStation";
    System.out.println("obtainLongString = " + obtainLongString);
    int longitud = obtainLongString.length();
    System.out.println("longitud = " + longitud);
    //Reemplazar caracteres
    String cadenaReplace = obtainLongString.replace('P', 'C');
    System.out.println("cadenaReplace = " + cadenaReplace);
    //Convertir a mayusculas
    String upperCase = obtainLongString.toUpperCase();
    System.out.println("upperCase = " + upperCase);
    System.out.println("Minuscula: " + obtainLongString.toLowerCase());

    //eliminar espacios a inicio y final
    String product = " RoyalCain ";
    System.out.println("Cadena con espacios:" + product);
    System.out.println("Cadena sin espacios:" + product.trim());

    // concatenar Cadenas //el builder solo genera un objeto de tipo cadena en memoria
    System.out.println(sayHi.concat(product));
    StringBuilder constructorBuilder = new StringBuilder();
    constructorBuilder.append(sayHi);
    constructorBuilder.append(" ");
    constructorBuilder.append("SAM");
    System.out.println("constructorBuilder = " + constructorBuilder);
    String allString = constructorBuilder.toString();
    System.out.println("allString = " + allString);

    //StringBuffer -> se usa cuando se trabaja con hilos
    StringBuffer stringBuffer = new StringBuffer();
    stringBuffer.append(sayHi).append("->").append(product);
    System.out.println("stringBuffer = " + stringBuffer);

    //Método Join
    String resultado = String.join("*", cadenaDos, sayHi, "Adios");
    System.out.println("resultado = " + resultado);

    System.out.println("resultado = " + resultado);
  }

  public static void formatCadenas() {
    System.out.println("** Formateo de cadenas **");

    String name = "Mati";
    int age = 278;
    double earrn = 2334.12;
    int numEmployee = 12;
    //String.format
    String messageName = String.format("Nombre: %s, Edad: %d, Salario: %.2f", name, age, earrn);
    System.out.println(messageName);
    System.out.printf("Nombre: %s, Edad: %d, Salario: %.2f", name, age, earrn);
    System.out.println();
    messageName = """
        %n________________________
        %n User details: \s
         _______________________
         \t Name: %s\s
         \t Age: %d\s
         \t Earn: %.2f\s
         \t EmployeeNum: %04d\s"""
        .formatted(name, age, earrn, numEmployee);
    System.out.println("messageName = " + messageName);

  }
}