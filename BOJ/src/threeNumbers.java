import java.util.*;

public class threeNumbers {

	public static void main(String[] args) {
		int arr[] = new int[3];
		
		Scanner scan = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays.sort(arr);
		
		System.out.println(arr[1]);
		
		scan.close();
	}

}