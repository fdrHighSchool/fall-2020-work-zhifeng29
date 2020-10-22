
//Zhi Feng
import java.util.*;

class Main {//1
  public static void main(String[] args) {//2
    // greet the user of your with a certain
    // amount of base coins to their bank (can be random or fixed)
    //Random rng = new Random();
    Scanner in = new Scanner(System.in);
    System.out.println("You have 500 coins in your bank.");
    boolean playing = true;
    int totalCoins = 500;
    int item = 0;

    //create a looping structure that allows the user to play until they choose to quit

    // 1. play
    // 2. shop
    // 3. quit
    while (playing  ){//3
      System.out.println("What do you want to do \ntype 1 to play \ntype 2 to shop \ntype 3 to quit");
      int input = in.nextInt();

      if (input == 1){
      int earnedCoin = play();
      totalCoins += earnedCoin;
      System.out.println("you have "+ totalCoins +" in your bank");
      }

      else if (input == 2){
      int UsedCoin = shop(totalCoins);
      totalCoins -= UsedCoin;

      System.out.println("You have "+ totalCoins +" in your bank");
      }

      else if (input == 3){
      //break;
      playing = false;
      //System.exit(0);
     }

   }//end of while loop



   in.close();
 }//end main method


  /*
   * Name: play
   * Purpose: simulate a round of the game, award the user a random amount of coins for playing
   * Input: none
   * Return: a random number of coins the user won that round
   */
   public static int play () {//2
    // generate random coins from 1 - 100
    int coins = ((int)(Math.random() * 100 )+1);
    return coins;
  }
  /*
   * Name: shop
   * Purpose: allow the player to spend coins
   * Input: how much player spend
   * Return: how many coins spent
   */
  public static int shop (int totalCoins) {//2
    Scanner input = new Scanner(System.in);
    System.out.println("How much do you want to spend?");
    int amount = input.nextInt();

    if (amount <= totalCoins){

      return amount;
    }
    else {
      System.out.println("insufficient amount of coins");
      return 0;
    }


  }
}//end class1
