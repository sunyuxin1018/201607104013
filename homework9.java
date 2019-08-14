package day02.com.syx2;

public class homework9 {
    public static void main(String[] args) {
        int[] arr = new int[5];
        int a = arr[0];
        for (int i = 1;i < arr.length;i++){
            if(a>=arr[i]){
                a=arr[i];
            }
        }
        System.out.println("该数组最小值为:"+a);
    }
}
