package arrays;

import java.util.HashMap;

public class Array_021_TwoSumVariation {
    public static int pairSum(int[] arr , int target){
        HashMap<Integer,Integer> map = new HashMap<>();

        int count = 0;

        for(int i = 0 ; i < arr.length ; i++){
            int complement = target - arr[i];

            if(map.containsKey(complement)){
                count += map.get(complement);
            }

            map.put(arr[i] , map.getOrDefault(arr[i],0) + 1);
        }
        return count;
    }
}
