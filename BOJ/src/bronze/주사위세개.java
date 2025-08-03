package bronze;

import java.io.IOException;
import java.util.Scanner;

public class 주사위세개 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int cnt = 1;
		if (a==b && a==c && b==c) System.out.println(10000+a*1000);
		else if (a!=b&&b!=c&&a!=c) {
			int max = Integer.MIN_VALUE;
			if (max<a) max = a;
			if (max<b) max = b;
			if (max<c) max = c;
			System.out.println(max*100);
		}
		else {
			if (a==b && a!=c) System.out.println(1000+a*100);
			if (a==c && a!=b) System.out.println(1000+a*100);
			if (b==c && a!=b) System.out.println(1000+b*100);
		}
	}
}
