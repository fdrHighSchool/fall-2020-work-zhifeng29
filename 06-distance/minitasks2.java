import java.util.Scanner;
import java.lang.Math;
class Main{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);

  System.out.println("enter first position in the format of (n,n)");
  String point1 = input.nextLine();
  System.out.println("enter second position in the format of (n,n)");
  String point2 = input.nextLine();

  double x1 = getx(point1);
  double y1 = gety(point1);
  double x2 = getx(point2);
  double y2 = gety(point2);

/*

*/
  double strightline = cartesianDistance(x2,x1,y2,y1);
  System.out.println("cartesianDistance is "+ strightline +" meters");
  double zigzag = taxicabDistance(x2,x1,y2,y1);
  System.out.println("taxicabDistance is "+ zigzag+" meters");

  }

  public static double cartesianDistance(double x1, double x2, double y1, double y2){
    x2-=x1;
    y2-=y1;
    //System.out.println(y2);
    //System.out.println(x2);
    double Distance = Math.pow(x2,2) + Math.pow(y2,2);
    //System.out.println(Distance);
    Distance = Math.abs(Math.sqrt(Distance));
    return Distance;
  }
  public static double taxicabDistance(double x1, double x2, double y1, double y2){
    x2-=x1;
    y2-=y1;

    double Distance = Math.abs(x2) + Math.abs(y2);
    return Distance;
  }

  public static double  getx(String point){

    int front = 1 + point.indexOf("(");

    int back = point.indexOf(",");

    String x = point.substring(front,back);

  double  ans = Integer.parseInt(x);

    return  ans ;
  }

 public static double  gety(String point){

   int front = point.indexOf(",") + 1;

   int back = point.indexOf(")");

   String y = point.substring(front,back);

   double ans = Integer.parseInt(y);

   return  ans ;
  }
}
