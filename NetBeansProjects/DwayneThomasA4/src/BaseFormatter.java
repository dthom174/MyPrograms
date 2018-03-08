/**
 *Title:     DecimalSeparatorFormatter
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program formats the number as base n
 */

public class BaseFormatter implements NumberFormatter{
    
    int base;
    
    /**
     * This method sets the base
     * @param base 
     */
    public BaseFormatter(int base){
        
        this. base = base; 
        
    }
    
    /**
     * 
     * @param n
     * @return the formatted number
     */
    @Override
    public String format(int n){
        
        //this converts a negative number to a positive number 
        n *= (n < 0)? -1 : 1;
        String format = "";
        
        //the loop ends when the number n is zero
        do{
            
            String remainder = n % base + "";
            char letter = 'a';
            
            //hexadecimal and up
            if(Integer.parseInt(remainder) > 9){
                
                for(int i = 0; i < Integer.parseInt(remainder) - 10; ++i){
                     
                    ++letter;

                }
                
               /* 
                for(int i = 10; i < Integer.parseInt(remainder); ++i){
                     
                    ++letter;

                }
                */
                remainder = letter + "";
                
            }
            
            //add the remainder to the format
            format = remainder + "" + format;
            n = n / base;
            
        }while(n != 0);
        
        return format;
    }
    
}
