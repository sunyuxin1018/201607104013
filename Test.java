package day01.com.syx;
import java.util.Scanner;
public class Test {

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入一个数:");
        Long number = scanner.nextLong();
        String check = (number % 2 == 0)?"这个数是：偶数":"这个数是：奇数";
        System.out.println(check);


    }
}
