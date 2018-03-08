
public class DisjointTester {
    
    public static void main(String[] args){
        
        Disjoint_Set sets = new Disjoint_Set();
        
        for(int i = 0; i < 8; ++i){
            
            sets.makeSet(i);
        }
        
        System.out.println(sets);
        
    }
}
