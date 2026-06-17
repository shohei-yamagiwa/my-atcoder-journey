import java.util.Scanner;

public class Prelim1681 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder result = new StringBuilder();
		
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			int sum = 0;
			
			for (int i = 1; i <= n; i++) {
				sum += (int) (i * ((n + 1) * (n / 2.0)));
			}
			
			result.append(sum);
			if (sc.hasNext()) {
				result.append(System.lineSeparator());
			}
		}
		
		sc.close();
		
		System.out.print(result);
	}
}
