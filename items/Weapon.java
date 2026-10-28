package blue.items;

import java.util.List;

public class Weapon extends Item{
    int damage;

    public Weapon(String name, String type, String desc, int size, int sellPrize, int shopPrize, int damage){
        super(name, type, desc, size, sellPrize, shopPrize);
        this.damage=damage;
    }

    @Override
    public double sell(List<String> shopInventory, List<String> playerInventory, String itemName, double sellPrize, int amount, double playerBalance){
        return super.sell(shopInventory, playerInventory, itemName, sellPrize, amount, playerBalance);
    }
    
    @Override
    public double buyShop(List<String>playerInventory, String itemName, double shopPrize, int amount, double playerBalance){
        return super.buyShop(playerInventory, itemName, shopPrize,amount, playerBalance);
    }
}
