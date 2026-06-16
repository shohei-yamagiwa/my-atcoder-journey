import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class ABC433C_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String S = scanner.nextLine();
		
		Deque<CharLength> blockLengths = new ArrayDeque<>();
		
		int i = 0;
		while (i < S.length()) {
			char targetChar = S.charAt(i);
			int length = 0;
			while (true) {
				if (i + length != S.length() && targetChar == S.charAt(i + length)) {
					length++;
				} else {
					break;
				}
			}
			
			blockLengths.add(new CharLength(targetChar, length));
			
			i += length;
		}
		
		int result = 0;
		
		CharLength lastCharLength = null;
		while (blockLengths.peek() != null) {
			if (lastCharLength == null) { // First time
				lastCharLength = blockLengths.poll();
			} else {
				CharLength currentCharLength = blockLengths.poll();
				
				if (currentCharLength.c == lastCharLength.c + 1) {
					result += Math.min(lastCharLength.length, currentCharLength.length);
				}
				
				lastCharLength = currentCharLength;
			}
		}
		
		System.out.println(result);
	}
	
	record CharLength(char c, int length) {
	}
}
