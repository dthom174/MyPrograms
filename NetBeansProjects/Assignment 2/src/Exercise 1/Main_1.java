
public class Main_1 {
    
    public static void main(String[] args){
        
       Deque y = new Deque();

        y.inject(7);
        y.push(8);
        y.push(9);
        y.inject(10);
        
        y.display();
        
        y.pop();
        y.pop();
    
        y.display();
        
        y.eject();
        y.inject(2);
        
        y.display();
        
        System.out.printf("%8s %8s", "Front: " + y.getFront(), "Rear: " + y.getRear()); 
        System.out.println();
    }
    
}
