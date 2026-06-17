import java.util.*;

public class ABC393C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        Map<Integer, Set<Integer>> connectedVertices = new HashMap<>(); // vertex -> all vertices the vertex connects to
        for (int i = 1; i <= N; i++) {
            connectedVertices.put(i, new HashSet<>());
        }

        int ans = 0;
        for (int i = 0; i < M; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            if (u == v) {
                ans++;
                continue;
            }

            if (connectedVertices.get(u).contains(v) && connectedVertices.get(v).contains(u)) {
                ans++;
                continue;
            }

            connectedVertices.get(u).add(v);
            connectedVertices.get(v).add(u);
        }

        System.out.println(ans);
    }
}
