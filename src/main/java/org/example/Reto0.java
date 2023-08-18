package org.example;

import java.util.stream.Stream;

public class Reto0 {
//    public static void main(String[] reto) {
//        for (int i = 0; i <= 100; i++) {
//            if (i % 3 == 0 & i % 5 == 0)
//                System.out.println("es tres y cinco");
//            else if (i % 3 == 0)
//                System.out.println("es tres");
//            else if (i % 5 == 0)
//                System.out.println("es cinco");
//
//       }

    public static void main(String[] reto) {
        Stream.iterate(1, n -> n + 1).limit(100).
                forEach(n -> {
                    if ( n % 3 == 0 && n % 5 == 0 ) System.out.println(" son ambos");
                    else if (n % 3 == 0) System.out.println(" es multiplo de 3");
                    else if (n % 5 == 0) System.out.println(" es multiplo de 5");
                    else System.out.println("no es multiplo " + n);
                });
        //   streamIterated.forEach(System.out::println);
    }
}
                      //}filter(n -> n % 2 != 0)
