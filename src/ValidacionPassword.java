import java.util.Scanner;

public class ValidacionPassword {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese su password: ");
        String password = read.nextLine();
        read.close();
        //true o false
        boolean pasaLongitudMinima=  password.length() >= 8;
        boolean pasaMinusculas=  password.matches(".*[a-z].*");
        boolean pasaMayusculas=  password.matches(".*[A-Z].*");
        boolean pasaDigitos=  password.matches(".*[0-9].*");
        boolean pasaSimbolosEspeciales=  password.matches(".*[!@#$%^&*(),.?\":{}|<>].*");

        boolean esBuenaPass =  pasaLongitudMinima && pasaMayusculas && pasaMinusculas && pasaDigitos && pasaSimbolosEspeciales;

        if(esBuenaPass)
            System.out.println("Todo OK!");
        else {
            System.out.println("Algo no anda bien...");
            if (!pasaLongitudMinima) {
                System.out.println("No tiene al menos 8 caracteres");
            }
            if (!pasaMayusculas) {
                System.out.println("No tiene Mayusculas");
            }
            if (!pasaMinusculas){
                System.out.println("No tiene Minusculas");
            }
            if (!pasaDigitos) {
                System.out.println("No tiene Numeros");
            }
            if (!pasaSimbolosEspeciales) {
                System.out.println("No tiene simbolos especiales\n");
            }
        }

    }
}
