class StrangeNumber {
  public String solution(String s) {
      String result = "";
      int index = 0;
      
      for(int i=0; i<s.length(); i++){
          if(s.charAt(i) == ' '){
              index = 0;
              result += " ";
          }else if(index % 2 == 0){
              result += Character.toUpperCase(s.charAt(i));
              index++;
          }else if(index % 2 == 1){
              result += Character.toLowerCase(s.charAt(i));
              index++;
          }
      }
      
      return result;
  }
}