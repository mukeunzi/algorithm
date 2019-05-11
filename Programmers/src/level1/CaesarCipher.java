package level1;

public class CaesarCipher {
	
	public String solution(String s, int n) {
		String answer = "";
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z'){
				if((int)(s.charAt(i)) + n > 122){
					answer += (char)(((int)s.charAt(i)) + n - 26);
				}else{
					answer += (char)(((int)s.charAt(i)) + n);
				}
			}else if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'){
				if(((int)s.charAt(i)) + n > 90){
					answer += (char)(((int)s.charAt(i)) + n - 26);
				}else{
					answer += (char)(((int)s.charAt(i)) + n);
				}
			}else{
				answer += " ";
			}
		}
		return answer;
	}
}
