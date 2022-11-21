package 攒钱是否一样多问题;

/*
题目：
    已知小红同学有25元，她攒了几天钱之后发现自己的现在的钱比原来的2倍还多出10块。
    而小蓝同学有30元，他攒了几天钱之后发现自己的钱正好是原来的2倍。
    于是小胖说：小红和小蓝现在的钱一样多，请问，他说的对吗？
*/
public class Demo {
    public static void main(String[] args) {
        boolean same = ifSame(25, 30);
        System.out.println(same);
    }
    public static boolean ifSame(int initialMoney1, int initialMoney2) {
        int finalMoney1 = initialMoney1 * 2 + 10;
        int finalMoney2 = initialMoney2 * 2;
        return finalMoney1 == finalMoney2;
    }
}
