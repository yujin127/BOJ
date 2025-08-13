package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 방배정_13300 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		List<int[]> list = new ArrayList<>();
		for (int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int grade = Integer.parseInt(st.nextToken());
			list.add(null);
		}
	}
}
