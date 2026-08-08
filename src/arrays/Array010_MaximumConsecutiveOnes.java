package arrays;

public class Array010_MaximumConsecutiveOnes {
    public int maxOnes(int [] nums){
        int current = 0;
        int max = 0;

        for(int num : nums){
            if(num == 1){
                current++;
                max = Math.max(current,max);
            }
            else{
                current = 0;
            }
        }
        return max;
    }
}
