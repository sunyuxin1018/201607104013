package day03.com.syx3;

        import java.util.Scanner;

public class homework3_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个大于3的整数");
        int a = scanner.nextInt();
        Print(a);
    }
    public static void Print(int a) {
        for (int i = 0; i < a ; i++) {
            if(i%2==0){
                System.out.println("符合条件的数字有:"+i);
            }
        }
    }
}
