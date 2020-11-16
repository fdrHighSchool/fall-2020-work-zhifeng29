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
      while (use == true){//until user say "stop" also the main loop
        System.out.println("please enter you equation?");
        String input = in.nextLine();
        if( input.equalsIgnoreCase("stop")){
          use = false;
        }

        String ans = produceAnswer(input);
        System.out.println("The answer is "+ ans);

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
      if (input.contains("stop") == true){
        System.out.println("stop");
        return "stop";
      }

      int end = input.length();

      int space = input.indexOf(" ") + 1;
    //  System.out.println(input.indexOf(" ") + 1);
      String num1 = input.substring(0,space-1);//get first number
      //System.out.println(num1.length());

      int space2 = input.indexOf(" ",1) + 3;
    //  System.out.println(input.indexOf(" ") + 3);
      String num2 = input.substring(space2,end);//second number

      String Operation = input.substring(space,space + 1);//locate substring of the operation


//Checkpoint 2 break down each number into charcter(s)
System.out.println( num1.length());
System.out.println( num2.length());
      String W1,N1,D1,W2,N2,D2;
      if (num1.indexOf("_") >= 0 ){//for have fraction
         W1 = num1.substring(0,num1.indexOf("_"));
         N1 = num1.substring(num1.indexOf("_")+1,num1.indexOf("/"));
         D1 = num1.substring(num1.indexOf("/")+1,num1.length());
        System.out.println( "whole 1: "+W1);
        System.out.println("numerator 1: "+N1);
        System.out.println("denominator 1: "+D1);
      }
      else if (num1.contains("/")) {
         N1 = num1.substring(0,num1.indexOf("/"));
         D1 = num1.substring(num1.indexOf("/")+1);
         W1 = "0";
         System.out.println("numerator 1: "+N1);
         System.out.println("denominator 1: "+D1);
      }
      else {//don't have faction
         W1 = num1.substring(0,num1.length());
         N1 = "0";
         D1 = "1";
        System.out.println("whole 1: "+W1);
      }

      if (num2.indexOf("_") >= 0 ){
         W2 = num2.substring(0,num2.indexOf("_"));
         N2 = num2.substring(num2.indexOf("_")+1,num2.indexOf("/"));
         D2 = num2.substring(num2.indexOf("/")+1);
        System.out.println( "whole 2: "+W2);
        System.out.println("numerator 2: "+N2);
        System.out.println("denominator 2: "+D2);
      }
      else if (num2.contains("/")) {
         N2 = num2.substring(0,num2.indexOf("/"));
         D2 = num2.substring(num2.indexOf("/")+1);
         W2 = "0";
         System.out.println("numerator 2: "+N2);
         System.out.println("denominator 2: "+D2);
      }
      else {
         W2 = num2;
         N2 = "0";
         D2 = "1";
        System.out.println("whole 2: "+W2);
      }
      //Checkpoint3
      int w1  =  Integer.parseInt(W1);
      int n1  =  Integer.parseInt(N1);
      int d1  =  Integer.parseInt(D1);
      int w2  =  Integer.parseInt(W2);
      int n2  =  Integer.parseInt(N2);
      int d2  =  Integer.parseInt(D2);

      n1 = n1 + (w1 * d1);
      n2 = n2 + (w2 * d2);
      System.out.println(n1);
      System.out.println(n2);

       String ans;
      if (Operation.equals("+")){
         ans = addition(n1,d1,n2,d2);
        System.out.println(ans);
      }
      else if (Operation.equals("-")) {
         ans = subraction(n1,d1,n2,d2);
        System.out.println(ans);
      }
      else if (Operation.equals("*")) {
         ans = multiplication(n1,d1,n2,d2);
        System.out.println(ans);
      }
      else if (Operation.equals("/")) {
         ans = division(n1,d1,n2,d2);
        System.out.println(ans);
      }
      else{
        System.out.println("invalid operation");
        return "stop";
      }

      int FinalN = Integer.parseInt(ans.substring(0,ans.indexOf("/")));
      int FinalD = Integer.parseInt(ans.substring(ans.indexOf("/")+1));
      System.out.println(FinalN);
      System.out.println(FinalD);
      int gcd = greatestCommonDivisor(FinalN, FinalD);
      System.out.println(gcd);

      FinalN = FinalN / gcd;
      FinalD = FinalD / gcd;

      System.out.println(FinalN);
      System.out.println(FinalD);
      int FinalW = 0;

      if (FinalN < 0){
        while (Math.abs(FinalN) >= FinalD){
        FinalN = Math.abs(FinalN) - FinalD;
        FinalW--;
        }
      }
      else if (FinalN > 0 ) {
        while (FinalN >= FinalD){
        FinalN = FinalN - FinalD;
        FinalW++;
        }
      }

      System.out.println(FinalW);
      System.out.println(FinalN);
      System.out.println(FinalD);

      if (FinalW == 0){
        return FinalN+"/"+FinalD;
      }
      else if (FinalD == 0 || FinalD == 1){
        return FinalW+"";
      }
      else  {
        return FinalW+"_"+FinalN+"/"+FinalD;
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

        //return "final";
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

      for(int i = 1; i <= a && i <= b; i++){

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
/*
N:
P:
I:
R:
*/
  public static String addition(int n1 ,int d1 , int n2 , int d2){
  int D = d1 * d2;
  int N = (n1 * d2) + (d1 * n2);
  String ans = N + "/" + D;
    return ans;
  }
  public static String subraction(int n1 ,int d1 , int n2, int d2){
    int D = d1 * d2;
    int N = (n1 * d2) - (d1 * n2);
    String ans = N + "/" + D;
      return ans;
  }
  public static String multiplication(int n1 ,int d1 , int n2, int d2){
    int D = d1 * d2;
    int N = n1 * n2;
    String ans = N + "/" + D;
      return ans;
  }
  public static String division(int n1 ,int d1, int n2, int d2){
    int D = n1 * d2;
    int N = d1 * n2;
    String ans = D + "/" + N;
      return ans;
  }

}//end class
