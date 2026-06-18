import java.util.*;

public class ABC392C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] P = new int[N + 1]; // person to faced person
        for (int i = 1; i <= N; i++) {
            P[i] = sc.nextInt();
        }

        SortedMap<Integer, Integer> bibNumToPerson = new TreeMap<>();
        Map<Integer, Integer> personToBibNum = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            int Q = sc.nextInt();

            bibNumToPerson.put(Q, i);
            personToBibNum.put(i, Q);
        }

        StringBuilder ans = new StringBuilder();
        bibNumToPerson.keySet().forEach(bibNum -> {
            int opponentBibNum = personToBibNum.get(P[bibNumToPerson.get(bibNum)]);
            ans.append(opponentBibNum).append(" ");
        });

        System.out.println(ans);
    }
}
