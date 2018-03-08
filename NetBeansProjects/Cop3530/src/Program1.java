
import java.util.Scanner;


public class Program1 {
    
    public static void main(String[] args){
        
        Scanner scnr = new Scanner(System.in);

        double[][] xy = new double[3][2];
        double area = 0;
        double distanceA = 0;
        double distanceB = 0;
        double distanceC = 0;
      
        for(int i = 1; i <= xy.length; i++){
  
                System.out.println("Enter x" + i);           
                xy[i - 1][0]  = scnr.nextDouble();
                System.out.println("Enter y" + i);
                xy[i - 1][1]  = scnr.nextDouble();  
        }
        
       distanceA = Math.sqrt(Math.pow((xy[1][0] - xy[0][0]),2) + Math.pow((xy[1][1] - xy[0][1]),2));
       distanceB = Math.sqrt(Math.pow((xy[2][0] - xy[0][0]),2) + Math.pow((xy[2][1] - xy[0][1]),2));
       distanceC = Math.sqrt(Math.pow((xy[1][0] - xy[2][0]),2) + Math.pow((xy[2][1] - xy[1][1]),2)); 
       
       area = (distanceA + distanceB + distanceC) / 2;
       System.out.println(area);
    }
    
    
    
}
