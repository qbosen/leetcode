package medium.q753;

/**
 * @author qiubaisen
 * @date 2018/10/18
 */

@FunctionalInterface
public interface Answer {
    int openLock(String[] deadends, String target);
}
