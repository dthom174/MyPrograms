
public class RecBinary {
   
    public static void main(String[] args){
        
        RecBinary start =  new RecBinary(8);
        
    }
    
    int list[] = {1, 3, 5, 7, 9, 10, 15, 20};
        
    public RecBinary(int value){
        
      System.out.println(isFound(value, 0, list.length - 1));    
        
    }
    
    public boolean isFound(int value, int left, int right){
        
        int index = (right + left) / 2;
        
        if(right < left){
            
            return false;
        }
        
        if(list[index] == value){
            
            return true;
        }
        
        if(list[index] < value){
            
            return isFound(value, index + 1, right);
        }
        
        return isFound(value, left, index - 1);
    }
    
}
