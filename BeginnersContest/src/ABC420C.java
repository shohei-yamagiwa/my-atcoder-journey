import java.util.Scanner;
import java.util.stream.IntStream;

public class ABC420C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int Q = sc.nextInt();
		int[] A = IntStream.range(0, N).map(i -> sc.nextInt()).toArray();
		int[] B = IntStream.range(0, N).map(i -> sc.nextInt()).toArray();
		
		long sum = IntStream.range(0, N).mapToLong(i -> Math.min(A[i], B[i])).sum();
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < Q; i++) {
			String c = sc.next();
			int X = Integer.parseInt(sc.next());
			int V = Integer.parseInt(sc.next());
			
			int targetA = A[X - 1];
			int targetB = B[X - 1];
			
			sum -= Math.min(targetA, targetB);
			
			if (c.equals("A")) {
				A[X - 1] = V;
			}
			if (c.equals("B")) {
				B[X - 1] = V;
			}
			
			sum += Math.min(A[X - 1], B[X - 1]);
			
			result.append(sum);
			if (i != Q - 1) {
				result.append(System.lineSeparator());
			}
		}
		
		System.out.print(result);
	}
}
