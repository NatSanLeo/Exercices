import java.util.Scanner;

public class CapturaNombre {
    public static void main(String[] args) {
        Scanner datosUsuarios = new Scanner(System.in);
        String nombreUsuario;
        int edad;
        System.out.println("Ingresa tu nombre");
        nombreUsuario=datosUsuarios.nextLine();
        System.out.println("Ingresa tu edad");
        edad =datosUsuarios.nextInt();

        System.out.println("Tu nombre es : "+ nombreUsuario+" , tu edad es: "+edad);

    }

}

