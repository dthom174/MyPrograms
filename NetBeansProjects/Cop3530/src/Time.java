
import java.util.Date;
import java.util.Random;


public class Time {
 
    public static void main(String[] args){
        
        Time main = new Time();
        
    }
    
    int n = 10000;
    int y = 0;
    
    public Time(){
        
        int[] che = new int[1000000];
        Random x = new  Random(); 
        
        for(int i = 0; i <che.length; ++i){
           
            che[i] = x.nextInt(30);
            
        }
        
        //run the timer
        Date current = new Date();
        long startTime = current.getTime();
       
        //Find the min
        getMin(che);
        //code to be timed goes here
        
        current = new Date();
        long stopTime = current.getTime();
        
        //elapsedTime: milliseconds;
        long elapsedTime = stopTime - startTime;
        
        System.out.println("The section of code lasted " + elapsedTime + "ms");
        compare(); compare2();
       
    }
    
    public void getMin(int[] x){
        
        int min = x[0];
        
        for(int i = 1; i < x.length; ++i){
           
            if(x[i] < min){
                
                min = x[i];
                
            }
        }
        
        System.out.println("Min: " + min);
        
    }    
    
    public void compare(){
        
        //run the timer
        Date current = new Date();
        long startTime = current.getTime();
       
       // O(n)
        for(int i = 0; i <= n; ++i){
            
            for(int j = 1; j <= 1000; ++j){
                
                y = 0;
            }
            
        } 
        //code to be timed goes here
        
        current = new Date();
        long stopTime = current.getTime();
        
        //elapsedTime: milliseconds;
        long elapsedTime = stopTime - startTime;
        
        System.out.println("The section of code lasted " + elapsedTime + "ms");
       
    }
    
   public void compare2(){
       
       //run the timer
        Date current = new Date();
        long startTime = current.getTime();
       
       // O(n^2)
        for(int i = 0; i <= n; ++i){
            
            for(int j = 1; j <= n; ++j){
                
                y = 0;
            }  
        } 
        
        //code to be timed goes here
        
        current = new Date();
        long stopTime = current.getTime();
        
        //elapsedTime: milliseconds;
        long elapsedTime = stopTime - startTime;
        
        System.out.println("The section of code lasted " + elapsedTime + "ms");
        
   }
    
}
