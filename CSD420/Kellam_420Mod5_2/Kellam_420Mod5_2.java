/*
 * Jeremiah Kellam
 * CSD420 Module 5.2 Assignment
 * 4/25/24
 * 
 * Write a test program that reads words from a text file and displays all non-duplicate words in ascending order and then in descending order.
 * The file is to be referenced in the program, not needing to be used as a command line reference.
 * The word file is to be titled collection_of_words.txt and included in your submission.
 * Write test code that ensures the code functions correctly.
 * 
 * References:
 * 
 */

 import java.io.BufferedReader;
 import java.io.FileReader;
 import java.io.IOException;
 import java.util.*;

 public class Kellam_420Mod5_2 {
    public static void main(String[] args) {
        String textFile = "collection_of_words.txt";
        Set<String> sodaShop = new HashSet<>();

        try (BufferedReader buffR = new BufferedReader(new FileReader(textFile))) {
            String words;
            while ((words = buffR.readLine()) != null) {
                String[] entries = words.split("\\s+");
                for (String entry : entries) {
                    if (!entry.trim().isEmpty()) {
                        sodaShop.add(entry.trim().toLowerCase());
                    }
                }
            }
        }
            catch (IOException e) {
                System.err.println("There was an error reading file: " + e.getMessage());
                return;
            }
        List<String> sodaList = new ArrayList<>(sodaShop);

        Collections.sort(sodaList);
        System.out.println("Soda references ascending:");
        for (String entry : sodaList)
            System.out.println(entry);

        Collections.sort(sodaList, Collections.reverseOrder());
        System.out.println("\nSoda references descending:");
        for (String entry : sodaList) {
            System.out.println(entry);
        }
    }
 }