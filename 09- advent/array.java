import java.util.*;
class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("how many number do you plan to add");
    int x = in.nextInt();
    int[] array =  new int[x];



    for(int i = 0;i < x; i++) {
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
  int i = 0, n = array.length;

  while (i < n - 1 ) {
    for (int j = 1; j < n - i; j++) {
        if (array[j - 1] > array[j]) {
            int temp = array[j - 1];
            array[j - 1] = array[j];
            array[j] = temp;
        }
    }
    i++;
  }

    System.out.println("order "+Arrays.toString(array));
    average(array);
    median(array);
  }
  public static void average(int [] array){
    double total = 0;
    for(int i = 0;i < array.length; i++) {
       total = total + array[i];
    }
    total = total/array.length;
    System.out.println("average: "+total);

  }
  public static void median(int [] array){
  if (array.length % 2 == 1){//odd
    System.out.print("median: ");
    System.out.println(array[array.length/2]);
  }
  else if(array.length % 2 == 0){//even
    System.out.print("median: ");
    System.out.println((array[array.length/2-1]+array[array.length/2])/2.0);
  }
  else{
    System.out.println("invalid");
  }
}



}
