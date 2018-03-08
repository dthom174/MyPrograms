
public class Selection {

    public Selection(int[] list){
        
        int n = list.length - 1;
        
        //sort the list
        
        for(int i = 0; i < n; ++i){
            
            int low = i;
            
            for(int j = i + 1; j < n + 1; ++j){
               
                
                if(list[low] > list[j]){
                    
                    low = j;
                    
                }
                
            }
            
            int temp = list[i];
            list[i] = list[low];
            list[low] = temp;
            
        }
              
    }
    
}
