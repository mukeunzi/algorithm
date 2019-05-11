package level1;

public class GetAverage {
	
	public double solution(int[] arr) {
		int sum = 0;
		
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		
		return (double)sum / arr.length;
	}	

}
