package arrays;

public class Array018_RemoveElement {
    public int removeElements(int [] nums , int val ){
        int slow = 0;
        for(int fast = 0 ; fast < nums.length ; fast++){
            if(nums[fast] != val){
                nums[slow] = nums[fast];
                slow++;
            }
        }
        return slow;
    }
}
