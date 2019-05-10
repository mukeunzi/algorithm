package level1;

import java.util.Arrays;

public class budget {

	public int solution(int[] d, int budget) {
		int sum = 0;
		
		Arrays.sort(d);
		for(int i=1; i<=d.length; i++){
			sum += d[i-1];
			if(sum > budget){
				return i-1;
			}
		}
		
		return d.length;
	}
	  
}
