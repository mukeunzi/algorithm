import java.util.*;

class Phonekemon {
    public int solution(int[] nums) {
        HashSet numList = new HashSet<Integer>();
        
        for(int i=0; i<nums.length; i++){
            numList.add(nums[i]);
        }
        
        return (numList.size() > nums.length/2) ? nums.length/2 : numList.size();
    }
}