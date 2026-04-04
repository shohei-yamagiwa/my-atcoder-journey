import java.util.Scanner;

public class ABC083B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // Max = 10^4
		int A = sc.nextInt(); // Min = 1
		int B = sc.nextInt(); // Max = 36
		int sum = 0;
		
		for (int i = 0; i <= 1; i++) { // 10000の位
			for (int j = 0; j <= 9; j++) { // 1000の位
				for (int k = 0; k <= 9; k++) { // 100の位
					for (int l = 0; l <= 9; l++) { // 10の位
						int currentDigitSum = (i + j + k + l);
						int currentBase = i * 10000 + j * 1000 + k * 100 + l * 10;
						
						int start = Math.max(A - currentDigitSum, 0);
						if (start > 9) {
							continue;
						}
						int end = Math.min(B - currentDigitSum, 9);
						if (end < 0) {
							continue;
						}
						
						int startValue = currentBase + start;
						if (startValue > N) {
							break;
						}
						
						int endValue = currentBase + end;
						if (endValue > N) {
							endValue = N;
						}
						
						sum += successiveSum(startValue, endValue);
//						System.out.println("Start: " + startValue + " " + "End: " + endValue);
						
						if (endValue == N) {
							break;
						}
					}
				}
			}
		}
		
		System.out.println(sum);
	}
	
	/**
	 * Calculate the integer sum between start and end (with including them)
	 *
	 * @param start The initial value to be sum
	 * @param end   The last value to be sum
	 */
	private static int successiveSum(int start, int end) {
		int n = end - start + 1;
		return (start + end) * n / 2;
	}
}
