package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Spliterator;

public class TestList2 {

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Original List: " + fruits);


        // =========================================================
        // 1. replaceAll(UnaryOperator<E> operator)
        // =========================================================
        // Replaces EVERY element with the result of the operation.
        //
        // Here, we convert every fruit name to uppercase.

        fruits.replaceAll(fruit -> fruit.toUpperCase());

        System.out.println("\nAfter replaceAll(): " + fruits);


        // =========================================================
        // 2. retainAll(Collection<?> c)
        // =========================================================
        // Keeps ONLY the elements that are present
        // in the specified collection.
        //
        // Current list:
        // [APPLE, BANANA, MANGO, ORANGE]

        ArrayList<String> keepFruits =
                new ArrayList<>(Arrays.asList("APPLE", "MANGO"));

        fruits.retainAll(keepFruits);

        System.out.println("\nAfter retainAll(): " + fruits);


        // =========================================================
        // 3. set(int index, E element)
        // =========================================================
        // Replaces the element at the specified index.
        //
        // Before:
        // [APPLE, MANGO]
        //
        // Index 1 = MANGO
        // It will be replaced with GRAPES.

        fruits.set(1, "GRAPES");

        System.out.println("\nAfter set(1, \"GRAPES\"): " + fruits);


        // =========================================================
        // 4. size()
        // =========================================================
        // Returns the number of elements in the ArrayList.

        int size = fruits.size();

        System.out.println("\nSize of ArrayList: " + size);


        // =========================================================
        // 5. sort(Comparator<? super E> c)
        // =========================================================
        // Sorts the ArrayList according to the Comparator.
        //
        // Let's create another list for sorting examples.

        ArrayList<Integer> numbers =
                new ArrayList<>(Arrays.asList(50, 10, 40, 20, 30));

        System.out.println("\nBefore sorting: " + numbers);

        // Ascending order
        numbers.sort(Comparator.naturalOrder());

        System.out.println("After ascending sort: " + numbers);

        // Descending order
        numbers.sort(Comparator.reverseOrder());

        System.out.println("After descending sort: " + numbers);


        // =========================================================
        // 6. spliterator()
        // =========================================================
        // Creates a Spliterator to traverse the elements.
        //
        // Spliterator is mainly useful with Java 8+ streams
        // and parallel processing.

        System.out.println("\nUsing spliterator():");

        Spliterator<Integer> spliterator =
                numbers.spliterator();

        spliterator.forEachRemaining(number -> {
            System.out.println(number);
        });


        // =========================================================
        // 7. subList(int fromIndex, int toIndex)
        // =========================================================
        // Returns a VIEW of a portion of the ArrayList.
        //
        // fromIndex = inclusive
        // toIndex   = exclusive
        //
        // Example:
        // [50, 40, 30, 20, 10]
        //      0   1   2   3   4
        //
        // subList(1, 4)
        // returns indexes 1, 2, 3

        ArrayList<Integer> numbers2 =
                new ArrayList<>(Arrays.asList(50, 40, 30, 20, 10));

        System.out.println("\nOriginal numbers2: " + numbers2);

        java.util.List<Integer> part =
                numbers2.subList(1, 4);

        System.out.println("subList(1, 4): " + part);


        // =========================================================
        // 8. toArray()
        // =========================================================
        // Converts the ArrayList into an Object[] array.

        ArrayList<String> colors =
                new ArrayList<>(Arrays.asList(
                        "Red", "Green", "Blue"
                ));

        Object[] objectArray = colors.toArray();

        System.out.println("\nArrayList: " + colors);

        System.out.println("Object[] array:");

        for (Object color : objectArray) {
            System.out.println(color);
        }


        // =========================================================
        // 9. <T> T[] toArray(T[] a)
        // =========================================================
        // Converts the ArrayList into a specific type of array.
        //
        // Here, we convert ArrayList<String>
        // into String[].

        String[] stringArray =
                colors.toArray(new String[0]);

        System.out.println("\nString[] array:");

        for (String color : stringArray) {
            System.out.println(color);
        }
    }
}
