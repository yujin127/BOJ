package Powerset;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1182_부분수열의합 {
	static int n, s, ans;
	static int[] arr;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		s = Integer.parseInt(st.nextToken());
		arr = new int[n];
		visited = new boolean[n];
		st = new StringTokenizer(br.readLine(), " ");
		for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		ans = 0;
		powerset(0);
		System.out.println(ans);
	}
	public static void powerset(int idx) {
		if (idx == n) {
			int tmp = 0;
			boolean picked = false;
			for (int i=0; i<n; i++) {
				if (visited[i]) {
					tmp += arr[i];
					picked = true;
				}
			}
			if (picked && tmp==s) ans ++;
			return;
		}
		visited[idx] = true;
		powerset(idx + 1);
		visited[idx] = false;
		powerset(idx + 1);
	}
}
