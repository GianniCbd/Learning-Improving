package org.example.collection.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapSample {
    public static void main(String []args){
        Map<String,Integer> hashMap = new HashMap<>();

//        Aggiungo coppie chiave-valore alla mappa
        hashMap.put("Cipolla",1);
        hashMap.put("Carota",1);
        hashMap.put("Sedano",1);
        hashMap.put("Macinato",2000);

//        ittero attraverso la mappa
        for(Map.Entry<String,Integer> entry: hashMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

//        Recupero un valore per chiave(Key)
        int NumberOfOnion = hashMap.get("Cipolla");
        System.out.println("Numero di cipolle: " + NumberOfOnion);

//Rimuovo coppia chiave-valore
        hashMap.remove("Cipolla");
        System.out.println("Rimozione ingrediente: " + hashMap);

//        Controllo se una chiave è presente nella mappa

        boolean hashSedano = hashMap.containsKey("Sedano");
        System.out.println("C'è il sedano? " + hashSedano);
    }
}
