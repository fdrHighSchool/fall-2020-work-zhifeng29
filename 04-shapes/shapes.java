import java.util.*;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
    square(5);
    trangle(6,6);
		trangle(4.0,5.0,6.0);
}
public static void square(double s) {
double a = s * s;
System.out.println(a);
}
public static void trangle(double b,double h) {
double a = b * h / 2;
System.out.println(a);
}

public static void trangle(double a,double b,double c) {
double s = (a + b + c )/2;//s stand for semi perimeter
a = (s - a) ;
b = (s - b) ;
c = (s - c) ;
//System.out.println(s);
double p = a * b * c * s;
//System.out.println(p);
double area = Math.sqrt(p);
System.out.println(area);

  }
}
