/*
 * Jeremiah Kellam
 * CSD 405
 * Module 5 Assignment Program #2
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
import java.io.*;        
import java.util.Random; 

public class Kellam_405Asgmt5_2 {
    public static void main(String[] args) {
        String fileName = "data.file";

        try {
            File file = new File(fileName);
            boolean dataFileExists = file.exists();

            FileWriter fileWriter = new FileWriter(file, true); 
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter); 

            if (!dataFileExists) {
                Random random = new Random();
                for (int i = 0; i < 10; i++) {
                    int randomNumber = random.nextInt(100);
                    bufferedWriter.write(Integer.toString(randomNumber));
                    if (i < 9) {
                        bufferedWriter.write(" ");
                    }
                }
                bufferedWriter.newLine();
            }

            bufferedWriter.close();

            FileReader fileReader = new FileReader(file); 
            BufferedReader bufferedReader = new BufferedReader(fileReader); 

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line); 
            }

            bufferedReader.close(); 
        } catch (IOException e) {
            e.printStackTrace(); 
        }
    }
}