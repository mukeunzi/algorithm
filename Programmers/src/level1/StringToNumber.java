package level1;

public class StringToNumber {
	
	public int solution(String s) {
		int number = 0;
		
		if(s.charAt(0) == '+'){
			number += Integer.parseInt(s.substring(1));
		}else if(s.charAt(0) == '-'){
			number -= Integer.parseInt(s.substring(1));
		}else{
			number = Integer.parseInt(s);
		}
		
		return number;
	}
	  
}
