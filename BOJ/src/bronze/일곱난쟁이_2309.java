package bronze;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class 일곱난쟁이_2309 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Integer> set = new TreeSet<>();
		for (int i=0; i<9; i++) {
			set.add(sc.nextInt());
		}
		Object[] tmp = set.toArray();
		for (int i=0; i<7; i++) {
			System.out.println(tmp[i]);
		}
	}
}
