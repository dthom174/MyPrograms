
import java.io.*;
import java.util.*;

public class Graph {
    
    private int V;
    private LinkedList<Integer> adj[];
    
    //constructor
    Graph(int v){
        
        V = v;
        adj = new LinkedList[v];
        
        for(int i = 0; i < v; ++i){
            
            adj[i] = new LinkedList();
                    
        }
        
    }
    
    void addEdge(int v, int w){
        
        adj[v].add(w);
        
    }
    
    int search(int y){
     
        for(int i = 0; i < V; ++i){
         
            
        }
        return y;
    }   
    
}
