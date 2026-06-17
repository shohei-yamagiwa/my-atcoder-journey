import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Prelim1683 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder ans = new StringBuilder();
		while (true) {
			int n = sc.nextInt();
			long m = sc.nextLong();
			if (n == 0 && m == 0) {
				break;
			}
			
			long[] a = IntStream.range(0, n).mapToLong(i -> sc.nextLong()).toArray();
			
			long basicWorkingDays = (m / 7) * 5 + Math.min(m % 7, 5);
			long holidaysCount = Arrays.stream(a).distinct().filter(d -> d <= m && d % 7 != 6 && d % 7 != 0).count();
			
			ans.append(basicWorkingDays - holidaysCount).append(System.lineSeparator());
		}
		
		System.out.print(ans);
	}
}
