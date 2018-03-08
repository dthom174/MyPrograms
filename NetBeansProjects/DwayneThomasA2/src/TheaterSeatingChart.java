/**
 * Title:       TheaterSeatingChart
 * Semester:    COP3337 - Summer 2017
 * @author      Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * The TheaterSeatingChart program takes the user input to find available 
 * seats and to mark that seat sold by changing the price to 0. 
 * The program also displays the available seats by price or by address.
 */

public class TheaterSeatingChart {

    int[][] byPrice = {{10,10,10,10,10,10,10,10,10,10,10,10},
                      {10,10,10,10,10,10,10,10,10,10,10,10},                  
                      {10,10,20,20,20,20,20,20,20,20,10,10},
                      {10,10,20,20,20,20,20,20,20,20,10,10},
                      {20,20,30,30,40,40,40,40,30,30,20,20},
                      {20,20,30,30,40,40,40,40,30,30,20,20},
                      {20,30,30,40,40,40,40,40,40,30,30,20},
                      {20,30,30,40,40,40,40,40,40,30,30,20},
                      {30,30,40,40,50,50,50,50,40,40,30,30},
                      {30,40,50,50,50,50,50,50,50,50,40,30}
    };
    
    String[][] byAddress = new String[10][12]; 
    String display;

    /**
     * This method initialized display and 
     * byAddress
     */
    public TheaterSeatingChart(){
    
        display = "none";
        char letter = 'A';
        
        for(int i = byAddress.length - 1; i >= 0; --i){
            
            int num = 1;
            
            for(int j = 0; j < byAddress[0].length; ++j){
                
                byAddress[i][j] = letter + ""  + num + ""; 
                ++num;
                
            }
            
            ++letter;
        
        }    
    
    }
    
    /**
     * This method sets the
     * display of the seating chart by price
     */
    public void setDisplayByPrice(){
        
        display = "";
        
        for(int i = 0; i < byPrice.length; ++i){
            
            for(int j = 0; j < byPrice[0].length; ++j){
                
                display += byPrice[i][j] + " ";
                
                if(byPrice[i][j] == 0){
                    
                    display += " ";
                }
            }
            
            if(i != byPrice.length - 1){
            
                display += "\n";
                
            }
             
        }    
    }
    
    /** 
     * @return display: This returns the display
     * of the seating chart by price
     */
    public String getDisplayByPrice(){
        
        return display;
    }
    
    /**
     * This method sets the display
     * of the seating chart by Address
     */
    public void setDisplayByAddress(){
        
        display = "";
        
        for(int i = 0; i < byAddress.length; ++i){
            
            for(int j = 0; j < byAddress[0].length; ++j){
                
                display += byAddress[i][j] + " "; 
                
            }
            
            display += "\n";
                    
        }    
    }
    
    /**
     * 
     * @return display: This returns the display
     * of the seating chart by Address
     */
    public String getDisplayByAddress(){
        
        return display;
    }
    
    /**
     * This method checks if there is an available
     * seat that has the same price the user entered
     * @param price
     * @return 
     * @return: This returns whether if there is an available 
     *          seat that matches the price 
     */
    public boolean seatsByPrice(int price){
        
        for(int i = 0; i < byPrice.length; ++i){
            
            for(int j = 0; j < byPrice[0].length; ++j){
                
                if(byPrice[i][j] == price){
                    
                    byPrice[i][j] = 0;
                    byAddress[i][j] = 0 + " ";
                    
                    return true;
                    
                }
            }   
        }
        
        return false;
    }
    
    /**
     * This method checks if there is an available
     * seat at the address the user entered
     * @param address
     * @return 
     * @return: This returns whether if there is an available 
     *          seat that matches the address  
     */
    public boolean seatsByAddress(String address){
        
       for(int i = 0; i < byAddress.length; ++i){
            
            for(int j = 0; j < byAddress[0].length; ++j){
                
                if(byAddress[i][j].equals(address)){
                    
                    byPrice[i][j] = 0;
                    byAddress[i][j] = 0 + " ";
                    
                    return true;
                    
                }
            }   
        }
          
        return false;
    }   
    
}
