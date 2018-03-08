/**
 * Title:     Block
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program has the quantity and price of a block of stocks.
 * 
 */

public class Block
{
   private final int price;
   private int quantity;

   /**
      Constructor.
      @param quantity the quantity of this block.
      @param price the price of this block.
   */
   public Block(int quantity, int price)
   {
      this.price = price;
      this.quantity = quantity;
   }
   
   public int getQuantity() { return quantity; }
   public int getPrice() { return price; }
   public void sell(int shares) { quantity -= shares; }
}
