package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_2805_나무자르기 {
	static int n, m, max, ans;
	static int[] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		arr = new int[n];
		st = new StringTokenizer(br.readLine());
		max = 0;
		for (int i=0; i<n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			max = Math.max(tmp, max);
			arr[i] = tmp;
		}
		search(0, max);
		System.out.println(ans);
	}
	static void search(int left, int right) {
		if (left>right) return;
		// 재귀 
		int mid = (left+right)/2;
		long sum = 0;
		for (int i=0; i<n; i++) {
			if (mid < arr[i]) sum += arr[i]-mid;
		}
		if (sum>=m) {
			ans = mid;
			search(mid+1, right);
		}
		else search(left, mid-1);
	}
}
