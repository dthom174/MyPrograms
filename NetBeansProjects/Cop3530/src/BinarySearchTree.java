/**
* @author A. Hernandez
* Data Structures and Algorithms
*/
public class BinarySearchTree
{
    public BinarySearchTree()
    {
        root = new Node();        //dummy node as the root
        root.setLeftChild(null);
        root.setRightChild(null);
        root.setInfo(-1);
    }

    public boolean isEmpty()
    {
        return root.getLeftChild() == null;
    }

    public void display()
    {
        inorderDisplay(root.getLeftChild());
        System.out.println();
        
        
        preOrderDisplay(root.getLeftChild());
        System.out.println();
        
        postOrderDisplay(root.getLeftChild());
        System.out.println();
        
    }

    public boolean contains(int x)
    {
        return search(x, root.getLeftChild());
    }

    public void add(int x)
    {
        if (root.getLeftChild() == null)
        {
            Node p = new Node();
            p.setNode(x, null, null);
            root.setLeftChild(p);
        } else
            insert(x, root.getLeftChild());
    }

    public int getMin()
    {
        return getMin(root);
    }

    private Node root;    //root of the bst; implemented as a dummy node.

    public int getHeight(){
        
        return getHeight(root.getLeftChild());
        
    }
    
    public int getCount(){
        
        return getCount(root.getLeftChild());
        
    }
    
    private void inorderDisplay(Node p)
    {
        if (p != null)
        {
            inorderDisplay(p.getLeftChild());
            System.out.print(p.getInfo() + " ");
            inorderDisplay(p.getRightChild());
        }
    }
    
    private void preOrderDisplay(Node p){
        
        if(p != null){
            
            System.out.print(p.getInfo() + " ");
            preOrderDisplay(p.getLeftChild());
            preOrderDisplay(p.getRightChild());
        }
        
        
        
    }
    
    private void postOrderDisplay(Node p){
        
        if(p != null){
            
             postOrderDisplay(p.getLeftChild());
             postOrderDisplay(p.getRightChild());
             System.out.print(p.getInfo() + " ");
            
        }
        
       
    }

    private boolean search(int x, Node p)
    {
        if (p == null)
            return false;
        else if (x == p.getInfo())
            return true;
        else if (x < p.getInfo())
            return search(x, p.getLeftChild());
        else
            return search(x, p.getRightChild());
    }

    private void insert(int x, Node p)
    {
        if (x < p.getInfo())
            if (p.getLeftChild() == null)
            {
                Node q = new Node();
                q.setNode(x, null, null);
                p.setLeftChild(q);
            } else
                insert(x, p.getLeftChild());
        else if (p.getRightChild() == null)
        {
            Node q = new Node();
            q.setNode(x, null, null);
            p.setRightChild(q);
        } else
            insert(x, p.getRightChild());
    }

    private int getMin(Node p)
    {
        if (p.getLeftChild() == null)
            return p.getInfo();
        else
            return getMin(p.getLeftChild());
    }
    
    private int getCount(Node p){
        
        if(p == null){
          
            return 0;
            
        }
        
        return 1 + getCount(p.getLeftChild()) + getCount(p.getRightChild());
        
    } 

    private int getHeight(Node p){
        
        if(p == null){
            
            return 0;
            
        }
        
        return 1 + Math.max(getHeight(p.getLeftChild()), getHeight(p.getRightChild()));
    }
    
}