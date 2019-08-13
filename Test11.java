package day01.com.syx;
import java.util.Scanner;
public class Test11 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入x值");
        int a = scanner.nextInt();
        if(a<0){
            System.out.println("x="+a+",y=-1");
        }
        if(a==0){
            System.out.println("x="+a+",y=0");
        }
        if(a>1){
            System.out.println("x="+a+",y=1");
        }

    }
}
