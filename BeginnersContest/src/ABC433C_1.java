import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ABC433C_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		
		int result = 0;
		for (int i = 0; i < S.length(); i++) {
			if (check(i, new ArrayDeque<>(), true, S)) {
				result++;
			}
		}
		
		System.out.println(result);
	}
	
	private static boolean check(int i, Deque<Integer> firstHalf, boolean stacking, String S) {
		if (i >= S.length()) {
			if (!stacking && firstHalf.isEmpty()) {
				return true;
			} else {
				return false;
			}
		}
		
		int currentNum = Character.getNumericValue(S.charAt(i));
		
		if (stacking && firstHalf.isEmpty()) {
			firstHalf.add(currentNum);
			return check(i + 1, firstHalf, true, S);
		}
		
		if (stacking && currentNum == firstHalf.peek()) {
			firstHalf.add(currentNum);
			return check(i + 1, firstHalf, true, S);
		}
		
		if (!firstHalf.isEmpty() && currentNum == firstHalf.poll() + 1) {
			if (firstHalf.isEmpty()) {
				return true;
			}
			return check(i + 1, firstHalf, false, S);
		} else {
			return false;
		}
	}
}
