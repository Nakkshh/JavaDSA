package strings;

public class String008_CountVowels {
    public static void main(String[] args){
      String s = "Programming";
      int count = 0;
      for(char ch : s.toLowerCase().toCharArray()){
          if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
              count++;
          }
      }
        System.out.println(count);
    }
}
