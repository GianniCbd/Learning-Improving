package org.example.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[]args){
//        TreeSet è un insieme ordinato che non permette elementi duplicati.
//        Gli elementi sono ordinati in modo naturale.

        Set<String>stringSet = new TreeSet<>();
        stringSet.add("Calcio");
        stringSet.add("Baseball");
        stringSet.add("Rugby");


        System.out.println("Sport: " + stringSet);

        stringSet.add("Football");
        System.out.println("Lista Sport aggiornata" + stringSet);
    }

}
