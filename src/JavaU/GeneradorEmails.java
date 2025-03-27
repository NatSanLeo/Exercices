package JavaU;

public class GeneradorEmails {

  public static void main(String[] args) {
    String name = "Nat Santos";
    String empresa = "LULO BANK";
    String dominio = "com.co";
    String firtsPartName = name.substring(0, 3);
    String seconPartName = name.substring(4, 10);
    String firtsPartEmpresa = empresa.substring(0, 4);
    String secondPartEmpresa = empresa.substring(5,9);
    dominio.toLowerCase();
    String allDominio=firtsPartEmpresa+secondPartEmpresa;


   String correo = String.join(".",firtsPartName,seconPartName+"@"+allDominio,dominio).toLowerCase();

    System.out.println("El coreo es: " + correo);

  }

}
