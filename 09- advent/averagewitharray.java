import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("how many number do you plan to add");
    int x = in.nextInt();
    int[] myArray =  new int[x];
    int i = 0;


    for(i = 0;i < x; i++) {
      try{
      System.out.println("enter intager to add number and any non intager to show average");
      myArray[i] = in.nextInt();

      }
      catch( Exception e ) {
        System.out.println("fail");
        System.exit(0);
      }
    }

    double total = 0;
    for(int a = 0;a < x; a++) {
       total = total + myArray[a];
    }
    total = total/myArray.length;
    System.out.println("anerage: "+total);
  }
}
