package arrays;

public class Array019_MoveNegativeNumbersToEnd {
    public static void moveNegativestoEnd(int[] arr){
        int i = 0;
        int j = arr.length -1;


        while( i < j && arr[i] >= 0){
            i++;
        }

        while(i < j && arr[j] <= 0){
            j--;
        }

        if(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }
    }

    public static void main(String[] args) {

        int[] arr = {-1,4,-2,5,0,-3,8};

        moveNegativestoEnd(arr);

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
}