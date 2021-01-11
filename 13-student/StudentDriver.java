import java.util.*;
public class StudentDriver {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    Student student1 = new Student("Hans", "123456789");
    System.out.println(student1);

    student1.setName("Joshua");

    System.out.println(student1);

    Student student2 = new Student("Fun", "987654321");
    System.out.println(student2);








/*
    int num = 0;
    for (int i = 0 ; i<10 ; i++){
      num = in.nextInt();
      GGrade GetGrade = new GGrade(num);
    }*/
  }//end main method

}//end class
