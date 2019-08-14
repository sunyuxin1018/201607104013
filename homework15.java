package day02.com.syx2;

import java.util.Random;
import java.util.Scanner;

public class homework15 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入班级人数：");
        int a=sc.nextInt();
        int[] arr = new int[a];
        for (int i = 0 ;i< arr.length;i++){
            arr[i]=random.nextInt(101);
        }
        int b = 0;
        int sum = 0;
        for (int i =0 ; i < arr.length;i++){
            sum = sum + arr[i];
            if (arr[i]<60){
                b++;
            }
        }
        System.out.println("不及格人数："+b);
        System.out.println("班级平均分："+sum/arr.length);
    }
}
