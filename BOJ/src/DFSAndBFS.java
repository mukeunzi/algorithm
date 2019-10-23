import java.util.*;

public class DFSAndBFS {
	public static ArrayList<Integer>[] list;
	public static Queue<Integer> bq = new LinkedList<>();
	public static boolean[] dVisited;
	public static boolean[] bVisited;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int vertex = scan.nextInt();
		int edge = scan.nextInt();
		int start = scan.nextInt();
		
		list = new ArrayList[vertex+1];
		dVisited = new boolean[vertex+1];
		bVisited = new boolean[vertex+1];
		
		for(int i=0; i<vertex+1; i++) {
			list[i] = new ArrayList<>();
		}
		
		for(int i=0; i<edge; i++) {			
			int x = scan.nextInt();
			int y = scan.nextInt();
			list[x].add(y);
			list[y].add(x);
		}
		scan.close();
		
		for(int i=0; i<vertex+1; i++) {
			Collections.sort(list[i]);
		}
		
		dfs(start);
		System.out.println();
		
		bq.offer(start);
		bfs();
	}
	
	public static void dfs(int vertex) {
		if(dVisited[vertex]) {
			return;
		}
		
		dVisited[vertex] = true;
		System.out.print(vertex + " ");
		
		for(int i=0; i<list[vertex].size(); i++) {
			dfs(list[vertex].get(i));
		}
	}
	
	public static void bfs() {
		while(!bq.isEmpty()) {
			int index = bq.poll();
			bVisited[index] = true;
			
			System.out.print(index + " ");
			
			for(int i=0; i<list[index].size(); i++) {
				if(!bVisited[list[index].get(i)]) {
					bq.offer(list[index].get(i));
					bVisited[list[index].get(i)] = true;
				}
			}
		}
	}

}
