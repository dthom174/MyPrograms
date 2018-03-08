/**
 *Title:     Tester
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program illustrate how the
 * DefaultFormatter, DecimalSeparatorFormatter, AccountingFormatter,
 * and BaseFormatter formats an array of numbers
 * 
 */

import javax.swing.JOptionPane;

public class Tester {
 
    public static void main(String[] args){
        
        int[] num = {-13,34,-4,1585,1000000}; 
        
        print(num, new DefaultFormatter());
        print(num, new DecimalSeparatorFormatter());
        print(num, new AccountingFormatter());
        print(num, new BaseFormatter(16));
        print(num, new BaseFormatter(5));
        
    }
    
    /*
     * This method takes an array of integers and a NumberFormatter object
     * and print each number on a separated line
     * @param formatNum
     * @param f 
     */
    public static void print(int[] num, NumberFormatter f){
        
        String printAll = "";
           
        
        for(int i = 0; i < num.length; ++i){
            
            System.out.printf("%-10s %10s %n", f.format(num[i]), num[i]);
            printAll += String.format("%-10s %10s %n", f.format(num[i]), num[i]);
            
        }
        
        System.out.println("");
        JOptionPane.showMessageDialog(null,printAll);
        
    }
    
}
