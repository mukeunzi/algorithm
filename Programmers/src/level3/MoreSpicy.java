import java.util.*;

class Solution {
  public int solution(int[] scoville, int K) {
    PriorityQueue<Integer> index = new PriorityQueue<Integer>();
    int mix = 0;
    int min1 = 0;
    int min2 = 0;
    int newScoville = 0;

    for (int i = 0; i < scoville.length; i++) {
      index.offer(scoville[i]);
    }

    while (index.size() > 1) {
      min1 = index.poll();

      if (min1 >= K) {
        break;
      }
      min2 = index.poll();

      newScoville = min1 + min2 * 2;
      index.offer(newScoville);

      mix++;
    }

    return index.peek() < K ? -1 : mix;
  }
}