import java.util.*;

public class ABC455C {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int K = sc.nextInt();
		
		Map<Integer, Long> numToAmount = new HashMap<>();
		
		for (int i = 0; i < N; i++) { // 10^5
			int A = sc.nextInt();
			
			numToAmount.put(A, numToAmount.getOrDefault(A, 0L) + A);
		}
		
		PriorityQueue<Long> filteredNums = new PriorityQueue<>(Comparator.reverseOrder());
		
		filteredNums.addAll(numToAmount.values());
		for (int i = 0; i < K; i++) {
			filteredNums.poll();
		}
		
		long result = 0L;
		
		for (long num : filteredNums) {
			result += num;
		}
		
		System.out.println(result);
	}
}
