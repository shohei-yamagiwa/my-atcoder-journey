import java.util.Scanner;

public class ABC455B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int H = sc.nextInt();
        int W = sc.nextInt();

        // Setup input board
        char[][] board = new char[H + 1][W + 1];
        for (int i = 1; i <= H; i++) {
            String S = sc.next();
            for (int j = 1; j <= W; j++) {
                board[i][j] = S.charAt(j - 1);
            }
        }

        int result = 0;

        for (int h1 = 1; h1 <= H; h1++) {
            for (int h2 = h1; h2 <= H; h2++) {
                for (int w1 = 1; w1 <= W; w1++) {
                    for (int w2 = w1; w2 <= W; w2++) {
                        boolean same = true;
                        for (int i = h1; i <= h2; i++) {
                            for (int j = w1; j <= w2; j++) {
                                if (board[i][j] != board[h1 + h2 - i][w1 + w2 - j]) {
                                    same = false;
                                    break;
                                }
                            }
                            if (!same) {
                                break;
                            }
                        }

                        if (same) {
                            result++;
                        }
                    }
                }
            }
        }

        System.out.println(result);
    }
}
