import java.util.Scanner;

public class star4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i, j, k;
		int num = scan.nextInt();
		
		for(i=0;i<num;i++) {
			for(j=0;j<i;j++) {
				System.out.print(" ");
			}
			for(k=num-i;k>0;k--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}
}
