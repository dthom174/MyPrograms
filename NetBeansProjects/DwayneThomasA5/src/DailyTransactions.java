/**
 * Title:     DailyTransactions
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program calculate if the actual amount of cash equals
 * the amount of cash at the end of the day
 * 
 */

import java.io.*;
import java.util.Scanner;

public class DailyTransactions {

    private Scanner file = null;
    int sum, beginningAmount, endAmount, cashAmount;
    char transaction;
    String result = "";
    boolean isSuccessful;

    /**
     * This method initialize the cash amount at the end of the day
     * @param beginning
     * @param end 
     */
    public DailyTransactions(int beginning, int end) {

        cashAmount = 0;
        beginningAmount = beginning;
        endAmount = end;
        transaction = '.';
        sum = 0;
        result = "None";
        isSuccessful = true;

    }

    /**
     * This method checks if the file exist
     * @param name
     * @return 
     */
    public boolean openFile(String name) {

        try {

            file = new Scanner(new File(name));

        } catch (FileNotFoundException error) {

            return false;

        }

        return true;

    }

    /**
     * This method calculate the actual amount of cash at
     * end of the day
     * @return 
     */
    public boolean totalCashAmounnt() {

        sum = beginningAmount;
        isSuccessful = true;
        
        //checks if the file is empty
        if (!file.hasNext()) {

            System.out.println("This file is empty");
            isSuccessful = false;

        }
        
        while (file.hasNext() && isSuccessful) {

            file.next();

            try {

                cashAmount = Integer.parseInt(file.next());

            } catch (NumberFormatException error) {

                System.out.println("The file is missing the cash Amount");
                isSuccessful = false;

            }

            if (isSuccessful) {

                try {

                    transaction = file.next().charAt(0);

                    switch (transaction) {

                        case 'P':
                            sum -= cashAmount;
                            break;

                        case 'R':
                            sum += cashAmount;
                            break;

                        default:
                            System.out.println("The file does not have the letter P or R");
                            isSuccessful = false;
                            break;

                    }

                } catch (Exception mismatch) {

                    System.out.println("A letter is missing from the file");
                    isSuccessful = false;

                }
            }
        }

        return isSuccessful;

    }

    /**
     * This method returns the result 
     * @return 
     */
    public String getResults() {

        result = (sum == endAmount) ? "Correct" : "Incorrect";
        result += "! The Total at the end of the day is " + sum;
        file.close();

        return result;

    }
}
