
import java.util.Arrays;


public class Bubblesort {
    
    public Bubblesort(int[] list){
        
        //sort
        
        for(int i = list.length - 1; i > 0; --i){
            
            for(int j = list.length - 1; j > 0; --j){
                
                if(list[j] < list[j - 1]){
                    
                    int temp = list[j];
                    list[j] = list[j - 1];
                    list[j - 1] =  temp;
 
                }
            } 

        }
        
    }
    
}
