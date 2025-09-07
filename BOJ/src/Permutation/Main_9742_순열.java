package Permutation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_9742_순열 {
	static int n, nth, cnt;
	static boolean find;
	static boolean[] visited;
	static String str; // 받아온 문자열, 조합되는 순열 들 
	static StringBuilder tmp;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		while ((line=br.readLine())!=null && !line.isEmpty()) {
			StringTokenizer st = new StringTokenizer(line);
			str = st.nextToken();
			nth = Integer.parseInt(st.nextToken());
			n = str.length();
			visited = new boolean[n];
			tmp = new StringBuilder();
			cnt = 1;
			find = false;
			perm(0);
			if (!find) System.out.println(str+" "+nth+" = "+"No permutation");
		}
	}
	static void perm(int index) {
		if (find) return;
		if (index == n) {
			if (cnt == nth) {
				System.out.println(str+" "+nth+" = "+tmp);
				find = true;
			}
			cnt ++;
			return;
		}
		for (int i=0; i<n; i++) {
			if (visited[i]) continue;
			tmp.append(str.charAt(i));
			visited[i] = true;
			perm(index+1);
			tmp.deleteCharAt(tmp.length()-1);
			visited[i] = false;
		}
	}
}
