package Permutation;

import java.util.Scanner;

public class Main_15649_N과M1 {
	static int n, m;
	static int[] arr, result;
	static boolean[] visited;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		arr = new int[n];
		for (int i=0; i<n; i++) arr[i] = i+1;
		result = new int[m];
		visited = new boolean[n];
		perm(0);
	}
	static void perm(int idx) {
		if (idx == m) {
			// 프린트 하는 함수
			for (int i=0; i<m; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i=0; i<n; i++) {
			if (visited[i]) continue;
			result[idx] = arr[i];
			visited[i] = true;
			perm(idx+1);
			visited[i] = false;
		}
	}
}
