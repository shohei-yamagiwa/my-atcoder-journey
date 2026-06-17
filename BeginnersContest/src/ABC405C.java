import java.util.Scanner;

public class ABC405C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        long[] sums = new long[N + 1];
        for (int i = 1; i <= N; i++) {
            long A = sc.nextLong();

            sums[i] = sums[i - 1] + A;
        }

        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += (sums[i] - sums[i - 1]) * (sums[N] - sums[i]);
        }

        System.out.println(ans);
    }
}
