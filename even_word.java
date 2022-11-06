package Strings;

public class even_word {
    public static void main(String[] args) {
        String s = "Java Programming is cool";
        evenWord(s);
        
    }

    static void evenWord(String s){
        System.out.println("The words with even length are: ");
        for(String word : s.split(" ")){
            if(word.length() % 2 == 0){
                System.out.println(word);
            }
        }
    }
}
