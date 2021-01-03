import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int [][] arr =new int [30][10];
       fillarray(arr);
       /*
       for(int i = 0 ; i<30 ;i++){
        System.out.println(Arrays.toString(arr[i]));
        }
        */
       System.out.printf("average:%, .2f",average(arr));
       System.out.println();
       top_average(arr);
       System.out.println(Arrays.deepToString(arr));

    }
    public static int [][] fillarray (int [][] arr) {
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();
    for (int i = 0; i < 30; i++) {
        for (int j = 0; j < 10; j++) {
            arr[i][j] = (int) (Math.random() * (100 - 55 + 1) + 55);
        }
    }
    return arr;
    }

    public static double average (int [][] arr) {
      double total = 0;
      int c = 0;
        for(int i = 0;i < arr.length; i++) {
          for(int j = 0;j < arr[i].length; j++) {
             total = total + arr[i][j];
             c++;
             //System.out.println(total);

            }
        }
        return total/c;
    }
    public static double top_average (int [][] arr) {
    double first = 0;
    double second = 0;
    for (int i = 0; i < arr.length; i++) {
        double total = 0;
        int c = 0;
        double current_average;
        for (int j = 0; j < arr[i].length; j++) {
            total = total + arr[i][j];
            c++;
        }
        current_average = total / c;
        if (current_average > second) {
            if (current_average > first) {
                second = first;
                first = current_average;
            }
            else {
                second = current_average;
            }
        }
    }
    System.out.println("The top average is " + first);
    System.out.println("The second highest average is " + second);
    return 0;
    }

}
