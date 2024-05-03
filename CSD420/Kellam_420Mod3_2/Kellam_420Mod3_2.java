/*
 * Jeremiah Kellam
 * CSD 420 Module 3 Assignment
 * 3/31/24
 * 
 * Write a test program that contains a static method that returns a new ArrayList.
 * The new ArrayList returned will contain all original values with no duplicates from the original ArrayList.
 * Fill the Original ArrrayList with 50 random values from 1 to 20.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 * Write test code that ensures the code functions correctly.
 * 
 * References:
 * GfG. (2023a, May 7). HashSet in Java. GeeksforGeeks. https://www.geeksforgeeks.org/hashset-in-java/#
 * 
 */

 import java.util.ArrayList;
 import java.util.HashSet;
 import java.util.Random;
 import java.util.Set;
 
 public class Kellam_420Mod3_2 {
     public static void main(String[] args) {
         ArrayList<Integer> ogList = randomList(50, 1, 20);
         System.out.println("Original List:" + ogList);
 
         ArrayList<Integer> noDups = removeDups(ogList);
         System.out.println("\nList with no duplicates:");
         System.out.println(noDups);
 
         if (hasDups(noDups)) {
             System.out.println("\nFailure to remove duplicate values.");
         } else {
             System.out.println("\nSuccessfully removed duplicate values.");
         }
     }
 
     public static <E> ArrayList<E> removeDups(ArrayList<E> list) {
         Set<E> set = new HashSet<>(list);
         return new ArrayList<>(set);
     }
 
     public static ArrayList<Integer> randomList(int size, int min, int max) {
         ArrayList<Integer> list = new ArrayList<>();
         Random random = new Random();
         for (int i = 0; i < size; i++) {
             list.add(random.nextInt(max - min + 1) + min);
         }
         return list;
     }
 
     public static boolean hasDups(ArrayList<Integer> list) {
         Set<Integer> set = new HashSet<>();
         for (Integer num : list) {
             if (!set.add(num)) {
                 return true;
             }
         }
         return false;
     }
 }
 