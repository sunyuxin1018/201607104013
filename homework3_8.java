package day03.com.syx3;

public class homework3_8 {
    public static void main(String[] args) {
        int[] arr={10,20,30,40,50,60};
        int b = max(arr);
        System.out.println("这个数组最大元素索引值为:"+b);

    }

    public  static int max(int arr[]) {
        int a=arr[0];
        int b = 0;
        for (int i = 1; i < arr.length; i++) {
            if (a<arr[i]){
                b=i;
            }
        }
        return b;
    }
}
