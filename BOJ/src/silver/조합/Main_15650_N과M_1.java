package silver.조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_15650_N과M_1 {
	
	static int n;
	static int m;
	static int[] arr;
	static int[] sel;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		for (int i=1; i<=n; i++) arr[i-1] = i;
		sel = new int[m];
		comb(0, 0);
	}

	static void comb(int idx, int sidx) {
		if (sidx==m) {
			for (int i=0; i<m; i++) {
				System.out.print(sel[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i=idx; i<=n-m+sidx; i++) {
			sel[sidx] = arr[i];
			comb(i+1, sidx+1);
		}
	}
}
