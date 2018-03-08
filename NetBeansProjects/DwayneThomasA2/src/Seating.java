/**
 * Title:       Seating
 * Semester:    COP3337 - Summer 2017
 * @author      Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * The Seating program shows the implementation of the theater
 * seating program.
 */

import java.util.Scanner;

public class Seating {
    
    public static void main(String[] args){
        
        Scanner scnr = new Scanner(System.in);
        TheaterSeatingChart seat = new TheaterSeatingChart();
        
        String menu = "MENU" + "\na - Display Seating Chart\n" + "b - Choose a seat by seat address\n" + 
                      "c - Choose a seat by price\n" + "q - Quit\n\n" + "Choose an option:";
        
        char userOption = '.';
        
        //instructions for the user
        System.out.println("Welcome to the Theater Seating Chart" + 
                           "\nThis program is going to start by prompting a menu" + 
                           " and asking you to choose an option" );
                      
        
        do{
            
            System.out.println("");
            
            //Prompt the menu
            System.out.println(menu);
            
            userOption = scnr.next().charAt(0);
            System.out.println("");
            
            switch(userOption){
                
                //Display seating chart
                case 'a':
                    System.out.println("DISPLAY SEATING CHART:");
                    seat.setDisplayByPrice();
                    System.out.println(seat.getDisplayByPrice()); 
                    break;
                
                case 'b':
                    
                    //Allow the user to choose a seat by seat address
                    System.out.println("BY SEAT ADDRESS:");
                    seat.setDisplayByAddress();
                    System.out.println(seat.getDisplayByAddress() + 
                                        "\nEnter an Address that doesn't have a 0 in the seating Chart" + 
                                        "\nFor Example: A1");
                    
                    String address = scnr.next();
                    
                    while(!seat.seatsByAddress(address)){
                        
                        System.out.println(seat.getDisplayByAddress() + 
                                           "\nseat is taken! Pick another seat");
                        
                        address = scnr.next();

                    }
                    break;
                 
                 //Allow the user to choose a seat by price
                case 'c':
                    System.out.println("BY PRICE:");
                    System.out.println("Enter a price between 10 Through 50");
                    int price = scnr.nextInt();
                    
                    while(price < 10 || price > 50){
                        
                        System.out.println("The price is either too high or too low!\n" +
                                           "Enter a price between 10 Through 50");
                        
                        price = scnr.nextInt();
                        
                    }
                    
                    while(!seat.seatsByPrice(price)){
                        
                        System.out.println("The seat is unavalible! Pick another seat");
                        price = scnr.nextInt();
                        
                    }
                    break;
                
                //Quit
                case 'q':
                    break;
                
                //notify the user to choose a valid option    
                default:
                    System.out.println("Invalid choice! Choose an option:");
                    break;
                    
            }
            
        }while(userOption != 'q');
        
    }
    
}
