package JavaU;

import java.util.*;
import java.util.stream.Collectors;

public class ProgramacionFuncional {
  public static void main(String[] args) {
    List<Integer> numeros = Arrays.asList(3, 6, 8, 1, 5, 6, 8, 10, 15, 3);

    // 1. stream() -> Convierte la lista en un flujo de datos
    numeros.stream().forEach(n -> System.out.print(n + " "));
    System.out.println();

    // 2. filter() -> Filtrar números mayores a 5
    List<Integer> filtrados = numeros.stream()
        .filter(n -> n > 5)
        .collect(Collectors.toList());
    System.out.println("Números mayores a 5: " + filtrados);

    // 3. map() -> Multiplicar cada número por 2
    List<Integer> duplicados = numeros.stream()
        .map(n -> n * 2)
        .collect(Collectors.toList());
    System.out.println("Números duplicados: " + duplicados);

    // 4. flatMap() -> Aplanar listas de listas
    List<List<Integer>> listas = Arrays.asList(Arrays.asList(1, 2), Arrays.asList(3, 4));
    List<Integer> aplanada = listas.stream()
        .flatMap(Collection::stream)
        .collect(Collectors.toList());
    System.out.println("Lista aplanada: " + aplanada);

    // 5. forEach() -> Imprimir cada número
    numeros.stream().forEach(n -> System.out.print(n + " "));
    System.out.println();

    // 6. reduce() -> Sumar todos los números
    int suma = numeros.stream()
        .reduce(0, Integer::sum);
    System.out.println("Suma total: " + suma);

    // 7. collect() -> Convertir a Set (elimina duplicados)
    Set<Integer> conjunto = numeros.stream()
        .collect(Collectors.toSet());
    System.out.println("Conjunto sin duplicados: " + conjunto);

    // 8. sorted() -> Ordenar la lista
    List<Integer> ordenados = numeros.stream()
        .sorted()
        .collect(Collectors.toList());
    System.out.println("Lista ordenada: " + ordenados);

    // 9. distinct() -> Eliminar duplicados
    List<Integer> sinDuplicados = numeros.stream()
        .distinct()
        .collect(Collectors.toList());
    System.out.println("Lista sin duplicados: " + sinDuplicados);

    // 10. limit() -> Tomar los primeros 3 números
    List<Integer> limitados = numeros.stream()
        .limit(3)
        .collect(Collectors.toList());
    System.out.println("Primeros 3 números: " + limitados);

    // 11. skip() -> Omitir los primeros 2 números
    List<Integer> omitidos = numeros.stream()
        .skip(2)
        .collect(Collectors.toList());
    System.out.println("Lista sin los primeros 2 números: " + omitidos);

    // 12. anyMatch() -> ¿Hay algún número mayor a 10?
    boolean hayMayorQue10 = numeros.stream()
        .anyMatch(n -> n > 10);
    System.out.println("¿Hay un número mayor a 10? " + hayMayorQue10);

    // 13. allMatch() -> ¿Todos son positivos?
    boolean todosPositivos = numeros.stream()
        .allMatch(n -> n > 0);
    System.out.println("¿Todos son positivos? " + todosPositivos);

    // 14. noneMatch() -> ¿Ninguno es menor a 0?
    boolean ningunoNegativo = numeros.stream()
        .noneMatch(n -> n < 0);
    System.out.println("¿Ninguno es negativo? " + ningunoNegativo);

    // 15. findFirst() -> Obtener el primer número
    int primerNumero = numeros.stream()
        .findFirst()
        .orElse(-1);
    System.out.println("Primer número: " + primerNumero);

    // 16. findAny() -> Obtener cualquier número
    int cualquierNumero = numeros.stream()
        .findAny()
        .orElse(-1);
    System.out.println("Cualquier número: " + cualquierNumero);
  }
}
