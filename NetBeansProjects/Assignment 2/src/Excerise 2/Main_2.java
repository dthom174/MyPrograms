
public class Main_2 {
    
    public static void main(String[] args){
        
        Stack x = new Stack();
        
        x.push(5);
        x.push(8);
        x.push(3);
        x.push(1);
        x.push(11);
        
        x.display();
        
        System.out.println(x.peek());
        x.pop();
        System.out.println(x.peek());
        x.pop();
        System.out.println(x.peek());
        
        x.display();
        
    }
    
}
