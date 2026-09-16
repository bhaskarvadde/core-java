package com.Collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.function.Consumer;

public class TestList1 {

    public static void main(String[] args) {

        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();

        // =========================================================
        // 1. add(E e)
        // =========================================================
        // Adds an element at the end of the ArrayList.
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println("After add(): " + fruits);


        // =========================================================
        // 2. add(int index, E element)
        // =========================================================
        // Inserts an element at the specified index.
        // Existing elements are shifted to the right.
        fruits.add(1, "Orange");

        System.out.println("After add(index, element): " + fruits);


        // =========================================================
        // 3. addAll(Collection<? extends E> c)
        // =========================================================
        // Adds all elements of another collection
        // to the end of this ArrayList.
        Collection<String> moreFruits =
                Arrays.asList("Grapes", "Papaya");

        fruits.addAll(moreFruits);

        System.out.println("After addAll(): " + fruits);


        // =========================================================
        // 4. addAll(int index, Collection<? extends E> c)
        // =========================================================
        // Inserts all elements of another collection
        // starting from the specified index.
        Collection<String> newFruits =
                Arrays.asList("Kiwi", "Guava");

        fruits.addAll(2, newFruits);

        System.out.println("After addAll(index, collection): " + fruits);


        // =========================================================
        // 5. clear()
        // =========================================================
        // Removes ALL elements from the ArrayList.
        ArrayList<String> temp = new ArrayList<>(fruits);

        temp.clear();

        System.out.println("After clear(): " + temp);


        // =========================================================
        // 6. clone()
        // =========================================================
        // Creates a shallow copy of the ArrayList.
        ArrayList<String> clonedList =
                (ArrayList<String>) fruits.clone();

        System.out.println("Original list: " + fruits);
        System.out.println("Cloned list: " + clonedList);


        // =========================================================
        // 7. contains(Object o)
        // =========================================================
        // Checks whether the specified element exists.
        // Returns true or false.
        System.out.println("Contains Mango? "
                + fruits.contains("Mango"));

        System.out.println("Contains Apple? "
                + fruits.contains("Apple"));


        // =========================================================
        // 8. ensureCapacity(int minCapacity)
        // =========================================================
        // Ensures that the ArrayList has enough internal
        // capacity to store at least the specified number
        // of elements.
        //
        // NOTE:
        // Capacity is NOT the same as size.
        fruits.ensureCapacity(100);

        System.out.println("ensureCapacity(100) executed.");


        // =========================================================
        // 9. forEach(Consumer<? super E> action)
        // =========================================================
        // Performs an action for every element.
        System.out.println("\nUsing forEach():");

        fruits.forEach(fruit -> {
            System.out.println(fruit);
        });


        // =========================================================
        // 10. get(int index)
        // =========================================================
        // Returns the element present at the specified index.
        String fruit = fruits.get(0);

        System.out.println("\nElement at index 0: " + fruit);


        // =========================================================
        // 11. indexOf(Object o)
        // =========================================================
        // Returns the index of the FIRST occurrence
        // of the specified element.
        int firstIndex = fruits.indexOf("Mango");

        System.out.println("First index of Mango: "
                + firstIndex);


        // =========================================================
        // 12. isEmpty()
        // =========================================================
        // Returns true if the ArrayList contains no elements.
        System.out.println("Is fruits empty? "
                + fruits.isEmpty());


        // =========================================================
        // 13. iterator()
        // =========================================================
        // Returns an Iterator that can be used to traverse
        // the ArrayList from beginning to end.
        System.out.println("\nUsing iterator():");

        Iterator<String> itr = fruits.iterator();

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        // =========================================================
        // 14. lastIndexOf(Object o)
        // =========================================================
        // Returns the index of the LAST occurrence
        // of the specified element.
        fruits.add("Mango");

        int lastIndex = fruits.lastIndexOf("Mango");

        System.out.println("\nLast index of Mango: "
                + lastIndex);


        // =========================================================
        // 15. listIterator()
        // =========================================================
        // Returns a ListIterator that can move
        // both forward and backward.
        System.out.println("\nUsing listIterator():");

        ListIterator<String> listItr =
                fruits.listIterator();

        while (listItr.hasNext()) {
            System.out.println(listItr.next());
        }


        // =========================================================
        // 16. listIterator(int index)
        // =========================================================
        // Returns a ListIterator starting from
        // the specified index.
        System.out.println("\nlistIterator(2):");

        ListIterator<String> listItr2 =
                fruits.listIterator(2);

        while (listItr2.hasNext()) {
            System.out.println(listItr2.next());
        }


        // =========================================================
        // 17. remove(int index)
        // =========================================================
        // Removes the element at the specified index.
        // Returns the removed element.
        String removedFruit = fruits.remove(0);

        System.out.println("\nRemoved element: "
                + removedFruit);

        System.out.println("After remove(index): "
                + fruits);


        // =========================================================
        // 18. remove(Object o)
        // =========================================================
        // Removes the FIRST occurrence of the specified object.
        // Returns true if an element was removed.
        boolean removed = fruits.remove("Banana");

        System.out.println("Was Banana removed? "
                + removed);

        System.out.println("After remove(object): "
                + fruits);


        // =========================================================
        // 19. removeAll(Collection<?> c)
        // =========================================================
        // Removes ALL elements from this ArrayList
        // that are also present in the specified collection.

        Collection<String> removeFruits =
                Arrays.asList("Orange", "Mango");

        fruits.removeAll(removeFruits);

        System.out.println("After removeAll(): "
                + fruits);
    }
}
