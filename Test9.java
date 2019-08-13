package day01.com.syx;
import java.util.Scanner;
public class Test9 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入您的工龄:");
        int a = scanner.nextInt();
        Scanner scanner1= new Scanner(System.in);
        System.out.println("请输入您的基本工资:");
        int b = scanner.nextInt();
        System.out.println("您目前工作了"+a+"年");
        System.out.println("您的基本工资为"+b+"元");
        if (a>=0&a<1){
            System.out.println("应涨工资"+200+"元");
        }
        else if (a>=1&a<3) {
            System.out.println("应涨工资" + 500 + "元,"   +"涨后工资为"+(b+500)+"元");
        }
        else if (a>=3&a<5) {
            System.out.println("应涨工资" + 1000 + "元,"   +"涨后工资为"+(b+1000)+"元");
        }
        else if (a>=5&a<10) {
            System.out.println("应涨工资" + 2500 + "元,"   +"涨后工资为"+(b+2500)+"元");
        }
        else{
            System.out.println("应涨工资" + 5000 + "元,"   +"涨后工资为"+(b+5000)+"元");

        }

    }
}
