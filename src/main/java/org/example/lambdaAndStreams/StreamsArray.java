package org.example.lambdaAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsArray {
public static void main(String[]args){

    String[] array = {"apple", "banana", "cherry", "apricot", "blueberry"};

    // Conversione dell'array in uno stream
    Stream<String> stream = Arrays.stream(array);


    List<String> result = stream
            .map(String::toUpperCase)           // Converti ogni stringa in maiuscolo
            .filter(s -> s.startsWith("B"))    // Filtra le stringhe che iniziano con "A"
            .collect(Collectors.toList());     // Raccogli i risultati in una lista


        result.forEach(System.out::println);
}
}
