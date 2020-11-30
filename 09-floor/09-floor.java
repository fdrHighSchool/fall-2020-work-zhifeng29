public class Main
{
	public static void main(String[] args) {
		String input = "";// i remove the long string to prevent lag 
		int floor = 0;
		for (int i = 0; i < input.length(); i++) {
		   if (input.substring(i , i+1).contains("(")) {
		    floor++;
		    }
		   else {
		    floor--;
		   }


		}
		System.out.println(floor);
	}
}
