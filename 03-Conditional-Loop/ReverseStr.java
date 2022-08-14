import java.util.Scanner;

public class ReverseStr {
    public static void main(String[] args) {
//        Reverse A String In Java
        String str;
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a string : ");
        str=scan.nextLine();
        char[] ch=str.toCharArray();
        System.out.println("Reverse of a String is :");
        for(int i=ch.length;i>0;i--){
            System.out.print(ch[i-1]);
        }
    }
}