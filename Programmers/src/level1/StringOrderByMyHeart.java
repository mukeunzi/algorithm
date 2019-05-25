import java.util.*;

class StringOrderByMyHeart {
  public String[] solution(String[] strings, int n) {
      Arrays.sort(strings, new Comparator<String>(){
          @Override
          public int compare(String str1, String str2){
              char char1 = str1.charAt(n);
              char char2 = str2.charAt(n);
              
              if(char1 == char2){
                  return str1.compareTo(str2);
              }else if(char1 < char2){
                  return -1;
              }else{
                  return 1;
              }
          }
      });
      
      return strings;
  }
}