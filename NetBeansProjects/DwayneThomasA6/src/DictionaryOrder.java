/**
 * Title:     DictionaryOrder
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program reads a text file with the list
 * of directories to sort and display them to the screen
 * 
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class DictionaryOrder {

    String directoriesName;
    ArrayList<String> list;
    private Scanner file = null;
    boolean isSuccessful;

    /**
     * This method initialize the instance variable
     */
    public DictionaryOrder() {

        directoriesName = "none";
        list = new ArrayList<>();
        isSuccessful = true;

    }

    /**
     * This method checks if the file exist and opens a file to read 
     * @param fileName name of the file
     * @return 
     */
    public boolean openFile(String fileName) {

        try {

            file = new Scanner(new File(fileName));

        } catch (IOException error) {

            System.out.println("The file does not exist");
            return false;

        }

        return true;
    }

    /**
     * This method adds the directory name to the list in chronological order
     * @return 
     */
    public boolean addToList() {
        
        isSuccessful = true;
        
        if (!file.hasNext()) {

            System.out.println("The file is Empty");

        } 
        
        else {


            while (file.hasNextLine() && isSuccessful) {

                //storing the directory name 
                directoriesName = file.nextLine().trim();

                //this is to avoid adding empty directory name to the list
                if (directoriesName.isEmpty()) {

                    continue;

                }

                //check if the directory name is valid
                isSuccessful = isValid(directoriesName);

                //if the directory name is valid add it to the list in chronlogical order
                if (isSuccessful) {

                    //the first directory name is added to the list 
                    if (list.isEmpty()) {

                        list.add(directoriesName);

                    } 
                    
                    else {

                        for (int i = 0; i < list.size(); ++i) {

                            if (getString(directoriesName).equals(getString(list.get(i)))) {

                                if (getNumber(directoriesName) < getNumber(list.get(i))) {

                                    list.add(i, directoriesName);
                                    break;

                                }

                            } 
                            
                            else if (getString(directoriesName).compareTo(getString(list.get(i))) < 0) {

                                list.add(i, directoriesName);
                                break;

                            }

                            if (i + 1 == list.size()) {

                                list.add(directoriesName);

                            }
                        }

                    }
                }
        
            }
            
            //close the file and clear the list if there is an invalid directory name
            if(!isSuccessful){
                
                file.close();
                list.clear();
                
            }

        }

        return isSuccessful;

    }
    
    /**
     * This method checks if the directory name is valid
     * @param name a string that contains the directory name
     * @return 
     */
    public boolean isValid(String name) {

        boolean isValid = true;
        
        //check if the string only contain one directory name 
        Scanner scnr = new Scanner(name);

        scnr.next();
        if(scnr.hasNext()){
            
            isValid = false;
            System.out.println("There are more than one directory name on the same line");
        }
      
        if(isValid){
            
            for(int i = 0; i < name.length() && isValid; ++i){
                
                //check if the directory name contains only letters and numbers
                if( !(Character.isDigit(name.charAt(i)) || Character.isLetter(name.charAt(i)))){
                   
                    isValid = false;
                    System.out.println("One of the directory name contain a character that is not a letter or a number");
                    
                } 
                
                else if(Character.isDigit(name.charAt(i))){
                  
                    //check if the directory name has a number at the beginning  
                    if(i == 0){
                        
                        isValid = false; 
                        System.out.println("One of the directory name does not follow the LetterNumber format(abc123)");
                        
                    }
                    
                    else{
                        
                        //check if the directory has a letter after the number
                        for(int j = i; j < name.length() && isValid; ++j){
                            
                            if(Character.isLetter(name.charAt(j))){
                                
                                isValid = false;
                                System.out.println("One of the directory name does not follow the LetterNumber format(abc123)");
                                
                            }
                            
                        }
                        
                    }
                }
                
                //check if the directory is missing a number
                else if(Character.isLetter(name.charAt( name.length() -1 ))){
                    
                    isValid = false;
                    System.out.println("The directory name is missing a number");
                    
                }
                
            }
            
        }

        return isValid;
    }

    /**
     * This method returns all the letters from the directory name
     * @param name the directory name
     * @return 
     */
    public String getString(String name) {

        for (int i = 0; i < name.length(); ++i) {

            if (Character.isDigit(name.charAt(i))) {

                return name.substring(0, i);

            }

        }

        return "";

    }

    /**
     * This method returns the number from the directory name
     * @param name directory name
     * @return 
     */
    public int getNumber(String name) {

        for (int i = name.length() - 1; i >= 0; --i) {

            if (Character.isLetter(name.charAt(i))) {

                return Integer.parseInt(name.substring(i + 1, name.length()));

            }

        }

        return 0;
    }

    /**
     * This method displays all the directory name from the list
     * and close the file
     */
    public void printList() {
        
        System.out.println("");
        
        for (String s : list) {

            System.out.printf("%-10s \n", s);

        }

        file.close();
        
    }

}
