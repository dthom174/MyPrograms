
public final class Prog20_03 {

public static void main(String[] args){
    
 Prog20_03 x = new Prog20_03();   
    
}

int[] list1 = {4, 7, 9};
int[] list2 = {1, 3, 4, 6, 7, 8, 9, 13};

public Prog20_03(){
    
  unsorted();
  sorted(); 
  
}

public void unsorted(){
    
    boolean found = false;
   
       for(int i = 0; i < list1.length; ++i){
           
           found = false;
           
               for(int j = 0; j < list2.length && !found; ++j){
                   
                   if(list1[i] == list2[j]){
                       
                       found = true;
                       
                   }
                   
               }
               
               if(!found){
                   
                   System.out.println("not completely contained");
                   break;
               } 
              
       }
       
       if(found){
           
           System.out.println("competely contained");
           
       }
        
}

//use binary search
public void sorted(){
     
      boolean found2 = false;  
      int start = 0;
      int end = list2.length - 1;
      
      while(start <= end && !found2){
          
          
           
          
      }
            
}
    
}
