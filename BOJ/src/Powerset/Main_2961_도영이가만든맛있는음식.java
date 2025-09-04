package Powerset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2961_도영이가만든맛있는음식 {
	static int n, s, b, min;
	static int[][] arr;
	static boolean[] visited;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n][2];
		for (int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			s = Integer.parseInt(st.nextToken());
			b = Integer.parseInt(st.nextToken());
			arr[i] = new int[] {s, b};
		}
		visited = new boolean[n];
		min = Integer.MAX_VALUE;
		powerset(0);
		System.out.println(min);
	}
	
	static void powerset(int idx) {
		if (idx == n) {
			int bitter = 0; int sour = 1;
			boolean selected = false;
			for (int i=0; i<n; i++) {
				if (visited[i]) {
					sour *= arr[i][0];
					bitter += arr[i][1];
					selected = true;
				}
			}
			if (selected && Math.abs(sour-bitter)<min) min = Math.abs(sour-bitter);
			return;
		}
		
		visited[idx] = true;
		powerset(idx+1);
		visited[idx] = false;
		powerset(idx+1);
	}
}
