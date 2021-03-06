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
 * Con Java 8, la interfaz de colecci??n tiene dos m??todos para generar una secuencia.
 * stream () : devuelve un flujo secuencial considerando la colecci??n como su fuente.
 * paralelaStream () : devuelve una secuencia paralela que considera la colecci??n como su fuente.
 *
 *
 * forEach
 * Stream ha proporcionado un nuevo m??todo 'forEach' para iterar cada elemento del flujo. El siguiente segmento de c??digo muestra c??mo imprimir 10 n??meros aleatorios usando forEach.
 *
 * mapa
 * El m??todo 'mapa' se utiliza para asignar cada elemento a su resultado correspondiente. El siguiente segmento de c??digo imprime cuadrados ??nicos de n??meros usando map.
 *
 * filter
 *
 * El m??todo de 'filtro' se utiliza para eliminar elementos seg??n un criterio. El siguiente segmento de c??digo imprime un recuento de cadenas vac??as usando filter.
 *
 * limit
 * El m??todo 'l??mite' se utiliza para reducir el tama??o de la secuencia. El siguiente segmento de c??digo muestra c??mo imprimir 10 n??meros aleatorios usando el l??mite.
 *
 * order
 * El m??todo 'ordenado' se utiliza para ordenar la secuencia. El siguiente segmento de c??digo muestra c??mo imprimir 10 n??meros aleatorios en un orden ordenado.
 *
 * Parallel Processing
 *paraleloStream es la alternativa de flujo para procesamiento paralelo. Eche un vistazo al siguiente segmento de c??digo que imprime un recuento de cadenas vac??as usando paraleloStream.
 *
 * Collectors
 * Los recopiladores se utilizan para combinar el resultado del procesamiento en los elementos de una secuencia. Los recopiladores se pueden utilizar para devolver una lista o una cadena
 *
 *
 *Statistics
 * Con Java 8, se introducen recopiladores de estad??sticas para calcular todas las estad??sticas cuando se realiza el procesamiento de la transmisi??n.
 *
 */
