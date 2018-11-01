package easy.q733;

/**
 * @author qiubaisen
 * @date 2018/11/1
 */
public class CallStack implements Answer {
    @Override
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if (image == null || sr >= image.length || sc >= image[0].length)
            return image;

        if (newColor == image[sr][sc])
            return image;

        change(image, sr, sc, image[sr][sc], newColor);
        return image;
    }

    private void change(int[][] image, int row, int col, int oldColor, int newColor) {
        if (row >= image.length || col >= image[0].length || row < 0 || col < 0
                || image[row][col] != oldColor)
            return;

        image[row][col] = newColor;
        change(image, row + 1, col, oldColor, newColor);
        change(image, row - 1, col, oldColor, newColor);
        change(image, row, col + 1, oldColor, newColor);
        change(image, row, col - 1, oldColor, newColor);
    }
}
