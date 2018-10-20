package medium.q279;

/**
 * @author qiubaisen
 * @date 2018/10/20
 */
public class MathSolution implements Answer {
    @Override
    public int numSquares(int n) {
        while (n % 4 == 0) {
            n /= 4;
        }
        if (n % 8 == 7) {
            return 4;
        }
        for (int i = 0; i * i <= n; i++) {
            int j = (int) Math.sqrt(n - i * i);
            if (i * i + j * j == n) {
                return i * j == 0 ? 1 : 2;
            }
        }
        return 3;
    }
}
