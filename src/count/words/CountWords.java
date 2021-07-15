
package count.words;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
* <b>Counting words from the strings!</b>
* <p>
* The wordCounter program processes a list of Strings from an input text file,
* Counts and returns the NUMBER of words (i.e. Strings) that start with "M" or "m".
* Print all the words longer than 5 characters on the console.
* <p>
* @author  Nancy Matharuu
* @version 1.0
* @since   2021-07-15
*/
public class CountWords {
    /**
   * countM method split the string into words and count the words starting with 'm' or 'M'.
   * 
     * @param str string to count the words from 
     * @return count of the words starting with 'm' or 'M' is returned to the main method
   */
    public static int countM(String str)
    {
        int count =0;
        String[] words = str.split(" ");
        //for loop to iterate over all the words from the string
        for (String word : words) {
            char firstChar = word.charAt(0);
            // check if first character of word starts with either 'M' or 'm'
            if (firstChar == 'M' || firstChar == 'm') {
                // increase the counter if true
                count++;
                if (word.length() > 5) {
                    System.out.println(word.toLowerCase());
                }
            }
        }
        return count;
    }

    /**
   * This is the main method which makes use of countM method to print count of words starting with 'm' or 'M'.
   * 
   * @param args Unused.
     * @throws java.io.FileNotFoundException if the file is not found on path specified.
   */
    public static void main(String[] args) throws FileNotFoundException {
        //read an input text file 
        Scanner s = new Scanner(new File("input.txt"));
        int count = 0;
        //reading strings from file till there is no string left
        while(s.hasNextLine()){
            
            String str = s.nextLine();
            count += CountWords.countM(str);
        }
        System.out.println("Number of Words Starting with the letter M or m is " + count);
    }
    
}


