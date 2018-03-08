/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwayne
 */
public class Tester {
    
    public static void main(String[] args){
        
        LinkedList intList = new LinkedList();
        
        System.out.print("List of numbers before list creation");
        
        for(int i = 0; i < 10; i++){
            
            int info = (int)(Math.random() * 10);
            System.out.print(info + " ");
            
            intList.insert(info, i);
            
        }
        
    }
    
}
