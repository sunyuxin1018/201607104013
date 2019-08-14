package day02.com.syx2;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入1-5内的一个数字:");
        int week = scanner.nextInt();
        while (week == 1) {
            switch (week) {
                case 1:
                    System.out.println("新建");
                    break;
            }
            switch (week) {
                case 2:
                    System.out.println("打开文件");
                    break;
            }
            switch (week) {
                case 3:
                    System.out.println("保存");
                    break;
            }
            switch (week) {
                case 4:
                    System.out.println("刷新");
                    break;
            }
            switch (week) {
                case 5:
                    System.out.println("退出");
                    System.exit(0);
            }

        }
    }
}

