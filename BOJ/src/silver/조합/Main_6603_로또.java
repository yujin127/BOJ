package silver.조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_6603_로또 {
	static int[] arr;
	static int[] sel;
	static int k;
	static int h = 6;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			String str = br.readLine();
			if (str==null || str.trim().equals("0")) break;
			
			StringTokenizer st = new StringTokenizer(str);
			k = Integer.parseInt(st.nextToken());
			arr = new int[k];
			sel = new int[h];
			for (int i=0; i<k; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			comb(0, 0);
			System.out.println();
		}
	}
	
	static void comb(int idx, int sidx) {
		// end part
		if (sidx == 6) {
			for (int i=0; i<6; i++) {
				System.out.print(sel[i]+" ");
			}
			System.out.println();
			return;
		}
		for (int i=idx; i<=k-h+sidx; i++) {
			sel[sidx] = arr[i];
			comb(i+1, sidx+1);
		}
	}
}
