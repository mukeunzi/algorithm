import java.util.*;

public class NumberingComplex {	
	public static Queue<Integer> qx = new LinkedList<Integer>();
	public static Queue<Integer> qy = new LinkedList<Integer>();
	public static int dx[] = { 0, 0, -1, 1 };
	public static int dy[] = { 1, -1, 0, 0 };
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int arr[][] = new int[num][num];
		boolean visited[][] = new boolean[num][num];
		
		for(int i=0; i<num; i++) {
			String str = scan.next();
			String rows[] = str.split("");
			
			for(int j=0; j<num; j++) {
				arr[i][j] = Integer.parseInt(rows[j]);
			}
		}
		scan.close();		
		
		int index = 0;
		int count = 0;
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i=0; i<num; i++) {
			for(int j=0; j<num; j++) {
				if(arr[i][j] == 1 && !visited[i][j]) {	
					count = 0;
					
					qx.offer(i);
					qy.offer(j);
					
					count = bfs(arr, visited);
					result.add(index, count);
					index++;
				}
			}
		}
		
		Collections.sort(result);
		
		System.out.println(result.size());
		
		for(int i=0; i<result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
	
	public static int bfs(int[][] arr, boolean[][] visited) {
		int count = 0;
		
		while(!qx.isEmpty()) {
			count++;
			
			int x = qx.poll();
			int y = qy.poll();
			int _x;
			int _y;
			
			visited[x][y] = true;
			
			for(int i=0; i<4; i++) {
				_x = dx[i] + x;
				_y = dy[i] + y;
				
				if(_x < 0 || _x >= arr.length || _y < 0 || _y >= arr.length) {
					continue;
				}
				if(visited[_x][_y]) {
					continue;
				}
				
				if(arr[_x][_y] == 1) {
					qx.offer(_x);
					qy.offer(_y);
					visited[_x][_y] = true;
				}
			}
		}
		
		return count;
	}

}
