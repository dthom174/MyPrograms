
public class ArrayPrep {
 
    public static void main(String args[]){
        
        double[] a = new double[5];
        
        for(int i = 0; i < a.length; ++i){
            
            a[i] = Math.pow(2,i);
                    
        }
        
        String s = "";
         
        for(int i = 0; i < a.length; ++i){
            
            s = s + (int)a[i] + "\n";
            
        }
        
        System.out.println(s);
        
        
    }
    
}
