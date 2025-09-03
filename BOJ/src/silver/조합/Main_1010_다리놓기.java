package silver.조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_1010_다리놓기 {
	static long nCr(int m, int n) {
	    if (n > m - n) n = m - n;
	    long res = 1;
	    for (int i = 1; i <= n; i++) {
	        res = res * (m - n + i) / i; // 매 단계 정수 나눗셈 성립
	    }
	    return res;
	}

	public static void main(String[] args) throws Exception {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    int T = Integer.parseInt(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    while (T-- > 0) {
	        StringTokenizer st = new StringTokenizer(br.readLine());
	        int n = Integer.parseInt(st.nextToken());
	        int m = Integer.parseInt(st.nextToken());
	        sb.append(nCr(m, n)).append('\n'); // 1010: C(m, n)
	    }
	    System.out.print(sb.toString());
	}
//	static int[] arr;
//	static int[] sel;
//	static int n, m, ans;
//	
//	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		int T = Integer.parseInt(br.readLine());
//		for (int tc=1; tc<=T; tc++) {
//			StringTokenizer st = new StringTokenizer(br.readLine());
//			n = Integer.parseInt(st.nextToken());
//			m = Integer.parseInt(st.nextToken());
//			ans = 0;
//			comp(0, 0);
//			System.out.println(ans);
//		}
//	}
//
//	static void comp(int idx, int sidx) {
//		if (sidx==n) {
//			ans ++;
//			return;
//		}
//		for (int i=idx; i<=m-n+sidx; i++) {
//			comp(i+1, sidx+1);
//		}
//	}
}
