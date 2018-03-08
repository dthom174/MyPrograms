/**
 * Title:     StockSimulator
 * Semester: COP 3337- Summer 2017
 * @author   Dwayne Thomas
 * 
 * I affirm that this program is entirely my own work
 * and none of it is the work of any other person.
 * 
 * This program is used for simulating trading a single stock at varying prices.
 * 
 */

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Map;
import java.util.TreeMap;

public class StockSimulator {

    private Map<String, Queue<Block>> blocks;

    /**
     * Constructor.
     */
    public StockSimulator() {
        blocks = new TreeMap<>();

    }

    /**
     * Handle a user buying a given quantity of stock at a given price.
     *
     * @param symbol
     * @param quantity how many to buy.
     * @param price the price to buy.
     */
    public void buy(String symbol, int quantity, int price) {
        
        //initialize the stock
        Queue<Block> stock = new LinkedList<Block>();

       /* if there exist the same symbol in the map, add the new quantity and
        * price to the same list
        */
        if (blocks.containsKey(symbol)) {

            Queue<Block> cv = blocks.get(symbol);
            stock.add(cv.peek());

        }

        stock.add(new Block(quantity, price));
        
        //finally insert the list into the map
        blocks.put(symbol, stock);

    }

    /**
     * Handle a user selling a given quantity of stock at a given price.
     *
     * @param symbol the stock to sell
     * @param quantity how many to sell.
     * @param price the price to sell.
     */
    public void sell(String symbol, int quantity, int price) {

        //Symbol name
        String nextSymbol = "";

        //Searching for the symbol in the map
        for (String findSymbol : blocks.keySet()) {

            if (findSymbol.equals(symbol)) {

                nextSymbol = symbol;
                break;

            }

        }
       
        // first check if the symbol exist in the map
        if (!nextSymbol.isEmpty()) {

            int gain = 0;

            //Scanning the Queue list of the Stock symbol
            Queue<Block> bo = blocks.get(nextSymbol);
            Iterator<Block> it = bo.iterator();

            while (it.hasNext() && quantity != 0) {

                Block go = it.next();
                
                //check if the symbol has any quantity left
                if (go.getQuantity() > 0) {

                    //calculating the gain(total profit)
                    if (go.getQuantity() < quantity) {

                        gain += (go.getQuantity() * price) - (go.getQuantity() * go.getPrice());
                        quantity -= go.getQuantity();
                        go.sell(go.getQuantity());

                    } else if (go.getQuantity() >= quantity) {

                        gain += (quantity * price) - (quantity * go.getPrice());
                        go.sell(quantity);
                        quantity = 0;

                    }

                }

            }
            
            //check if the gain is a negative number(This means that there was a lost)
            if (gain < 0) {

                System.out.println("----GAIN = $0" + " (You lost $" + Math.abs(gain) + " )");

            } else {

                System.out.println("----GAIN = $" + gain);

            }

        } else {

            System.out.println("STOCK-SYMBOL not found!");

        }

    }
}
