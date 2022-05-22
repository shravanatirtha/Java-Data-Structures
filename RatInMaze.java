import java.util.*;

public class RatInMaze {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] maze = new int[n][m];
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                maze[i][j] = sc.nextInt();
        int x[] = { 0, 1 };
        int y[] = { 1, 0 };
        if (solve(maze, n, m, 0, 0, x, y))
            System.out.println("Yes");
        else
            System.out.println("No");
        sc.close();
    }

    static boolean solve(int[][] maze, int n, int m, int row, int col, int[] x, int[] y) {
        if (row == (n - 1) && col == (m - 1)) // base case
            return true;
        else //recursive case
            for (int i = 0; i < 2; i++)
                if (isSafe(maze, row + x[i], col + y[i], n, m))
                    return solve(maze, n, m, row + x[i], col + y[i], x, y);

        return false;
    }

    static boolean isSafe(int[][] maze, int row, int col, int n, int m) {
        if (row >= 0 && row < n && col >= 0 && col < m) {
            if (maze[row][col] == 0)
                return true;
        }
        return false;
    }
}
