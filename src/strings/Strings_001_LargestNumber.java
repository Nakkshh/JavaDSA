package strings;

import java.util.Arrays;

public class Strings_001_LargestNumber {
    public static String largesnumber(int [] nums){
        String [] strings = new String[nums.length];

        for(int i = 0 ; i < nums.length ; i++){
            strings[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strings , (a, b) -> (b+a).compareTo(a+b));

        if(strings[0] == "0") {
            return "0";
        }

        StringBuilder sb = new StringBuilder();

        for(String b : strings){
            sb.append(b);
        }
        return sb.toString();
    }
}