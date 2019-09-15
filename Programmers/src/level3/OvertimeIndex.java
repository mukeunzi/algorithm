import java.util.*;

class Solution {
  public long solution(int n, int[] works) {
    PriorityQueue<Integer> workload = new PriorityQueue<Integer>();
    int num = 0;
    long result = 0;

    for (int i = 0; i < works.length; i++) {
      workload.offer(works[i] * -1);
    }

    for (int i = 0; i < n; i++) {
      num = workload.poll();

      if (num == 0) {
        return 0;
      }

      workload.offer(num + 1);
    }

    while (workload.size() != 0) {
      result += Math.pow(workload.poll(), 2);
    }

    return result;
  }
}