package day01.com.syx;
import java.util.Scanner;
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入学生成绩:");
        Long number = scanner.nextLong();
        String check=(number>=60)?"及格":"不及格";
        System.out.println(check);
    }
}
