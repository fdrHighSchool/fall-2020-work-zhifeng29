import java.util.*;
import java.lang.Math;

public class Main
{
	public static void main(String[] args) {
		System.out.println(square(5));
		System.out.println(trangle(6,6));
		System.out.println(trangle(4.0,5.0,6.0));
		System.out.println(rectangle(2,3));
		System.out.println(circle(2));
                System.out.println(cube(5));
		System.out.println(triangular_prism(6,6,4));
		System.out.println(sphere(4));

}


	public static double square(double s) {
		double area = s * s;
		return area;
	}
	public static double trangle(double b,double h) {
		double area = b * h / 2;
		return area;
	}

	public static double trangle(double a,double b,double c) {
		double s = (a + b + c )/2;//s stand for semi perimeter
		a = (s - a) ;
		b = (s - b) ;
		c = (s - c) ;
		//System.out.println(s);
		double p = a * b * c * s;
		//System.out.println(p);
		double area = Math.sqrt(p);
		return area;
	}
	public static double rectangle(double l,double w) {
		double area = l * w;
		return area;
	}

	public static double circle(double s) {
		double area = s * s * Math.PI;
		return area;
        }

	public static double cube(double s) {
		double volume = s * square(s);
		return volume;
	}

	public static double triangular_prism(double b,double h,double h2){
  	double volume = h2 * trangle(b,h);
		return volume;

	}
	public static double sphere(double r) {
		double volume = (4 * Math.PI *r*r*r/3);

		return volume;
