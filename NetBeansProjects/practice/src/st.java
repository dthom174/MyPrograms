
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwayne
 */
public class st {
    
    public static void main(String[] agrs){
        
        String u = "How are you doing today";
        Scanner scnr = new Scanner(u);
        int count = 0;
        String lw = "";
        
        while(scnr.hasNext()){
            ++count;
            String ch = scnr.next();
            
            if(lw.length() < ch.length()){
                
                lw = ch;
            }
        }
        
        System.out.println("#words: " + count);
        System.out.println("long: " + lw + " and length is " + lw.length());
    }
}
