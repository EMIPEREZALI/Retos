package org.example;

import java.util.Arrays;

public class Reto1B {

    public static String[] findSubstringsAndSort(String[] a1, String[] a2){
        return Arrays.stream(a1)
                .filter(s1 -> Arrays.stream(a2).anyMatch(s2 -> s2.contains(s1))).toArray(String[]::new);
    }
}