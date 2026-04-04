import java.util.Arrays;
import java.util.Scanner;

public class ABC081A {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		long result = Arrays.stream(scanner.next().split("")).filter((s) -> s.equals("1")).count();
		System.out.println(result);
	}
}
