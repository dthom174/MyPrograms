
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Mirror {
    
    public static void main(String[] arg) throws FileNotFoundException{
       
        Scanner nr = new Scanner(System.in);
        
        int time = nr.nextInt();
        
        for(int i = 1; i <= time; ++i){
            
            int row = Integer.parseInt(nr.next());
            int col = Integer.parseInt(nr.next());
            
            String y = "";
            
            for(int j = 0; j <= row; ++j){
                
                y += nr.nextLine();
                
            }
            System.out.println("TEST " + i);
            
            char[] fin = y.toCharArray();
            
            int num = fin.length - 1;
            
            for(int k = row; k > 0; --k){
                
                for(int u = col; u > 0; --u){
                    
                    
                    System.out.print(fin[num]);
                    --num;
                }
                
                System.out.println();
                
            }
            
        }
        
    }
    
    
    
    
}