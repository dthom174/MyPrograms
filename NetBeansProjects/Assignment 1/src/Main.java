
public class Main {
    
    public static void main(String[] args){
        
        ArrayBag bagList = new ArrayBag();
        
        //check if the bag is empty
        System.out.println("Empty: " + bagList.isEmpty() + "\n");
        
        //add item to the bag
        bagList.add("Basketball");
        bagList.add("Football");
        bagList.add("Soccer");
        bagList.add("Hockey");
        bagList.add("Rugby");
        bagList.add("Football");
        bagList.add("Tennis");
        bagList.add("Track");
        bagList.add("Football");
        bagList.add("Soccer");
        
        //display the items that are in the bag
        bagList.print();
        System.out.println("");
        
        //count occurence of s in the bag
        System.out.println("Football: " + bagList.count("Football"));
        System.out.println("Tennis: " + bagList.count("Tennis"));
        System.out.println("soccer: " + bagList.count("Soccer"));
        System.out.println("Rugby: " + bagList.count("Rugby") + "\n");
        
        //Remove some items from the bag
        bagList.remove("Tennis");
        bagList.remove("Rugby");
        bagList.remove("Soccer");
        
        //Display the items that are in the bag
        bagList.print();
        System.out.println("");
        
        //count occurence of s in the bag again
        System.out.println("Football: " + bagList.count("Football"));
        System.out.println("Tennis: " + bagList.count("Tennis"));
        System.out.println("soccer: " + bagList.count("Soccer"));
        System.out.println("Rugby: " + bagList.count("Rugby") + "\n");
        
        //check if the bag is empty
        System.out.println("Empty: " + bagList.isEmpty());
    }
    
}
