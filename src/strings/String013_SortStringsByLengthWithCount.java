package strings;

import java.util.*;

public class String013_SortStringsByLengthWithCount {
    public static void main(String[] args){
      List<String> words = Arrays.asList("JAVA","is","powerful");

      words.stream().sorted(Comparator.comparingInt(String::length)).forEach(word -> System.out.println(word + " : " + word.length()));
    }
}
