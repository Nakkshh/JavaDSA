package arrays;

public class Array007_FindSecondLargest {
    public static void main(String[] args){
      int [] arr = {3,5,3,7,8,9,2,10,45,34,23,14};

      int largest = Integer.MIN_VALUE;
      int secondLargest = Integer.MIN_VALUE;

      for(int num : arr){
          if(num > largest){
              secondLargest = largest;
              largest = num;
          }
          if(num > secondLargest && num < largest){
              secondLargest = num;
          }
      }
        System.out.println(secondLargest);
    }
}
