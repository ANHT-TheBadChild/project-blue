package blue.items;

import java.util.List;

/**
 *
 * @author pixll
 */
public class Item extends Inventory{
    String name, type, desc;
    int size;
    double sellPrize, shopPrize;

    //constructor
    public Item(String name, String type, String desc, int size, double sellPrize, double shopPrize){
        this.name=name;
        this.type=type;
        this.desc=desc;
        this.size=size;
        this.sellPrize=sellPrize;
        this.shopPrize=shopPrize;
    }


    public double sell(List<String> shopInventory, List<String> playerInventory, String itemName, double sellPrize, int amount, double playerBalance){
        double totalSell= sellPrize*amount;

        if(totalSell<=playerBalance && shopInventory.contains(itemName)){
            System.out.println("You've sold " + amount + " " + itemName);
            return playerBalance+=totalSell;
        }else{
            System.out.print("Insufficient Balance, please come back later");
            return 0;
        }
    }

    public double buyShop(List<String>playerInventory, String itemName, 
            double shopPrize, int amount, double playerBalance){
        double totalBuy= shopPrize*amount;

        if(totalBuy<=playerBalance && playerInventory.contains(itemName)){
            System.out.println("You've bought " + amount + " " + itemName);
            playerInventory.remove(itemName);
            return playerBalance-=totalBuy;
        }else if(!playerInventory.contains(itemName)){
            System.out.println("You do not have this item");
            return 0;
        }else{
            System.out.print("Insufficient Balance, please come back later");
            return 0;
        }
    }
}
