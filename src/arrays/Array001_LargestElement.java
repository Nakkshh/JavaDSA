package arrays;

import java.util.Scanner;

public class Array001_LargestElement {
    public static int largestElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }
        int result = largestElement(arr);
        System.out.println("Max : " + result);
    }
}
