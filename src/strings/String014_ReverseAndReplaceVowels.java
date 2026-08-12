package strings;

public class String014_ReverseAndReplaceVowels {
    public static void main(String[] args){
      String s = "programming";

      StringBuilder sb = new StringBuilder();
      for(int i = s.length()-1 ; i >=0 ; i--){
          char ch = s.charAt(i);

          if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
              sb.append('*');
          }
          else{
              sb.append(ch);
          }
      }

      System.out.println(sb);
    }
}
