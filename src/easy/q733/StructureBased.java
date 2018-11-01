package easy.q733;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.Stack;

/**
 * @author qiubaisen
 * @date 2018/11/01
 */

public class StructureBased implements Answer{
    @Override
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        Stack<Location> stack = new Stack<>();
        Set<Location> set = new HashSet<>();
        int oldColor = image[sr][sc];
        Location e = new Location(sr, sc);
        stack.add(e);
        set.add(e);
        while (!stack.empty()) {
            Location pop = stack.pop();
            image[pop.x][pop.y] = newColor;
            add(stack, set, pop.x - 1, pop.y, oldColor, image);
            add(stack, set, pop.x + 1, pop.y, oldColor, image);
            add(stack, set, pop.x, pop.y - 1, oldColor, image);
            add(stack, set, pop.x, pop.y + 1, oldColor, image);
        }
        return image;
    }

    private void add(Stack<Location> stack, Set<Location> set, int x, int y, int oldColor, int[][] image) {
        if (x >= 0 && x < image.length && y >= 0 && y < image[0].length && image[x][y] == oldColor) {
            Location e = new Location(x, y);
            if (set.contains(e)) return;
            stack.add(e);
            set.add(e);
        }
    }

    class Location {
        int x;
        int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Location location = (Location) o;
            return x == location.x &&
                    y == location.y;
        }

        @Override
        public int hashCode() {
            return Objects.hash(x, y);
        }
    }
}
