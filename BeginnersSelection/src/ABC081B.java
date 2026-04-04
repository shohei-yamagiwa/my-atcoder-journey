import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ABC081B {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = Integer.parseInt(scanner.nextLine());
		List<Integer> nums = Arrays.stream(scanner.nextLine().split(" ")).map(Integer::parseInt).toList();
		
		int result = Integer.MAX_VALUE;
		for (Integer num : nums) {
			result = Math.min(getDivisionCount(num), result);
		}
		
		System.out.println(result);
	}
	
	private static int getDivisionCount(int n) {
		int count = 0;
		
		while (n % 2 == 0) {
			n = n / 2;
			count++;
		}
		
		return count;
	}
}
