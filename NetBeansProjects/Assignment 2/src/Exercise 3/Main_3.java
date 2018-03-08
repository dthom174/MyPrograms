
public class Main_3 {
 
    public static void main(String[] args){
        
        PriorityQueue h = new PriorityQueue();
        
        h.add(10,5);
        h.add(3,1);
        h.add(6,3);
        h.add(11,7);
        h.add(5,2);
        h.add(7,4);
        
        h.display();
        
        System.out.println("Max = " + h.max());
        
        h.removeMax();
        
        System.out.println("Max = " + h.max());   
        
    }
    
}
