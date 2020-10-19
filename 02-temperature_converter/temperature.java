import java.util.*;
public class Main
{
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
  System.out.print("type 1 for Celsius to Fahrenheit and 2 for Fahrenheit to Celsius");
  int ans = in.nextInt();

	if (ans == 1){
		System.out.print("please enter the temperature in °C ");
		double	Celsius = in.nextInt();
	    double	Fahrenheit = Celsius * 1.8 + 32;
	    System.out.println(Fahrenheit);
	}
	else if (ans == 2) {
		System.out.print("please enter the temperature in °F ");
		double  Fahrenheit = in.nextInt();
	    double  Celsius = (Fahrenheit-32)/1.8;
	    System.out.println(Celsius);


	}
	else{
		System.out.println("invaild input");
	  }
	}
}
