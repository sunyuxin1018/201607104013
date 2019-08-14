package day02.com.syx2;

public class homework11 {
    public static void main(String[] args) {
        int[] nums = {5,10,15};
        int[] nums1 = new int[3];
        for(int i = 0;i < nums1.length;i++){
            nums1[i] = nums[i]*2;
        }
        for(int i = 0;i < nums1.length;i++){
            System.out.println(nums1[i]);
        }
    }
}

