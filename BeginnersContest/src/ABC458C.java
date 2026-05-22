import java.util.Scanner;

public class ABC458C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String S = sc.nextLine();
		char[] chars = S.toCharArray();
		
		long totalAmount = 0L;
		
		for (int i = 0; i < chars.length; i++) {
			char currentChar = chars[i];
			if (currentChar != 'C') {
				continue;
			}
			
			totalAmount += getAmount(i, chars.length);
		}
		
		System.out.println(totalAmount);
	}
	
	private static int getAmount(int currentIndex, int length) {
		int startDiff = currentIndex + 1;
		int endDiff = length - currentIndex;
		
		return Math.min(startDiff, endDiff);
	}
}
