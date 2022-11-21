package 计算儿女身高题;

/*
题目：
    儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
    女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
    请将预测的子女身高打印输出
 */
public class Demo {
    public static void main(String[] args) {
        float height = expectHeight(1.73f, 1.50f, "男");
        System.out.println(height);
        float femaleHeight = expectHeight(1.73f, 1.50f, "女");
        System.out.println(femaleHeight);
    }
    public static float expectHeight(float fatherHeight, float motherHeight, String yourSex) {
        float yourHeight;
        if(yourSex == "男") {
            yourHeight = (fatherHeight + motherHeight) * 1.08f / 2;
            return yourHeight;
        } else if (yourSex == "女") {
            yourHeight = (fatherHeight + motherHeight) / 2;
            return yourHeight;
        } else {
            System.out.println("请输入正确的性别");
            return 0;
        }
    }
}
