/**
 *Title:     DecimalSeparatorFormatter
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program formats negative numbers with parenthesis 
 */

public class AccountingFormatter implements NumberFormatter{
    
    /**
     * This method only formats negative number with parenthesis
     * @param n
     * @return the formatted number 
     */
    @Override
    public String format(int n){
        
        String format = n + "";
        
        if(n < 0){
  
            format = format.replace("-", "(") + ")";
            
        }
        
        return format;
    }
    
}
