package arrays.twopointer;

public class TargetPairSum {
    public static int TargetPairSum(int []arr , int target){
        int left = 0;
        int right = arr.length - 1;
        int count = 0;

        while(left < right) {
            int sum = arr[left] + arr[right];

            if (sum < target) {
                left++;
            } else if (sum > target) {
                right--;
            } else {
                if (arr[left] == arr[right]) {
                    int n = right - left + 1;
                    count += (n * (n - 1)) / 2;
                    break;
                } else {
                    int leftcount = 1;
                    int rightcount = 1;

                    while (left + 1 < right && arr[left] == arr[left + 1]) {
                        leftcount++;
                        left++;
                    }
                    while (right - 1 > left && arr[right] == arr[right - 1]) {
                        rightcount++;
                        right--;
                    }

                    count += leftcount * rightcount;
                    left++;
                    right--;
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] arr = {-1, 1, 5, 5, 7};
        int target = 6;

        TargetPairSum obj = new TargetPairSum();
        int ans = obj.TargetPairSum(arr, target);

        System.out.println("Number of pairs = " + ans);
    }
}
