package org.example;

import java.util.Locale;

public class Exercicio2 {
    public static void main(String[] args) {
        //palavra a ser verificada
        String s = "Teset";

        if(isPalindrome(s)){
            System.out.println("The word '" + s + "' is a Palindrome.");
        }else{
            System.out.println("The word '" + s + "' is not a Palindrome.");
        }

    }

    public static boolean isPalindrome(String s) {
        boolean isPalindrome = true;
        s=s.toLowerCase();
        int rightIndex = s.length() -1;
        int leftIndex = 0;

        while(leftIndex < rightIndex){
            if(s.charAt(leftIndex) != s.charAt(rightIndex)){
                isPalindrome = false;
                break;
            }
            rightIndex--;
            leftIndex++;
        }
        return isPalindrome;
    }
}
