
public class Exam {
 
    public static void main(String[] args){
        
        int[] a = {10, 5, 7, 9, -5};
        int[] b = {21, -5, 12, 30, 7, 121};
        
        boolean isFound = false;
        //unsorted
        
        for(int i = 0; i < a.length; ++i){
            
            for(int h = 0; h < b.length && !isFound; ++h){
                
                if(a[i] == b[h]){
                    
                    isFound = true;
                    
                    
                }
                
            }
            
        }
         
       System.out.println(isFound);
       
       
       
    }
    
}
