package arrays;

import java.util.HashSet;

public class Array017_PairWithGivenSum {
    public static boolean hasPair(int[] arr , int target){
        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            int complement = target - num;

            if(set.contains(complement)){
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
