package blue.world;

/**
 *
 * @author pixll
 */
import blue.entities.Player;

public class Game {
    public static void main(String args[]){
        Player player1 = new Player();
        
        player1.getDetails();
        player1.displayDetails();
    }
}
