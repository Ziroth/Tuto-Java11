package com.company;

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        String name = null;

        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());

        name = "Joe";
        System.out.println(!Optional.ofNullable(name).isPresent());
        System.out.println(Optional.ofNullable(name).isEmpty());
    }
}

/***
 * Java 11 introdujo un nuevo método en la clase Opcional como isEmpty () para verificar si el valor está presente.
 * isEmpty () devuelve falso si el valor está presente, de lo contrario es verdadero. *
 * Se puede usar como una alternativa del método isPresent () que a menudo necesita negarse para verificar si el valor no está presente.
 */
