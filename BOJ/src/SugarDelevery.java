import java.util.Scanner;

class SugarDelevery {
	
  public static void main(String[] args){
	int bag;
	int remainder;
	
    Scanner scan = new Scanner(System.in);
    int sugar = scan.nextInt();
    
    scan.close();
    
    bag = sugar / 5;
    remainder = sugar - bag * 5;
    
    while(remainder != 0) {
    	System.out.println("bag : "+bag+" remain : "+remainder);
    	if(bag < 0 || remainder > sugar) {
    		bag = -1;
    		break;
    	}else if(remainder % 3 == 0) {
    		bag += remainder / 3;
    		break;
    	}else {
//    		while(remainder % 3 != 0) {
    			remainder += 5;
    			bag--;
//    		}
    	}
    }
    
    System.out.println(bag);
  }
}