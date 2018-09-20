package medium.q046;

import java.util.List;

/**
 * @author abosen
 * @date 2018/09/20
 */

@FunctionalInterface
public interface Answer {
    List<List<Integer>> permute(int[] nums);
}
