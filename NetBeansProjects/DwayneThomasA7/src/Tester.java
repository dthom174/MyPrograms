/**
 * Title:     Tester
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program runs the InterestRate application
 * 
 */

import javax.swing.JFrame;

public class Tester {
    
    public static void main(String[] args){
        
        JFrame frame = new InterestRate();
        frame.setTitle("Annual Interest rate");
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
    
}
