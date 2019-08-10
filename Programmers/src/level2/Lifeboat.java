import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int boat = 0;
        Arrays.sort(people);
        
        int light = 0;
        int heavy = people.length - 1;
        
        while(light < heavy){
            if(people[light] + people[heavy] <= limit){
                boat++;
                light++;
                heavy--;
            }else{
                heavy--;
                boat++;
            }
        }
        
        if(light == heavy){
            boat++;
        }
        
        return boat;
    }
}