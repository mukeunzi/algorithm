package level1;

public class xIntervalN {
	public long[] solution(int x, int n) {
		long[] answer = new long[n];
		long sum = x;
		
		for(int i=1; i<=n; i++){
		answer[i-1] = sum * i;
		}
		
		return answer;
	}

}
