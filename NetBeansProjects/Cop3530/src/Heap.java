/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwayne
 */
public class Heap {
    
    int length;
    Person[] list;
    
    public int min(){
        
        return list[1].getKey();
    }
    
    public Heap(){
        
        length = 0;
        list = new Person[20];
    }
    
    public void remove(){
    
        Person lastItem = list[length];
        length--;
        
        int parent = 1;
        
        while(parent * 2 <= length){
            
            int child = parent * 2;
            
            if(child != length && list[child + 1].getKey() < list[child].getKey())
                
                child++;
            
            if(list[child].getKey() < lastItem.getKey())
                
               list[parent] = list[child];
            
            else
                break;
            
            parent = child;
            }
        
        list[parent] = lastItem;
    }
    
     public void add(int x, String name){
        
        Person nod = new Person(name, x);
        
        int loc = ++length;
        
        while(loc > 1 && nod.getKey() < list[loc / 2].getKey()){
            
            list[loc] = list[loc / 2];
            loc /= 2;
            
        }
        
        list[loc] = nod;      
        
    }   
     
     public String getMax(){
         
         return list[1].getName();
         
     }
    
}
