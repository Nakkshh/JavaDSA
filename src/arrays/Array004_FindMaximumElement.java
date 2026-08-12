package arrays;

public class Array004_FindMaximumElement {
    public static void main(String[] args){
      int[] arr = {2,4,3,6,7,123,435,43};

      int max = arr[0];

      for(int num : arr){
          if(num > max){
              max = num;
          }
      }
        System.out.println(max);
    }
}
