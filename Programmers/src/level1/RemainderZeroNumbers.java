package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class RemainderZeroNumbers {

	public int[] solution(int[] arr, int divisor) {
		int[] result;
		ArrayList<Integer> numberList = new ArrayList<>();
		
		for(int i=0; i<arr.length; i++){
			if(arr[i] % divisor == 0){
				numberList.add(arr[i]);
			}
		}
		
		if(numberList.size() != 0){
			result = new int[numberList.size()];
			
			for(int i=0; i<result.length; i++){
				result[i] = numberList.get(i);
			}
			Arrays.sort(result);
		}else{
			result = new int[1];
			result[0] = -1;
		}
		
		return result;
	}

}
