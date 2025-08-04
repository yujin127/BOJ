package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 체스판다시칠하기 {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] temp = br.readLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		
		// 1차원배열로 입력받
		String[] checker = new String[n];
		for(int i=0; i<n; i++) {
			checker[i] = br.readLine();
		}
		// 팔방 탐색
		int[] same_r = {-1, 0, 1, 0};
		int[] same_c = {0, -1, 0, 1};
		int[] cross_r = {-1, 1, 1, -1};
		int[] cross_c = {-1, -1, 1, 1};
		
		int[] num = new int[n-7];
		for (int x=0; x<=n-8; x++) { // 8*8 배열 다 탐색 
			int coloring = 0;
			for (int i=0; i<8; i++) { // 8*8 배열의 행 탐색 
				for (int j=0; j<8; j++) { //8*8 배열의 열 탐색 
					char now = checker[i].charAt(j);
					for (int k=0; k<4; k++) { // 팔방탐색 
						if (i+same_r[k]>=0 && i+same_r[k]<i+8 && j+same_c[k]>=0 && j+same_c[k]<i+8) {
							if (now == checker[i+same_r[k]].charAt(j+same_c[k])) {
								coloring ++;
								StringBuilder sb = new StringBuilder(checker[i+same_r[k]]);
								sb.setCharAt(same_c[k], now=='W'?'B':'W');
								checker[i+same_r[k]] = sb.toString();
							}
							if (now != checker[i+cross_r[k]].charAt(j+cross_c[k])) {
								coloring ++;
								StringBuilder sb = new StringBuilder(checker[i+cross_r[k]]);
								sb.setCharAt(cross_c[k], now=='W'?'B':'W');
								checker[i+cross_r[k]] = sb.toString();
							}
						}
					}
				}
				
			}
			num[x] = coloring;
		}
		int max = Integer.MIN_VALUE;
		for (int i=0; i<num.length; i++) {
			if (num[i]>max) max=num[i];
		}
		System.out.println(max);
	}
}
