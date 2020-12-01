import java.util.*;
import java.io.*;
/*part one
public class main{
  public static void main(String[] args) {
    int total = 0;
    try{
      Scanner in = new Scanner(new File("data.txt"));

      while(in.hasNext()){
      int mass = Integer.parseInt(in.next());

      int fuel = (mass/3)-2;
      total = total + fuel;
      System.out.println(total);
      }//end while loop
      System.out.println("the sum of the fuel requirements is "+total);
      in.close();
    }//end try

    catch(Exception e){
      System.out.println("something went wrong");
    }//end catch
  }//end main method


}//end class
*/
public class main{
  public static void main(String[] args) {
    int total = 0;
    try{
      Scanner in = new Scanner(new File("data.txt"));

      while(in.hasNext()){
        int mass = Integer.parseInt(in.next());
        int fueltotal = 0;
        while(mass/3-2 > 0){
          int fuel = (mass/3)-2;
          mass = fuel;
          fueltotal += fuel;
        }
      total = total + fueltotal;
      //System.out.println(total);
      }//end while loop
      System.out.println("the new sum of the fuel requirements is "+total);
      in.close();
    }//end try

    catch(Exception e){
      System.out.println("something went wrong");
    }//end catch
  }//end main method


}//end class
