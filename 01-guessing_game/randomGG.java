import java.util.*;
public class Main
{
	public static void main(String[] args) {

  Scanner in = new Scanner(System.in);
    System.out.println("What is the minimum number you want to guess to?");
    int min = in.nextInt();
    System.out.println("What is the maximum number you want to guess to?");
    int max = in.nextInt();

		final int NUMBER = ((int)(Math.random() * max)+1);
   String ans = null;
   int guess = 0;
   int guesses = 0;
   String help = null;
   boolean winGame = false;

   while (winGame != true){//main loop //3
     System.out.printf("What is your guess?(%d - %d) ",min,max);
     if (guesses % 4 == 0 && guesses > 3){//4 //hint shows up every 4 loop
       System.out.println("press any not number character to get hints");}

     ans = in.next();//input string

     boolean convertible = isInteger(ans);

     if (convertible == false ){//4
     System.out.println("type 'h' to know if the number is even or odd");
     System.out.println("type 'f' to know first character of the random number");
     System.out.println("type 'a' to give up and show answer");
     help = in.next();
     if (help.equals("h".toLowerCase())){//5 (lowercase dont work)
        if (NUMBER % 2 == 0){//6
          System.out.println("the random number is even");
         }
        else{//6
          System.out.println("the random number is odd");
          }

      }
       else if (help.equals("f")){//5
         int first = NUMBER;
         while (first > 9  ){//6
           first = first / 10;
         }
        System.out.println("The first letter is "+ first);
       }

       else if (help.equals("a")){//5
         System.out.printf("The answer is " + NUMBER + " and you have %d attempt(s)",guesses); //use of fprint
         System.exit(0);//stop progarm
     }
       else{//5
         System.out.println("not a valid answer");
     }

     }//4

     else if (convertible == true ){//4
      guess = Integer.parseInt(ans);

      guesses++;
      if (guess<NUMBER){//5
       System.out.println("Too Low!");
       min = guess + 1;
       }
     else if(guess>NUMBER){//5
        System.out.println("Too High!");
        max = guess - 1;
       }
     else if (guess == NUMBER){//5
       System.out.println("Congratulation!");
       winGame = true;
       }
     }//4
   }//3 main
   System.out.println("Good Job! The correct answer was " + NUMBER + ", It took you " + guesses + " tries.");
   in.close();
   }//2

 public static boolean isInteger (String x){//2
      try {
          Integer.parseInt( x );
        return true;
      }
      catch( Exception e ) {
          return false;
          }
    }//2
}//1
