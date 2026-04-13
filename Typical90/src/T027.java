import java.util.*;

public class T027 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Set<String> usernames = new HashSet<>();
		List<Integer> days = new ArrayList<>();
		
		for (int i = 0; i < N; i++) {
			String username = sc.next();
			if (usernames.contains(username)) {
				continue;
			}
			
			usernames.add(username);
			days.add(i + 1);
		}
		
		StringBuilder result = new StringBuilder();
		
		for (int i = 0; i < days.size(); i++) {
			int day = days.get(i);
			
			result.append(day);
			
			if (i != days.size() - 1) {
				result.append(System.lineSeparator());
			}
		}
		
		System.out.println(result);
	}
}
