import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class ABC395C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int maxA = 1000000;

        SortedSet<Integer> lengths = new TreeSet<>();
        int[] lastIndices = new int[maxA + 1];
        for (int i = 1; i <= N; i++) {
            int A = sc.nextInt();

            if (lastIndices[A] == 0) {
                lastIndices[A] = i;
                continue;
            }

            lengths.add(i - lastIndices[A] + 1);
            lastIndices[A] = i;
        }

        int ans = -1;
        if (!lengths.isEmpty()) {
            ans = lengths.first();
        }

        System.out.println(ans);
    }
}
