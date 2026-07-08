package arrays.twopointer;

import java.util.Arrays;

public class TripletSum {
    public static boolean hasTripletSum(int[]arr , int target){

        Arrays.sort(arr);

        for(int i = 0 ; i < arr.length - 2 ; i++){
            int rem = target - arr[i];

            int j = i+1;
            int k = arr.length - 1;

            while(j < k){
                int sum = arr[j]+arr[k];
                if(sum < rem){
                    j++;
                }
                else if(sum > rem){
                    k--;
                }
                else {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,45,6,8,10};
        int target = 13;

        boolean ans = hasTripletSum(arr,target);

        System.out.println(ans);
    }
}
