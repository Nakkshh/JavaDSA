package arrays;

import java.util.*;

public class Array006_FindMinMaxInList {
    public static void main(String[] args){
      List<Integer> list = new ArrayList<>(Arrays.asList(10,2,5,45,8));

      int max = list.get(0);
      int min = list.get(0);

      for(int num : list){
          if (num < min) min = num;
          if (num > max) max = num;
      }

        System.out.println(min);
        System.out.println(max);
    }
}
