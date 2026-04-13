import java.util.Scanner;

public class T010 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		
		int[][] scoreSums = new int[3][N + 1];
		scoreSums[1][0] = 0;
		scoreSums[2][0] = 0;
		
		for (int i = 1; i <= N; i++) {
			int C = scanner.nextInt();
			int P = scanner.nextInt();
			
			if (C == 1) {
				scoreSums[1][i] = scoreSums[1][i - 1] + P;
				scoreSums[2][i] = scoreSums[2][i - 1];
			} else {
				scoreSums[1][i] = scoreSums[1][i - 1];
				scoreSums[2][i] = scoreSums[2][i - 1] + P;
			}
		}
		
		int Q = scanner.nextInt();
		StringBuilder sb = new StringBuilder();
		
		for (int i = 1; i <= Q; i++) {
			int L = scanner.nextInt();
			int R = scanner.nextInt();
			
			int A = scoreSums[1][R] - scoreSums[1][L - 1];
			int B = scoreSums[2][R] - scoreSums[2][L - 1];
			
			sb.append(A).append(" ").append(B);
			if (i < Q) {
				sb.append("\n");
			}
		}
		
		System.out.print(sb);
	}
}
