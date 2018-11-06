package medium.q871;

import java.util.List;

/**
 * @author qiubaisen
 * @date 2018/11/06
 */

@FunctionalInterface
public interface Answer {
    boolean canVisitAllRooms(List<List<Integer>> rooms);
}
