import java.util.Scanner;
import java.lang.Math;
public class FracCalc {

    public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      boolean use = true;
      while (use == true){//until user say "stop" also the main loop
        System.out.println("please enter you equation?");
        String input = in.nextLine();
        if( input.equalsIgnoreCase("stop")){
          use = false;
          System.out.println("you stop the calculator");
        }
        else{
        String ans = produceAnswer(input);
        System.out.println("The answer is "+ ans);
        }
      }
    }//end main method


    public static String produceAnswer(String input){
      if (input.contains("stop")){

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


//Checkpoint 2 break down each number into charcter(s)1

      String W1,N1,D1,W2,N2,D2;
      if (num1.indexOf("_") >= 0 ){//for have fraction
         W1 = num1.substring(0,num1.indexOf("_"));
         N1 = num1.substring(num1.indexOf("_")+1,num1.indexOf("/"));
         D1 = num1.substring(num1.indexOf("/")+1,num1.length());
        //System.out.println( "whole 1: "+W1);
        //System.out.println("numerator 1: "+N1);
        //System.out.println("denominator 1: "+D1);
      }
      else if (num1.contains("/")) {
         N1 = num1.substring(0,num1.indexOf("/"));
         D1 = num1.substring(num1.indexOf("/")+1);
         W1 = "0";
         //System.out.println("numerator 1: "+N1);
         //System.out.println("denominator 1: "+D1);
      }
      else {//don't have faction
         W1 = num1.substring(0,num1.length());
         N1 = "0";
         D1 = "1";
        //System.out.println("whole 1: "+W1);
      }

      if (num2.indexOf("_") >= 0 ){
         W2 = num2.substring(0,num2.indexOf("_"));
         N2 = num2.substring(num2.indexOf("_")+1,num2.indexOf("/"));
         D2 = num2.substring(num2.indexOf("/")+1);
         // System.out.println( "whole 2: "+W2);
         //  System.out.println("numerator 2: "+N2);
         //  System.out.println("denominator 2: "+D2);
      }
      else if (num2.contains("/")) {
         N2 = num2.substring(0,num2.indexOf("/"));
         D2 = num2.substring(num2.indexOf("/")+1);
         W2 = "0";
         //System.out.println("numerator 2: "+N2);
         //System.out.println("denominator 2: "+D2);
      }
      else {
         W2 = num2;
         N2 = "0";
         D2 = "1";
        //System.out.println("whole 2: "+W2);
      }// all good up to this
      //Checkpoint3
      int w1  =  Integer.parseInt(W1);
      int n1  =  Integer.parseInt(N1);
      int d1  =  Integer.parseInt(D1);
      int w2  =  Integer.parseInt(W2);
      int n2  =  Integer.parseInt(N2);
      int d2  =  Integer.parseInt(D2);

      if (W1.contains("-")){// change mix or whole number into  inporper fraction
        n1 = (w1 * d1) - n1;
      }
      else{
        n1 = (w1 * d1) + n1;
      }

      if (W2.contains("-")){
        n2 = (w2 * d2) - n2;
      }
      else{
        n2 = (w2 * d2) + n2;
      }

       String ans;
      if (Operation.equals("+")){
         ans = addition(n1,d1,n2,d2);

      }
      else if (Operation.equals("-")) {
         ans = subraction(n1,d1,n2,d2);

      }
      else if (Operation.equals("*")) {
         ans = multiplication(n1,d1,n2,d2);

      }
      else if (Operation.equals("/")) {
         ans = division(n1,d1,n2,d2);

      }
      else{
        System.out.println("invalid operation");
        return "stop";
      }

      int FinalN = Integer.parseInt(ans.substring(0,ans.indexOf("/")));
      int FinalD = Integer.parseInt(ans.substring(ans.indexOf("/")+1));

      int gcd = greatestCommonDivisor(Math.abs(FinalN), Math.abs(FinalD));
      //System.out.println("gcd =" +gcd);

      FinalN = FinalN / gcd;
      FinalD = FinalD / gcd;


      int FinalW = 0;

      if (FinalN < 0){
        while (Math.abs(FinalN) >= Math.abs(FinalD)){
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


      if (FinalW == 0 && FinalN == 0){
        return FinalW+"";
      }
      else if (FinalW == 0){
        return FinalN+"/"+FinalD;
      }
      else if (FinalD == 0 || FinalD == 1){
        return FinalW+"";
      }
      else  {
        return FinalW+"_"+FinalN+"/"+FinalD;
      }


    }//end produceAnswer method

    public static int greatestCommonDivisor(int a, int b){
      int  gcd = 1;

      for(int i = 1; i <= a && i <= b; i++){

        if(a%i==0 && b%i==0){

        gcd = i;
        }
      }
      return gcd;

    }//end greatestCommonDivisor method

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
    int N = n1 * d2;
    int D = d1 * n2;
    if (D < 0 ){// in case denominator is negative
      N = N * -1;
      D = D * -1;
    }
    String ans = N + "/" + D;
      return ans;
  }

}//end class
