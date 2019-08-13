package day01.com.syx;
import java.util.Scanner;
public class Tset8 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入一个四位数字:");
        int a = scanner.nextInt();
        int b = a;
        int c = a%10;
        int d = a/10%10;
        int e = a/100%10;
        int f = a/1000;
        System.out.println("会员卡号"+b+"各位之和为:"+(c+d+e+f));
        if (c+d+e+f>20) {
            System.out.println("会员卡号"+b+"是幸运客户");
        }
        else{
            System.out.println("会员卡号"+b+"不是幸运客户");
        }
    }
}
