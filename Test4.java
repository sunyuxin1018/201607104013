package day01.com.syx;
import java.util.Scanner;
public class Test4 {
    public static void main(String[] args) {
        Scanner number= new Scanner(System.in);
        System.out.println("请输入一个数:");
        int a = number.nextInt();
        Scanner number1= new Scanner(System.in);
        System.out.println("请再次输入一个数:");
        int b = number1.nextInt();
        int check = (a>b)?(a+b):(a*b);
        System.out.println(check);
    }
}
