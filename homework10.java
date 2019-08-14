package day02.com.syx2;

import java.util.Random;

public class homework10 {
    public static void main(String[] args) {
        Random random = new Random();
        int arr[] = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
        for (int i = 0;i < arr.length;i++){
            System.out.println(arr[i]);
            }
        }
    }

