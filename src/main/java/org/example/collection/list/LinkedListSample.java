package org.example.collection.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {

    public static void main(String[]args){
        List<Integer> list = new LinkedList<>();
//        aggiungo numeri alla lista
        list.add(2);
        list.add(20);
        list.add(200);


//        ottengo numero dentro la lista
        Integer number = list.get(0);
        System.out.println("Numero selezionato: "+number);

// inserisco un numero dentro la lista
list.add(1, 2000);
        System.out.println("numero aggiungo: " + list);

//        rimuovo il numero aggiunto precedentemente
        list.remove(1);
        System.out.println("numero rimosso "+list);
    }
}
