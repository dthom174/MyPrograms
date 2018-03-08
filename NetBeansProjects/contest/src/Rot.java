
import java.util.Arrays;
import java.util.Scanner;


public class Rot {
    
    public static void main(String[] args){
        
        Scanner nr = new Scanner(System.in);
        
        int rou = Integer.parseInt(nr.next());
        
        while(rou != 0){
            
            String x = nr.next();
            char[] ty = x.toCharArray();
            
            for(int i = ty.length - 1; i >= 0; --i){
                
                for(int k = 0; k < rou; ++k){
                    
                    if(ty[i] == '.'){
                        
                        ty[i] = 'A';
                        
                    }
                    
                    else if(ty[i] == '_'){
                        
                        ty[i] = '.';
                        
                    }
                    
                    else if(ty[i] == 'Z'){
                 
                        ty[i] = '_';
                    
                    }
                    
                    else{
                        
                        ++ty[i];
                        
                    }
                    
                }
                
                System.out.print(ty[i]);
               
            }
             System.out.println();
             //End
             rou = Integer.parseInt(nr.next());
        }
        
    }
    
}
