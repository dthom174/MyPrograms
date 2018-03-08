
public class Node {
    
    Node next;
        Node previous;
        int num;
        int priorityNum;
        
        public Node(){
            
            num = 0;
            next = null;
            previous = null;
            priorityNum = 0;
            
        }
        
        public void setNum(int p){
            
            num = p;
            
        }
        
        public void setPriority(int k){
            
            priorityNum = k;
        }
        
        public int getNum(){
            
            return num;
        }
        
        public int getPriorityNum(){
            
            return priorityNum;
        }
        
        public void setNext(Node y){
            
            next = y;
        }
        
        public void setPrevious(Node j){
            
            previous = j;
        }
        
        public Node getNext(){
            
            return next;
        }
        
        public Node getPrevious(){
            
            return previous;
        }
    
    
}
