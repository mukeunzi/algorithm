package level1;

public class kimInSeoul {
	
public String solution(String[] seoul) {
	String answer = "";
	
	for(int i=0; i<seoul.length; i++){
		if(seoul[i].equals("Kim")){
			answer = "�輭���� " + i + "�� �ִ�";
			return answer;
			}
		}
		return answer;
	}

}
