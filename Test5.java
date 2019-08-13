package day01.com.syx;
import java.util.Scanner;
public class Test5 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("请输入学生成绩:");
        Long number = scanner.nextLong();
        if (number < 60){
            System.out.println("该生成绩为不及格");
        }
        else if(number>=60&number<70){
            System.out.println("该生成绩为及格");
        }
        else if(number>=70&number<80){
            System.out.println("该生成绩为良好");
        }
        else if(number>=80&number<90){
            System.out.println("该生成绩为好");
        }
        else{
            System.out.println("该生成绩为优秀");
        }

    }
}
