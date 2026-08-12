package strings;

import java.util.*;

public class String001_CountCharacters {
    public static void main(String [] args){
        String s = "java";

        Map<Character,Integer> freq = new TreeMap<>();

        for(char ch : s.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch,0)+1);
        }
        System.out.println(freq);
    }
}
