package arrays.twopointer;

import java.util.Arrays;

public class movezerostoend {
    static void pushZerosToEnd(int[] arr) {
        int r = 0;

        for (int l = 0; l < arr.length; l++) {
            if (arr[l] != 0) {
                int temp = arr[l];
                arr[l] = arr[r];
                arr[r] = temp;
                r++;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 0, 3, 0, 4};

        pushZerosToEnd(arr);

        System.out.println(Arrays.toString(arr));
    }
}
