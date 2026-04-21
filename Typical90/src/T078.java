import java.util.Arrays;
import java.util.Scanner;

public class T078 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int[] lowerNodeCounts = new int[N + 1];
		
		for (int i = 0; i < M; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			assert a != b;
			
			if (a > b) {
				lowerNodeCounts[a]++;
			} else {
				lowerNodeCounts[b]++;
			}
		}
		
		int result = 0;
		for (int i : lowerNodeCounts) {
			if (i == 1) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
