
public class PriorityQueueHeap {
    
    public static void main(String[] args){
        
        Heap start = new Heap();
        start.add(9,"Jason");
        start.add(3,"mike");
        start.add(5,"tom");
        
        System.out.println(start.getMax());
        start.remove();
        System.out.println(start.getMax());
        start.remove();
        System.out.println(start.getMax());
    }
    
}
