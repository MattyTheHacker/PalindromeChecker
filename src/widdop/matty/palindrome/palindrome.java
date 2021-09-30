package widdop.matty.palindrome;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check: ");
        String inputString = scanner.nextLine();
        System.out.println(inputString);
        scanner.close();
        char[] word = inputString.toCharArray();
        boolean status = isPalindrome(word);
        if (status) {
            System.out.println(inputString + " is a palindrome.");
        } else {
            System.out.println(inputString + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(char[] word){
        int start = 0;
        int end = word.length - 1;
        for(int i = word.length - 1; i >= 0; i--){
            if (word[start] != word[end]) {
                return false;
            }
            ++start;
            --end;
        }
        return true;
    }
}
