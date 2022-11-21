package 点餐最优选择;


/*
题目：
    某小伙想定一份外卖，商家的优惠方式如下：鱼香肉丝单点24元，油炸花生米单点8元，
    米饭单点3元。订单满30元8折优惠。鱼香肉丝优惠价16元，
    但是优惠价和折扣不能同时使用。那么这个小伙要点这三样东西，最少要花多少钱？
*/
public class Demo {
    public static void main(String[] args) {
        float choice = bestChoice(24, 8, 3);
        System.out.println(choice);
    }
    public static float bestChoice(int dish1, int dish2,int dish3) {
        float plan1 = 16 + dish2 + dish3;
        int total2 = dish1 + dish2 + dish3;
        float plan2;
        if(total2 > 30 ) {
            plan2 = total2 * 0.8f;
        } else {
            plan2 = total2;
        }
        if(plan1 < plan2) {
            return plan1;
        } else {
            return plan2;
        }
    }
}
