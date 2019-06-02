import java.util.*;

class Phonekemon {
    public int solution(int[] nums) {
        int temp = 0;
        int maxResult = 0;
        
        Arrays.sort(nums);
        
        temp = nums[0];
        maxResult++;
        for(int i=1; i<nums.length; i++){
            if(maxResult == nums.length / 2){
                break;
            }
            if(temp != nums[i]){
                maxResult++;
                temp = nums[i];
            }
        }
        
        return maxResult;
    }
}