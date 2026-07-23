import java.util.*;

public class NQueens {

    public List<List<String>> placeSensors(int n) {

        List<List<String>> ans = new ArrayList<>();

        int[] col = new int[n];

        backtrack(n, 0, col, ans);

        return ans;
    }

    void backtrack(int n,
                   int row,
                   int[] col,
                   List<List<String>> ans) {

        if (row == n) {

            ans.add(buildBoard(n, col));
            return;
        }

        for (int i = 0; i < n; i++) {

            if (isSafe(row, i, col)) {

                col[row] = i;

                backtrack(n, row + 1, col, ans);
            }
        }
    }

    boolean isSafe(int row, int c, int[] col) {

        for (int i = 0; i < row; i++) {

            if (col[i] == c)
                return false;

            if (Math.abs(col[i] - c) == Math.abs(i - row))
                return false;
        }

        return true;
    }

    List<String> buildBoard(int n, int[] col) {

        List<String> board = new ArrayList<>();

        for (int i = 0; i < n; i++) {

            StringBuilder sb = new StringBuilder();

            for (int j = 0; j < n; j++) {

                if (col[i] == j)
                    sb.append("Q");
                else
                    sb.append(".");
            }

            board.add(sb.toString());
        }

        return board;
    }
}