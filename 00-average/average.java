import java.util.Scanner;
class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int total = 0;
    int times = 0;
    boolean finish = false;
    while (finish == false){
      System.out.println("enter intager to add number and any non intager to show average");
      String ans = in.next();

      boolean convertible = isInteger(ans);
      if (convertible == true){
       int num = Integer.valueOf(ans);
       total = total + num;
       times++;
      }
      else{
        finish = true;
      }


    }
     System.out.printf("the average of %d number(s) is %d", times,total/times);
  }
  public static boolean isInteger (String x){//2
   try {
      Integer.parseInt( x );
      return true;
     }
   catch( Exception e ) {
         return false;
         }
  }//2
}
