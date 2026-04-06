package Strings;
import java.util.*;

public class ValidPalindrome {

    public static boolean isPalindrome(String s) {

        int left = 0;
        int right = s.length() - 1;

        while (left < right) {

            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } 
            else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } 
            else {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        boolean result = isPalindrome(input); // input" user ka variable ka nam ha

        System.out.println("Is Palindrome: " + result);

        sc.close();
    }
}