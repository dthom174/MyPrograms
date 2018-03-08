//used linkedlist
public class Disjoint_Set {
    
    public class DisNode{
     
        DisNode rep;
        int info;
        DisNode next;
        
        public DisNode(){
            
            rep = null;
            next = null;
            info = 0;
        }
        
        public void setInfo(int i){
            
            info = i;
        }
        
        public int getInfo(){
            
            return info;
        }
        
        public void setNext(DisNode p){
            
            next = p;
        }
        
        public DisNode getNext(){
            
            return next;
        }
        
    }
    
    int count;
    DisNode first;
    DisNode last;
    DisNode[] list;
    
    public Disjoint_Set(){
        
        count = 0;
        first = new DisNode();
        last = first;
        list = new DisNode[8];
    }
    
    
    public void makeSet(int x){
        
        if(count < list.length){
            
          DisNode p = new DisNode();
          p.setInfo(x);
          list[count] = p;
        }
        
    }
    
    public void find(int x){
        
    }
    
    public void union(int x, int k){
        
            
    }
    
}
