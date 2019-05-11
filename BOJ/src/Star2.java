import java.util.Scanner;

public class Star2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i, j, k;
		int num = scan.nextInt();
		
		for(i=1;i<=num;i++) {
			for(j=num-i;j>0;j--) {
				System.out.print(" ");
			}
			for(k=0;k<i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}
}