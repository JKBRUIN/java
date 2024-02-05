/*
 * Jeremiah Kellam
 * CSD 405
 * Module 5 Assignment Program #2
 * 1/28/2024
 *  
 * Assignment:
 *      Program 2: Write a program to create a new file titled data.file, if the file does not exist. 
 *      Then write to the new file, adding 10 randomly generated numbers, or append 10 randomly generated numbers to a previous file. 
 *      Each integer is to be separated by a space. 
 *      Close the file, then reopen the file and read the data from the file and display it. 
 * Sources:
 * https://www.w3schools.com/java/java_files.asp
 * https://www.w3schools.com/java/java_files_create.asp
 * https://www.w3schools.com/java/java_files_read.asp
 * https://www.geeksforgeeks.org/filewriter-class-in-java/
 * https://www.programiz.com/java-programming/bufferedwriter
 * https://www.baeldung.com/java-buffered-reader
 */

 //imports necessary classes for handling java.io and generating random numbers
import java.io.*;        
import java.util.Random; 

public class Kellam_405Asgmt5_2 {
    public static void main(String[] args) {
        String fileName = "data.file";//initializes string variable 'fileName' with value 'data.file' which represents name of the file to be created or accessed

        //try-catch block to handle IO exceptions
        try {
            File file = new File(fileName); //creates new File object with specified fileName, in this case 'data.file'
            boolean dataFileExists = file.exists();//checks if it already exists T/F

            FileWriter fileWriter = new FileWriter(file, true); //FileWriter object named fileWriter to write data, second parameter 'true' means data will be appended to file if it exists
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); //wraps object FileWriter in a BufferedWriter to improve writing efficiency

            //If file doesn't exist 'false'
            if (!dataFileExists) {
                Random random = new Random();
                for (int i = 0; i < 10; i++) {
                    int randomNumber = random.nextInt(100);//generates 10 random numbers between 0-99
                    bufferedWriter.write(Integer.toString(randomNumber));
                    if (i < 9) {
                        bufferedWriter.write(" ");//writes the 10 integers to the file separated by spaces
                    }
                }
                bufferedWriter.newLine();//appends new line after writing
            }

            bufferedWriter.close();

            //create object to read data from file
            FileReader fileReader = new FileReader(file); 
            BufferedReader bufferedReader = new BufferedReader(fileReader); 

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); //reads each line using readLine() method and prints to console
            }

            bufferedReader.close(); //close the reader
        } 
        
        catch (IOException e) {
            e.printStackTrace(); //runtime environment (JVM) generates a printStackTrace() to provide the location of the exception and the location/sequence of method calls that led to an exception
        }
    }
}