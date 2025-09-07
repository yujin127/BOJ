package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_11724_연결요소의개수 {
	static int n, m, ans;
	static int[][] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n+1][n+1];
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());
			arr[v1][v2] ++;
			arr[v2][v1] ++;
		}

		visited = new boolean[n+1];
		ans = 0;
		for (int i=1; i<=n; i++) {
			if (!visited[i]) {
				dfs(i);
				ans ++;
			}
		}
		System.out.println(ans);
	}
	static void dfs(int start) {
		visited[start] = true;
		for (int i=1; i<=n; i++) {
			if (!visited[i] && arr[start][i]==1) {
				dfs(i);
			}
		}
	}
}
