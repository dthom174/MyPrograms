
public class Stack {
    
    Node first;
 
    public Stack(){
        
        first = new Node();
 
    }
    
    public void push(int y){
        
        Node j = new Node();
        j.setNum(y);
        j.setNext(first.getNext());
        first.setNext(j);
        
    }
    
    public void pop(){
        
        if(first.getNext() != null){
           
            Node last = first.getNext();
            first.setNext(last.getNext());
            
        }
         
    }
    
    public int peek(){
        
        return first.getNext().getNum();
    }
    
    public void display() {
        
        Node now = first.getNext();
        
        System.out.print("[ ");
        
        while (now != null) {
            
            System.out.print(now.getNum() + ", ");
            
            now = now.getNext();
        }
        
        System.out.print("]");
        
        System.out.println();
    }
}

