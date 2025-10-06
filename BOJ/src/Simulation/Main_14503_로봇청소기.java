package Simulation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_14503_로봇청소기 {
	static int[] dr = {-1, 0, 1, 0};
	static int[] dc = {0, 1, 0, -1};
	static int[][] room;
	static boolean[][] visited;
	static int n, m, ans;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		room = new int[n][m];
		visited = new boolean[n][m];
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j=0; j<m; j++) {
				int tmp = Integer.parseInt(st.nextToken());
				if (tmp==1) visited[i][j] = true;
				room[i][j] = tmp;
			}
		}
		ans = 0;
		simulate(r, c, d);
		System.out.println(ans);
	}
	static void simulate(int r, int c, int d) {
		while (true) {
			if (!visited[r][c]) {
				visited[r][c] = true;
				ans++;
			}
			boolean canclean = false;
			for (int i=0; i<4; i++) {
				d = (d + 3) % 4;
				int nr = r+dr[d];
				int nc = c+dc[d];
				if (nr>=0&&nc>=0&&nr<n&&nc<m&&room[nr][nc]==0&&!visited[nr][nc]) {
					r=nr;
					c=nc;
					canclean = true;
					break;
				}
			}
			if (canclean) continue;
			
			int backDir = (d + 2) % 4;
			int br = r + dr[backDir];
			int bc = c + dc[backDir];
			if(br<0||bc<0||br>=n||bc>=m||room[br][bc]==1) break;
			r=br;
			c=bc;
		}
	}
}
