import java.util.Arrays;
import java.util.Random;


public class Graph {
    
    int[][] mat;
    
    public Graph(int numberVertices){
        
        mat = new int[numberVertices][numberVertices];        
    }
    
    public void addEdge(int n, int k){
        
        mat[n][k] = 1;
        mat[k][n] = 1;
    }
    
    public void removeEdge(int n, int k){
        
        mat[n][k] = 0;
        mat[k][n] = 0;    
    }
    
    public int[] findAdjacentVertices(int n){
        
        int[] adj = new int[mat.length];
        int total = 0;
        
        for(int i = 0; i < mat.length; ++i){
                 
               if(mat[n][i] == 1){
                   
                   adj[total] = i;
                   ++total;           
               }                           
        }
        
        int[] a = Arrays.copyOf(adj, total);
        return a;
    }
    
    public String toString(){
        
        String done = "";
        
        for(int i = 0; i < mat.length; ++i){
            
            for(int j = 0; j < mat[0].length; ++j){
             
                done += mat[i][j] + " ";
                
            }
                done += "\n";
        }
        
        return done;
    }
    
    public void bft(int v){
        
        boolean[] visit = new boolean[mat.length];
        
        for(int i = 0; i < visit.length; ++i){
            
            visit[i] = false;
        }
        
        Queue cha = new Queue();
        cha.enqueue(v);
        visit[v] = true;
        
        while(!cha.isEmpty()){
            
            int x = cha.getFront();
            cha.dequeue();
            System.out.print(x + ", ");
            
            //next examine the vertices adjacent to x
            int[] adj = findAdjacentVertices(x);
            
            for(int y: adj){
                
                if(!visit[y]){
                    
                    cha.enqueue(y);
                    visit[y] = true;
                }                
            }
        }
    }        
}
