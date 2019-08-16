package day03.com.syx3;

import java.util.Random;

public class homework3_7 {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt(101);
        int b = random.nextInt(101);
        int arr[] = new int[4];
        arr = yunsuan(a,b);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("运算结果为："+arr[i]);
        }
    }

    public static int[] yunsuan(int a,int b) {
        int arr[] = new int[4];
        arr[0] = a + b;
        arr[1] = a - b;
        arr[2] = a * b;
        arr[3] = a / b;
        return  arr;
    }
}
