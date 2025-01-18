import java.util.Scanner;
public class DW_Contrasena {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String clave = "secreto";
        String intento = "";
        do {
            System.out.println("Adivina la contraseña");
            intento = input.nextLine();

            if (clave.equals(intento)) {
                System.out.println("Adivinaste");
            } else {
                System.out.println("Contraseña incorrecta");
            }
        } while ( !intento.equals(clave) );
        input.close();
    }
}
