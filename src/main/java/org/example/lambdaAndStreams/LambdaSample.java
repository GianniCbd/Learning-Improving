package org.example.lambdaAndStreams;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaSample {
    public static void main(String[]args){

        List<String> list = Arrays.asList("a", "aaa", "aa");
        Collections.sort(list, (s1, s2) -> s1.length() - s2.length());
        System.out.println(list);
// ordina una lista di stringhe in base alla loro lunghezza in ordine crescente
// utilizzo dell'interfaccia Comparator


        List<String> listTwo = Arrays.asList("a", "", "bb", "ccc");
        List<String> nonEmpty = list.stream() //Converte la lista originale in uno stream
                .filter(s -> !s.isEmpty()) //Filtra le stringhe vuote dallo stream.
                .collect(Collectors.toList()); //Raccoglie le stringhe rimanenti in una nuova lista.
        System.out.println("With empty String" + listTwo); //con stringa vuota
        System.out.println("Without empty string" + nonEmpty); //senza stringa vuota



// ESEMPIO COMPLETO

        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filtro: rimuove le stringhe vuote
        List<String> filtered = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        // Mappa: converte le stringhe in maiuscolo
        List<String> upperCase = filtered.stream()
                .map(s -> s.toUpperCase())
                .collect(Collectors.toList());


        // Itera e stampa ogni stringa
        upperCase.forEach(s -> System.out.println(s));
    }

}
