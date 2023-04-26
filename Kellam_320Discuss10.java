/* CSD 320
 * Module 10 Discussion
 * Jeremiah Kellam
 * 4/25/2023
 * Review the following code example using both a List and a Set.
 * Research the Internet on information related to both. Then discuss:
 *     Similarities.
 *     Differences.
 *     Advantages of both.
 *     Disadvantages of both.
 */

 import java.util.*;

public class Kellam_320Discuss10 {
  public static void main(String [] args){
     List <Integer> list = new ArrayList <Integer> ();
     Set <Integer> set = new HashSet <Integer> ();
     Integer intObject;
     for(int i = 0; i < 100; ++i){
          //intObject = new Integer ((int) (Math.random() * 10 + 1)); -- the constructor Integer(int) was deprecated since Java 9
          intObject = (int) (Math.random() * 10 + 1);
          list.add(intObject);
          set.add(intObject);
          System.out.println("Iteration " + (i + 1) + ": Integer " + intObject + " added to List and Set."); // added to see the program at work, because I keep getting List=100 and Set=10
     }
     System.out.println("List size = " + list.size()); 
     System.out.println("Set size = " + set.size());
  }
} 