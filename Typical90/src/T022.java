import java.util.Scanner;

public class T022 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long A = scanner.nextLong();
		long B = scanner.nextLong();
		long C = scanner.nextLong();
		
		long divisor = getGCD(getGCD(A, B), C);
		long result = (A / divisor) - 1 + (B / divisor) - 1 + (C / divisor) - 1;
		
		System.out.println(result);
	}
	
	private static long getGCD(long x, long y) {
		if (y == 0) {
			return x;
		}
		return getGCD(y, x % y);
	}
}
