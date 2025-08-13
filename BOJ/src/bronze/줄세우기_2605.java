package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class 줄세우기_2605 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		List<Integer> list = new ArrayList<>();
		list.add(1);
		for (int i=1; i<n; i++) {
			list.add(i-arr[i], (i+1));
		}
		StringBuilder sb = new StringBuilder();
		for (int i=0; i<n; i++) sb.append(list.get(i)).append(" ");
		System.out.println(sb);
	}
}
