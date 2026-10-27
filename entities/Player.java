package blue.entities;

/**
 *
 * @author pixll
 */
import java.util.Scanner;

import blue.items.inventory;

public class Player extends inventory{
    Scanner scan=new Scanner(System.in);
    //PLlayer Details
    String playerName;
    int playerAge;
     //Level
    private int level = 1, expPoints = 0;
    //Player Base Stats
    private int healthPoints = 20, phyAttack = 10, 
            phyDefense = 10;
    private int enAttackPoints = 10, enDefensePoints = 10, 
            speedPoints = 15;
    
    public void getDetails(){
        char detailsVerifier;
        
        do{
            System.out.print("Please your name, Player: \t");
            playerName = scan.nextLine();
            
            while(true){
                try {
                    System.out.print("How old are you? \t");
                    playerAge = scan.nextInt();
                    if(playerAge<=0){
                        System.out.println("You're " + playerAge + 
                                " years old? dude seriously?");
                        System.exit(0);
                    }else if (playerAge < 15) {
                        System.out.println("You're too young kiddo");
                        System.exit(0);
                    }
                    break;
                }catch(Exception e){
                    System.out.println("Invalid input, "
                            + "please enter numbers only");
                    break;
                }
            }
            
            System.out.println("-----Player Details-----");
            System.out.println("Name: " + playerName + 
                    "\nAge: " + playerAge + "\n");

            System.out.print("Is this correct?[y/n]: ");
            detailsVerifier = scan.next().charAt(0);
            
            switch (detailsVerifier) {
                case 'y':
                case 'Y':
                    System.out.println("\nWelcome to the Night City, " + 
                            playerName + "!");
                    break;
                case 'n':
                case 'N':
                    System.out.print("Please re-enter your details\n");
                    break;
                default:
                    System.out.print("Invalid input, please try again");
                    break;
            }
            scan.nextLine();
        }while(detailsVerifier!='y' && detailsVerifier!='Y');

        scan.close();
    }
    
    public void displayDetails(){
        System.out.println("-----Player Details-----");
        System.out.println("Name: " + playerName + "\nAge: " + playerAge);
        System.out.println("Level: "+ level + "\nEXP Points: " + expPoints);
        System.out.println("-----Player Stats-----");
        System.out.println("Health: "+ healthPoints +
                            "\nAttack: " + phyAttack +
                            "\nDefense: " + phyDefense +
                            "\nEN Points: " + enAttackPoints +
                            "\nEN Defense: " + enDefensePoints +
                            "\nSpeed: " + speedPoints);

    }

    //from player
    int p1_phyDamage(int p1_phyAtk, int enem_Hp, int enem_phyDef){
        int phyDamage= enem_Hp - (p1_phyAtk/enem_phyDef);
            
        return phyDamage;
    }
    int p1_enDamage(int p1_enAtk, int enem_Hp, int enem_enDef){
        int enDamage= enem_Hp - (p1_enAtk/enem_enDef);

        return enDamage;
    }

    //from enemy
    int getEnem_phyDamage(int enem_phyAtk, int p1_Hp, int p1_phyDef){
        int enem_phydamage= p1_Hp - (enem_phyAtk/p1_phyDef);

        return  enem_phydamage;
    }
    int getEnem_enDamage(int enem_enAtk, int p1_Hp, int p1_enDef){
        int enem_enDamage= p1_Hp - (enem_enAtk/p1_enDef);

        return  enem_enDamage;
    }

    void movement(){
        
    }


}