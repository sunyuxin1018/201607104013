package day03.com.syx3;

import java.util.Random;

public class homework3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        int number1 = random.nextInt(101);
        int number2 = random.nextInt(101);
        sum(number1,number2);
    }

    public static void sum(int number1,int number2) {
        int a = (number1+number2);
        System.out.println("第一个数为:"+number1);
        System.out.println("第二个数为:"+number2);
        System.out.println("两个数之和为:"+a);
    }
}
