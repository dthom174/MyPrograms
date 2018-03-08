
public class Node {
    
    private int x;
    private int y;
    private Node leftChild;
    private Node rightChild;
    private boolean isDeleted;
    
    public Node(){
        
        leftChild = null;
        rightChild = null; 
        isDeleted = false;
    }
    
    public void setPoints(int x, int y){
        
        this.x = x;
        this.y = y;
    }
    
    public int getX(){
        
        return x;
    }
    
    public int getY(){
        
        return y;
    }
    
    public void setLeft(Node g){
        
        leftChild  = g;
    }
    
    public void setRight(Node g){
        
        rightChild = g;
    }
    
    public Node getLeft(){
        
        return leftChild;
    }
    
    public Node getRight(){
        
        return rightChild;
    }
    
    public void setIsDeleted(){
        
        isDeleted  = true;
    }
    
    public boolean isDeleted(){
        
        return isDeleted;
    }
    
}
