
public class Deque {
   
    Node first;
    Node last;
    
    public Deque(){
     
        first = new Node();
        last = new Node();
    }
    
    public void push(int x){
        
        Node g  = new Node();
        g.setNum(x);
        
        if(empty()){

            last = g;
            
        }
        
        g.setNext(first.getNext());
        first.setNext(g);
        
    }
    
    public int pop(){
       
        int h = 0;
        
       if(first.getNext() != null){
           
            Node u = first.getNext();
            h = u.getNum();
            first.setNext(u.getNext());
            
        }
      
      return h;
      
    }
    
    public void inject(int x){
        
        Node k = new Node();
        k.setNum(x);
        
        if(empty()){
            
            k.setNext(first.getNext());
            first.setNext(k);
            last = k;
            
        }
        
        else{
            
            k.setNext(last.getNext());
            last.setNext(k);
            last = k;
            
        }
  
    }
    
    public int eject(){
                
        Node i = first;
        
        while(i.getNext() != last){
            
            i = i.getNext();
                       
        }
        
        int y = last.getNum();
        
        i.setNext(last.getNext());
        
        last = i;
        
        return y;  
        
    }
    
    public boolean empty(){
        
        return (first.getNext() == null);
    }
    
    public void display(){
        
        Node now = first.getNext();
        
        System.out.print("[ ");
        
        while(now != null){
            
            System.out.print(now.getNum());
            
            if(now.getNext() != null){
                
                System.out.print(", ");
                
            }
            
            now = now.getNext();
            
        }
        
        System.out.print("]");
        System.out.println();
    }
    
    public int getFront(){
        
        return first.getNext().getNum();
    }
    
    public int getRear(){
        
        return last.getNum();
    }
    
}
