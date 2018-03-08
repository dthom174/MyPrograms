
public class PriorityQueue {
  
    Node first;
   
    public PriorityQueue(){
     
        first = new Node();
       
    }
    
    public boolean empty(){
        
        return first.getNext() == null;
    }
    
   public void add(int n, int l){
       
       boolean isFound = false;
       Node v = new Node();
       v.setNum(n);
       v.setPriority(l);
       
       if(empty()){
           
           v.setNext(first.getNext());
           first.setNext(v);
           v.setPrevious(first);
                       
       }
       
       else{
           
           Node x  = first.getNext();
           
           if(l > x.getPriorityNum()){
               
               isFound = true;
               
           }
           
           while(x.getNext() != null && !isFound){
               
               x = x.getNext();
               
               if(l > x.getPriorityNum()){
               
                    isFound = true;
               
                }               
           }
           
           if(isFound){
               
               v.setNext(x);
               v.setPrevious(x.getPrevious());
               x.getPrevious().setNext(v);
               x.setPrevious(v);
           }
           
           else{
               
               v.setNext(x.getNext());
               x.setNext(v);
               v.setPrevious(x);
           }
           
       }
      
   }
   public void display() {
       
        Node curr = first.getNext();
         
        while (curr != null) {
            
            System.out.printf("%-9s %-10s %-9s", "(" + curr.getNum() + ", " + curr.getPriorityNum() + ")", "Previous ->", "(" + 
                    curr.getPrevious().getNum() + ", " + curr.getPrevious().getPriorityNum() + ")");
            
            System.out.println();
            curr = curr.getNext();
               
        }
        
        System.out.println();
    }
   
   
   public int max(){
       
       return first.getNext().getNum();
       
   }
    
   public void removeMax(){
       
       Node last = first.getNext();
       System.out.println("The current max has been remove");
       first.setNext(last.getNext());
       
   }
   
}
