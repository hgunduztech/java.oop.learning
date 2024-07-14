// Paket tanımı: com.hamza.learnjava paketi
package com.hamza.learnjava;

// Kütüphane importları
import java.util.*;

// Main class tanımı
public class Main {
    public static void main(String[] args) {
        // Jenerik sınıf örneği
        Box<Integer> integerBox = new Box<>(10);
        System.out.println("Integer Value: " + integerBox.getItem());

        // Jenerik metot örneği
        String[] stringArray = { "apple", "orange", "banana" };
        System.out.println("Array Element Count: " + countOccurrences(stringArray, "orange"));
    }

    // Jenerik metot tanımı: Bir dizide belirli bir öğe sayısını sayar
    public static <T> int countOccurrences(T[] array, T item) {
        int count = 0;
        for (T element : array) {
            if (element.equals(item)) {
                count++;
            }
        }
        return count;
    }
}

// Jenerik sınıf tanımı: Kutu (Box) sınıfı
class Box<T> {
    private T item;

    public Box(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}
