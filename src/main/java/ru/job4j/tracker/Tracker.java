package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] rsl = new Item[size];
        int counter = 0;
        for (int index = 0; index < size; index++) {
            if (items[index].getName().equals(key)) {
                rsl[counter++] = items[index];
            }
        }
        return Arrays.copyOf(rsl, counter);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        boolean change = false;
        item.setId(id);
        if (indexOf(id) != -1) {
            int index = indexOf(id);
            items[index] = item;
           change = true;
        }
        return change;
    }

    public boolean delete(int id) {
        boolean result = false;
        if (indexOf(id) != -1) {
            items[indexOf(id)] = null;
            System.arraycopy(items, id + 1, items, id, size - 1);
            items[size - 1] = null;
            size--;
        result = true;
        }
        return result;
    }
}