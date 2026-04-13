import java.util.Scanner;

public class T055 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long P = sc.nextLong();
		long Q = sc.nextLong();
		
		long[] remainders = new long[N];
		
		int result = 0;
		
		for (int i = 0; i < N; i++) {
			long A = sc.nextLong();
			
			remainders[i] = A;
		}
		
		for (int i = 0; i < N - 4; i++) {
			for (int j = i + 1; j < N - 3; j++) {
				for (int k = j + 1; k < N - 2; k++) {
					for (int s = k + 1; s < N - 1; s++) {
						for (int t = s + 1; t < N; t++) {
							long remainder = getRemainder(remainders[i], remainders[j], remainders[k], remainders[s], remainders[t], P);
							
							if (remainder == Q) {
								result++;
							}
						}
					}
				}
			}
		}
		
		System.out.println(result);
	}
	
	private static long getRemainder(long a, long b, long c, long d, long e, long P) {
		long remainder = (a * b) % P;
		remainder = (remainder * c) % P;
		remainder = (remainder * d) % P;
		remainder = (remainder * e) % P;
		return remainder;
	}
}
