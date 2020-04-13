class NormalSquare {
    public static void main(String[] args) {
        long result = solution(8, 12);
        System.out.println(result);
    }

    public static long solution(int w,int h) {
        long wl = Long.valueOf(w);
        long hl = Long.valueOf(h);
        long result = 0;
        
        long area = wl * hl;
        long gcd = getGCD(wl, hl);
        long unusable = (wl / gcd + hl / gcd - 1) * gcd;
        
        result = area - unusable;
        
        return result;
    }
    
    public static long getGCD(long x, long y) {
        long big = x > y ? x : y;
        long small = x > y ? y : x;
        
        if(small == 0) {
            return big;
        }
        
        return getGCD(small, big % small);
    }
}