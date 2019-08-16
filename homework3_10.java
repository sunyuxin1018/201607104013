package day03.com.syx3;

public class homework3_10 {
    public static void main(String[] args) {

    }
    public static void equals(int[] arr1,int[] arr2){
        int count=0;
        if (arr1.length==arr2.length){
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i]==arr2[i]){
                    count++;
                }
            }
        }
        if (count==arr1.length&&count==arr2.length){
            System.out.println("两个数组是相同的");
        }else {
            System.out.println("两个数组不是相同的");
        }
    }
    public static void fill(int[] arr,int value){
        for (int i = 0; i < arr.length; i++) {
            arr[i]=value;
        }
    }
    public static void fill(int[] arr,int fromlndex,int tolndex,int value){
        for (int i = fromlndex; i < tolndex; i++) {
            arr[i]=value;
        }
    }
    public static int[] copyOf(int[] arr,int newLength){
        int[] newarr=new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newarr[i]=arr[i];
        }
        return newarr;
    }
    public static int[] copyOfRange(int[] arr,int from, int to){
        int[] newarr=new int[to-from];
        for (int i = 0; i < newarr.length; i++) {
            newarr[i]=arr[i];
        }
        return newarr;
    }
}
