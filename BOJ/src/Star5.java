import java.util.*;

class Star5{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		for(int i=1; i<=num; i++){
			for(int j=num-i; j>0; j--){
				System.out.print(" ");
			}
			for(int k=1; k<=i*2-1; k++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
}