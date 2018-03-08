
import java.util.Arrays;
import java.util.Random;


public class Practice {
    
    public  static void main(String[] args){
        
        int n = 10;
        
        int[] list = new int[n];
        Random x = new Random();
        
        for(int i = 0; i < list.length; ++i){
            
            list[i] = x.nextInt(n);
            
        }
        
        System.out.println(Arrays.toString(list));
        
        Quicksort p = new Quicksort(list);
        p.print();
    }
    
}
