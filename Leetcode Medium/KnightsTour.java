import java.util.*;

public class KnightsTour {
    static int[] x = { -2, -2, -1, 1, 2, 2, 1, -1 };
    static int[] y = { -1, 1, 2, 2, 1, -1, -2, -2 };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] chessboard = new int[n][n];
        for (int[] c : chessboard)
            Arrays.fill(c, -1);
        chessboard[0][0] = 1;
        solve(chessboard, n, 0, 0, 2);
        sc.close();
    }

    static void solve(int[][] chessboard, int n, int row, int col, int step) {
        if (step == (n * n) + 1) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(chessboard[i][j] + " ");
                }
                System.out.println();
            }
            System.out.println();
        } else {
            for (int i = 0; i < 8; i++) {
                if (isSafe(chessboard, n, row + x[i], col + y[i])) {
                    chessboard[row + x[i]][col + y[i]] = step;
                    solve(chessboard, n, row + x[i], col + y[i], step + 1);
                    chessboard[row + x[i]][col + y[i]] = -1;
                }
            }
        }
    }

    static boolean isSafe(int[][] chessboard, int n, int row, int col) {
        if (row >= 0 && row < n && col >= 0 && col < n && chessboard[row][col]==-1)
            return true;
        return false;
    }
}
