package com.Java8;


import java.util.List;
 import java.util.ArrayList;

public class MethodReferences {

    public static void main(String args[]) {
        List names = new ArrayList();

        names.add("Mahesh");
        names.add("Suresh");
        names.add("Ramesh");
        names.add("Naresh");
        names.add("Kalpesh");

        names.forEach(System.out::println);
    }
}
/**
 * Las referencias a métodos ayudan a señalar los métodos por sus nombres. Una referencia a un método se describe mediante el símbolo "::". Se puede utilizar una referencia de método para señalar los siguientes tipos de métodos:
 *
 * Métodos estáticos
 * Métodos de instancia
 * Constructores que utilizan un operador nuevo (TreeSet :: new)
 *
 * Aquí hemos pasado el método System.out :: println como referencia de método estático.
 */
