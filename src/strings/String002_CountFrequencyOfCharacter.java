package strings;

public class String002_CountFrequencyOfCharacter {
    public static void main(String [] args) {
        String s = "jgssdvgshgdsfhfhgfgfbvbvcvfdhjhjjjjhjjhava";
        char target = 'j';

        int count = 0;

        for(char ch : s.toCharArray()){
            if(ch == target){
                count++;
            }
        }
        System.out.println(count);
    }
}
