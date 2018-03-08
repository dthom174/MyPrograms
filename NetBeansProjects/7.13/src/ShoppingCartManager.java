import java.util.Scanner;

public class ShoppingCartManager {
    
    static Scanner scnr = new Scanner(System.in);
    
    public static void main(String[] args){
        
        System.out.println("Enter Customer's Name:");
        String name = scnr.nextLine();
        
        System.out.println("Enter Today's Date:");
        String date = scnr.nextLine();
        
        ShoppingCart shoppingCart = new ShoppingCart(name,date);
        System.out.println("\nCustomer Name: " + shoppingCart.getCustomerName() + "\nToday's Date: " + shoppingCart.getDate());
        
        printMenu(shoppingCart);
        
    }
    
    public static void printMenu(ShoppingCart shoppingCart){
        
        char opt = ' ';
        String itemName = " ";
        String itemDescription = " ";
        int price = 0;
        int quantity = 0;
        
        do{
        System.out.println("");
        System.out.println("MENU\n" + "a - Add item to cart\n" + "d - Remove item from cart\n" +
                "c - Change item quantity\n" + "i - Output items' descriptions\n" + "o - Output shopping cart\n" +
                "q - Quit\n\n" + "Choose an option");
         
        opt = scnr.next().charAt(0);
        
        switch(opt){
            
            case 'a':
                scnr.nextLine();
                System.out.println("ADD ITEM TO CART\n" + "Enter the item name:");
                itemName = scnr.nextLine();
                System.out.println("Enter the item description:");
                itemDescription = scnr.nextLine();
                System.out.println("Enter the item price:");
                price = scnr.nextInt();
                System.out.println("Enter the item quantity:");
                quantity = scnr.nextInt();
                ItemToPurchase item = new ItemToPurchase(itemName,itemDescription,price,quantity);
                shoppingCart.addItem(item);
                break;
                
           case 'd':
               scnr.nextLine();
               System.out.println("REMOVE ITEM FROM CART\n" + "Enter name of item to remove:");
               shoppingCart.removeItem(scnr.nextLine());
               break;
               
           case 'c':
               scnr.nextLine();
               ItemToPurchase jj = new ItemToPurchase();
               System.out.println("CHANGE ITEM QUANTITY\n" + "Enter the item name:");
               jj.setName(scnr.nextLine());
               System.out.println("Enter the new quantity:");
               jj.setQuantity(scnr.nextInt());
               shoppingCart.modifyItem(jj);
               break;
               
           case 'i':
               System.out.println("OUTPUT ITEM'S DESCRIPTIONS");
               shoppingCart.printDescription();
               break;
               
           case 'o':
               System.out.println("OUTPUT SHOPPING CART");
               shoppingCart.printTotal();
               break;
               
           default:
               break;
            
        } 
       }while(opt != 'q');
        
    }
    
}
