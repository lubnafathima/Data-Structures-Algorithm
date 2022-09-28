import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        To find out whether the given String is Palindrome or not.
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = in.next();
        int start = 0, end = str.length()-1;
        boolean isPalindrome = true;
        while(start < end) {
            if(str.charAt(start) != str.charAt(end)) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }
        if(isPalindrome) {
            System.out.println(str+" is a Palindrome");
        } else {
            System.out.println(str+" is not a Palindrome");
        }
    }
}
