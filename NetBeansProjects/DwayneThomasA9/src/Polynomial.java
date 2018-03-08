/**
 * Title:     Polynomial
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * @version  8.2
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program supply methods to add, multiply, and print polynomials
 * 
 */

import java.util.LinkedList;
import java.util.ListIterator;

/**
   A class to represent a polynomial.
*/

public class Polynomial
{
   LinkedList<Term> poly;
   
   /**
      Constructs an empty polynomial
   */
   public Polynomial()
   {
     
       poly  = new LinkedList<Term>();
    
   }

   /**
      Constructs a new polynomial with the given term
      @param t the term to initialize the polynomial with
   */
   public Polynomial(Term t)
   {
      poly = new LinkedList(); 
      //add the Term t to the LinkedList
      poly.addLast(t);
       
   }

   /**
      Adds the polynomial such that the terms are in sorted order
      from highest power to lowest
      @param p the polynomial to add
   */
   public void add(Polynomial p)
   {
       
     
      Term nextPoly = p.poly.getFirst();
      
      ListIterator<Term> iter = poly.listIterator();
      int num = nextPoly.getPower();
      
      
      //sort order
      while(iter.hasNext()){
          
          Term xp = iter.next();
          //order is determined by the power
          
          if(num == xp.getPower()){
              
              iter.remove();
              iter.add(new Term(xp.getCoefficient() + nextPoly.getCoefficient(), xp.getPower())); 
              break;
          }
          
          else if (num > xp.getPower()){
             
             iter.remove();              
             iter.add(nextPoly);
             iter.add(xp);
             break;
           
          }
          
          else if(!iter.hasNext()){
              
              iter.add(nextPoly);
              
          }
          
      }
      
      if(poly.isEmpty()){
          
          poly.add(nextPoly);
          
      }
      
      
      
      //finally add the new object to the LinkedList
      //poly.add(n,nextPoly);
      
   }

   /**
      Multiplies the given polynomial with this one and returns the result
      @param p the polynomial to multiply
      @return this * p
   */
   public Polynomial multiply(Polynomial p)
   {
       
      Polynomial q = new Polynomial(); 
      ListIterator<Term> iter = p.poly.listIterator();
      ListIterator<Term> iter2 = p.poly.listIterator();
      
      while(iter.hasNext()){
          
          Term x = iter.next();
            double coffi= x.getCoefficient();
            int power = x.getPower();
         
         while(iter2.hasNext()){
     
            
             Term x2 = iter2.next();
             double coffi2= x2.getCoefficient();
             int power2 = x2.getPower();
             /*Term newTerm = new Term (coffi * coffi2, power + power2);*/
             
             q.add(new Polynomial(new Term (coffi * coffi2, power + power2)));
              
             
             
         }
         
         while(iter2.hasPrevious()){
             
             iter2.previous();
             
         }    
         
      }
       
      
      return q;
       
   }

   /**
      Prints the polynomial "nicely" so that it reads
      from highest term to lowest and doesn't have a
      leading "+" if the first term is positive.
   */
   public void print()
   {
      
       int i = 0;
       
       //print everything from LinkedList
       for(Term x : poly){
           
           //This is to get the add or subtract sign
           char sign = ' ';
             
           sign = ((x.getCoefficient() + "").charAt(0) == '-') ? '-' : '+';
               
               if(sign == '+' && i == 0){
                   
                    System.out.print(" " + x.toString() + " ");
                
               }
               
               else{
                   
                   System.out.print(sign + " " + x.toString() + " "); 
                   
               }

           ++i;
       }
      
       
   }
}

    

