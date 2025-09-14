package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main_14940_쉬운최단거리 {
	static int n, m, r, c;
	static int[][] arr, result;
	static boolean[][] visited;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n][m];
		visited = new boolean[n][m];
		result = new int[n][m];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				arr[i][j] = tmp;
				if (tmp==2) {
					r = i; c = j;
				}
				if (tmp==0) result[i][j] = 0;
				else result[i][j] = -1;
			}
		}
		
		bfs(r, c);

		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	static void bfs(int r, int c) {
		Queue<int[]> q = new ArrayDeque<>();
		q.offer(new int[] {r, c});
		result[r][c] = 0;
		visited[r][c] = true;
		while (!q.isEmpty()) {
			int[] tmp = q.poll();
			int rr = tmp[0]; int cc = tmp[1];
			
			for (int d=0; d<4; d++) {
				int nr = rr + dr[d];
				int nc = cc + dc[d];
				if (nr<0 || nc<0 ||nr>=n || nc>=m) continue;
				if (!visited[nr][nc]&&arr[nr][nc]!=0) {
					visited[nr][nc] = true;
					result[nr][nc] = result[rr][cc]+1;
					q.offer(new int[] {nr, nc});
				}
			}
		}
	}
}
