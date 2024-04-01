import java.util.Arrays;

public class Sudoku {
    public static boolean isValid(int[][] grid, int r, int c, int k) {
        for (int i = 0; i < 9; i++) {
            if (grid[r][i] == k || grid[i][c] == k) {
                return false;
            }
        }
        int boxRowStart = r - r % 3;
        int boxColStart = c - c % 3;
        for (int i = boxRowStart; i < boxRowStart + 3; i++) {
            for (int j = boxColStart; j < boxColStart + 3; j++) {
                if (grid[i][j] == k) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean solve(int[][] grid, int r, int c) {
        if (r == 9) {
            return true;
        }
        if (c == 9) {
            return solve(grid, r + 1, 0);
        }
        if (grid[r][c] != 0) {
            return solve(grid, r, c + 1);
        }
        for (int k = 1; k <= 9; k++) {
            if (isValid(grid, r, c, k)) {
                grid[r][c] = k;
                if (solve(grid, r, c + 1)) {
                    return true;
                }
                grid[r][c] = 0;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 4, 0, 5, 0, 0, 0, 0},
                {9, 0, 0, 7, 3, 4, 6, 0, 0},
                {0, 0, 3, 0, 2, 1, 0, 4, 9},
                {0, 3, 5, 0, 9, 0, 4, 8, 0},
                {0, 9, 0, 0, 0, 0, 0, 3, 0},
                {0, 7, 6, 0, 1, 0, 9, 2, 0},
                {3, 1, 0, 9, 7, 0, 2, 0, 0},
                {0, 0, 9, 1, 8, 2, 0, 0, 3},
                {0, 0, 0, 0, 6, 0, 1, 0, 0}
        };
        if (solve(grid, 0, 0)) {
            for (int[] row : grid) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("solution does not exist");
        }
    }
}


