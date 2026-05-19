import java.util.*;

public class T002 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		if (N % 2 == 1) {
			return;
		}
		assert N >= 1 && N <= 20 && N % 2 == 0;
		
		Set<String> results = build(Set.of("()"), N);
		String[] resultsArray = results.toArray(new String[0]);
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < resultsArray.length; i++) {
			sb.append(resultsArray[i]);
			if (i != resultsArray.length - 1) {
				sb.append(System.lineSeparator());
			}
		}
		
		System.out.println(sb);
	}
	
	private static Set<String> build(Set<String> strings, int n) {
		if (n == 2) {
			return strings;
		}

		Set<String> newStrings = new TreeSet<>();

		for (String result : strings) {
			newStrings.add("(" + result + ")");
		}
		for (String result : strings) {
			newStrings.add(result + "()");
			newStrings.add("()" + result);
		}
		return build(newStrings, n - 2);
	}
}
