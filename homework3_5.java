package day03.com.syx3;

import java.util.Scanner;

public class homework3_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字");
        int key = sc.nextInt();
        System.out.println("请输入一个数组");
        int arr[] = {sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        cishu(key,arr);
    }

    public static void cishu(int key,int arr[]) {
        int x = 0;
        for (int i = 0; i < arr.length; i++) {
            if(key==arr[i]) {
                x++;
            }
        }
        System.out.println("您输入的数字出现次数为:"+x);
    }
}
