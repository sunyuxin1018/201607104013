package day02.com.syx2;

import java.util.Random;
import java.util.Scanner;

public class homework6 {
    public static void main(String[] args) {
        Random r = new Random();
        int number = r.nextInt(100)+1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int week = scanner.nextInt();
        while(true){
            if(number<week){
                System.out.println("你猜的数据大了！");
            }else if(number>week){
                System.out.println("你猜的数据小了！");
            }else if(number==week){
                System.out.println("恭喜你，猜中啦！");
            }

        }

    }
}
