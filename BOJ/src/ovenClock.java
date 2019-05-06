import java.util.*;

public class ovenClock {

	public static void main(String[] args) {
		int hour;
		int minute;
		int addTime;
		int temp = 0;
		
		Scanner scan = new Scanner(System.in);
		hour = scan.nextInt();
		minute = scan.nextInt();
		addTime = scan.nextInt();
		
		
		if(59 < minute + addTime) {
			temp = (minute + addTime) / 60;
			minute = (minute + addTime) % 60;
		}else {
			minute += addTime;
		}
		
		if(23 < hour + temp) {
			hour = hour + temp - 24;
		}else {
			hour += temp;
		}
		
		System.out.println(hour + " " + minute);
		
		scan.close();
	}

}
