package level1;

public class CheckSqrt {

	public long solution(long n) {
		if(Math.pow(Math.ceil(Math.sqrt(n)), 2) == n){
			return (long)Math.pow((int)Math.sqrt(n) + 1, 2);
		}
		return -1;
	}

}
