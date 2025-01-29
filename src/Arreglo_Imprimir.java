public class Arreglo_Imprimir {
    public static class ImprimirArray {
        public static void main(String[] args) {
            int[] arreglo = {1, 2, 3};
            String[] arregloString = {"1", "2", "3"};
            imprimirArray(arregloString);
            System.out.println(" ");
            imprimirArray(arreglo);
        }


        public static void imprimirArray(int[] arreglo) {
            for (int i : arreglo) {
                System.out.print(i + " ");
            }
        }

        public static void imprimirArray(String[] arregloString) {
            for (String i : arregloString) {
                System.out.print(i + " ");
            }
        }
    }
}
