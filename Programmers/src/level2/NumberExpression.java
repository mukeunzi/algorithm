package level2;

public class NumberExpression {
	
	public int solution(int n) {
		int sum = 0;
		int cnt = 0;
		
		for(int i=1; i<=n; i++){
			for(int j=i; j<=n; j++){
				sum += j;
				if(sum == n){
					cnt++;
				}else if(sum > n){
					break;
				}
			}sum = 0;
		}
		return cnt;
	}	

}
