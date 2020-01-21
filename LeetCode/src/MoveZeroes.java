import java.util.*;

class MoveZeroes {
    public static void main(String[] args){
        int arr[] = {0, 1, 0, 4, 5};
        moveZeroes(arr);
    }

    public static void moveZeroes(int[] nums) {
        // 방법 1.
        ArrayList<Integer> zeroList = new ArrayList<>();

        for(int i=0; i<nums.length; i++) {
            if(nums[i] == 0) {
                zeroList.add(i);
            } else {
                if(zeroList.size() > 0){
                    int index = zeroList.get(0);
                    nums[index] = nums[i];
                    nums[i] = 0;
                    zeroList.remove(0);
                    zeroList.add(i);
                }
            }
        }

        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]);
        }
        System.out.println();

        // 방법 2. 
        int zeroIndex = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != 0) {
                nums[zeroIndex++] = nums[i];
            }
        }

        for(int i=zeroIndex; i<nums.length; i++) {
            nums[i] = 0;
        }

        for(int i=0; i<nums.length; i++) {
            System.out.print(nums[i]);
        }
    }
}