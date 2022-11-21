package 输入是奇数还是偶数;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        String what = isWhat();
        System.out.println(what);
    }
    public static String isWhat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字");
        int num = scanner.nextInt();
        int i = num % 2;
        if(i == 0) {
            return "是偶数";
        } else {
            return "是奇数";
        }
    }
}
