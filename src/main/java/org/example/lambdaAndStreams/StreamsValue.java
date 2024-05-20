package org.example.lambdaAndStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsValue {
    public static void main(String[] args) {

        Stream<String> stream = Stream.of("apple", "banana", "cherry", "apricot", "blueberry");


        List<String> result = stream
                .map(String::toUpperCase)           // Converti ogni stringa in maiuscolo
                .filter(s -> s.startsWith("A"))    // Filtra le stringhe che iniziano con "A"
                .collect(Collectors.toList());     // Raccogli i risultati in una lista


        result.forEach(System.out::println);
    }
}
