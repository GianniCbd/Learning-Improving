package org.example.collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetSample {
    public static void main(String[]args){


//Hashset è un insieme non ordinato di elementi e non permette duplicati

        Set<String>stringSet = new HashSet<>();
        stringSet.add("Cane");
        stringSet.add("Gatto");
        stringSet.add("Maiale");
        stringSet.add("Cane"); //duplicato non viene inserito

        System.out.println("nomi animali: "+ stringSet);
    }



}
