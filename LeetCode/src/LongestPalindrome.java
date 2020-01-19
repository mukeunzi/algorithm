import java.util.*;

class LongestPalindrome {
    public static void main(String[] args){
        System.out.println(longestPalindrome("bananas")); // 5
        System.out.println(longestPalindrome("civilwartestingwhetherthatnaptionoranynartionsoconceivedandsodedicatedcanlongendureWeareqmetonagreatbattlefiemldoftzhatwarWehavecometodedicpateaportionofthatfieldasafinalrestingplaceforthosewhoheregavetheirlivesthatthatnationmightliveItisaltogetherfangandproperthatweshoulddothisButinalargersensewecannotdedicatewecannotconsecratewecannothallowthisgroundThebravelmenlivinganddeadwhostruggledherehaveconsecrateditfaraboveourpoorponwertoaddordetractTgheworldadswfilllittlenotlenorlongrememberwhatwesayherebutitcanneverforgetwhattheydidhereItisforusthelivingrathertobededicatedheretotheulnfinishedworkwhichtheywhofoughtherehavethusfarsonoblyadvancedItisratherforustobeherededicatedtothegreattdafskremainingbeforeusthatfromthesehonoreddeadwetakeincreaseddevotiontothatcauseforwhichtheygavethelastpfullmeasureofdevotionthatweherehighlyresolvethatthesedeadshallnothavediedinvainthatthisnationunsderGodshallhaveanewbirthoffreedomandthatgovernmentofthepeoplebythepeopleforthepeopleshallnotperishfromtheearth")); // 983
    }

    public static int longestPalindrome(String s) {
        String[] splitS = s.split("");
        int result = 0;
        
        HashMap<String, Integer> letters = new HashMap<String, Integer>();
        
        for(int i=0; i<splitS.length; i++) {
            if(letters.containsKey(splitS[i])){
                letters.put(splitS[i], letters.get(splitS[i]) + 1);
            }else {
                letters.put(splitS[i], 1);
            }
        }
        
        Iterator<String> keys = letters.keySet().iterator();
        boolean oddNumber = false;
        
        while(keys.hasNext()) {
            String key = keys.next();
            
            if(letters.get(key) % 2 == 0){
                result += letters.get(key);
            } else{
                result += letters.get(key) - 1;
                oddNumber = true;
            }
        }
        
        if(oddNumber){
            result++;
        }
        
        return result;
    }
}