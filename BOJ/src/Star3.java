import java.util.Scanner;

public class Star3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i, j;
		int num = scan.nextInt();
		
		for(i=num;i>0;i--) {
			for(j=i;j>0;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}
}