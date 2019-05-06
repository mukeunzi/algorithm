package level1;

public class sumNumbers {

  public long solution(int a, int b) {
		int big, small;
		long answer = 0;
		
		if(a > b) {
			small = b;
			big = a;
		}else if(a < b) {
			small = a;
			big = b;
		}else {
			small = a;
			big = b;
		}
		
		for(int i=small; i<=big; i++) {
			answer += i;
		}
		
		return answer;
  }	

}
