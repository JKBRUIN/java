/*
 * CSD 320 
 * Module 11 Assignment
 * Jeremiah Kellam
 * 5/9/2023
 * 
 * Assignment:
 * Write methods using the following headers that returns the location of the largest element in the array passed to the method returning a one-dimensional array that contains two location elements.
 *     public static int [] locateLargest (double [][] arrayParam)
 *     public static int [] locateLargest (int [][] arrayParam)
 * 
 * Then, write methods using the following headers that returns the location of the smallest element in the array passed to the method returning a one-dimensional array that contains two location elements.
 *     public static int [] locateSmallest (double [][] arrayParam)
 *     public static int [] locateSmallest (int [][] arrayParam)
 * 
 * I went further and made example arrays, used a for method to list them out, and then showed a result. 
 * Unless we were always supposed to do that. If so, DONE. 
 * 
 * Citations:
 * 
 * GeeksforGeeks. (2023d). Arrays in Java. GeeksforGeeks. 
 *      https://www.geeksforgeeks.org/arrays-in-java/
 * 
 * Admin. (2023). Array in java. JavaGoal. 
 *      https://javagoal.com/java-array/
 */

public class Kellam_320Asgmt11 {

    public static int[] locateLargest(double[][] arrayParam) {
        int maxRowIndex = 0; // the row index of the largest element found 
        int maxColIndex = 0; // the column index of the largest element found
        double maxVal = arrayParam[0][0]; // the value of the largest element found (initialized to the value of the first element in the array)
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > maxVal) {
                    maxVal = arrayParam[i][j];
                    maxRowIndex = i;
                    maxColIndex = j;
                }
            }
        }
        return new int[]{maxRowIndex, maxColIndex};
    }
    
    public static int[] locateLargest(int[][] arrayParam) {
        int maxRowIndex = 0; // the row index of the largest element found 
        int maxColIndex = 0; // the column index of the largest element found
        int maxVal = arrayParam[0][0]; // the value of the largest element found (initialized to the value of the first element in the array)
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] > maxVal) {
                    maxVal = arrayParam[i][j];
                    maxRowIndex = i;
                    maxColIndex = j;
                }
            }
        }
        return new int[]{maxRowIndex, maxColIndex};
    }

    public static int[] locateSmallest(double[][] arrayParam) {
        int minRowIndex = 0; // the row index of the smallest element found 
        int minColIndex = 0;
        double minVal = arrayParam[0][0]; // the value of the smallest element found (initialized to the value of the first element in the array)
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < minVal) {
                    minVal = arrayParam[i][j];
                    minRowIndex = i;
                    minColIndex = j;
                }
            }
        }
        return new int[]{minRowIndex, minColIndex};
    }
    
    public static int[] locateSmallest(int[][] arrayParam) {
        int minRowIndex = 0; // the row index of the smallest element found 
        int minColIndex = 0; // the column index of the largest element found
        int minVal = arrayParam[0][0]; // the value of the smallest element found (initialized to the value of the first element in the array)
        for (int i = 0; i < arrayParam.length; i++) {
            for (int j = 0; j < arrayParam[i].length; j++) {
                if (arrayParam[i][j] < minVal) {
                    minVal = arrayParam[i][j];
                    minRowIndex = i;
                    minColIndex = j;
                }
            }
        }
        return new int[]{minRowIndex, minColIndex};
    }        
    public static void main(String[] args) {
        int[][] intArray = {{88, 77}, {1, 2, 3}, {606, 505, 404, 303}, {1111, 9999, 3333, 5555, 7777}};

        System.out.println("\nInteger Array: ");
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print(intArray[i][j] + " ");
            }
            System.out.println();
        }

        int[] largestLocation = locateLargest(intArray);
        System.out.println("Location of largest integer element: (" + largestLocation[0] + ", " + largestLocation[1] + ")");

        int[] smallestLocation = locateSmallest(intArray);
        System.out.println("Location of smallest integer element: (" + smallestLocation[0] + ", " + smallestLocation[1] + ")");


        double[][] doubleArray = {{4.04, 5.05, 6.06}, {7.07, 8.08, 9.09}, {1.01, 2.02, 3.03}};

        System.out.println("\nDouble Array: ");
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(doubleArray[i][j] + " ");
            }
            System.out.println();
        }
        
        largestLocation = locateLargest(doubleArray);
        System.out.println("Location of largest double element: (" + largestLocation[0] + ", " + largestLocation[1] + ")");

        smallestLocation = locateSmallest(doubleArray);
        System.out.println("Location of smallest double element: (" + smallestLocation[0] + ", " + smallestLocation[1] + ")");
        System.out.println();
    } 
}    
/* I may be confused with the question.
* We're making multidimensional arrays, but we want one dimensional output?
* I've only understood how the results of the methods give the index inside the [][] array. 
* I don't get how we'd give a one-dimensional output for a multidimensional array, is (x, y) truly a one-dimensional array? 
* Maybe I already am answering it right but don't understand anything anymore. 
*/