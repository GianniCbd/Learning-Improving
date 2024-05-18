package org.example.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSample {
    public static void main(String[]args){

//        LHS è simile ad HashSet ma mantiene l'ordine di inserimento degli elementi

        Set<String>stringSet = new LinkedHashSet<>();
        stringSet.add("Pane");
        stringSet.add("Marmellata");
        stringSet.add("Succo d'arancia");
        stringSet.add("Pane");

        System.out.println("Colazione: " + stringSet);

        stringSet.add("Caffè");
        System.out.println("Colazione modificata: " + stringSet);

    }
}
