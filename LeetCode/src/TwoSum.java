import java.util.*;

class TwoSum {
    public static void main(String[] args) {
      int test[] = { 2, 7, 11, 15 };
      int target = 9;

      System.out.println(Arrays.toString(twoSum(test, target)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int result[] = new int[2];
        
        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target-nums[i])) {
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        
        return result;
    }
}