package arrays;

public class Array005_FindMinimumElement {
    public static void main(String[] args){
        int[] arr = {2,4,3,6,7,123,435,43};

        int min = arr[0];

        for(int num : arr){
            if(num < min){
                min = num;
            }
        }
        System.out.println(min);
    }
}
