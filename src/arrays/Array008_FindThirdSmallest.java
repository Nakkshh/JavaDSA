package arrays;

public class Array008_FindThirdSmallest {
    public static void main(String[] args){
      int [] arr = {2,4,5,3,7,34,64,54,213,4545,333,3};

      int smallest = Integer.MAX_VALUE;
      int secondSmallest = Integer.MAX_VALUE;
      int thirdSmallest = Integer.MAX_VALUE;

      for(int num : arr){
          if(num < smallest){
              thirdSmallest = secondSmallest;
              secondSmallest = smallest;
              smallest = num;
          }
          else if(num < secondSmallest && num != smallest){
              thirdSmallest = secondSmallest;
              secondSmallest = num;
          }
          else if(num < thirdSmallest && num != smallest && num != secondSmallest){
              thirdSmallest = num;
          }
      }
        System.out.println(thirdSmallest);
    }
}
