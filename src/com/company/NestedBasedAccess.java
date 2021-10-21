package com.company;


import java.util.Arrays;
        import java.util.Set;
        import java.util.stream.Collectors;

public class NestedBasedAccess {
    public static void main(String[] args) {
        boolean isNestMate = APITester.class.isNestmateOf(APITester.Inner.class);
        boolean nestHost = APITester.Inner.class.getNestHost() == APITester.class;


        System.out.println(isNestMate);
        System.out.println(nestHost);

        Set<String> nestedMembers = Arrays.stream(APITester.Inner.class.getNestMembers())
                .map(Class::getName)
                .collect(Collectors.toSet());
        System.out.println(nestedMembers);
    }
    public class Inner{}
}

/****
 * Java 11 introdujo un concepto de clase anidada donde podemos declarar una clase dentro de una clase. Este anidamiento de clases permite agrupar lógicamente las clases que se utilizarán en un solo lugar, haciéndolas más legibles y fáciles de mantener. La clase anidada puede ser de cuatro tipos:
 * * Clases anidadas estáticas
 * * Clases anidadas no estáticas
 * * Clases locales
 * * Clases anónimas
 * * Java 11 también proporciona el concepto de nestmate para permitir la comunicación y verificación de clases anidadas.
 */
