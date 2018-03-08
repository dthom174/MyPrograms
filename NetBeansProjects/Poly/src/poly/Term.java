package poly;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwayne
 */
public class Term {
    
    int coe = 0;
    int exp = 0;
    
    Term(int coef, int exp){
        
        coe = coef;
        this.exp = exp;
    }
    
    public String toString(){
       
        if(exp == 1){
            
            return (coe+ "x");
        }
        
        else if(exp == 0){
           
            return (coe + "");
        }
        
        return(coe+ "x^" + exp);
    }
    
}
