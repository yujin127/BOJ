package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_2606_바이러스 {
	static int n, m;
	static boolean[] visited;
	static int[][] arr;
	static int cnt = 0;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		arr = new int[n+1][n+1];
		visited = new boolean[n+1];
		for (int i=0; i<m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1;
		}	
		System.out.println(bfs(1));
	}
	
	public static int bfs(int start) {
		Queue<Integer> q = new ArrayDeque<>();
		visited[start] = true;
		q.add(start);
		
		while(!q.isEmpty()) {
			int cur = q.poll();
			for (int i=1; i<=n; i++) {
				if (arr[cur][i] == 1 && !visited[i]) {
					visited[i] = true;
					q.add(i);
					cnt++;
				}
			}
		}
		return cnt;
   	}
}
