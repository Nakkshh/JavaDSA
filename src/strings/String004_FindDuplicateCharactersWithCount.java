package strings;

import java.util.*;

public class String004_FindDuplicateCharactersWithCount {
    public static void main(String[] args) {
        String s = "programming";

        Map<Character,Integer> map = new LinkedHashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch,0)+1);
        }

        for(char ch : map.keySet()){
            if(map.get(ch) >1){
                System.out.println(ch + "=" + map.get(ch));
            }
        }

    }
}
