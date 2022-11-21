package 创建一个随机长度数组并输出最大值;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int num = find();
        System.out.println(num);
        int small = findSmall();
        System.out.println(small);
    }
    public static int find() {
        int arrLength = new Random().nextInt(100);
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = new Random().nextInt(100);
        }
        Arrays.sort(arr);
        return arr[arrLength -1];
    }
    public static int findSmall() {
        Integer arrLength = new Random().nextInt(100);
        Integer[] arr = new Integer[arrLength];
        for (int i = 0; i < arrLength; i++) {
            arr[i] = new Random().nextInt(100);
        }
        MyComparator myComparator = new MyComparator();
        Arrays.sort(arr, myComparator);
        return arr[0];
    }
}
class MyComparator implements Comparator<Integer> {
    @Override
    public int compare(Integer num1, Integer num2) {
        if(num1 > num2) {
            return 1;
        } else if(num1 < num2) {
            return -1;
        } else {
            return 0;
        }
    }
}
