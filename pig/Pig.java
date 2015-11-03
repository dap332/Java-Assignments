/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pig;
/*
 * imports Scanner to allow user input
 */
import java.util.Scanner;
/**
 *Objective - Run through a game of Pig
 * Involves Dice
 * CPU keeps rolling dice until the sum of the rolls exceed 19 or until a 1 is rolled
 * 
 * Input- Y/N to roll again
 * Output-Displays dice values and scores. Also ends game when there is a winner
 * and announces winner
 * @author Patel
 */
public class Pig {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     
        /*
         * Strings for player name and computer name
         */
        String Player;
        String Cpu = "Computer";
        
        /*
         * playerScore and cpuScore are the total scores for the players
         * sum is a temporary score that stores the sum of the rolls before being added to the total scores
         */
        int playerScore = 0;
        int cpuScore = 0;
        int sum = 0;
        
        /*
         * Creates 2 new Dice
         * Dice is an object created in a separate class
         * See Dice.java class for more
         */
        Dice d1 = new Dice();
        Dice d2 = new Dice();
        
        //Creates a new Scanner named "s1" to take in user input
        Scanner s1 = new Scanner(System.in);
        
        //boolean that is true when it is the Player's turn
        boolean isPlayerTurn = true;
        
        //Instructs player to enter name and takes the input and sets it as String Player
        System.out.println("Enter your name please");
        Player = s1.nextLine();
      
        //Makes sure game only runs until there is a winner
        while(playerScore < 100 && cpuScore < 100){
            //Runs Player's turn until its no longer Player's turn
            while(isPlayerTurn == true){
                //rolls dice and displays the value of the rolls
                d1.roll();
                d2.roll();
                System.out.println(Player + "'s Turn ");
                System.out.println(d1.get() + " " + d2.get());
                //If the player rolls 2 1's then the turn ends and the score is reset
                if((d1.get() + d2.get()) == 2){
                    playerScore = 0;
                    isPlayerTurn = false;
                    
                    System.out.println("Snake Eyes! Reset Score!");
                    System.out.println();                    
                }
                //If only one of the dice roll a 1 then the turn ends and no additional points are added to the score
                else if((d1.get() == 1) || (d2.get() == 1)){
                    isPlayerTurn = false;
                    
                    System.out.println("You lose your turn!");
                    System.out.println();                    
                }
                else{
                    //If no 1's are rolled the sume of the two dice are added to sum and the player is given an option to roll again
                    sum += d1.get() + d2.get();
                
                    System.out.println("Roll Dice? Y/N");
                        if(s1.nextLine().toLowerCase().equals("n")){
                            isPlayerTurn = false;
                            playerScore += sum;
                            sum = 0;
                        }
                }            
            }
            //if the player scores 100 there is no need for the CPU turn so the game ends
            if(playerScore > 99){
                System.out.println(Player + " Wins!!XD");
                break;
            }
        System.out.println();    
        System.out.println(Cpu + "'s Turn ");            
        
        //Runs CPU's turn repeatedly while the boolean is false
        while(isPlayerTurn == false){
            //rolls both dice
            d1.roll();
            d2.roll();
            //if both dice are 1's the score is reset and it is the Player's turn
                if((d1.get() + d2.get()) == 2){
                    cpuScore = 0;
                    isPlayerTurn = true;
                }
                //If only one 1 is rolled it is the Player's turn and nothing is added to the score
                else if((d1.get() == 1) || (d2.get() == 1)){
                    isPlayerTurn = true;
                }
                else{
                    //if no 1's are rolled the sum of both dice are added to sum
                    //and the CPU keeps rolling until a 1 is rolled or
                    //sum is exceeds or equals 20
                    sum += d1.get() + d2.get();
                
                        if(sum >= 20){
                            isPlayerTurn = true;
                            cpuScore += sum;
                            sum = 0;
                        }
                }
            }    
        //displays CPU's score at the end of each turn
                System.out.println(Player + "'s Score: " + playerScore + "\t" + Cpu + "'s Score: " + cpuScore);
                System.out.println();
                
        }
        //Displays that CPU wins when game ends
        if(cpuScore >= 100){
            System.out.println(Cpu + " Wins!");
        }
    }
}
