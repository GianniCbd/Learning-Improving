package org.example.lambdaAndStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsRange {
    public static void main(String[] args) {

        IntStream stream = IntStream.rangeClosed(1, 10);


        List<Integer> result = stream
                .filter(n -> n % 2 == 0)        // Filtra i numeri pari
                .map(n -> n * 2)               // Moltiplica ogni numero per 2
                .boxed()                       // Converte IntStream a Stream<Integer>
                .collect(Collectors.toList()); // Raccogli i risultati in una lista


        result.forEach(System.out::println);
    }
}
