package 遍历二维数组;

public class Demo {
    public static void main(String[] args) {
        forEach();
    }
    public static void forEach() {
        char[][] arr = {
                {'道', '路', '千','万','条'},
                {'安','全','第','一','条'}
        };
        for (int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
    }
}
