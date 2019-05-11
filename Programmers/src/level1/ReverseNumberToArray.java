package level1;

public class ReverseNumberToArray {
	
	public int[] solution(long n) {
		String strN = Long.toString(n);
		int[] answer = new int[strN.length()];
		
		for(int i=0; i<strN.length(); i++){
			answer[i] = strN.charAt(strN.length()-1-i) - '0';
		}
		return answer;
	}	

}
