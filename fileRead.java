//Written by Andrew Bailey

import java.io.FileReader;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.*;

public class fileRead {
    public static void main(String[] args) {
        int count = 0;

        //try statment attempts to read in the file
        try {
           Scanner scanner = new Scanner(new File("assorted_words.txt"));

           //While loop iterates through file and counts the elements
           while(scanner.hasNextLine()) {
               count = count + 1;
               scanner.nextLine();
           }
           String[] nums = new String[count];
           Scanner s2 = new Scanner(new File("assorted_words.txt"));

           //For loop now assigns elements to an array of Strings
           for (int i = 0; i < count; i++) {
               nums[i] = s2.next();
           } 

           //The Array is sorted alphabetically 
           Arrays.sort(nums);
           System.out.println(Arrays.toString(nums));

        }

        //error handling
        catch (FileNotFoundException e) {
               e.printStackTrace();
           }

    }
    
}
