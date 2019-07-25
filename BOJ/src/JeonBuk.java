import java.util.*;

public class JeonBuk {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int num = scan.nextInt();
    int leftSpace = num / 2;
    int middleSpace = 0;

    scan.close();

    if (num % 2 == 0) {
      System.out.println("I LOVE CBNU");
    } else {
      for (int i = 0; i < num; i++) {
        System.out.print("*");
      }
      System.out.println();

      for (int i = 0; i < leftSpace; i++) {
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();

      while (leftSpace != 0) {
        leftSpace--;
        middleSpace++;

        for (int i = 0; i < leftSpace; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        for (int i = 0; i < middleSpace * 2 - 1; i++) {
          System.out.print(" ");
        }
        System.out.print("*");
        System.out.println();
      }
    }
  }

}