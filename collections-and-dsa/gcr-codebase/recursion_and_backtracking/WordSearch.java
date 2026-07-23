public class WordSearch {

    public boolean exists(char[][] board, String word) {

        int rows = board.length;
        int cols = board[0].length;

        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < cols; j++) {

                if (backtrack(board, word, 0, i, j, visited))
                    return true;
            }
        }

        return false;
    }

    boolean backtrack(char[][] board,
                      String word,
                      int index,
                      int r,
                      int c,
                      boolean[][] visited) {

        if (index == word.length())
            return true;

        if (r < 0 || r >= board.length || c < 0 || c >= board[0].length)
            return false;

        if (visited[r][c])
            return false;

        if (board[r][c] != word.charAt(index))
            return false;

        visited[r][c] = true;

        boolean found =
                backtrack(board, word, index + 1, r + 1, c, visited) ||
                backtrack(board, word, index + 1, r - 1, c, visited) ||
                backtrack(board, word, index + 1, r, c + 1, visited) ||
                backtrack(board, word, index + 1, r, c - 1, visited);

        visited[r][c] = false;

        return found;
    }
}