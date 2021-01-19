public class LifespanDriver {
  public static void main(String[] args) {
    Lifespan rat = new Lifespan("some", 2 , 12);
    Lifespan elephant = new Lifespan("Sophia", 50 , 100);
    System.out.println(rat);
    System.out.println(elephant);
    System.out.printf("%.2f%%",rat.percent());
    System.out.printf("\n%.2f%%",elephant.percent());
  }//end of main
}//end of class
