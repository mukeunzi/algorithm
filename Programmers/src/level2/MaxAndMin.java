import java.util.*;

class MaxAndMin {
  public String solution(String s) {
      String strNumbers[] = s.split(" ");
      int numbers[] = new int[strNumbers.length];
      String result = "";
      
      for(int i=0; i<numbers.length; i++){
          numbers[i] = Integer.parseInt(strNumbers[i]);
      }
      Arrays.sort(numbers);
      result = numbers[0] + " " + numbers[numbers.length-1];
      
      return result;
  }
}