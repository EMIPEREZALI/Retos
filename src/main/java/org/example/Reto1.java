package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Dados dos arrays se debe devolver uno que ordenado de forma albaticamente de los items
 * del array 1 que esten contenidos en el array 2.
 * Example 1:
 * a1 = ["arp", "live", "strong"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns ["arp", "live", "strong"]
 *
 * Example 2:
 * a1 = ["tarp", "mice", "bull"]
 * a2 = ["lively", "alive", "harp", "sharp", "armstrong"]
 * returns []



 */
public class Reto1 {
    public static String[] findSubstringsAndSort(String[] a1, String[] a2) {
        StringBuilder sbuil = new StringBuilder();
        for (int i = 0; i < a2.length; i++) {
            sbuil.append(a2[i] + " ");
        }
        List<String> e = new ArrayList<>();
        for (int i = 0; i < a1.length; i++) {
            if (sbuil.indexOf(a1[i]) != -1)
                e.add(a1[i]);

        }
        String array[] = e.toArray(new String[e.size()]);
        return array;
    }
  }



