package day01.com.syx;
import java.util.Scanner;
public class Test7 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入张浩java课程的成绩:");
        int a = scanner.nextInt();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("请输入张浩SQL课程的成绩:");
        int b = scanner1.nextInt();
        Scanner scanner2= new Scanner(System.in);
        System.out.println("请输入张浩Web课程的成绩:");
        int c = scanner2.nextInt();
        double d = (a-b);
        double e =(a+b+c)/3;
        System.out.println("张浩java课程和SQL课程分数的成绩差为:"+d);
        System.out.println("张浩成绩的平均分为:"+e);


    }
}
