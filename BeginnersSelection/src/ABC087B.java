import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ABC087B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int X = sc.nextInt();
		
		int[] a = IntStream.rangeClosed(0, A).map((i) -> i * 500).filter((i) -> i <= X).toArray();
		int[] b = IntStream.rangeClosed(0, B).map((i) -> i * 100).filter((i) -> i <= X).toArray();
		Set<Integer> c = IntStream.rangeClosed(0, C).map((i) -> i * 50).filter((i) -> i <= X).boxed().collect(Collectors.toSet());
		
		int result = 0;
		
		for (int i : a) {
			for (int j : b) {
				if (c.contains(X - (i + j))) {
					result++;
				}
			}
		}
		
		System.out.println(result);
	}
}
