package level1;

import java.util.*;

public class MockTest {
	
	public int[] solution(int[] answers) {
		int[] result = {};
		
		int one[] = new int[]{1, 2, 3, 4, 5};
		int two[] = new int[]{2, 1, 2, 3, 2, 4, 2, 5};
		int three[] = new int[]{3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
		int count[] = new int[]{0, 0, 0};
		List<Integer> countNum = new ArrayList<>();
		int maxNum = 0;
		
		for(int i=0; i<answers.length; i++){
			if(one[i % 5] == answers[i]){
				count[0]++;
			}
			if(two[i % 8] == answers[i]){
				count[1]++;
			}
			if(three[i % 10] == answers[i]){
				count[2]++;
			}
		}
		
		for(int i=0; i<count.length; i++){
			if(count[i] > maxNum){
				maxNum = count[i];
			}
		}
		
		for(int i=0; i<count.length; i++){
			if(count[i] == maxNum){
				countNum.add(i+1);
			}
		}
		
		result = new int[countNum.size()];
		for(int i=0; i<countNum.size(); i++){
			result[i] = countNum.get(i);
		}
		
		return result;
	}

}
