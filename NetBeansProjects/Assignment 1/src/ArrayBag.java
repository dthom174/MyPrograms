
public class ArrayBag implements Bag{
    
    String[] list;
    private final int size = 10;
    int length = 0;
    
    public ArrayBag(){
        
     list = new String[size];
            
    } 
    
    @Override
    public boolean isEmpty(){
         
        return length == 0;
        
     }
    
    @Override
    public void print(){
     
        for(int i = 0; i < length; ++i){ 
            
            System.out.print(list[i] + ", ");
            
        }
        
        System.out.println("");
    }
    
    @Override
    public void add(String s){
        
        list[length] = s;
        ++length;
        
    }
    
    @Override
    public void remove(String s){
        
        for(int i = 0; i < list.length; ++i){
            
            if(s.equals(list[i])){
                
                --length;
                
                if(i == length){
                    
                    list[i] = null;
                    
                }
                
                else{
                    
                    while( i < length){
                    
                        list[i] = list[i+1];
                        
                        ++i;
                        
                    }
                    
                    list[i] = null;
                    
                }
                
            }
            
        }
        
    }
    
    @Override
    public int count(String s){
        
       int count = 0;
       
       for(int i = 0; i < length; ++i){
           
           if(list[i].equals(s)){
               
               ++count;
               
           }
           
       }
        
       return count;
    }
    
}