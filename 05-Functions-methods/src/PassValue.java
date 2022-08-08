import java.util.Arrays;

public class PassValue {
//    Cannot change value

//    public static void main(String[] args) {
//        int a = 20;
//        value(a);
//        System.out.println(a);
//    }
//    static int value( int b) {
//         b = 10;
//         return b;
//    }

//    But we  can update a value from array (but can for string as its a 'Final' value)
//    public static void main(String[] args) {
//        int[] a = {1,2,3,4,5};
//        change(a);
//        System.out.println(Arrays.toString(a));
//    }
//
//    static int change(int[] b) {
//        b[0] = 6;
//        return b[0];
//    }

    public static void main(String[] args) {
        int a = 20;
        {
            System.out.println(a);
            int c = 40;
        }
        System.out.println(c); //this wont work
    }
}

