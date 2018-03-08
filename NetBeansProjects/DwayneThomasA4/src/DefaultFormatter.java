/**
 *Title:     DefaultFormatter
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program formats a number in the usual way
 */

public class DefaultFormatter implements NumberFormatter{
    
    /**
     * 
     * @param n
     * @return the formatted number
     */
    @Override
    public String format(int n){
        
        return n + "";
    }
    
}
