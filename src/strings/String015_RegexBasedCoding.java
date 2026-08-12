package strings;

public class String015_RegexBasedCoding {
    public static void main(String[] args){
      String s = "Java@123!";

      String result = s.replaceAll("[^a-zA-Z0-9]","");

      System.out.println(result);
    }
}
