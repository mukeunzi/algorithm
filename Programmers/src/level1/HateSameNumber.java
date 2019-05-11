package level1;

import java.util.ArrayList;

public class HateSameNumber {
	
	public int[] solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = -1;
        
        for(int num : arr){
            if(temp != num){
                list.add(num);
            }
            temp = num;
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        
        return answer;
	}

}
