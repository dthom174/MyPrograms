/**
 * Title:     Tester
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program prompts the user enter the cash amount at the 
 * beginning of the day and at the end of the day, and ask the user
 * to enter the name of the file
 * 
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {

        DailyTransactions account;

        Scanner scnr = new Scanner(System.in);
        int beginning = 0;
        int end = 0;
        String fileName = "";
        boolean isError = true;

        //check if the user enter a number
        while (isError) {

            scnr = new Scanner(System.in);
            System.out.print("Enter the beginning amount: ");

            try {

                beginning = scnr.nextInt();
                isError = false;

            } catch (InputMismatchException error) {

                System.out.println("You didn't enter a number");

            }
        }

        isError = true;

         //check if the user enter a number
        while (isError) {

            try {

                scnr = new Scanner(System.in);
                System.out.print("Enter the ending amount: ");
                end = scnr.nextInt();
                isError = false;

            } catch (InputMismatchException error) {

                System.out.println("You didn't enter a number");

            }
        }

        account = new DailyTransactions(beginning, end);
        
        //if the file is not missing anything then exit the loop
        do {

            System.out.print("Enter the name of the ledger text file: ");
            fileName = scnr.next();

            while (!account.openFile(fileName)) {

                scnr = new Scanner(System.in);
                System.out.println("Invalid File name!");
                System.out.print("Enter the name of the ledger text file: ");
                fileName = scnr.nextLine();

            }       

        } while (!account.totalCashAmounnt());
        
        //Display results
        System.out.println(account.getResults());
        
    }
}
