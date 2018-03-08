package poly;


import java.util.ArrayList;

public class Polynomial
{
   
    // do NOT modify this instance variable declaration
   Term Term; 
   private ArrayList<Term> polynomial ; 

   public Polynomial()  // constructor
   {
       polynomial =  new ArrayList<>();  
       // TO DO: write body of this constructor
   }
   
   public void addTerm(int coeff, int expo)
   {
      // TO DO: write body of this method
       Term Term = new Term(coeff, expo);
       
       if(polynomial.size() < 0){
           
            polynomial.add(Term);
       }
       
       else{
       
           
       }
       
   }      
  
   public String toString()
   {
      
      String x = ""; 
       for(int i = 0;  i < polynomial.size(); ++i){

           x += polynomial.get(i).toString() + " + ";
       }
        
// TO DO: write body of this method
       // temporary return so class skeleton will compile and run
       return x ;
   }
   
   // collect terms of a Polynomial object. I.e. replace all terms having the 
   // same exponent with a single term which is their sum
   private void collectTerms()
   {
       // TO DO: write body of this method
   }
   
   public Polynomial polyMultiply(Polynomial p)
   {
       
       
        // TO DO: write body of this method
       // temporary return so class skeleton will compile and run
       return null ;
   }
   
   public Polynomial polyAdd(Polynomial p)
   {      
       
      
// TO DO: write body of this method
       // temporary return so class skeleton will compile and run
       return null ;
   }
} // end of Polynomial class definition =========================