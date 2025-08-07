package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 알고리즘수업_버블정렬1_23968 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine(), " ");
		int[] arr = new int[n];
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int count = 0;
		for (int i=n-1; i>0; i--) {
			for (int j=0; j<i; j++) {
				if (arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					count ++;

					if (count == k) {
						System.out.println(Math.min(arr[j], arr[j+1])+ " "+Math.max(arr[j], arr[j+1]));
						return;
					}
				}
			}
		}
		System.out.println(-1);
	}
}
