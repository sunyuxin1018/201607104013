package day02.com.syx2;

public class homework2 {
    public static void main(String[] args) {
        int x=0;
        for(int i=1;i<101;i++){
            if (i%3==0&i%5==0){
                x = x + i;
            }
        }
        System.out.println(x);


    }
}
