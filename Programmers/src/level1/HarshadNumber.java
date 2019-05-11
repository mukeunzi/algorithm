package level1;

public class HarshadNumber {
	
	public boolean solution(int x) {
		String strX = Integer.toString(x);
		int sum = 0;
		
		for(int i=0; i<strX.length(); i++){
			sum += strX.charAt(i) - '0';
		}
		return (x % sum == 0);
	}

}
