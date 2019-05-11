package level1;

import java.util.Arrays;

public class KNumber {
	
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int[] copyArr = {};
        
        for(int i=0; i<commands.length; i++){
            copyArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(copyArr);
            answer[i] = copyArr[commands[i][2]-1];
        }
        
        return answer;
    }	

}
