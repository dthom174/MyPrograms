
public class PointSet {

    Node root;
    int count;
    String[] list;
    
    PointSet() {

        count = 0;
        root = new Node();
    }

    public boolean isEmpty() {

        if (root.getLeft() == null) {

            return true;
        }

        return false;
    }

    public void print() {

        print(root.getLeft());
        System.out.println();
    }

    private void print(Node q) {

        if (q == null) {

            return;
        }

        print(q.getLeft());
        
        if(!q.isDeleted()){
           
            System.out.print("(" + q.getX() + ", " + q.getY() + "), ");
        }
       
        print(q.getRight());

    }

    public void clear() {

        count = 0;
        root.setLeft(null);
    }

    public void add(int x, int y) {

        ++count;
        if (root.getLeft() == null) {

            Node e = new Node();
            e.setPoints(x, y);
            root.setLeft(e);
        } else {

            insert(x, y, root.getLeft());
        }

    }

    public void insert(int x, int y, Node q) {

        if (x != q.getX()) {

            if (x < q.getX()) {

                if (q.getLeft() == null) {

                    Node w = new Node();
                    w.setPoints(x, y);
                    q.setLeft(w);
                } else {

                    insert(x, y, q.getLeft());
                }
            } else {

                if (q.getRight() == null) {

                    Node w = new Node();
                    w.setPoints(x, y);
                    q.setRight(w);

                } else {

                    insert(x, y, q.getRight());
                }
            }
        } else {

            if (y <= q.getY()) {

                if (q.getLeft() == null) {

                    Node w = new Node();
                    w.setPoints(x, y);
                    q.setLeft(w);
                } else {

                    insert(x, y, q.getLeft());
                }
            } else {

                if (q.getRight() == null) {

                    Node w = new Node();
                    w.setPoints(x, y);
                    q.setRight(w);

                } else {

                    insert(x, y, q.getRight());
                }
            }
        }
    }
    
    public void remove(int x, int y){
        
        remove(x, y, root.getLeft());
    }
    
    //Lazy Deletion
    private void remove(int x, int y, Node q) {
        
        if(q == null){
            
            return;
        }
        
        if (x == q.getX() && y == q.getY() && !q.isDeleted()) {
            
            --count;
            q.setIsDeleted();
            
        }
        
        else{
            
            if(x < q.getX() || (x == q.getX() && y <= q.getY() )){
                
                remove(x, y, q.getLeft());
            }
            
            else{
                
                remove(x, y, q.getRight());
            }
            
        }   
    }
    
    public void removeAll(int x, int y){
        
        while(search(x, y, root.getLeft())){
            
            remove(x, y, root.getLeft());
        }
        
    }
   
    public boolean search(int x, int y) {

        return search(x, y, root.getLeft());
    }

    private boolean search(int x, int y, Node q) {

        if (q == null) {

            return false;
        }
        
        if (x == q.getX() && y == q.getY() && !q.isDeleted()) {

            return true;
        }

        if (x < q.getX() || (x == q.getX() && y <= q.getY())) {

            return search(x, y, q.getLeft());
        }

        return search(x, y, q.getRight());
    }

    public int count(int x, int y) {

        return count(x, y, root.getLeft(), 0);
    }
    
    private int count(int x, int y, Node q, int num) {

        if (q == null) {

            return num;
        }

        num = count(x, y, q.getLeft(), num);
        
        if(x == q.getX() && y == q.getY() && !q.isDeleted()){
            
            ++num;
        }
        
        num = count(x, y, q.getRight(), num);
        
        return num;
    }
    
    public String[] toArray(){
        
        list = new String[count];
        toArray(root.getLeft(), 0);
        return getArray();
    }
    
    //set the array
    private int toArray(Node q, int i){
        
        if(q == null){
            
            return i;
        }
      
         i = toArray(q.getLeft(), i);
         
         if(!q.isDeleted()){
             
            list[i] = "(" + q.getX() + ", " + q.getY() + ")";
            ++i;
         }
         
         i = toArray(q.getRight(), i);
         
         return i;
    }
    
    //returns the array
    private String[] getArray(){
        
        return list;
    }
    
}
