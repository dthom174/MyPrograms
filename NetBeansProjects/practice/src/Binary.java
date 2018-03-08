
public class Binary {
    
    public static void main(String[] args){
        
        int[] list = {1, 3, 6, 8, 9, 10, 15, 20};
        int value = 5;
        boolean isFound = false;
        int right = list.length - 1;
        int left = 0;
        
        while(!isFound){
            
            if(right < left){
                
                break;
                
            }
            
            int index = (right + left) / 2;
            
            if(list[index] == value){
                
                isFound = true;
                
            }
            
            else{
                
                if(list[index] < value){
                    
                     left = index + 1;
                }
                
                else{
                    
                    right = index - 1;
                }
                
            }
 
        }
        
        System.out.println(isFound);
        
    }
    
}
