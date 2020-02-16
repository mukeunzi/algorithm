import java.util.*;

class PascalsTriangle {
    public static void main(String[] args) {
        int row = 5;
        System.out.println(generate(row).toString());
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        for(int i=0; i<numRows; i++) {
            List<Integer> row = new ArrayList<Integer>();
            
            for(int j=0; j<i+1; j++) {
                if(j == 0 || j == i) {
                    row.add(1);
                } else if(i != 0) {
                    List<Integer> arr = result.get(i-1);
                    int sum = arr.get(j-1) + arr.get(j);
                    row.add(sum);
                }
            }
            result.add(row);
        }
        
        return result;
    }
}