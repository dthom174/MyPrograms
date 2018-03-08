
public class Recursion {

    public static void main(String[] args) {

        Recursion main = new Recursion();

    }
    
    public Recursion(){
        
        System.out.println(factorial(10)); //(n!)
        System.out.println(factorial(7)); //(n!)
        System.out.println(prob17_02(5)); //formula (2n + 3)
        System.out.println(prob17_03(7)); //fibonacci
        int[] g = {2,5,4,3};
        PrintArrayBack(g);
    }

    long factorial(int n) {

        if (n == 1) {

            return 1;
            
        } else {

            return n * factorial(n - 1);
        }

    }
    
    long prob17_02(int k){
        
        if( k == 0){
            
            return 1;
            
        }
        
        else{
            
            return 2 * prob17_02(k - 1) + 3;
        }
        
    }
    
    long prob17_03(int v){
        
        if(v == 1){
            
            return 1;
        }
        
        else if(v == 0){
            
            return 0;
        }
        
        else{
            
            return prob17_03(v - 1) + prob17_03(v - 2);
        }
        
    }
    
    void PrintArrayBack(int[] b){
        
        Print(b,b.length - 1);
    }
    
    void Print(int[] b, int pos){
       
        System.out.println(b[pos]);
        if(pos != 0){
            
            Print(b, pos - 1);
        }
        
    }
    
}
