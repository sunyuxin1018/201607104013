package day01.com.syx;

public class Test2 {
    public static void main(String[] args) {
        int a = 123;
        int b = a%10;
        int c = (a/10)%10;
        int d = a/100;
        System.out.println("123的个位是:"+ b);
        System.out.println("123的十位是:" + c);
        System.out.println("123的百位是:" + d);
    }
}
