package strings;

import java.util.*;

public class String005_RemoveDuplicateCharacters {
    public static void main(String[] args){
        String s = "Programming";

        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(set.add(ch)){
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
