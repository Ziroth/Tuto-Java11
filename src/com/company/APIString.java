package com.company;
import java.util.ArrayList;
import java.util.List;

public class APIString {
    public static void main(String[] args) {
        String sample = " abc ";
        System.out.println(sample.repeat(2)); // " abc  abc " --String.repeat (int) : repite una cadena determinada cantidad de veces. Devuelve la cadena concatenada.
        System.out.println(sample.isBlank()); // false   --String.isBlank () : comprueba si una cadena está vacía o solo tiene espacios en blanco.
        System.out.println("".isBlank()); // true
        System.out.println("   ".isBlank()); // true
        System.out.println(sample.strip()); // "abc"  String.strip () : elimina los espacios en blanco iniciales y finales.
        System.out.println(sample.stripLeading()); // "abc "  String.stripLeading () : elimina los espacios en blanco iniciales
        System.out.println(sample.stripTrailing()); // " abc"  --String.stripTrailing () : elimina los espacios en blanco finales.
        sample = "This\nis\na\nmultiline\ntext.";
        List<String> lines = new ArrayList<>();

        sample.lines().forEach(line -> lines.add(line)); //String.lines () : devuelve el flujo de líneas de una cadena de varias líneas.
        lines.forEach(line -> System.out.println(line));


    }
}