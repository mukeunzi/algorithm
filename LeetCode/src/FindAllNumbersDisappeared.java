import java.util.*;

class FindAllNumbersDisappeared {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDisappearedNumbers(arr).toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            int number = Math.abs(nums[i]) - 1;
            
            if(nums[number] > 0) {
                nums[number] *= -1;
            }
        }
        
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] > 0) {
                result.add(i + 1);
            }
        }
        
        return result;
    }
}