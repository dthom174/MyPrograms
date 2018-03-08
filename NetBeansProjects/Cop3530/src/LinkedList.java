public class LinkedList implements ListInterface {

    boolean search(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void remove(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void add(String str) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class Node {

        private int info;   
        private Node next;  

        public Node() {
            info = 0;
            next = null;
        }

        public void setInfo(int i) {
            info = i;
        }

        public void setNext(Node l) {
            next = l;
        }

        public int getInfo() {
            return info;
        }

        public Node getNext() {
            return next;
        }
    }

    private Node first;

    public LinkedList() {
        first = new Node();
    }

    public boolean isEmpty() {
        return (first.getNext() == null);
    }

    public void display() {
        Node current = first.getNext();

        while (current != null) {
            System.out.print(current.getInfo() + " ");
            current = current.getNext();
        }

        System.out.println();
    }

    public boolean search(int x) {
        Node current = first.getNext();

        while (current != null) {
            if (current.getInfo() == x) {
                return true;
            }
            current = current.getNext();
        }

        return false;
    }

    public void add(int x) {
        Node p = new Node();

        p.setInfo(x);
        p.setNext(first.getNext());

        first.setNext(p);
    }

    public void remove(int x) {
        Node old = first.getNext(),
               p = first;
           
        boolean found = false;
        while (old != null && !found) {
            if (old.getInfo() == x) {
                found = true;
            }
            else {
                p = old;
                old = p.getNext();
            }
        }

        if (found) {
            p.setNext(old.getNext());
        }
    }

    public void insert(int x, int loc) {

      Node current = first.getNext();
        
       for(int i = 0; i < loc ;++i){
           
           
           current = current.getNext();
           
       }
      
       Node node = new Node();
       node.setInfo(x);
       node.setNext(current.getNext());
       current.setNext(node); 
       
    }

    public void removeItemAt(int loc) {

    }
}
