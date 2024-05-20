package org.example.lambdaAndStreams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsList {
    public static void main(String []args){

//Esempio di utilizzo

        // Trova il quadrato dei numeri pari
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> squareOfEvenNumbers = list1.stream()
                .filter(n -> n % 2 == 0)
                .map( n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squareOfEvenNumbers);


// Somma tutti i numeri
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        int sum = list.stream()
                .mapToInt(Integer::intValue)
                .sum();

        System.out.println("Sum: " + sum);  // Output: Sum: 55

// Raggruppa le parole per la loro iniziale

        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "apricot", "blueberry");
        Map<Character, List<String>> groupedByInitial = words.stream()
                .collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println(groupedByInitial);



    }
    }

