
import java.util.Arrays;


public class Merge {
 
    public static void main(String[] args){
        
        //merge two sorted array(Hint: pointers)
        
        int[] b = {2,5,43};
        int[] a = {1,3,33,55};
       
        if(a.length > b.length){
            
            System.out.println(Arrays.toString(m(b,a)));
            
        }
        
        else{
            
            System.out.println(Arrays.toString(m(a,b)));
        }
     
         b = a; 
        System.out.println(Arrays.toString(b) + "   " + b.length);
        
   }
    
    static int[] m(int[] x, int[] y){
        
         int[] z = new int[x.length + y.length];
         int p1 = 0;
         int p2 = 0;
         
        for(int i = 0; i < z.length ; ++i){
              
                if(p1 < x.length && x[p1] < y[p2]){
                
                z[i] = x[p1]; 
                ++p1;
                
            }
            
              else{
                
                z[i] = y[p2];
                ++p2;
                
               }
                      
            
        }
        
        return z;
    }
}