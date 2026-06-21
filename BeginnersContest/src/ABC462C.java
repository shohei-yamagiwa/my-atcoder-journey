import java.util.*;

public class ABC462C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        Map<Integer, List<Integer>> xToY = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            xToY.put(i, new ArrayList<>());
        }

        int[] tempMinY = new int[N + 1]; // x -> minimum Y pos for each x
        for (int i = 0; i < N; i++) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            xToY.get(X).add(Y);
            tempMinY[X] = tempMinY[X] == 0 ? Y : Math.min(Y, tempMinY[X]);
        }

        int[] minY = new int[N + 1]; // x -> minimum Y pos
        minY[1] = tempMinY[1];
        for (int i = 2; i <= N; i++) {
            minY[i] = Math.min(tempMinY[i], minY[i - 1]);
        }

        int ans = 0;
        for (int x : xToY.keySet()) {
            for (int y : xToY.get(x)) {
                if (x == 1) {
                    ans++;
                    continue;
                }

                if (minY[x - 1] >= y) {
                    ans++;
                }
            }
        }

        System.out.println(ans);
    }
}
