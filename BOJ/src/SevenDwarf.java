import java.util.*;

public class SevenDwarf {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[9];
		
		int sum = 0;
		int except1 = 0;
		int except2 = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] = scan.nextInt();
		}
		Arrays.sort(arr);

		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				sum = 0;
				
				if(i == j) {
					continue;
				}
				
				for(int k=0; k<9; k++) {
					if(k != i && k!= j) {
						sum += arr[k];
					}
				}
				
				if(sum == 100) {
					except1 = i;
					except2 = j;
					break;
				}
			}
		}
		
		for(int k=0; k<9; k++) {
			if(k != except1 && k!= except2) {
				System.out.println(arr[k]);
			}
		}
	}

}