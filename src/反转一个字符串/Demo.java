package 反转一个字符串;

import java.util.Stack;

public class Demo {

    public static void main(String[] args) {
        String reverseStr = reverse("abcdefg");
        System.out.println(reverseStr);
    }
    public static String reverse(String str) {
        Stack<String> strStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            strStack.push(String.valueOf(str.charAt(i)));
        }
        String str2 = "";
        int size = strStack.size();
        for (int i = 0; i < size; i++) {
            str2 = str2 + strStack.pop();
        }
        return str2;
    }
}
