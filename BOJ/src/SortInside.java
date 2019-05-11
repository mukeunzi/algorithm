import java.util.*;

public class SortInside {

	public static void main(String[] args) {
		String strNum = "";
		int intNum [];
		
		Scanner scan = new Scanner(System.in);
		strNum = scan.nextLine();
		
		intNum = new int[strNum.length()];
		for(int i=0; i<strNum.length(); i++) {
			intNum[i] = strNum.charAt(i) - '0';
		}
		
		Arrays.sort(intNum);
		
		for(int i=intNum.length-1; i>=0; i--) {
			System.out.print(intNum[i]);
		}
		
		scan.close();
	}

}