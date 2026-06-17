import java.util.Scanner;

public class Prelim1682 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		StringBuilder ans = new StringBuilder();
		
		while (true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			
			String s0 = sc.next();
			String s1 = s0;
			int maxDuplicationLength = 0;
			
			StringBuilder result = new StringBuilder(s0);
			
			for (int i = 0; i < n - 1; i++) {
				String part = s1.substring(0, i + 1);
				if (s0.endsWith(part)) {
					maxDuplicationLength = part.length();
				}
			}
			
			result.append(s1, maxDuplicationLength, s1.length());
			ans.append(result).append(System.lineSeparator());
		}
		
		sc.close();
		
		System.out.print(ans);
	}
}
