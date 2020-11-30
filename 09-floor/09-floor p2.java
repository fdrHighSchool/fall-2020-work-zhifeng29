public class Main
{
	public static void main(String[] args) {
		String input = "";
		int floor = 0;
		for (int i = 0; i < input.length(); i++) {
		   if (input.substring(i , i+1).contains("(")) {
		    floor++;
		    }
		   else {
		    floor--;
		   }
		  if (floor == -1){
		      System.out.println(i+1);
		      System.exit(0);
		  }

		}

	}
}
