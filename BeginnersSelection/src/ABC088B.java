import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class ABC088B {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		Queue<Integer> nums = new PriorityQueue<>(Collections.reverseOrder());
		
		for (int i = 0; i < N; i++) {
			nums.add(sc.nextInt());
		}
		
		int aliceScore = 0;
		int bobScore = 0;
		
		while (!nums.isEmpty()) {
			aliceScore += nums.poll();
			
			if (!nums.isEmpty()) {
				bobScore += nums.poll();
			}
		}
		
		System.out.println(aliceScore - bobScore);
	}
}
