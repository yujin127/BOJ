package Permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_10819_차이를최대로 {
	static int n, max;
	static int[] arr, result;
	static boolean[] visited;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		max = 0;
		result = new int[n];
		visited = new boolean[n];
		perm(0);
		System.out.println(max);
	}
	static void perm(int idx) {
		if (idx == n) {
			int tmp = 0;
			for (int i=0; i<n-1; i++) {
				tmp += Math.abs(result[i]-result[i+1]);
			}
			if (tmp>max) max = tmp;
			return;
		}
		for (int i=0; i<n; i++) {
			if (visited[i]) continue;
			result[idx] = arr[i];
			visited[i] = true;
			perm(idx + 1);
			visited[i] = false;
		}
	}
}
