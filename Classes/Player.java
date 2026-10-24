package blue;
import java.util.Scanner;
public class Player {
    //level
    String playerName;
    int playerAge;
    private int Level = 1, expPoints = 0;
    char details_Verifier;
    //Player Base Stats
    private int healthPoints = 20, phy_Attack = 10, 
            phy_Defense = 10, en_Points = 10, 
            en_DefensePoints = 10, speedPoints = 15;
    //Status
//    private boolean isAlive = true;
    
//    void player_Stats(String playerName){
//        this.playerName=playerName;
//        this.age=age;
//        this.isAlive=true;
//    }
    
    void userInput(){
        Scanner scan=new Scanner(System.in);
        
        do{
            System.out.print("Please your name, Player: \t");
            playerName = scan.nextLine();
            System.out.print("How old are you? \t");
            playerAge = scan.nextInt();
            scan.nextLine();
            
            System.out.println("-----Player Details-----");
            System.out.println("Name: " + playerName + "\nAge: " + playerAge + "\n");

            System.out.print("Is this correct?[y/n]: ");
            details_Verifier = scan.next().charAt(0);
            
            switch (details_Verifier) {
                case 'y':
                case 'Y':
                    System.out.println("Welcome to the Night City, " + 
                            playerName + "!");
                    break;
                case 'n':
                case 'N':
                    System.out.print("Please re-enter your details");
                    break;
                default:
                    System.out.print("Invalid input, please try again");
                    break;
            }
        }while(details_Verifier!='y');
    }
    
}
