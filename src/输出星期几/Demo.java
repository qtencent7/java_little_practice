package 输出星期几;

import java.util.HashMap;

public class Demo {
    public static void main(String[] args) {
        String whichDay = isWhichDay(1);
        System.out.println(whichDay);
    }
    public static String isWhichDay(Integer i) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "星期一");
        map.put(2,"星期二");
        map.put(3, "星期三");
        map.put(4, "星期四");
        map.put(5, "星期五");
        map.put(6, "星期六");
        map.put(7, "星期天");
        String result = map.get(i);
        return result;
    }
}
