import java.util.*;

public class ABC398C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Set<Integer> duplicatedNums = new HashSet<>();
        SortedMap<Integer, Integer> numToPerson = new TreeMap<>(Comparator.reverseOrder());
        for (int i = 1; i <= N; i++) {
            int A = sc.nextInt();
            if (duplicatedNums.add(A)) {
                numToPerson.put(A, i);
            } else {
                numToPerson.remove(A);
            }
        }

        int ans;
        try {
            ans = numToPerson.get(numToPerson.firstKey());
        } catch (NoSuchElementException e) {
            ans = -1;
        }

        System.out.println(ans);
    }
}
