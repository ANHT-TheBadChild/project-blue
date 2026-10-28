package blue.world;

/**
 *
 * @author pixll
 */
import blue.entities.Player;
import blue.items.Weapon;

public class Game {
    public static void main(String args[]){
        Player player1 = new Player();
        Weapon knife = new Weapon("Regular Knife", "Weapon", "Sample desc", 
            3, 70, 100, 25);
        
        player1.getDetails();
        player1.displayDetails();

        knife.sell(null, null, null, 0, 0, 0);
        knife.buyShop(null, null, 0, 0, 0);
    }
}
