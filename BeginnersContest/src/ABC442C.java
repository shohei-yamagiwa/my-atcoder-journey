import java.util.Arrays;
import java.util.Scanner;

public class ABC442C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		long[] reviewerCounts = new long[N];
		Arrays.fill(reviewerCounts, N - 1);
		
		for (int i = 0; i < M; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			reviewerCounts[A - 1]--;
			reviewerCounts[B - 1]--;
		}
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < reviewerCounts.length; i++) {
			long reviewerCount = reviewerCounts[i];
			if (reviewerCount < 3) {
				result.append(0);
			} else {
				long all = reviewerCount * (reviewerCount - 1) * (reviewerCount - 2);
				long duplicationCount = 3 * 2 * 1;
				
				result.append(all / duplicationCount);
			}
			
			if (i != reviewerCounts.length - 1) {
				result.append(" ");
			}
		}
		
		System.out.println(result);
	}
}
