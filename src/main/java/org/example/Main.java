package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8};

        changeArr(arr);

    }

    public static int [] changeArr (int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i]++;
            }
        }
        int [] arr1 = Arrays.copyOfRange(arr,2,6);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        return arr1;
    }

}