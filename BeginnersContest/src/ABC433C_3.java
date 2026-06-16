import java.util.Scanner;

public class ABC433C_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		
		int result = 0;
		
		for (int i = 0; i < S.length(); i++) {
			int length = 0;
			while (true) {
				if (i + length != S.length() && S.charAt(i) == S.charAt(i + length)) {
					length++;
				} else {
					break;
				}
			}
			
			boolean valid = true;
			for (int j = 0; j < length; j++) {
				if (i + j + length >= S.length() || S.charAt(i + j) != S.charAt(i + j + length) - 1) {
					valid = false;
					break;
				}
			}
			
			if (valid) {
				result++;
			}
		}
		
		System.out.println(result);
	}
}
