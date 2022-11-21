package 存款利率;


import java.util.Scanner;

/*
题目：
    某银行推出了整存整取定期储蓄业务，其存期分为一年、两年、三年、五年，到期凭存单支取本息。存款年利率表如下：
        存期 年利率（%）
        一年 2.25
        两年 2.7
        三年 3.25
        五年 3.6
    请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
        提示：
        存入金额和存入年限均由键盘录入
        本息计算方式：本金+本金×年利率×年限
*/
public class Demo {
    public static void main(String[] args) {
        float bestMoney = findBestMoney();
        System.out.println(bestMoney);
    }
    public static float findBestMoney() {
        float rate1 = 0.0225f;
        float rate2 = 0.027f;
        float rate3 = 0.0325f;
        float rate5 = 0.036f;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入本金");
        float money = scanner.nextInt();
        System.out.println("请输入存取年限");
        int year = scanner.nextInt();

        if(year == 1) {
            money = money + money * rate1 * year;

        } else if(year == 2) {
            money = money + money * rate2 * year;

        } else if(year >= 3 && year <= 4) {
            money = money + money * rate3 * year;

        } else if (year >= 5) {
            money = money + money * rate5 * year;
        }
        return money;
    }
}
