package com.Java8;


public class LambdaExpressions {

    public static void main(String args[]) {
        LambdaExpressions tester = new LambdaExpressions();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;

        //with out type declaration
        MathOperation subtraction = (a, b) -> a - b;

        //with return statement along with curly braces
        MathOperation multiplication = (int a, int b) -> { return a * b; };

        //without return statement and without curly braces
        MathOperation division = (int a, int b) -> a / b;

        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
        System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
        System.out.println("10 / 5 = " + tester.operate(10, 5, division));

        //without parenthesis
        GreetingService greetService1 = message -> System.out.println("Hello " + message);

        //with parenthesis
        GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

        greetService1.sayMessage("Mahesh");
        greetService2.sayMessage("Suresh");
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}

/***
 * Sintaxis
 * Una expresión lambda se caracteriza por la siguiente sintaxis.
 *
 **** parameter -> expression body ***
 * A continuación se muestran las características importantes de una expresión lambda. *
 * Declaración de tipo opcional : no es necesario declarar el tipo de un parámetro. El compilador puede inferir lo mismo a partir del valor del parámetro.
 * * Paréntesis opcional alrededor del parámetro : no es necesario declarar un solo parámetro entre paréntesis. Para varios parámetros, se requieren paréntesis.
 * * Corchetes opcionales : no es necesario utilizar llaves en el cuerpo de la expresión si el cuerpo contiene una sola declaración.
 * * Palabra clave de retorno opcional : el compilador devuelve automáticamente el valor si el cuerpo tiene una sola expresión para devolver el valor. Se requieren llaves para indicar que la expresión devuelve un valor.
 */
