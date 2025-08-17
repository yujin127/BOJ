package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 스위치켜고끄기_1244 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) arr[i] = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		int[] gender = new int[m];
		int[] num = new int[m];
		for (int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			gender[i] = Integer.parseInt(st.nextToken());
			num[i] = Integer.parseInt(st.nextToken());
		}
		for (int i=0; i<m; i++) {
			// 남자일 때 
			if (gender[i]==1) {
				for (int j=num[i]-1; j<n; j+=num[i]) {
					if (arr[j]==0) arr[j] = 1;
					else arr[j] = 0;
				}
			}
			// 여자일 때 
			else {
				int center = num[i]-1;
				if (arr[center] == 0) arr[center] = 1;
				else arr[center] = 0;
				int x = center - 1;
				int y = center + 1;
				while (x>=0 && y>= 0 && x<n && y<n&& arr[x]==arr[y]) {
					if(arr[x]==0) arr[x] = 1;
					else arr[x] = 0;
					if(arr[y] == 0) arr[y] = 1;
					else arr[y] = 0;
					x --; y ++;
				}
			}
		}
		for (int k=0; k<n/20+1; k++) {
			for (int i=0; i<20; i++) {
				if ((i+k*20)<n) sb.append(arr[i+k*20]).append(" ");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}
