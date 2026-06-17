import java.util.Scanner;

public class ABC394C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        int firstWFoundAt = -1;
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);

            if (c == 'W') {
                firstWFoundAt = firstWFoundAt == -1 ? i : firstWFoundAt;

                if (i == S.length() - 1) {
                    ans.repeat('W', i - firstWFoundAt).append('W');
                }
                continue;
            }

            if (c == 'A') {
                if (firstWFoundAt != -1) {
                    ans.append('A').repeat("C", i - firstWFoundAt);
                    firstWFoundAt = -1;
                } else {
                    ans.append(c);
                }
                continue;
            }

            if (firstWFoundAt != -1) {
                ans.repeat("W", i - firstWFoundAt).append(c);

                firstWFoundAt = -1;
            } else {
                ans.append(c);
            }
        }

        System.out.println(ans);
    }
}
