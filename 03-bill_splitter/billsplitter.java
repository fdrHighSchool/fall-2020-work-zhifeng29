import java.util.*;

public class Buggy{

	public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Welcome to the Bill-Splitter");
    System.out.print("Enter the total, pre-tax: ");
    double total = input.nextDouble();
    System.out.println("enter the text rate (a number that is 1-100)");
    double tax = input.nextDouble();
    tax = tax /100 + 1;
    System.out.println("enter the amount of tip you pay");
    double tips  = input.nextDouble();
    System.out.print("How many people? ");
    int numpeople = input.nextInt();

    total = total * tax + tips;

    double perPerson = total/(double)numpeople;


    System.out.printf(" Each person must pay $ %.2f", perPerson);
	}//end main method
}//end class
