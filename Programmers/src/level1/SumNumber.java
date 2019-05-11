package level1;

public class SumNumber {
	
	public int solution(int n) {
		String strN = Integer.toString(n);
		int sum = 0;
		
		for(int i=0; i<strN.length(); i++){
		    sum += strN.charAt(i) - '0';
		}
		
		return sum;
	}

}
