/**
 *Title:     DecimalSeparatorFormatter
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program formats a number with decimal separator
 */

public class DecimalSeparatorFormatter implements NumberFormatter{
    
    /**
     * 
     * @param n
     * @return the formatted number 
     */
    @Override
    public String format(int n){
        
        String formatter = n + "";
        
        
            
            int count = 0;
            
            for(int i = formatter.length() - 1; i >= 1; --i){
                  
                ++count;
                
                if(count == 3){
                    
                    formatter = formatter.substring(0,i) + "," + formatter.substring(i,formatter.length());
                    count = 0;
                }
                
            
            
        }
        
        return formatter;
    }
    
}
