
//Lab 4.5
import java.util.*;

public class HalfString {
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      System.out.print("Enter a String: ");
      String n = sc.nextLine();

      int half = n.length();
      int m = half / 2;

      System.out.println("Length of String: " + half);

      System.out.println("Second Half of String: " + n.substring(m));
      sc.close();

   }
}
