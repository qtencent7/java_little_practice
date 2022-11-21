package 根据手机号确认办卡费;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        int fee = getFee();
        System.out.println(fee);
    }
    public static int getFee() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入手机号：");
        String phoneNumber = scanner.nextLine();
        if(phoneNumber.length() != 11) {
            System.out.println("手机号长度不合法");
            return 0;
        }
        switch (phoneNumber.charAt(10)) {
            case '4':
                return 0;
            case '8':
                return 50;
            default:
                return 20;
        }

    }
}
