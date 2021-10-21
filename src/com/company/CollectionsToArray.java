package com.company;


import java.util.Arrays;
import java.util.List;

public class CollectionsToArray {
    public static void main(String[] args) {
        List<String> namesList = Arrays.asList("Joe", "Julie");
        // Old way
        String[] names = namesList.toArray(new String[namesList.size()]);
        System.out.println(names.length);
        System.out.println("Old way");

        // New way
        names = namesList.toArray(String[]::new);
        System.out.println(names.length);
        System.out.println("New way");
    }
}