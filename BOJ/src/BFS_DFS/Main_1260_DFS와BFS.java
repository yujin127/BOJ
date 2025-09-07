package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_1260_DFS와BFS {
	static int n, m, v;
	static int[][] arr;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		arr = new int[n+1][n+1];
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			arr[v1][v2] = 1;
			arr[v2][v1] = 1;
		}
		visited = new boolean[n+1];
		dfs(v);
		System.out.println();
		visited = new boolean[n+1];
		bfs(v);
	}
	static void dfs(int v) {
		visited[v] = true;
		System.out.print(v+" ");
		for (int i=1; i<=n; i++) {
			if (!visited[i] && arr[v][i]==1) {
				dfs(i);
			}
		}
	}
	
	static void bfs(int v) {
		Queue<Integer> q = new LinkedList<>();
		visited[v] = true;
		q.add(v);
		
		while (!q.isEmpty()) {
			int node = q.poll();
			System.out.print(node+" ");
			for (int i=1; i<=n; i++) {
				if(!visited[i]&&arr[node][i]==1) {
					visited[i] = true;
					q.add(i);
				}
			}
		}
	}
}
