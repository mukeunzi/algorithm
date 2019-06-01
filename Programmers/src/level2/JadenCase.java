class JadenCase {
  public String solution(String s) {
      String result = "";
      int index = 0;
      
      for(int i=0; i<s.length(); i++){
          if(index == 0){
              if(s.charAt(i) == ' '){
                  result += " ";
              }else{
                  result += Character.toUpperCase(s.charAt(i));
                  index++;
              }
          }else {
              if(s.charAt(i) == ' '){
                  result += " ";
                  index = 0;
              }else{
                  result += Character.toLowerCase(s.charAt(i));
                  index++;
              }
          }
      }
      
      return result;
  }
}