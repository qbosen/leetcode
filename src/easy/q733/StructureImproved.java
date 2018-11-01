package easy.q733;

import java.util.Stack;

/**
 * @author qiubaisen
 * @date 2018/11/01
 */

public class StructureImproved implements Answer {
    @Override
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Stack<Location> stack = new Stack<>();
        int oldColor = image[sr][sc];
        if (oldColor == newColor)
            return image;
        Location e = new Location(sr, sc);
        stack.add(e);
        while (!stack.empty()) {
            Location pop = stack.pop();
            image[pop.x][pop.y] = newColor;
            add(stack, pop.x - 1, pop.y, oldColor, image);
            add(stack, pop.x + 1, pop.y, oldColor, image);
            add(stack, pop.x, pop.y - 1, oldColor, image);
            add(stack, pop.x, pop.y + 1, oldColor, image);
        }
        return image;
    }

    private void add(Stack<Location> stack, int x, int y, int oldColor, int[][] image) {
        if (x >= 0 && x < image.length && y >= 0 && y < image[0].length && image[x][y] == oldColor) {
            Location e = new Location(x, y);
            stack.add(e);
        }
    }

    class Location {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

    }
}