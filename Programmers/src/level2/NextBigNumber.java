class NextBigNumber {
  public int solution(int n) {
      int count1 = 0;
      int count2 = 0;
      
      count1 = getBinaryNumber(n);
      
      while(true){
          n++;
          count2 = getBinaryNumber(n);
          if(count1 == count2){
              break;
          }
      }
      
      return n;
  }
    
  public int getBinaryNumber(int number){
      int count = 0;
      
      while(number >= 0){
          if(number == 0){
              break;
          }
          if(number % 2 == 1){
              count++;
          }
          
          number = number / 2;
      }
      
      return count;
  }
}