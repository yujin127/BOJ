package Combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15650_N과M_2 {
	
	static int n;
	static int m;
	static int[] arr;
	static int[] result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n+1];
		result = new int[m];
		for (int i=0; i<n; i++) arr[i] = i+1;
		comb(0, 0);
	}
	
	static void comb(int idx, int sidx) {
		// end condition
		if (sidx == m) {
			for (int i=0; i<m; i++) {
				System.out.print(result[i]+" ");
			}
			System.out.println();
			return;
		}
		// recursion part
		for (int i=idx; i<=n-m+sidx; i++) {
			result[sidx] = arr[i];
			comb(i+1, sidx+1);
		}
	}
}
