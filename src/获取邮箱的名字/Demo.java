package 获取邮箱的名字;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        String name = findName();
        System.out.println(name);
    }
    public static String findName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入邮箱：");
        String email = scanner.nextLine();
        int index = email.indexOf("@");
        String name = email.substring(0, index);
        return name;
    }
}
