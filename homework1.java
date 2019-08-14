package day02.com.syx2;

public class homework1 {
    public static void main(String[] args) {
        int x = 0;
        for(int i=1;i<101;i++){
            if (i%2!=0){
                x = x+i;
                }
        }
        System.out.println("奇数之和为:"+x);
    }
}
