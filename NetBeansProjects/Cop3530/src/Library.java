/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwayne
 */
public class Library {
    
    Book[] book;
    
    public void add(Book b){
    
        book[b.ID()] = b;
        //book[b.ID()].isIn() = true;
        
    }
    
    public void remove(Book b){
        //book[b.ID()].isIn() = false;
    }
    
    public boolean search(Book b){return true;}
    
    public void union(Library x, Library y, Library z){}
    
}
