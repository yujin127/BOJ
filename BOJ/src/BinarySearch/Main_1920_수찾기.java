package BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main_1920_수찾기 {
	static int[] a, b;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		b = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<m; i++) b[i] = Integer.parseInt(st.nextToken());
		Arrays.sort(a);
		for (int i=0; i<m; i++) {
			if(search(0, n-1, b[i])) System.out.println(1);
			else System.out.println(0);
		}
	}
	static boolean search(int left, int right, int target) {
		if (left>right) return false;
		int mid = (left+right)/2;
		if (a[mid] == target) return true;
		else if (a[mid]>target) return search(left, mid-1, target);
		else return search(mid+1, right, target);
	}
}
