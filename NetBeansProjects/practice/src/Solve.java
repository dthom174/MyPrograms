



import java.util.Arrays;
import java.util.Scanner;
import org.w3c.dom.NodeList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwayne
 */
public class Solve {
    
    public static void main(String[] args) {
       
        String s = "He is a very very good boy, isn't he?";
       
        String[] r = {"!", ".", "_", "@", "'", ",", "?"};
        
        for(String u : r){
            
             s = s.replace(u , " ");    
        }
        
         
       while(s.indexOf("  ") > -1){
           
           s = s.replace("  ", " ");
           
       }
       
       s = s.replace(" ", "\n");
       
        
       Scanner h = new Scanner(s.trim());
       
       int count = 0;
       while(h.hasNext()){
            
            ++count; 
            h.nextLine();
            
       }
       
      
       System.out.println(count);
       System.out.println(s.trim());
       
    }
    
}
