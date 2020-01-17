class PalindromeNumber {
  public static void main(String[] args){
    System.out.println(isPalindrome(12321)); // true
    System.out.println(isPalindrome(-12321)); // false
  }

  public static boolean isPalindrome(int x) {
      String strX = Integer.toString(x);
      int startIndex = 0;
      int endIndex = strX.length() - 1;
      
      for(int i=0; i<strX.length()/2; i++) {
          char front = strX.charAt(startIndex);
          char back = strX.charAt(endIndex);
          
          if(front != back) {
              return false;
          }
          
          startIndex++;
          endIndex--;
      }
      
      return true;
  }
}