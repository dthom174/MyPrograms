
import java.util.Arrays;
import java.util.Random;


public class GraphTest {

    public static void main(String[] args){
        
        //number of vertices
        Graph g = new Graph(5);
        
        g.addEdge(1,3);
        g.addEdge(1,2);
        g.addEdge(1,0);
        g.addEdge(3,4);
        g.addEdge(3,0);
        g.addEdge(2,2);
        
        int[] q = g.findAdjacentVertices(1);
        System.out.println(Arrays.toString(q) + "\n");
        System.out.println(g.toString());
        g.bft(1);
    }
    
}
