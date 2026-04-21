import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class T061 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Q = sc.nextInt();
		
		int firstKey = 0;
		HashMap<Integer, Long> map = new HashMap<>();
		List<Long> results = new ArrayList<>();
		
		for (int i = 0; i < Q; i++) {
			int t = Integer.parseInt(sc.next());
			long x = Long.parseLong(sc.next());
			
			switch (t) {
				case 1: {
					map.put(firstKey - 1, x);
					firstKey--;
					break;
				}
				case 2: {
					map.put(firstKey + map.size(), x);
					break;
				}
				case 3: {
					long value = map.get(firstKey + (int) x - 1);
					
					results.add(value);
					break;
				}
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < results.size(); i++) {
			sb.append(results.get(i));
			
			if (i != results.size() - 1) {
				sb.append(System.lineSeparator());
			}
		}
		
		System.out.println(sb);
	}
}
