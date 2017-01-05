/**
 * Created by Administator on 2017/1/5.
 * N!末尾有多少个0
 * 假设 N! = k * 10 ^m 问题可以化简为m的值 m由10的个数决定 10 = 2 *5 所以 m = min(2的次数, 5的次数)
 * 2的次数一般大于5的次数，因此求出1 ~ N中可以分解出多少个5即可
 */
public class Solution {
    public static int method1(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            int j = i;
            while (j % 5 ==0) {
                res++;
                j /= 5;
            }
        }
        return res;
    }
    /*
    5的次数 = a * 5 + b * 25 +……
    求出多项式可以贡献的5的其他次方的次数相加即可
     */
    public static int method2(int n) {
        int res = 0;
        while (n >= 5) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.print(method1(999) +" "+ method2(999));
    }
}
