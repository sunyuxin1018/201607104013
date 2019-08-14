package day02.com.syx2;

import java.util.Random;
import java.util.Scanner;

public class homework12 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int number = scanner.nextInt();
        int[] arr = new int[number];
        for (int i = 0;i < arr.length;i++){
            arr[i]=random.nextInt(11);
        }
        for (int i = 0;i < arr.length;i++){
            if (arr[i]>5&&arr[i]%2==0){
                System.out.println("数组中所有值大于5且为偶数的元素为"+arr[i]);
            }
        }


    }
}
