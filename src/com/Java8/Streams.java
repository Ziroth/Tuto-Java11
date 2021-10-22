package com.Java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String args[]) {

    List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

    //Usando forEach.

        Random random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        //map
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        //get list of unique squares
        List<Integer> squaresList = numbers.stream().map( i -> i*i).distinct().collect(Collectors.toList());

        //filter
     /*   List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
         //get count of empty string
        int count = strings.stream().filter(string -> string.isEmpty()).count();*/

        //limit
        random = new Random();
        random.ints().limit(10).forEach(System.out::println);

        //order
         random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);

        //Procesamiento en paralelo
       // List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        //get count of empty string
        long count = strings.parallelStream().filter(string -> string.isEmpty()).count();

        //collectors
     //   List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
    //    List<String> filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        System.out.println("Filtered List: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("Merged String: " + mergedString);

        //stadistics
     //   List numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
        System.out.println("Highest number in List : " + stats.getMax());
        System.out.println("Lowest number in List : " + stats.getMin());
        System.out.println("Sum of all numbers : " + stats.getSum());
        System.out.println("Average of all numbers : " + stats.getAverage());



    }}

/***
 * Generando corrientes
 * Con Java 8, la interfaz de colección tiene dos métodos para generar una secuencia.
 * stream () : devuelve un flujo secuencial considerando la colección como su fuente.
 * paralelaStream () : devuelve una secuencia paralela que considera la colección como su fuente.
 *
 *
 * forEach
 * Stream ha proporcionado un nuevo método 'forEach' para iterar cada elemento del flujo. El siguiente segmento de código muestra cómo imprimir 10 números aleatorios usando forEach.
 *
 * mapa
 * El método 'mapa' se utiliza para asignar cada elemento a su resultado correspondiente. El siguiente segmento de código imprime cuadrados únicos de números usando map.
 *
 * filter
 *
 * El método de 'filtro' se utiliza para eliminar elementos según un criterio. El siguiente segmento de código imprime un recuento de cadenas vacías usando filter.
 *
 * limit
 * El método 'límite' se utiliza para reducir el tamaño de la secuencia. El siguiente segmento de código muestra cómo imprimir 10 números aleatorios usando el límite.
 *
 * order
 * El método 'ordenado' se utiliza para ordenar la secuencia. El siguiente segmento de código muestra cómo imprimir 10 números aleatorios en un orden ordenado.
 *
 * Parallel Processing
 *paraleloStream es la alternativa de flujo para procesamiento paralelo. Eche un vistazo al siguiente segmento de código que imprime un recuento de cadenas vacías usando paraleloStream.
 *
 * Collectors
 * Los recopiladores se utilizan para combinar el resultado del procesamiento en los elementos de una secuencia. Los recopiladores se pueden utilizar para devolver una lista o una cadena
 *
 *
 *Statistics
 * Con Java 8, se introducen recopiladores de estadísticas para calcular todas las estadísticas cuando se realiza el procesamiento de la transmisión.
 *
 */
