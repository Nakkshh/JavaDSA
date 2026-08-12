package strings;

public class String011_CheckAnagram {
    public static void main(String[] args){
      String s1 = "listen";
      String s2 = "siltel";

      if(s1.length() != s2.length()){
          System.out.println(false);
          return;
      }

      int[] count = new int[256];

      for(int i = 0 ; i < s1.length() ; i++){
          count[s1.charAt(i)]++;
          count[s2.charAt(i)]--;
      }

      for(int x : count){
          if(x != 0){
              System.out.println(false);
              return;
          }
      }
        System.out.println(true);
    }
}