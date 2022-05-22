import java.util.*;

public class NQueens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[][] matrix = new char[n][n];
        for (char[] c : matrix)
            Arrays.fill(c, '-');
        solve(matrix, 0, n);
        sc.close();
    }

    static void solve(char[][] chessboard, int row, int n) {
        if (row == n) {//base case
            for (int i = 0; i < chessboard.length; i++) {
                for (int j = 0; j < chessboard[0].length; j++) {
                    System.out.print(chessboard[i][j] + " ");
                }
                System.out.println();
            }
        } else { //recursive case
            for (int col = 0; col < chessboard[0].length; col++) {
                if (isSafe(chessboard, row, col, n)) {
                    chessboard[row][col] = 'Q';
                    solve(chessboard, row + 1, n);
                    chessboard[row][col] = '-';
                }
            }
        }
    }

    static boolean isSafe(char[][] chessboard, int row, int col, int n) {
        int i = row;
        int j = col;
        while (i >= 0) { // plus path--row and column
            if (chessboard[i][j] == 'Q')
                return false;
            i--;
        }
        i = row;
        j = col;
        while (i >= 0 && j >= 0) { // left diagonal
            if (chessboard[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        i = row;
        j = col;
        while (i >= 0 && j < n) { // right diagonal
            if (chessboard[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        return true;
    }
}