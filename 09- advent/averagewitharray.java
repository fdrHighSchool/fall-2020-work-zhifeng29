import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
     //int[] values = { 2, 3, 6, 12, 15, 34, 65, 78, 99 };
    System.out.println("how many number do you plan to add");
    int x = in.nextInt();
    int[] array =  new int[x];
    int i = 0;


    for(i = 0;i < x; i++) {
      try{
      System.out.println("enter intager to add number and any non intager to show average");
      array[i] = in.nextInt();

      }
      catch( Exception e ) {
        System.out.println("fail");
        System.exit(0);
      }
    }
    System.out.println(Arrays.toString(array));
    double total = 0;
    for(int a = 0;a < x; a++) {
       total = total + array[a];
    }
    total = total/array.length;
    System.out.println("average: "+total);
  }


}
