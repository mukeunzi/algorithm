class TargetNumber {
  static int result = 0;

  public int solution(int[] numbers, int target) {
    dfs(numbers, target, 0, 0);
    return result;
  }

  public void dfs(int[] numbers, int target, int sum, int index) {
    if (index == numbers.length) {
      if (sum == target) {
        result++;
      }
      return;
    }

    dfs(numbers, target, sum + numbers[index], index + 1);
    dfs(numbers, target, sum - numbers[index], index + 1);
  }
}