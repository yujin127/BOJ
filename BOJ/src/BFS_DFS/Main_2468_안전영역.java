package BFS_DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main_2468_안전영역 {
	static int n;
	static int[][] arr;
	static boolean[][] drown;
	static int[] dr = {-1, 1, 0, 0};
	static int[] dc = {0, 0, -1, 1};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][n];
		int maxh = 0;
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j=0; j<n; j++) {
				int h = Integer.parseInt(st.nextToken());
				if (maxh<h) maxh = h;
				arr[i][j] = h;
			}
		}
		int max = 0;
		// 최소 높이 ~ 최대 높이 까지 모든 높이들로 순회 
		for (int h=0; h<=maxh; h++) {
			drown = new boolean[n][n];
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					if (arr[i][j] <= h) drown[i][j] = true;
				}
			}
			int safe = 0;
			for (int i=0; i<n; i++) {
				for (int j=0; j<n; j++) {
					if (!drown[i][j]) {
						dfs(i, j);
						safe ++;
					}
				}
			}
			if (max<safe) max = safe;
		}
		System.out.println(max);
	}
	static void dfs(int r, int c) {
		drown[r][c] = true;
		for (int d=0; d<4; d++) {
			int nr = r + dr[d];
			int nc = c + dc[d];
			if (nr >=0 && nc >=0 && nr<n && nc<n && !drown[nr][nc]) dfs(nr, nc);
		}
	}
}
