import java.util.*;

// 3 -1 6 5 -1 8 4 -1 -1 
// 5 2 -1 -1 -1 -1 -1 -1 -1 
// -1 8 7 -1 -1 -1 -1 3 1 
// -1 -1 3 -1 1 -1 -1 8 -1 
// 9 -1 -1 8 6 3 -1 -1 5 
// -1 5 -1 -1 9 -1 6 -1 -1 
// 1 3 -1 -1 -1 -1 2 5 -1 
// -1 -1 -1 -1 -1 -1 -1 7 4 
// -1 -1 5 2 -1 6 3 -1 -1

public class Sudoku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                matrix[i][j] = sc.nextInt();
        // for (int[] c : matrix)
        // Arrays.fill(c, -1);
        solve(matrix, 0, 0);
        sc.close();
    }

    static void solve(int[][] sudoku, int row, int col) {
        if (col == 9) {
            row++;
            col = 0;
        }
        if (row == 9) {
            System.out.println();
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    System.out.print(sudoku[i][j] + " ");
                }
                System.out.println();
            }
        } else if (sudoku[row][col] == -1) {
            for (int i = 1; i < 10; i++) {
                if (isSafe(sudoku, row, col, i)) {
                    sudoku[row][col] = i;
                    solve(sudoku, row, col + 1);
                    sudoku[row][col] = -1;
                }
            }
        } else {
            solve(sudoku, row, col + 1);
        }
    }

    static boolean isSafe(int[][] sudoku, int row, int col, int i) {
        for (int j = 0; j < sudoku.length; j++) {
            if (sudoku[row][j] == i || sudoku[j][col] == i)
                return false;
        }
        int k = (row / 3) * 3;
        int l = (col / 3) * 3;
        for (int a = k; a < k + 3; a++) {
            for (int b = l; b < l + 3; b++) {
                if (sudoku[a][b] == i)
                    return false;
            }
        }
        return true;
    }
}
