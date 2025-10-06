import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingTest_부산은행 {
	static int answer=Integer.MAX_VALUE;
	static int n;
	static int[] start, target;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		String input1 = br.readLine();
		String input2 = br.readLine();
		start = new int[n];
		target = new int[n];
		for (int i=0; i<n; i++) {
			start[i] = input1.charAt(i)-'0';
			target[i] = input2.charAt(i) - '0';
		}
		dfs(0, start.clone(), 0);
		System.out.println(answer);
	}
	
	static void dfs(int idx, int[] cur, int cnt) {
		if (cnt>=answer) return;
		
		if (idx==n) {
			answer = Math.min(answer, cnt);
			return;
		}
		int curval = cur[idx];
		int targetval = target[idx];
		
		int up = (targetval - curval + 10)%10;
		int down = (curval - targetval + 10)%10;
		
		int[] uparr = cur.clone();
		for (int i=idx; i<n; i++) {
			uparr[i] = (uparr[i] + up)%10;
		}
		dfs(idx+1, uparr, cnt+up);
		
		int[] downarr = cur.clone();
		for (int i=idx; i<n; i++) {
			downarr[i] = (downarr[i]-down+10)%10;
		}
		dfs(idx+1, downarr, cnt+down);
	}
}
