package JavaU;

import java.util.Random;
import java.util.Scanner;
import java.util.logging.Logger;

public class EstructurasRepeticion {

  private static final Logger LOGGER = Logger.getLogger(EstructurasRepeticion.class.getName());


  public static void main(String[] args) {
    contarVolcalesPalabra();
  }

  public static void onlyWhile() {
    int i = 1;
    while (i <= 5) {
      System.out.println("Número: " + i);
      i++; // Incremento
    }
  }

  public static void onlyDoWhile() {
    int j = 1;
    do {
      System.out.println("Número: " + j);
      j++; // Incremento
    } while (j <= 5);
  }

  public static void justFor() {
    for (int k = 1; k <= 5; k++) {
      System.out.println("Número: " + k);
    }
  }

  public static void justForEach() {
    int[] numeros = {1, 2, 3, 4, 5};
    for (int num : numeros) {
      LOGGER.info("Numero: " + num);
    }
  }

  public static void numeroParFor() {
    for (int i = 0; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println(i + " Par");
      } else {
        System.out.println(i + " Impar");
      }
    }
  }

  public static void sumaAcomulativa() {
    final int MAXIMO = 5;
    int acumuladorSuma = 0; //Guarda la suma tota de los números
    int contador = 1;//Autmeta en cada vuelta del while
    while (contador <= MAXIMO) {
      acumuladorSuma += contador++;
    }
    System.out.println("La suma de los primeros " + MAXIMO + " números " + "  es " + acumuladorSuma);

  }

  public static void contarNumeros() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese un número");
    int numero = teclado.nextInt();
    int contador = 0;
    while (numero > 0) {
      numero /= 10; // Eliminamos el último dígito
      contador++; // Incrementamos el contador
    }

    System.out.println("El número tiene " + contador + " dígitos.");

  }

  public static void menuInteractivo() {
    System.out.println("** Menu Interactivo **");
    Scanner teclado = new Scanner(System.in);
    int opcion;
    do {

      System.out.println("""
          1. Crear cuenta
          2. Eliminar cuenta
          3. Salir""");
      opcion = teclado.nextInt();
    } while (opcion != 3);

  }

  public static void menuInteractivo2() {
    System.out.println("** Menu Interactivo **");
    Scanner teclado = new Scanner(System.in);
    int opcion = 0;
    while (opcion != 3) {
      System.out.println("""
          1. Crear cuenta
          2. Eliminar cuenta
          3. Salir""");
      opcion = teclado.nextInt();
    }
  }

  public static void contarNumerosString() {
    Scanner teclado = new Scanner(System.in);
    int numero;

    System.out.println("Ingrese el numero");
    numero = teclado.nextInt();
    String numeroLetras = Integer.toString(numero);
    System.out.println(numeroLetras.length());
  }

  public static void contarVocales() {
    String vocales = "aeiou";
    LOGGER.info("La longitud de la cadena es: " + vocales);
  }

  public static void contarVolcalesPalabra() {
    int contador = 0;
    Scanner teclado = new Scanner(System.in);
    System.out.println("Ingrese la palabra");
    String palabra = teclado.next();

    for (char letra : palabra.toCharArray()) {
      if ("aeiou".contains(String.valueOf(letra))) {
        contador++;

      }
    }
    System.out.println("el numero de vocales de la palabra es: " + contador);
  }

  public static void nombres() {
    String[] nombre = {"Nata", "Sam", "Milo"};
    for (String nombres : nombre) {
      System.out.println(nombres);
    }
  }

  public static void cajeroAutomatico() {
    System.out.println("Cajero automatico");
    Scanner teclado = new Scanner(System.in);
    int saldo = 1000;
    int valorDepoito;
    int valorRetiro;

    int opcion;
    do {
      System.out.println("""
          1. Consultar saldo
          2. Retirar.
          3. Depositar
          4. Salir""");
      System.out.print("Ingresa una opción: ");
      opcion = teclado.nextInt();

      switch (opcion) {
        case 1 -> {
          System.out.printf("-> El saldo es: %s", saldo + "\n");
        }
        case 2 -> {
          System.out.print("Ingresa el valor a retirar: ");
          valorRetiro = teclado.nextInt();
          if (valorRetiro > saldo || valorRetiro <= 0) {
            System.out.printf("-> Saldo insuficiente, saldo actual: %s", saldo + "\n");

          } else {
            saldo -= valorRetiro;
            System.out.println("Contando dinero");
            System.out.printf("-> Saldo actual: %s ", saldo + "\n");

          }
        }
        case 3 -> {
          System.out.print("Ingrese el valor a depositar: ");
          valorDepoito = teclado.nextInt();
          if (valorDepoito <= 0) {
            System.out.println("Monto invalido");
          } else {
            saldo += valorDepoito;
            System.out.printf("Deposito realizado, saldo actual: %s", saldo + "\n");
          }
        }
        case 4 -> System.out.println("...Saliendo....");
      }
    } while (opcion != 4);
  }

  public static void calculadora() {
    System.out.println("Calculadora");
    Scanner teclado = new Scanner(System.in);
    int numeroUno = 0;
    int numeroDos = 0;
    int resultado;
    int opcion;
    do {
      System.out.println("""
          1. Sumar
          2. Restar
          3. Multiplicación
          4. División
          5. Salir""");
      opcion = teclado.nextInt();

      if (opcion >= 1 && opcion <= 4) {
        System.out.print("Ingresa el primer número: ");
        numeroUno = teclado.nextInt();
        System.out.print("Ingresa el segundo número: ");
        numeroDos = teclado.nextInt();
      }
      switch (opcion) {
        case 1 -> {
          resultado = numeroUno + numeroDos;
          System.out.printf("Resultado: %s", resultado + "\n");
        }
        case 2 -> {
          resultado = numeroUno - numeroDos;
          System.out.printf("Resultado: %s", resultado + "\n");
        }
        case 3 -> {
          resultado = numeroUno * numeroDos;
          System.out.printf("Resultado: %s", resultado + "\n");
        }
        case 4 -> {
          resultado = numeroUno / numeroDos;
          System.out.printf("Resultado: %s", resultado + "\n");
        }
        case 5 -> {
          System.out.println("...Saliendo...");
        }
      }
    } while (opcion != 4);
  }

  public static void validacionPassword() {
    Scanner teclado = new Scanner(System.in);
    System.out.println("Creación de password");
    String password;
    boolean isPasswordValido = false;
    do {
      System.out.print("Ingrese una contraseña, al menos 6 caracteres");
      password = teclado.nextLine();
      if (password.length() == 6) {
        isPasswordValido = true;
        System.out.println("Contraseña creada");
      } else {
        System.out.println("Ingrese de nuevo la contraseña");
      }
    } while (!isPasswordValido);
  }

  public static void adivinarNumero() {
    Random ramdom = new Random();
    Scanner teclado = new Scanner(System.in);
    int numeroRandom = ramdom.nextInt(10);
    System.out.println(numeroRandom);
    int contador = 0;
    boolean adivinoNumero = false;

    do {
      System.out.print("Ingresa un numero: ");
      int numeroUsuario = teclado.nextInt();
      contador++;
      if (numeroUsuario == numeroRandom) {
        System.out.println("Aivinaste el numero. Numero de intentos: " + (contador));
        adivinoNumero = true;

      } else if (contador == 3) {
        System.out.printf("Se acabaron los intentos el numero era: %s", numeroRandom);

        if (numeroUsuario < numeroRandom) {
          System.out.print("El numero ramdom es MAYOR, intenta de nuevo.");

        }
      } else {
        System.out.print("El numero ramdom es MENOR, intenta de nuevo.");

      }
    } while (!adivinoNumero && contador < 3);

  }

  public static void dibujarPiramide() {
    System.out.println("Para dibujar un triangulo, ingresa número de filas:");
    Scanner teclado = new Scanner(System.in);
    int numeroFilas = teclado.nextInt();
    for (int i = 1; i <= numeroFilas; i++) {
      String espaciosVacios = " ".repeat(numeroFilas - i);
      String asteriscos = "*".repeat(2 * i - 1);
      System.out.println(espaciosVacios + asteriscos);
    }
  }

  public static void numeroParBreak() {
    //Ejemplo break
    for (int i = 1; i < 10; i++) {
      if (i % 2 == 0) {
        System.out.print(i + " ");
        break;
      }
    }
  }

  public static void numeroParContinue() {
    for (int i = 1; i < 10; i++) {
      if (i % 2 == 1) {//si se cumple esta condicion es un numero impar
        continue;//salta a la siguiente
      }
      System.out.print(i + " ");// solo se imprimen los numeros impares
    }
  }
}


/// en el for se puede psasr una variabla ya delarada para iterar.