package level1;

public class PYInString {

	boolean solution(String s) {
		int pCount = 0;
		int yCount = 0;
		
		for(int i=0; i<s.length(); i++){
			if(s.charAt(i) == 'p' || s.charAt(i) == 'P') {
					pCount++;
			}
			if(s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
				yCount++;
			}
		}
		
		if(pCount == yCount){
			return true;
		}
		return false;
	}
	
}
