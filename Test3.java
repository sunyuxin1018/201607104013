package day01.com.syx;
import java.util.Scanner;
public class Test3 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入长方形的长:");
        Long number = scanner.nextLong();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("请输入长方形的宽:");
        Long number1 = scanner.nextLong();
        double a = number * number1;
        double b = (number + number1) * 2;
        System.out.println("这个长方形的面积为:"+ a);
        System.out.println("这个长方形的周长为:"+ b);
    }
}
