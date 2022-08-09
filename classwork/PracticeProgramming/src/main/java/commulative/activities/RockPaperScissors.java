/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package commulative.activities;
import java.util.Scanner;
import java.util.Random;
/**
 * @author: Jorge Villa 
 * email: villajorge41@gmail.com
 * Date: 
 * Purpose: 
 * 
 */
public class RockPaperScissors {
    
    
    public  void getPlays(){
        int games = 0;
        int playAgain = 0;
        Scanner scan = new Scanner(System.in); 
        boolean play = true;
        while (play){
            System.out.println("How many games would you like to play?");
            games = scan.nextInt();
            if (games > 0 && games <= 10){
                playGame(games, scan);
            }else{
                System.out.println("Entered invalid number of games.");
                break;
            }
            System.out.println("Would you like to play again?");
            System.out.println("1: yes\n2: no");
            playAgain = scan.nextInt();
            if(playAgain == 2){
                play = false;
            }
        }
        System.out.println("Thanks for playing!");
        
    }
    public void playGame(int num, Scanner scan){
        Random rand = new Random();
        int userChoice = 0;
        int compChoice = 0;
        int wins = 0, loses = 0, draws = 0;
        for (int i = 0; i < num; i++){
            System.out.println("What would you like to play?");
            System.out.println("1: Rock\n2: Paper\n3: Scissors");
            userChoice = scan.nextInt();
            compChoice = rand.nextInt(3)+1;
            if (userChoice == 1){
                switch(compChoice){
                    case 1:
                        System.out.println("Round "+(i+1)+" resulted in a draw");
                        draws++;
                        break;
                    case 2:
                        System.out.println("Round "+(i+1)+" resulted in a loss");
                        loses++;
                        break;
                    case 3:
                        System.out.println("Round "+(i+1)+" resulted in a win");
                        wins++;
                        break;
                }
            }else if (userChoice == 2){
                switch (compChoice){
                    case 1:
                        System.out.println("Round "+(i+1)+" resulted in a win");
                        wins++;
                        break;
                    case 2:
                        System.out.println("Round "+(i+1)+" resulted in a draw");
                        draws++;
                        break;
                    case 3:
                        System.out.println("Round "+(i+1)+" resulted in a loss");
                        loses++;
                        break;
                }
            }else{
                switch (compChoice){
                    case 1:
                        System.out.println("Round "+(i+1)+" resulted in a loss");
                        loses++;
                        break;
                    case 2:
                        System.out.println("Round "+(i+1)+" resulted in a win");
                        wins++;
                        break;
                    case 3:
                        System.out.println("Round "+(i+1)+" resulted in a draw");
                        draws++;
                        break;
                }
            }
        }
        System.out.println("After playing "+num+" games you: ");
        System.out.println("won: "+wins);
        System.out.println("lost: "+loses);
        System.out.println("tied: "+draws);
        if (wins > loses){
            System.out.println("You beat the computer!");
        }else if (wins < loses){
            System.out.println("You lost to the computer!");
        }else if (wins == loses){
            System.out.println("You tied with the computer!");
        }
        
        
    }
}
