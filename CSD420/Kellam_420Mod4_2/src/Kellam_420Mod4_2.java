/*
 * Jeremiah Kellam
 * CSD420 Module 4 Assignment
 * 4/7/2024
 * 
 * Write a test program that stores 50,000 integers in LinkedList and test the time to traverse the list using an iterator vs. using the get(index) method.
 * Then, test your program storing 500,000 integers.
 * After completing this program and having tested both values, in your comments, explain the results and discuss the time taken using both values and their difference with the get(index) approach.
 * Write test code that ensures the code functions correctly.
 * 
 * References:
 * Baeldung, & Baeldung. (2024a, January 8). A guide to iterator in Java | Baeldung. Baeldung. https://www.baeldung.com/java-iterator
 * 
 * Jenkov, J. (n.d.). Java System.currentTimeMillis(). https://jenkov.com/tutorials/java-date-time/system-currenttimemillis.html
 * 
 * 
 */
import java.util.LinkedList;
import java.util.Iterator;

public class Kellam_420Mod4_2 {
    public static void main(String[] args) {
        int fiftyK = 50000;
        int halfMil = 500000;

        System.out.println("Testing with 50000:");
        testTraversal(fiftyK);

        System.out.println("Testing with 500000:");
        testTraversal(halfMil);
    }

    public static void testTraversal(int size) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        withIterator(list);
        long iteratorTime = System.currentTimeMillis() - start; 

        start = System.currentTimeMillis();
        withGet(list);
        long getTime = System.currentTimeMillis() - start;

        System.out.println("Time traversing LinkedList with size " + size + ":");
        System.out.println("Time taken with Iterator: " + iteratorTime + " ms");
        System.out.println("Time taken with get(index): " + getTime + " ms");
        System.out.println();
    }

    public static void withIterator(LinkedList<Integer> list) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }
    }

    public static void withGet(LinkedList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
    }
}