
import java.util.Scanner;


public class SwitchCase {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of the day");
        int day = sc.nextInt();  

        switch (day) {
           case 1 -> System.out.println("Monday");

           case 2 -> System.out.println("Tue");

           case 3 -> System.out.println("wed");

           case 4 -> System.out.println("thus");

           case 5 -> System.out.println("fri");

           case 6 -> System.out.println("saturday");

           case 7 -> System.out.println("Sunday");

           default -> System.out.println("in valid");
        }
        sc.close();
    }
    
}
