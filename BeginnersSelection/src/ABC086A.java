import java.util.Scanner;

public class ABC086A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		
		String result = "Odd";
		if (a % 2 == 0 || b % 2 == 0) {
			result = "Even";
		}
		
		System.out.println(result);
	}
}
