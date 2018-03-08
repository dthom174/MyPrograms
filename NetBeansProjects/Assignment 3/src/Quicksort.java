
import java.util.Arrays;


public class Quicksort {
    
    int list[];
    
    public Quicksort(int[] list){
        
        this.list = list;
        
        sort(0, list.length - 1);
        
    }
    
    public void sort(int left, int right){
        
        if(left >= right){
            
            return;
        }
       
        int pivot = (right + left) / 2;
        int point = partition(left, right, pivot);
        
        //sort the left side
        sort(left, point - 1);
        
        //sort the right side
        sort(point + 1, right);
        
    }
    
    
   public int partition(int left, int right, int pivot){
       
       if(right >= left){
           
           int temp = list[pivot];
           list[pivot] = list[right];
           list[right] = temp;
           pivot = right;
           --right;
       }
        
       while(right >= left){
           
           while(right >= left && list[right] > list[pivot]){
               
              right--;
           }
           
           while(right >= left && list[left] < list[pivot]){
               
               left++;
           }
           
           if(right >= left){
               
               //swap
               int temp = list[right];
               list[right] = list[left];
               list[left] = temp;
               
               right--;
               left++;        
               
           }
           
       }
      
       int temp = list[left];
       list[left] = list[pivot];
       list[pivot] = temp;
       pivot = left;
       
       return pivot;
   }
    
   public void print(){
       
       System.out.print(Arrays.toString(list));
       
   }
   
}
