
import java.util.Arrays;
import java.util.Random;

/**
 * This program fills an array of 10 numbers with random integers in [0,100)
 * and displays it. Calculate the Average, Maximum, and Minimum and displays them.
 * 
 * @author dwayne
 */
public class Array1 {
    
    public static void main(String args[]){
        
        int[] y = new int[10];
        Random x = new Random();
        
        //Initialize
        int avg = 0;
        int min = 0;
        int max = 0;
        int sum = 0;
        
        //storing numbers [0,100)
        for(int i = 0; i < y.length; ++i){
            
            y[i] = x.nextInt(100);
            sum += y[i];
            
        }
        
        //max and min
        max = y[0];
        min = y[0];  
        
        for(int i = 0; i < y.length; ++i){
            
            if(max < y[i]){
                
                max = y[i];
                
            }
            
            if(min > y[i]){
                
                min = y[i];
            }
                
        }
        
        //display: Array, Average, max, min
        System.out.println(Arrays.toString(y));
        System.out.println("Average: " + (sum / 10));     
        System.out.println("Maximum: " + max);
        System.out.println("Minmum: " + min);
        
    }
    
    
}
