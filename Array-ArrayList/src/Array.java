import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
//        ARRAY OF PRIMITIVES
        Scanner in = new Scanner(System.in);
//        int[] arr = new int[4];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }

//        print the above for loop : 3 ways

//        using toString (much preferred)
//        System.out.println(Arrays.toString(arr));

//         using foreach loop (avg)
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }

//         using for loop (worse)
//        for (int i=0; i < arr.length; i++) {
//            System.out.print(arr[i] + " ");
//        }


//        ARRAY OF STRING
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }
        System.out.println(Arrays.toString(str));

//        modifying above array
        str[1] = "hello";
        System.out.println(Arrays.toString(str));
    }
}
