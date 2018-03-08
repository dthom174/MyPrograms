
import java.util.Scanner;

public class code {
 
    public static void main(String []args){
        
        Scanner scnr =  new Scanner(System.in);
        
        
        while(scnr.hasNext()){
        
        String first = scnr.next();
        String second = scnr.next();
        String third = scnr.next();
        
        String year = "";
        String day = "";
        String month = "";
        char sep = '.';
        
        /* check input
        System.out.println(first);
         System.out.println(second);
          System.out.println(third);*/
          
         // scan input format            
             for(int i = 0; i < second.length(); ++i){
                 
                 char k = second.charAt(i);
                 
                 if(k == 'm'){
                     
                     month = first.substring(i, i + 2);
                      i += 2;
                 }
                 
                 else if(k == 'd'){
                     
                     day  =  first.substring(i, i + 2);
                     
                     i += 2;
                 }
                 
                 else if(k == 'y'){
                     
                     year = first.substring(i, i + 4);
                     i += 4;
                    
                    }
                 }
             
             //convert format             
             for(int i = 0; i < third.length(); ++i){
                 
                 char k = third.charAt(i);
                 
                 if(k == 'm'){
                     
                     i += 2;
                     System.out.print(month);
                     if(i < third.length()){
                         System.out.print(third.charAt(i));
                     }
                 }
                 
                 else if(k == 'd'){
                     
                     i += 2;
                     System.out.print(day);
                     
                     if(i < third.length()){
                         System.out.print(third.charAt(i));
                     }
                 }
                 
                 else if(k == 'y'){
  
                     i += 4;
                     System.out.print(year);
                     
                     if(i < third.length()){
                         System.out.print(third.charAt(i));
                     }
                    }
                 }
                 
                 System.out.println();
                }   
             } 
    }

