import java.util.*;

public class Thirty {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		scan.close();
		
		String[] arr = str.split("");
		System.out.println(getMaxNum(arr));
	}
	
	public static String getMaxNum(String[] arr) {
		int zero = 0;
		int sum = 0;
		String result = "";
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals("0")) {
				zero++;
			}
			sum += Integer.parseInt(arr[i]);
		}
		if((zero == 0) || (sum % 3 != 0)) {
			return "-1";
		}
		
		Arrays.sort(arr, new Comparator<String>(){
			@Override
			public int compare(String a, String b){
				return b.compareTo(a);
			}
		});
		for(int i=0; i<arr.length; i++) {
			result += arr[i];
		}
		
		return result;
	}

}
