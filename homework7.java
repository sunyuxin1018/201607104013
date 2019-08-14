package day02.com.syx2;

public class homework7 {
    public static void main(String[] args) {
        double x = 0.0001;
        int i = 0;
        while(x<8848){
            x=x+x;
            i++;
        }
        System.out.println("经过"+i+"次折叠，可以折成珠穆朗玛峰的高度");
    }
}
