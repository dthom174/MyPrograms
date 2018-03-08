
public class Recru {
    
    public static void main(String[] args){
        
        Recru start =  new Recru();
        
    }
    
    int[] list = {1,6, 3, 2, 16, 10, -9};
    
    public Recru(){

        System.out.println(isFound(1,0));
        
    }
    
    public boolean isFound(int num, int i){
        
        if(i > list.length - 1){
            
            return false;
        }
        
         
        
          if(list[i] == num){
                
                return true;
            }
  
               return isFound(num, i + 1);   

    }
    
}
