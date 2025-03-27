package JavaU;

public class SubCadenas {

  public static void main(String[] args) {

    String extractToClass = "del muestran que los estudiantes que hacen del aprendizaje";
    System.out.println("Part of welcome message: " + extractToClass);
    String subCadena = extractToClass.substring(7, 45);
    System.out.println("SubString Part of welcome message: " + subCadena);
    System.out.println("extractToClass.substring(2) = " + extractToClass.substring(2));
    //busqueda de subCadenas
    System.out.println("IndexOf extractToClass: " + extractToClass.indexOf("que"));

    //lastIndexOf -return el indice de la última aparicion de la subcadena
    System.out.println("Last IndexOf extractToClass = " + extractToClass.lastIndexOf("del"));

    //Reemplazar SubCadenas
    String remplaceOneWordOnTheMessage = extractToClass.replace("estudiantes", "students");
    System.out.println("remplaceOneWordOnTheMessage = " + remplaceOneWordOnTheMessage);
  }

}
