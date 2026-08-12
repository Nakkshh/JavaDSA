package strings;

import java.util.*;

public class String016_ThirdHighestFrequencyCharacter {
    public static void main(String[] args){
      String s = "aabbbccccddddd";

      Map<Character,Integer> map = new HashMap<>();

      for(char ch : s.toCharArray()){
          map.put(ch , map.getOrDefault(ch,0)+1);
      }

      List<Character> letters = new ArrayList<>(map.keySet());

      letters.sort((a,b) -> map.get(b) - map.get(a));

        System.out.println(letters.get(2));


    }
}
