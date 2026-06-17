import java.util.*;

public class ABC455C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        long K = sc.nextLong();

        Map<Long, Long> map = new TreeMap<>();
        for (int i = 0; i < N; i++) {
            long A = sc.nextLong();
            map.put(A, map.getOrDefault(A, 0L) + A);
        }

        Queue<Long> sums = new PriorityQueue<>(Collections.reverseOrder());
        sums.addAll(map.values());

        for (long i = 0; i < K; i++) {
            sums.poll();
        }

        long result = 0;
        while (sums.peek() != null) {
            result += sums.poll();
        }

        System.out.println(result);
    }
}
