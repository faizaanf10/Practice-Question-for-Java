package Strings;

public class remove_vowels {
    public static void main(String[] args) {
        String str = "hello";
        // removeVowels(str);
        removeVowels2(str);
        
    }

    static void removeVowels(String str){
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) =='i' || str.charAt(i) == 'o' ||str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' ) {
                continue;
            }
            else{
                System.out.print( str.charAt(i));
            }
        }
    }

    static void removeVowels2(String s1){
        String s2 = "";
        s2 = s1.replaceAll("[aeiou]", "");
        System.out.println(s2);
    }
}


