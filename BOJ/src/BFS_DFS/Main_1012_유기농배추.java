package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1012_유기농배추 {
	static int m, n, k;
	static int[][] arr;
	static boolean[][] visited;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m = Integer.parseInt(st.nextToken());
			n = Integer.parseInt(st.nextToken());
			k = Integer.parseInt(st.nextToken());
			arr = new int[n][m];
			visited = new boolean[n][m];
			for (int i=0; i<k; i++) {
				st = new StringTokenizer(br.readLine());
				int v1 = Integer.parseInt(st.nextToken());
				int v2 = Integer.parseInt(st.nextToken());
				arr[v2][v1] = 1;
 			} // 배추 심기 끝 
			
			int ans = 0;
			for (int i=0; i<n; i++) {
				for (int j=0; j<m; j++) {
					if (!visited[i][j] && arr[i][j] == 1) {
						dfs(i, j);
						ans ++;
					}
				}
			}
			System.out.println(ans);
		}
	}
	static void dfs(int r, int c) {
		visited[r][c] = true;
		
		for (int d=0; d<4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			
			if (nr>=0 && nc>=00 && nr<n&& nc<m && !visited[nr][nc]&&arr[nr][nc]==1) dfs(nr, nc);
		}
	}
}
