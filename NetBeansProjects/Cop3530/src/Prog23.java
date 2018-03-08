
public class Prog23 {
    
    public static void main(){
        
        HashTable table = new HashTable();
        
        table.add("return");
        table.add("find");
        table.add("class");
        table.print();
        table.remove("find");
        
        if(table.search("find")){
            
            System.out.println("Found");
            
        }
        
        else{
            
            System.out.println("Not Found");
            
        }
        
        table.print();
        
    }
    
}
