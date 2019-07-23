import java.util.Scanner;

public class ContestOrIntern {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int team = 0;
    int women = scan.nextInt();
    int men = scan.nextInt();
    int intern = scan.nextInt();

    scan.close();

    team = women / 2 > men ? men : women / 2;
    intern -= women + men - team * 3;

    while (intern > 0) {
      team--;
      intern -= 3;
    }

    System.out.println(team);

  }
}