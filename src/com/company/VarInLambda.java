package com.company;

import java.util.Arrays;
        import java.util.List;
        import java.util.stream.Collectors;

@interface NonNull {}

public class VarInLambda {
    public static void main(String[] args) {
        List<String> tutorialsList = Arrays.asList("Java", "HTML");

        String tutorials = tutorialsList.stream()
                .map((@NonNull var tutorial) -> tutorial.toUpperCase())
                .collect(Collectors.joining(", "));

        System.out.println(tutorials);
    }
}

/***
 * Java 11 permite usar var en una expresión lambda y se puede usar para aplicar modificadores a variables locales. *
 *        (@NonNull var value1, @Nullable var value2) -> value1 + value2
 *
 *        Limitaciones
 * Existen ciertas limitaciones sobre el uso de var en expresiones lambda.
 *
 * Los parámetros var no se pueden mezclar con otros parámetros. Lo siguiente arrojará un error de compilación.
 *
 * (var v1, v2) -> v1 + v2
 * Los parámetros var no se pueden mezclar con otros parámetros escritos. Lo siguiente arrojará un error de compilación.
 *
 * (var v1, String v2) -> v1 + v2
 * Los parámetros var solo se pueden usar entre paréntesis. Lo siguiente arrojará un error de compilación.
 *
 * var v1 -> v1.toLowerCase()
 */

