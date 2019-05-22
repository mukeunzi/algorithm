package level1;

public class GCDAndLCM {

	public int[] solution(int n, int m) {
		int result[] = new int[2];
		int tempBig = 0;
		int tempSmall = 0;
		int big = 0;
		
		if(n > m){
			tempBig = n;
			tempSmall = m;
		}else{
			tempBig = m;
			tempSmall = n;
		}
		
		if(tempBig % tempSmall == 0){
			result[0] = tempSmall;
			result[1] = tempBig;
		}else {
			for(int i=1; i<tempSmall; i++){
				if((tempSmall % i == 0) && (tempBig % i == 0)){
					big = i;
				}
			}
			result[0] = big;
			result[1] = big * tempSmall/big * tempBig/big;
		}
		
		return result;
	}

}
