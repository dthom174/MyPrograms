
import java.util.Scanner;

public class Binary {
    
    public static void main(String[] args){
        
        long startTime = System.nanoTime();
        
        Binary r = new Binary();
        
        long elapsedTime = System.nanoTime()  - startTime;
        
        System.out.println(elapsedTime);
    }
    
    public Binary(){
        
        int[] lit = {5, 7, 11, 14, 27, 30, 34, 67, 100, 200, 205, 234, 320, 450, 451};
        
        Scanner nr = new Scanner(System.in);
        int x = 30;
        
        int n = lit.length;
        
        int first = 0, last = n - 1, pivot;
        
        boolean found = false;
        
        while(first <= last && !found){
            
            pivot = (first + last) / 2;
            
            if(lit[pivot] == x){
            
                found  = true;
                
            }
            
            else{
                
                if(x < lit[pivot]){
                    
                    last = pivot - 1;
                    
                }
                
                else{
                    
                    first = pivot + 1;
                    
                }
                
            }
            
        }
        
        if(found){
            
            System.out.println("x is in the array");
        }
        
        else{
            
            System.out.println("x is not in the array");
            
        }
        
    }
    
}
