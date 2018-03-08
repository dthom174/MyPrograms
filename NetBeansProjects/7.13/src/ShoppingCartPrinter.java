
import java.util.Scanner;

public class ShoppingCartPrinter {
    
    public static void main(String[] args){
        
        Scanner scnr = new Scanner(System.in);
        ItemToPurchase stuff = new ItemToPurchase();
        
        String fin = "TOTAL COST\n";
        int totalPrice = 0;
        int price = 0;
        
        for(int i = 1; i <= 2; ++i){
          
            System.out.println("Item " + i + "\nEnter the item name:");
            stuff.setName(scnr.nextLine());
            
            System.out.println("Enter the item price:");
            stuff.setPrice(scnr.nextInt());
            
            System.out.println("Enter the item quantity:");
            stuff.setQuantity(scnr.nextInt());
            
            price = stuff.getPrice() * stuff.getQuantity();
            totalPrice += price;
            
            fin += stuff.getName() + " " + stuff.getQuantity() + " @ $" + stuff.getPrice() +
                    " = $" + price + "\n";
           
            if(i != 2){
              scnr.nextLine();  
            }
            System.out.println("");
            
        }
        
        fin += "\nTotal: $" + totalPrice;
        System.out.println(fin);
        
    }
    
}
