
import java.util.Arrays;


public class work {
    
    public static void main(String[] args){
        
        int[] x = {1,2,3,4,5};
        int length = 5;
        System.out.println(x.length);
        System.out.println(Arrays.toString(x));
        
        for(int i = 0; i < x.length; ++i){
            
            if(5 == x[i]){
                
                 --length;
                 
                 if(i == length){
                     
                     x[i] = 0;
                     
                 }
                 
                 else{
                     
                     while(i  < length){
                    
                    x[i] = x[i+1];
                    
                    ++i;
                }
                     
                     x[i] = 0;
                     
                 }
                
                
            }
            
        }
        
        System.out.println(x.length);
        System.out.println(Arrays.toString(x));
        
    }
    
}
