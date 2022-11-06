package Strings;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your String : ");
        String key = in.next();
        String reverse = "";

        for (int i = key.length()-1; i >= 0; i--) {
            reverse = reverse + key.charAt(i);
        }
        if (key.equals(reverse)) {
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}
