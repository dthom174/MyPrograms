
import java.util.Scanner;

public class Symmetric {
    
    public static void main(String[] args){
        
        Scanner x = new Scanner(System.in);
        int n = Integer.parseInt(x.next());
        int number  = 1;
        
       while(n != 0){
           
           
       String[] set = new String[n];
       
       for(int i = 0; i < n; ++i){
           
           set[i] = x.next();
           
       }
        
       int h = 0;
       
        if(n % 2 == 0){
           
           h = n - 1;
             
          }
         
         else{
        
             h = n - 2;
             
        
    }
       
         System.out.println("SET " + number);
          
         
           for(int j = 0; j < n; j += 2){
               
               System.out.println(set[j]);
               
           }
           
           for(int i = h; i > 0; i -= 2){
        
               System.out.println(set[i]);
               
         }
           
           number += 1;
           n = Integer.parseInt(x.next());
           
       }
     
    }
    
    
    
}
 