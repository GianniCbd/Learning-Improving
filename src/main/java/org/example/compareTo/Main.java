package org.example.compareTo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Level> levels = new ArrayList<>();
        levels.add(new Level("Terrible lands", "Hard", "About horror drama level after atomic bombs drops"));
        levels.add(new Level("Hospital zombie", "Easy", "Try to escape from this terrifying hospital"));
        levels.add(new Level("Dark catacomb", "Medium", "Find the treasure and escape from catacomb"));

        System.out.println("Before");
        for(Level level: levels){
            System.out.println(level);
        }

        Collections.sort(levels);

        System.out.println("After");
        for(Level level:levels){
            System.out.println(level);
        }

    }
}
