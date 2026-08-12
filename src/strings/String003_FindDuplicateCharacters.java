package strings;

import java.util.*;

public class String003_FindDuplicateCharacters {
    public static void main(String[] args) {
        String s = "programming";

        Set<Character> set = new HashSet<>();

        for(char ch : s.toCharArray()){
            if(!set.add(ch)){
                System.out.println(ch);
            }
        }
    }
}
