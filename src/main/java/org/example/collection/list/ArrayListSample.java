package org.example.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSample {

    public static void main(String[] args) {

        List<String>list = new ArrayList<>();

//        aggiungo elementi alla lista
        list.add("Gianni");
        list.add("Marco");
        list.add("Franco");

//        itero attraverso la lista
        for(String name: list){
            System.out.println(name);
        }

//        recupero elementi dalla lista
        System.out.println("troviamo gli elementi");
        String elementOne = list.get(0); //cambiando lo 0 con per esempio 1 o 2 andiamo a trovare gli altri nomi della lista
        System.out.println("nome trovato: " +  elementOne);


//aggiungo un nome all' ArrayList
        list.add(2,"Filiberto");//indico a quale indice inserire il nuovo nome
        System.out.println("Lista aggiornata"+ list);

//        rimuovo nome dall' ArrayList
        list.remove(2);
        System.out.println("Nome Eliminato" + list);
    }

}
