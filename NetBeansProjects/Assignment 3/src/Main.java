
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Random;

import java.util.Arrays;

public class Main {
    
    public static void main(String[] args){
        
        String outputFilename = "output.csv";
        
        PrintWriter output = null;
        //open output stream
        try
        {
            output = new PrintWriter(new FileWriter(outputFilename));
        } catch (IOException ex)
        {
            System.exit(1);
        }
        
        output.println("size" + ", " + "BubbleSort Time" + ", " + "Selection Time" + ", " + "Quicksort Time");
            
        Random rnd = new Random();
        
        for(int n = 10; n <= 100000; n *= 10){
            
            int[] list = new int[n];
            
            //input random values into array
            for(int i = 0; i < n; ++i){
                
                list[i] = rnd.nextInt(n);
                
              }

                 //Selection
                Date current = new Date();
                long startTime = current.getTime();
                
                Selection p = new Selection(list);
                
                current = new Date();
                long stopTime = current.getTime();
                long selectionTime = stopTime - startTime;
                
                //BubbleSort
                current = new Date();
                startTime = current.getTime();
                
                Bubblesort y = new Bubblesort(list);
                
                current = new Date();
                stopTime = current.getTime();
                long bubbleSortTime = stopTime - startTime;
                
                //QuickSort
                current = new Date();
                startTime = current.getTime();
                
                Quicksort x = new Quicksort(list);
                
                current = new Date();
                stopTime = current.getTime();
                long quickSortTime = stopTime - startTime;
                
                output.println(n + ", " + bubbleSortTime + ", " + selectionTime + ", " + quickSortTime);
   
        }
        
        //close output stream
        output.close();
        
    }
    
}
