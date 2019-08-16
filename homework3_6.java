package day03.com.syx3;

import java.util.Scanner;

public class homework3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int key = sc.nextInt();
        System.out.println("请输入一个数组:");
        int[] arr ={sc.nextInt(),sc.nextInt(),sc.nextInt(),sc.nextInt()};
        find(key,arr);
    }

    public static void find(int key,int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(key==arr[i]){
                count++;
                System.out.println("你输入的数字索引值为:"+i);
            }
            }
        if(count==0){
            System.out.println("数组中没有这个数字");
        }
    }
}
