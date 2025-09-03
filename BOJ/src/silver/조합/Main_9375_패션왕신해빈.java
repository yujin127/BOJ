package silver.조합;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main_9375_패션왕신해빈 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		for (int tc=1; tc<=T; tc++) {
			int n = Integer.parseInt(br.readLine());
			HashMap<String, Integer> map = new HashMap<>();
			for (int i=0; i<n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				st.nextToken();
				String k = st.nextToken();
				map.put(k, map.getOrDefault(k, 0)+1);
			}
			int ans = 1;
			for (int k : map.values()) {
				ans *= (k+1);
			}
			System.out.println(ans-1);
		}
	}
}
