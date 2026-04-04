import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ABC085B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Set<Integer> mochi = new TreeSet<>();
		
		for (int i = 0; i < N; i++) {
			mochi.add(sc.nextInt());
		}
		
		System.out.println(mochi.size());
	}
}
