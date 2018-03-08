import java.util.ArrayList;

public class ShoppingCart {
    
    private String customerName;
    private String currentDate;
    ArrayList<ItemToPurchase> cartItems;
    
    public ShoppingCart(){
        
        customerName = "none";
        currentDate = "January 1,2016";
        cartItems = new ArrayList<>();
    }
    
    public ShoppingCart(String name, String date){
        
        customerName = name;
        currentDate = date;
        cartItems = new ArrayList<>();
    }
    
    public String getCustomerName(){
        
        return customerName;
    }
    
    public String getDate(){
        
        return currentDate;
    }
    
    public void addItem(ItemToPurchase item){
        
        
        cartItems.add(item);
    }
    
    public void removeItem(String name){
        
        for(int i = 0; i < cartItems.size(); ++i){
            
            if((cartItems.get(i).getName()).equals(name)){
                
                cartItems.remove(i);
                break;
            }
            
            else{
                
                if(i == cartItems.size() - 1){
                    
                    System.out.println("Item not found in cart.Nothing removed.");
                    
                }
                
            }
            
        }
    }
    
    public void modifyItem(ItemToPurchase item){
        
        for(int i = 0; i < cartItems.size(); ++i){
            
            if(cartItems.get(i).getName().equals(item.getName())){
                
                if(!cartItems.get(i).getName().equals("none")){
                    
                    cartItems.get(i).setName(item.getName());
                    cartItems.get(i).setQuantity(item.getQuantity());
                    cartItems.get(i).setPrice(cartItems.get(i).getPrice());
                            
                }
            }
            
            else{
                
                if(i == cartItems.size() - 1){
                    
                    System.out.println("Item not found in cart. Nothing modified");
                    
                } 
            }
        }
        
    }
    
    public int getNumItemsInCart(){
        
        int quan = 0;
        
        for(int i = 0; i < cartItems.size(); ++i){
            
            quan += cartItems.get(i).getQuantity();
            
        }
        
        return quan;
    }
    
    public int getCostOfCart(){
        
        int totalCost = 0;
        
        for(int i = 0; i < cartItems.size(); ++i){
            
            totalCost += cartItems.get(i).getPrice() * cartItems.get(i).getQuantity();
            
        }
        
        return totalCost;
    }
    
    public void printTotal(){
        
        int totalQuantity = 0;
        
        if(!cartItems.isEmpty()){
            
            System.out.println(customerName + "'s Shopping Cart - " + currentDate + 
                    "\nNumber of Items: " + getNumItemsInCart() + "\n");
            
            for(int i = 0; i < cartItems.size(); ++i){
             
               cartItems.get(i).printItemCost();
                
            }
            
            System.out.println("\nTotal: $" + getCostOfCart());
            
        }
        
        else{
            
            System.out.println("SHOPPING CART IS EMPTY");
            
        }
        
    }
    
    public void printDescription(){
        
        System.out.println(customerName + "'s Shopping Cart - " + currentDate + "\nItem Descriptions");
        for(ItemToPurchase item : cartItems){
        
            item.printItemDescription();
            
        }
        
    }
    
}
