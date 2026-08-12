package strings;

import java.util.*;

public class String012_SortStringsByLength {
    public static void main(String[] args){
      List<String> words = new ArrayList<>(
              Arrays.asList("Java", "is" , "powerful")
      );

      words.sort(Comparator.comparingInt(String::length));

        System.out.println(words);
    }
}
