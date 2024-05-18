package org.example.generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Repository<T> {
    private List<T> items;

    public Repository() {
        this.items = new ArrayList<>();
    }

    public void add(T item) {
        items.add(item);
    }

    public Optional<T> get(int index) {
        if (index >= 0 && index < items.size()) {
            return Optional.of(items.get(index));
        }
        return Optional.empty();
    }

    public List<T> getAll() {
        return new ArrayList<>(items);
    }

    public void update(int index, T item) {
        if (index >= 0 && index < items.size()) {
            items.set(index, item);
        }
    }

    public void delete(int index) {
        if (index >= 0 && index < items.size()) {
            items.remove(index);
        }
    }
}