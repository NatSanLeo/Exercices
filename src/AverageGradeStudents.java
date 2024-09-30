import java.util.Scanner;

public class AverageGradeStudents {
    public static void main(String[] args) {
        Scanner numeroUsuario = new Scanner(System.in);
        int EstudiantesSuperior7 = 0;
        int EstudiantesInferior7 = 0;
        int CantidadNotas = 10;

        for (int i = 1; i <= 10; i++) {
            double nota;
            System.out.println("Ingrese la nota de los 10 estudiantes");
            nota = numeroUsuario.nextDouble();

            if (nota >= 7) {
                EstudiantesSuperior7 = EstudiantesSuperior7 + 1;
            }
            EstudiantesInferior7 = EstudiantesInferior7 + 1;
        }
        System.out.println("Cantidad de estudiantes con notas superiores a 7: " + EstudiantesSuperior7);
        System.out.println("Cantidad de estudiantes con notas inferiores a 7: " + EstudiantesInferior7);

    }
}
