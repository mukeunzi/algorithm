import java.util.*;

class MaximumSubarray {
    public static void main(String[] args){
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        
        for(int i=1; i<nums.length; i++) {
                nums[i] += (nums[i-1] > 0 ? nums[i-1] : 0);
                max = Math.max(nums[i], max);
        }
        
        return max;
    }
}