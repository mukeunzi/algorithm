import java.util.Scanner;

public class Star1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num = scan.nextInt();
		
		for(int i=0;i<num;i++) {
			for(int j=0;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		scan.close();
	}
}