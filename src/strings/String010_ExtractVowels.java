package strings;

public class String010_ExtractVowels {
    public static void main(String[] args){
      String s = "Programming";

      StringBuilder sb = new StringBuilder();

      for(char ch : s.toLowerCase().toCharArray()){
          if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
              sb.append(ch);
          }
      }
      System.out.println(sb);
    }
}
