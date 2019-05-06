import java.util.*;

public class printInput {

	public static void main(String[] args) {
		String str = "";
		String strResult = "";
		
		Scanner scan = new Scanner(System.in);
		while(scan.hasNextLine()) {
			str = scan.nextLine();
			
			if(str.length() <= 100 && !str.startsWith(" ") && !str.endsWith(" ")) {
				strResult += str + "\n";
			}else {
				break;
			}
		}
		
		System.out.println(strResult);
		
		scan.close();
    }
}
