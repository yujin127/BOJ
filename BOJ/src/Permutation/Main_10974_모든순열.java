package Permutation;

import java.util.Scanner;

public class Main_10974_모든순열 {
	static int n;
	static int[] arr, result;
	static boolean[] visited;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new int[n];
		result = new int[n];
		visited = new boolean[n];
		for (int i=0; i<n; i++) arr[i] = i+1;
		perm(0);
	}
	
	static void perm(int idx) {
		if (idx == n) {
			for (int i=0; i<n; i++) {
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
