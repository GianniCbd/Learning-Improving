package org.example.collection.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapSample {
    public static void main(String []args){
        Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

        linkedHashMap.put("Cipolla",1);
        linkedHashMap.put("Sedano",1);
        linkedHashMap.put("Carote",1);

        // Ittero attraverso la mappa
        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Recuperare un valore per chiave
        int numberOfOnion = linkedHashMap.get("Cipolla");
        System.out.println("Numero di cipolle: " + numberOfOnion);

        //Rimuovo coppia chiave-valore
        linkedHashMap.remove("Cipolla");
        System.out.println("Rimozione ingrediente: " + linkedHashMap);

        // Verificare se una chiave è presente
        boolean hashCipolla = linkedHashMap.containsKey("Cipolla");
        System.out.println("Contiene Cipolla: " + hashCipolla);

//        in questo caso non verrà trovata Cipolla perchè è stata rimossa

    }
}
