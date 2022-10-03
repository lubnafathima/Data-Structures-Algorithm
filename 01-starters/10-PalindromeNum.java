import java.util.Scanner;

public class PalindromeNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        boolean isPalindrome=true;
        int temp=n, sol=0, rem;
        while(temp>0){
            rem=temp%10;
            sol=sol*10+rem;
            temp/=10;
        }
        if(sol!=n){
            isPalindrome=false;
            System.out.println("Not a Palindrome");
        } else {
            System.out.println("Palindrome");
        }
    }
}
