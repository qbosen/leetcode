package medium.q150;

/**
 * @author qiubaisen
 * @date 2018/10/23
 */

@FunctionalInterface
public interface Answer {
    int evalRPN(String[] tokens);
}
