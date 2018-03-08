/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dwayne
 */
public class oo {
    
    public static void main(String[] args){
        
        // ﻿listA and listB 

//The difference A - B (In A and not in B)

int[] A = {6, 1, 7, 8, 23, 56, 98, 99, 0};

int[] B = {23, 1, 7, 8, 9, 90, 76, 12, 0, 19, 8};

for(int i = 0; (i < A.length || i < B.length) ; ++i){

         boolean isFoundA = false;
         boolean isFoundB = false;
       
           for(int j = 0 ; (j < B.length || j < A.length)  && (!isFoundA || !isFoundB); ++j){
                
               if( j < B.length && i < A.length && A[i] == B[j] ){

                        isFoundA = true;
                   }
               
               if( j < A.length && i < B.length && B[i] == A[j] ){
                        
                        isFoundB = true; 
               }

            }

            if(!isFoundA && i < A.length){

                 System.out.println(A[i]);

             }
            
            if(!isFoundB && i < B.length){

                 System.out.println(B[i]);

             }
} 
           
        
    }
    
}
