package 生成一个乱序数组;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Demo {
    public static void main(String[] args) {
        int[] shuffleArray = shuffle();
        for (int i = 0; i < shuffleArray.length; i++) {
            System.out.println(shuffleArray[i]);
        }
    }
    public static int[] shuffle() {
        int arrLength = new Random().nextInt(100);
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength - 1; i++) {
            arr[i] = new Random().nextInt(100);
        }
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            arrayList.add(arr[i]);
        }
        Collections.shuffle(arrayList);
        int[] arr2 = new int[arr.length];
        for (int i = 0; i < arrayList.size() - 1; i++) {
            arr2[i] = arrayList.get(i);
        }
        return arr2;
    }
}
