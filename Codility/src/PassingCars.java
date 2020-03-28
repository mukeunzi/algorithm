class PassingCars {
  public static void main(String[] args) {
    int result = 0;
    int zero = 0;

    for(int i=0; i<A.length; i++) {
      if(A[i] == 0) {
        zero++;
      } else {
        result += zero;

        if(result > 1000000000) {
          return -1;
        }
      }
    }

    return result;
  }
}