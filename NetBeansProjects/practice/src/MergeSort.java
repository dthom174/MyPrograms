
import java.util.Arrays;

public class MergeSort {
 
    int[] list;
    
    public MergeSort(int[] list){
        
        this.list = list;
        this. list = sort(0, list.length - 1);
        
    }
    
    public MergeSort(){
        
    }
    
    public int[] sort(int left, int right){
        
        
        if(left >= right){
            
            int[] p = {list[left]};
            
            return p;
            
        }
        
        int mid = (left + right) / 2;
        
          return merge(sort(left , mid),sort(mid + 1, right));     
    }
    
    public int[] merge(int[] list1, int[] list2){
        
        int[] mergeList = new int[list1.length + list2.length];
        int left = 0;
        int right = 0;
        int i = 0;
        
        while(left < list1.length && right < list2.length){
            
            if(list1[left] > list2[right]){
                
                mergeList[i] = list2[right];
                ++right;
            }
            
            else{
                
                mergeList[i] = list1[left];
                ++left;
            }
            
            ++i;
            
        }
        
        if(left < list1.length){
            
            for(int j = left; j < list1.length; ++j, ++i){
                
                mergeList[i] = list1[j];
                
            }
            
        }
        
        else if(right < list2.length){
            
            for(int j = right; j < list2.length; ++j, ++i){
                
                mergeList[i] = list2[j];
                
            }
             
        }
        
        System.out.println(Arrays.toString(mergeList));
        return mergeList;
    }
    
    public void print(){
        
        System.out.println(Arrays.toString(list));
    }
    
}
