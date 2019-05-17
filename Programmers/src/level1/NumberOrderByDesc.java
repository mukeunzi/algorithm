package level1;

import java.util.Arrays;

public class NumberOrderByDesc {
	
	public long solution(long n) {
		String strN = Long.toString(n);
		String sortedN = "";
		String[] arr = new String[strN.length()];
		
		for(int i=0; i<strN.length(); i++){
			arr[i] = Integer.toString(strN.charAt(i) - '0');
		}
		Arrays.sort(arr);
		
		for(int i=strN.length()-1; i>=0; i--){
			sortedN += arr[i];
		}
		
		return Long.parseLong(sortedN);
	}

}
