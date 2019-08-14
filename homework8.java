package day02.com.syx2;

public class homework8 {
    public static void main(String[] args) {
        int s = 0;
        for(int i =1;i<101;i++){
            int a = i%10;
            int b = (i/10) % 10;
            int c = i / 100;
            if(a!=9&b!=9&c!=9){
                s++;
                if(s%5==0){
                    System.out.println(i);
                }else{
                    System.out.print(i+" ");
            }
            }

        }
    }
}
