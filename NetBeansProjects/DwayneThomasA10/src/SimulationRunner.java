/**
 * Title:     SimulationRunner
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program runs the Stock Trading Simulation 
 * 
 */

import java.util.Scanner;

public class SimulationRunner
{
   public static void main(String[] args)
   {
      StockSimulator sim = new StockSimulator();

      Scanner in = new Scanner(System.in);
      boolean done = false;
      System.out.println("Stock Simulator Menu");
      System.out.println("-----------------------------------------------");
      System.out.println(" > buy stock-symbol quantity price");
      System.out.println(" > sell stock-symbol quantity price");
      System.out.println(" > quit to quit simulation.");
      System.out.println();
      
      while (!done)
      {
         System.out.print(" > ");
         String action = in.next();
         if (action.equals("buy"))
         {
            String symbol = in.next();
            int quantity = in.nextInt();
            int price = in.nextInt();
            sim.buy(symbol, quantity, price);
         }
         else if (action.equals("sell"))
         {
            String symbol = in.next();
            int quantity = in.nextInt();
            int price = in.nextInt();
            sim.sell(symbol, quantity, price);
         }
         else if (action.equals("quit"))
         {
            done = true;
         }
      }
   }
}
