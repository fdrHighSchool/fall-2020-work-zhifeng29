import java.util.Scanner;
import java.lang.Math;
public class FracCalc {
    /**
     * Prompts user for input, passes that input to produceAnswer, then outputs the result.
     * @param args - unused
     */
    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      boolean use = true;
      while (use == true){
        System.out.println("please enter you equation?");
        String input = in.nextLine();
        if( input.equalsIgnoreCase("stop")){
          use = false;
        }

        String ans = produceAnswer(input);
        System.out.println(ans);

        // TODO: Read the input from the user and call produceAnswer with an equation
        // Checkpoint 1: Create a Scanner, read one line of input, pass that input to produceAnswer, print the result.
        // Checkpoint 2: Accept user input multiple times.
      }
    }//end main method

    /**
     * produceAnswer - This function takes a String 'input' and produces the result.
     * @param input - A fraction string that needs to be evaluated.  For your program, this will be the user input.
     *      Example: input ==> "1/2 + 3/4"
     * @return the result of the fraction after it has been calculated.
     *      Example: return ==> "1_1/4"
     */
    public static String produceAnswer(String input){
      int end = input.length();

      int space = input.indexOf(" ") + 1;
    //  System.out.println(input.indexOf(" ") + 1);
      String num1 = input.substring(0,space);
      System.out.println(num1);

      int space2 = input.indexOf(" ",1) + 3;
      //System.out.println(input.indexOf(" ") + 3);
      String num2 = input.substring(space2,end);

//Checkpoint 2
String cp2;
      if (num1.indexOf("_") >= 0 ){
        String WN1 = num1.substring(0,num1.indexOf("_"));
        String N1 = num1.substring(num1.indexOf("_")+1,num1.indexOf("/"));
        String D1 = num1.substring(num1.indexOf("/")+1);
        System.out.println( "whole 1: "+WN1);
        System.out.println("numerator 1: "+N1);
        System.out.println("denominator 1: "+D1);
      }
      else {
        String WN1 = num1;
        System.out.println("whole 1: "+WN1);
      }

      if (num2.indexOf("_") >= 0 ){
        String WN2 = num2.substring(0,num2.indexOf("_"));
        String N2 = num2.substring(num2.indexOf("_")+1,num2.indexOf("/"));
        String D2 = num2.substring(num2.indexOf("/")+1);
        System.out.println( "whole 2: "+WN2);
        System.out.println("numerator 2: "+N2);
        System.out.println("denominator 2: "+D2);
         cp2 = "whole:"+ WN2 + " numerator:" +N2 + " denominator:"+ D2;
      }
      else {
        String WN2 = num2;
        System.out.println("whole 2: "+WN2);
         cp2 = WN2;
      }


        // TODO: Implement this function to produce the solution to the input
        // Checkpoint 1: Return the second operand.  Example "4/5 * 1_2/4" returns "1_2/4".
        // Checkpoint 2: Return the second operand as a string representing each part.
        //               Example "4/5 * 1_2/4" returns "whole:1 numerator:2 denominator:4".
        // Checkpoint 3: Evaluate the formula and return the result as a fraction.
        //               Example "4/5 * 1_2/4" returns "6/5".
        //               Note: Answer does not need to be reduced, but it must be correct.
        // Final project: All answers must be reduced.
        //               Example "4/5 * 1_2/4" returns "1_1/5".

        return cp2;
    }//end produceAnswer method

    // TODO: Fill in the space below with helper methods

    /**
     * greatestCommonDivisor - Find the largest integer that evenly divides two integers.
     *      Use this helper method in the Final Checkpoint to reduce fractions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The GCD.
     */

    public static int greatestCommonDivisor(int a, int b){
      int  gcd = 1;

      for(int i = 1; i <= a && i <= b; i++)  {

      if(a%i==0 && b%i==0)

      gcd = i;
      }

      return gcd;

    }//end greatestCommonDivisor method

    /*
     * leastCommonMultiple - Find the smallest integer that can be evenly divided by two integers.
     *      Use this helper method in Checkpoint 3 to evaluate expressions.
     * @param a - First integer.
     * @param b - Second integer.
     * @return The LCM.
     */
    public static int leastCommonMultiple(int a, int b){
      int lcm = 0;
      if(a == 0|| b==0){
  		    lcm = 0;
  		}
  		else if (a > b && a % b == 0 ) {
  		    lcm = b;
  	  }
  		else if (b > a && b % a == 0) {
  		    lcm = a;

  		}
      else if(a == b){
        lcm = a;
      }


  		else {
  		  lcm = a*b;
  		}



      return lcm;

    }//end leastCommonMultiple

}//end class
