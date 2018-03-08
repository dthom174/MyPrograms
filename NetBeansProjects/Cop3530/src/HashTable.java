
public class HashTable {
    
    int tableSize;
    
    LinkedList[] table;
    
    int count = 0;
    
    public HashTable(){
        
        tableSize = 67;
        table = new LinkedList[tableSize];
        
        for(int i = 0; i < tableSize; ++i){
            
            table[i] = new LinkedList();
            
        }
    }
    
    public void add(String str){
        
       table[hash(str)].add(str); 
        
    }
    
    public void remove(String str){
        
        int hashValue = hash(str);
        table[hashValue].remove(str);
        
    }
    
    public boolean search(String str){
        
        int hashValue = hash(str);
        
        return table[hashValue].search(str);
            
           
     
    }
    
    public void print(){
        
        for(int i = 0; i < table.length; ++i){
            
            table[i].display();
            
        }
        
    }
    
    public int hash(String key){
        
        int hashVal = 0;
        
        for(int i = 0; i < key.length(); ++i)
            
            hashVal = 37 * hashVal + key.charAt(i);
        
        hashVal %= tableSize;
        
        if(hashVal < 0)
        
            hashVal += tableSize;
            
        return hashVal;
    }
 
}
