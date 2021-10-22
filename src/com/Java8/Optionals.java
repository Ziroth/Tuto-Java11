package com.Java8;

import java.util.Optional;

public class Optionals {

  public static void main(String[] args) {

     // Optional<Object> empty = Optional.empty();
      Optional<Object> empty = Optional.of("Holaa");

      System.out.println(empty.isPresent());//esta presente o tiene valores
      System.out.println(empty.isEmpty()); // esta vacio?
    }

}
