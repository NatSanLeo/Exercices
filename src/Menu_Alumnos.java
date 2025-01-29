import java.util.Arrays;
import java.util.Scanner;

public class Menu_Alumnos {
    public static void main(String[] args) {

        Scanner infoUser = new Scanner(System.in);
        int tamanoArreglo;
        int opcion;
        String alumnoABuscar;

        System.out.print("Ingrese la cantidad de alumnos que quiere registrar:");
        tamanoArreglo=infoUser.nextInt();

        double[] arregloNotas = new double[tamanoArreglo];
        String[] arregloNombres= new String[tamanoArreglo];
        do {
            System.out.println("""
                        ___________________________________________________________
                        1. Registrar alumno. 📝
                        2. Mostrar todos los alumnos.📃
                        3. Mostrar promedio de notas.📊
                        4. Buscar alumno por nombre. 🔎
                        5. Modificar nota por nombre. ✏️
                        6. Eliminar alumno por nombre. 🗑️
                        7. Salir ❌
                        ___________________________________________________________
          """);


            System.out.print("Ingrese una opción:");
            opcion= infoUser.nextInt();

            switch (opcion) {
                case 1->{//Permitir al usuario registrar un nuevo alumno ingresando su nombre y nota.
                    for (int i = 0; i < arregloNombres.length; i++) {
                        System.out.println("Ingrese el nombre del alumno: ");
                        arregloNombres[i] = infoUser.next(); //no poner nextLine, poner solo next
                        System.out.println("Inrese la nota: ");
                        arregloNotas[i] = infoUser.nextDouble();
                    }
                    System.out.println("Felicidades registraste a tus alumnos de manera correcta. \uD83D\uDE03");
                }

                case 2 ->{// Mostrar en pantalla el nombre y la nota de todos los alumnos registrados hasta el momento.
                    if (Arrays.stream(arregloNombres).allMatch(elemento -> elemento == null)) {
                        System.out.println("No hay alumnos registrados \uD83E\uDD10");
                    } else {
                        for (int i = 0; i < arregloNombres.length; i++){
                            System.out.println("Nombre: " + arregloNombres[i] + " Nota: " + arregloNotas[i]);
                        }
                    }
                }

                case 3 -> {//Calcular y mostrar en pantalla el promedio de las notas de todos los alumnos registrados hasta el momento.
                    double promedioNotas=0;
                    double suma=0;
                    if (Arrays.stream(arregloNombres).allMatch(elemento -> elemento == null)) {
                        System.out.println("No hay alumnos registrados \uD83E\uDD10");
                    } else {
                        for (int i = 0; i < arregloNombres.length; i++){
                            suma+=arregloNotas[i];
                            promedioNotas=suma/tamanoArreglo;
                        }
                        System.out.println("Promedio de notas: " + promedioNotas);
                    }
                }
                case 4 -> {//Solicitar al usuario ingresar el nombre de un alumno y mostrar en pantalla su nota si el alumno existe.
                    System.out.print("Ingrese el nombre del alumno a buscar:");
                    alumnoABuscar=infoUser.next();
                    if (Arrays.stream(arregloNombres).allMatch(elemento -> elemento == null)) {
                        System.out.println("No hay alumnos registrados \uD83E\uDD10");
                    }else for (int i =0;i<arregloNombres.length;i++) {
                        if (alumnoABuscar.equalsIgnoreCase(arregloNombres[i])) {
                            System.out.println("La nota del alumno es: " + arregloNotas[i]);
                        }
                    }
                }
                case 5 -> {//Solicitar al usuario ingresar el nombre de un alumno y permitir modificar su nota si el alumno existe.
                    System.out.print("Ingrese el nombre del alumno a buscar:");
                    alumnoABuscar=infoUser.next();
                    if (Arrays.stream(arregloNombres).allMatch(elemento -> elemento == null)) {
                        System.out.println("No hay alumnos registrados \uD83E\uDD10");
                    }else for (int i =0;i<arregloNombres.length;i++) {
                        if (alumnoABuscar.equalsIgnoreCase(arregloNombres[i])) {
                            System.out.println("La nota del alumno es: " + arregloNotas[i]);
                            System.out.println("Ingrese la nueva nota del alumno");
                            arregloNotas[i]=infoUser.nextDouble();
                        }
                    }
                }
                case 6 -> {//Solicitar al usuario ingresar el nombre de un alumno y eliminar al alumno si existe.
                    System.out.print("Ingrese el nombre del alumno a buscar:");
                    alumnoABuscar=infoUser.next();
                    if (Arrays.stream(arregloNombres).allMatch(elemento -> elemento == null)) {
                        System.out.println("No hay alumnos registrados \uD83E\uDD10");
                    }else for (int i =0;i<arregloNombres.length;i++) {
                        if (alumnoABuscar.equalsIgnoreCase(arregloNombres[i])) {
                            System.out.println("La nota del alumno es: " + arregloNotas[i]);
                            System.out.println("Ingrese la nueva nota del alumno");
                            arregloNotas[i]=0;
                        }
                    }
                }
                case 7 -> //Salir
                        System.out.println("Gracias por utilizar nuestro programa");
            }
        } while (opcion!=7);
    }
}
