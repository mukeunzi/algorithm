class Top {
    public int[] solution(int[] heights) {
        int result[] = new int[heights.length];
        
        for(int i=heights.length-1; i>=1; i--){
            for(int j=i-1; j>=0; j--){
                if(heights[i] < heights[j]){
                    result[i] = j+1;
                    break;
                }
            }
        }
        
        return result;
    }
}