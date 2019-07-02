import java.util.*;

class ATM {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int person = scan.nextInt();
    int arr[] = new int[person];
    int sum = 0;

    for(int i=0; i<person; i++){
      arr[i] = scan.nextInt();
    }
    scan.close();

    Arrays.sort(arr);
    for(int i=0; i<person; i++){
      sum += arr[i] * (person - i);
    }

    System.out.println(sum);
  }
}