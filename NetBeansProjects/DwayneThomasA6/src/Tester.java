/**
 * Title:     Tester
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program prompts the user to enter the name of the file 
 * and then it runs the DictionaryOrder program 
 * 
 */

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        DictionaryOrder directories = new DictionaryOrder();; 
        Scanner scnr = new Scanner(System.in);

        String fileName = "";
        
        //if the file is not missing anything then exit the loop
        do {
          
            do {
                
                System.out.print("Enter the name of the ledger text file: ");
                fileName = scnr.next();              

            } while (!directories.openFile(fileName));

        } 
        
        while (!directories.addToList());
        
        //Print the directory name from the list
        directories.printList();

    }

}
