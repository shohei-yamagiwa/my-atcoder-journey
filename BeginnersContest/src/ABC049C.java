import java.util.Scanner;

public class ABC049C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String S = sc.nextLine();

        boolean ans = true;
        while (!S.isEmpty()) {
            if (S.endsWith("dream")) {
                S = S.substring(0, S.length() - 5);
                continue;
            }
            if (S.endsWith("dreamer")) {
                S = S.substring(0, S.length() - 7);
                continue;
            }
            if (S.endsWith("erase")) {
                S = S.substring(0, S.length() - 5);
                continue;
            }
            if (S.endsWith("eraser")) {
                S = S.substring(0, S.length() - 6);
                continue;
            }
            ans = false;
            break;
        }

        System.out.println(ans ? "YES" : "NO");
    }
}
