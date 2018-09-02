package medium.q079;

/**
 * @author abosen
 * @date 2018/09/02
 */
class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (backtracking(i, j, 0, board, word)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean backtracking(int x, int y, int idx, char[][] board, String word) {
        if (idx == word.length()) {
            return true;
        }
        if (x < 0 || x >= board.length || y < 0 || y >= board[0].length || word.charAt(idx) != board[x][y]) {
            return false;
        }
        board[x][y] ^= 128;
        boolean exist = backtracking(x + 1, y, idx + 1, board, word) ||
                backtracking(x - 1, y, idx + 1, board, word) ||
                backtracking(x, y + 1, idx + 1, board, word) ||
                backtracking(x, y - 1, idx + 1, board, word);
        board[x][y] ^= 128;
        return exist;
    }
}
