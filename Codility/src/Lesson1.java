public class Lesson1 {
	public int solution(int N) {
		int maxLength = 0;
		int currentLength = 0;
		
		int dividend = N;
		int quotient = -1;
		int remainder;
		int lastRemainder = 0;
		
		while (quotient != 0) {
			quotient = dividend / 2;
			remainder = dividend % 2;
			
			if (remainder == 0 && (lastRemainder == 1 || currentLength > 0)) {
				currentLength++;
			} else {
				maxLength = Math.max(currentLength, maxLength);
				currentLength = 0;
			}
			
			lastRemainder = remainder;
			dividend = quotient;
		}
		
		return maxLength;
	}
}
