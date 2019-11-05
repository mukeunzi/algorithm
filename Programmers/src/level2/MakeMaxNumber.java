class MakeMaxNumber {
  public String solution(String number, int k) {
    StringBuilder result = new StringBuilder();
    int index = 0;

    if (number.charAt(0) == '0') {
      return "0";
    }

    for (int i = 0; i < number.length() - k; i++) {
      char max = '0';

      for (int j = index; j <= k + i; j++) {
        if (max < number.charAt(j)) {
          max = number.charAt(j);
          index = j + 1;
        }
      }
      result.append(max);
    }

    return result.toString();
  }
}