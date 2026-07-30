package arrays;

import java.util.Scanner;

public class Array002_SmallestElement {
    public static int smallestElement(int[] nums){
        int min = nums[0];

        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] < min){
                min = nums[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[5];
        for(int i = 0 ; i < arr.length ; i++){
            System.out.print("Enter element : ");
            arr[i] = sc.nextInt();
        }

        int result = smallestElement(arr);
        System.out.println("Smallest element : " + result);
    }
}
