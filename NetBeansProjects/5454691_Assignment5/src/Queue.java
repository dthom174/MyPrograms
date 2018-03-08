public class Queue
{
    
    public Queue()
    {
        size = 100;
        list = new int[size];

        front = 0;
        back = size - 1;

        count = 0;
    }

    public Queue(int s)
    {
        size = s;
        list = new int[size];

        front = 0;
        back = size - 1;

        count = 0;
    }

    public void enqueue(int c)
    {
        if(count == size) {
            
            System.out.println("full");
            
        }
        else{
            
        back = (back + 1) % size;
        list[back] = c;
        count++;
        
        }
    }

    public void dequeue()
    {
        
        if(count != 0){
            
            front = (front + 1) % size;
            count--;
            
        }
        
        else{
            
            System.out.println("It is empty");
            
        }      
    }

    public int getFront()
    {
        return list[front];
    }

    public boolean isEmpty()
    {
        return count == 0;
    }
    
    public void clear(){
        
        front = 0;
        back = size - 1;

        count = 0;
        
    }
    
    public void print(){
               
        for(int i = 0; i < count; i++){
            
            System.out.println(list[(front + i) % size]);
            
        }
        
    }

    private int[] list;
    private int size;
    private int count;
    private int front, back;

   
}
