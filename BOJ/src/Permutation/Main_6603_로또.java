package Permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_6603_로또 {
	static int n;
	static int m = 6;
	static int[] arr, result;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while (!(line = br.readLine()).equals("0")) {
			StringTokenizer st = new StringTokenizer(line);
			n = Integer.parseInt(st.nextToken());
			arr = new int[n];
			for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
			result = new int[m];
			comb(0, 0);
			System.out.println();
		}
	}
	static void comb(int idx, int sidx) {
		if (sidx == 6) {
			Arrays.sort(result);
			for (int i=0; i<6; i++) System.out.print(result[i]+" ");
			System.out.println();
			return;
		}
		for (int i=idx; i<=n-m+sidx; i++) {
			result[sidx] = arr[i];
			comb(i+1, sidx+1);
		}
	}
}
