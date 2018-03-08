
import java.util.Arrays;


public class Main {
    
    public static void main(String[] args){
        
        Main start = new Main();
    }
    
    public Main(){
        
        PointSet tree = new PointSet();
        tree.add(2,5);
        tree.add(3,2);
        tree.add(1,2);
        tree.add(1,5);
        tree.add(3,2);
        tree.add(5,6);
        tree.add(3,5);
        tree.add(3,2);
        
        System.out.println("First Test: Add");
        System.out.print("Print - ");
        tree.print();
        
        System.out.print("Is point (3,2) in the tree? - ");
        System.out.println(tree.search(3,2));
        System.out.print("The number of occurence of point (3,2): ");
        System.out.println(tree.count(3,2));
        System.out.println("Array " + Arrays.toString(tree.toArray()));
        
        tree.removeAll(3,2);
        tree.remove(1,2);
        tree.remove(2,5);
        
        System.out.println("\nSecond Test: Remove");
        System.out.print("Print - ");
        tree.print();
        
        System.out.print("Is point (3,2) in the tree? - ");
        System.out.println(tree.search(3,2));
        System.out.print("The number of occurence of point (3,2): ");
        System.out.println(tree.count(3,2));
        System.out.println("Array " + Arrays.toString(tree.toArray()));
        
        //clear
        tree.clear();
        System.out.println("\nThird Test: Clear");
        System.out.println("Array "+ Arrays.toString(tree.toArray()));
    }
    
}
