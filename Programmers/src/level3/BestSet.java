package level3;

class BestSet {
  public int[] solution(int n, int s) {
    if (n > s) {
      int result[] = new int[] { -1 };
      return result;
    }

    int result[] = new int[n];
    int count = n;

    for (int i = 0; i < n; i++) {
      result[i] = s / count;
      s -= result[i];
      count--;
    }

    return result;
  }
}