
//include the linked list and the interface

public class Hash {
    
    public static void main(String[] args){
        
        HashTable star = new HashTable();
        
        String[] trl = {"abcdef", "cheer", "hello",
                       "dance",  "money",  "yo", "22", 
                       "ddd",  "tyd", "dit", "uil", "il"   
        };
        
        for(int i = 0; i < trl.length; ++i)
            
            System.out.println(star.hash(trl[i]));
        
    }
    
}
