import java.util.Scanner;

public class years2007 {

	public static void main(String[] args) {
		int sum = 0;
		Scanner scan = new Scanner(System.in);

		int inputMon = scan.nextInt();
		int inputday = scan.nextInt();
		
		scan.close();
		
		int endDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String daysWeeks[] = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		
		sum+=inputday;
		for(int i=0;i<inputMon-1;i++) {
			sum+=endDays[i];
		}
		
		System.out.println(daysWeeks[sum%7]);
		
	}
}
