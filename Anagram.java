package Strings;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String str1 = "aab";
        String str2 = "bcc";
        isAnagram(str1, str2);
        
    }

    static void isAnagram(String str1, String str2){
        if (str1.length() == str2.length()) {
            //convert to char array
            char[] charA1 = str1.toCharArray();
            char[] charA2 = str2.toCharArray();

            Arrays.sort(charA1);
            Arrays.sort(charA2);

            boolean result = Arrays.equals(charA1, charA2);

            if (result) {
                System.out.println("String is anagram");
            }
            else{
                System.out.println("String is not anagram");
            }
        }
    }
}
