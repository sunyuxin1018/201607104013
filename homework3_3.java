package day03.com.syx3;

public class homework3_3 {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60};
        int a = arr[0];
        min(arr,a);
    }
    public static void min(int arr[],int a) {
        for (int i = 1; i < arr.length; i++) {
            if (a>arr[i]){
                a = arr[i];
            }
        }
        System.out.println("最小值为:"+a);
    }
}
