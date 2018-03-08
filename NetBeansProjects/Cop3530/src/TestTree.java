
public class TestTree {
    
    public static void main(String[] args){
        
        BinarySearchTree v = new BinarySearchTree();
        
        v.add(25);
        v.add(10);
        v.add(15);
        v.add(11);
        v.add(17);
        v.add(37);
        v.add(29);
        v.add(42);
        v.add(27);
        
        System.out.println("Min -- " + v.getMin());
        
        v.display();
        System.out.println(v.getHeight());
        System.out.println(v.getCount());
    }
    
}
