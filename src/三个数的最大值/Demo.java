package 三个数的最大值;


import java.util.Arrays;

/*
题目：
    接收用户输入的3个整数,并将它们的最大值作为结果输出
*/
public class Demo {
    public static void main(String[] args) {
        float bigNum = biggestNum(10, 20, 30);
        System.out.println(bigNum);
    }
    public static float biggestNum(float num1, float num2, float num3) {
        float[] nums = {num1, num2, num3};
        Arrays.sort(nums);
        return nums[nums.length - 1];
    }
}
