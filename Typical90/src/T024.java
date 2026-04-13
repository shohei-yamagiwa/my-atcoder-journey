import java.util.Scanner;

public class T024 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		long K = scanner.nextLong();
		long[] A = new long[N];
		long[] B = new long[N];
		
		for (int i = 0; i < N; i++) {
			A[i] = scanner.nextLong();
		}
		for (int i = 0; i < N; i++) {
			B[i] = scanner.nextLong();
		}
		
		long calculateCount = 0;
		for (int i = 0; i < N; i++) {
			long diff = Math.abs(A[i] - B[i]);
			calculateCount += diff;
		}
		
		if (calculateCount > K) {
			System.out.println("No");
			return;
		}
		
		long countDiff = K - calculateCount;
		if (countDiff % 2 == 0) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
