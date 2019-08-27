package level3;

class TileDecoration {
  public long solution(int N) {
    long fiboArr[] = new long[N + 1];
    fiboArr[1] = 1;

    for (int i = 2; i < fiboArr.length; i++) {
      fiboArr[i] = fiboArr[i - 2] + fiboArr[i - 1];
    }
    return fibo(N, fiboArr);
  }

  public long fibo(int N, long fiboArr[]) {
    return fiboArr[N] * 4 + fiboArr[N - 1] * 2;
  }
}