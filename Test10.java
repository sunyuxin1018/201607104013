package day01.com.syx;
import java.util.Scanner;
public class Test10 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int a = scanner.nextInt();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("请输入第二个整数");
        int b = scanner1.nextInt();
        Scanner scanner2= new Scanner(System.in);
        System.out.println("请输入您要进行的运算为:");
        int c = scanner.nextInt();
        if (c==0){
            System.out.println(a+b);

        }
        if(c==1){
            System.out.println(a-b);
        }
        if(c==2){
            System.out.println(a*b);
        }
        if(c==3){
            System.out.println(a/b);
        }
    }
}
