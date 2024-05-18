package org.example.generics;

import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Repository<User> userRepository = new Repository<>();

        // Aggiunta di utenti
        userRepository.add(new User("Alice", 30));
        userRepository.add(new User("Bob", 25));

        // Recupero di tutti gli utenti
        List<User> users = userRepository.getAll();
        System.out.println("Tutti gli utenti:");
        for (User user : users) {
            System.out.println(user);
        }

        // Recupero di un singolo utente
        Optional<User> user = userRepository.get(0);
        user.ifPresent(value -> System.out.println("Utente al primo indice: " + value));

        // Aggiornamento di un utente
        userRepository.update(0, new User("Alice", 31));
        System.out.println("Utente aggiornato:");
        userRepository.get(0).ifPresent(System.out::println);

        // Cancellazione di un utente
        userRepository.delete(1);
        System.out.println("Utenti dopo la cancellazione:");
        for (User remainingUser : userRepository.getAll()) {
            System.out.println(remainingUser);
        }
    }
}
