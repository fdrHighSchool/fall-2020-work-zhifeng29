import java.util.*;///Import scanner object
class Main{
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);///Scanner input
    System.out.println("how many number do you plan to add");///
    int x = in.nextInt();///Add multiple inputs
    int[] array =  new int[x];//range of the list



    for(int i = 0;i < x; i++) {/// when i = 0, less than x, and it increases one at a time
      try{
      System.out.println("enter a integer to add to the list");//Enter the
      array[i] = in.nextInt();
      }
      catch( Exception e ) {// stop the progarm if input is not integer
        System.out.println("Numbers only, please!");//Sorry if I reworded it a bit.
        System.exit(0);
      }
    }
  in.close();
  System.out.println(Arrays.toString(array));

  int i = 0, n = array.length;
  while (i <= n ) {//sort the list from small to large
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
    mode(array);
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
    if (array.length % 2 == 1){//for odd
      System.out.print("median: ");
      System.out.println(array[array.length/2]);
    }
    else if(array.length % 2 == 0){// for even
      System.out.print("median: ");
      System.out.println((array[array.length/2-1]+array[array.length/2])/2.0);
    }
    else{
      System.out.println("invalid");
    }
  }
  public static void mode(int [] array){
    int maxValue = 0;
    int maxCount = 0;
    int i,j;
    int n = array.length;

    for (i = 0; i < n; ++i) {
       int count = 0;
       for (j = 0; j < n; ++j) {
          if (array[j] == array[i])
          ++count;
       }
       if (count > maxCount ) {
          maxCount = count;
          maxValue = array[i];
       }
    }

    System.out.println("mode: " + maxValue);
  }
}
///That's the end of our code!
