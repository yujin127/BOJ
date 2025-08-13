package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 색종이_10163 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[1001][1001];
		for (int p = 1; p <= n; p++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());

			for (int i = 0; i < w; i++) {
				for (int j = 0; j < h; j++) {
					arr[x + i][y + j] = p;
				}
			}
		}
		for (int k = 1; k <= n; k++) {
			int c = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (arr[i][j] == k) c ++;
				}
			}
			System.out.println(c);
		}
	}
}
